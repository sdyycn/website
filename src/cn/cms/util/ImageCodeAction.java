package cn.cms.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ImageCodeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5901078861571038428L;
	final int MAXNUM = 4;
	
	private ByteArrayInputStream inputStream; 
	public void setInputStream(ByteArrayInputStream inputStream) {   
        this.inputStream = inputStream;   
    }   
    public ByteArrayInputStream getInputStream() {   
        return inputStream;   
    }   
	
	Color getRandColor(int fc, int bc){
		Random rand = new Random();
		if (fc>255) fc=255;
		if (bc>255) bc=255;
		int r = fc + rand.nextInt(bc-fc);
		int g = fc + rand.nextInt(bc-fc);
		int b = fc + rand.nextInt(bc-fc);
		return new Color(r, g, b);
	}
	
	private String getRandomChar(){
		int rand = (int)Math.round(Math.random()*2);
		long itmp = 0;
		char ctmp = '\u0000';
		switch (rand){
		case 1:
			itmp = Math.round(Math.random()*25 + 65);
			ctmp = (char)itmp;
			return String.valueOf(ctmp);
			
		case 2:
			itmp = Math.round(Math.random()*25 + 97);
			ctmp = (char)itmp;
			return String.valueOf(ctmp);
			
			default:
				itmp = Math.round(Math.random()*9);
				return String.valueOf(itmp);
		}
	}
	
	public String execute() throws Exception{   
//      在内存中创建图象   
       int width=MAXNUM*15+5, height=20;   
       BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
//      获取图形上下文   
       Graphics g = image.getGraphics();   
//     生成随机类   
       Random rand = new Random();   
//      设定背景色   
       g.setColor(getRandColor(200,250));   
       g.fillRect(0, 0, width, height);   
//     设定字体   
       g.setFont(new Font("Times New Roman",Font.PLAIN,18));   
//      随机产生155条干扰线，使图象中的认证码不易被其它程序探测到   
       g.setColor(getRandColor(160,200));   
 
       for (int i=0; i<155; i++){
			int x = rand.nextInt(width-1);
			int y = rand.nextInt(height-1);
			int x1 = rand.nextInt(6) + 1;
			int y1 = rand.nextInt(12) + 1;
			g.drawLine(x, y, x+x1, y+y1);
		}
       
		for (int i=0; i<70; i++){
			int x = rand.nextInt(width-1);
			int y = rand.nextInt(height-1);
			int x1 = rand.nextInt(6) + 1;
			int y1 = rand.nextInt(12) + 1;
			g.drawLine(x, y, x-x1, y-y1);
		}
//      取随机产生的认证码(MAXNUM位数字)   
       String sRand="";   
       for (int i=0;i<MAXNUM;i++){   
           String tmp = getRandomChar();   
           sRand += tmp;   
           // 将认证码显示到图象中   
           g.setColor(new Color(20+rand.nextInt(110),20+rand.nextInt(110),20+rand.nextInt(110)));   
//     调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成   
           g.drawString(tmp, 13*i+6, 16);
       }
//      将认证码存入SESSION 
       ActionContext.getContext().getSession().put("rand", sRand);
//      图象生效   
       g.dispose();
       ByteArrayOutputStream output = new ByteArrayOutputStream();   
       ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);   
       ImageIO.write(image, "JPEG", imageOut);   
       imageOut.close();   
       ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());   
       this.setInputStream(input);
       
       return SUCCESS;   
   }
}
