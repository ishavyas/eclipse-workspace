package com.spaopex;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAspect implements MethodInterceptor{

	public Object invoke(MethodInvocation inv) throws Throwable {
		System.out.println("Authentication Done");
		Object o = inv.proceed();
		System.out.println("Logging Information");
		return o;
	}
	
}
