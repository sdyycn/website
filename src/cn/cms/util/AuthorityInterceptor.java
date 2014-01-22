package cn.cms.util;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8655884797674033022L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext ctx = invocation.getInvocationContext();
		@SuppressWarnings("rawtypes")
		Map session = ctx.getSession();
		String user = (String)session.get("user");
		if (user != null && user.equals("scott")){
			return invocation.invoke();
		}
		ctx.put("tip", "您还没有登录,请登录系统!");
		
		return Action.LOGIN;
	}

}
