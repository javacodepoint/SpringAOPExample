package com.javacodepoint.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPAroundMethod implements MethodInterceptor {
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("name of Method : "
				+ methodInvocation.getMethod().getName());
		System.out.println("arguments of Method : "
				+ Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
		System.out.println("Javacodepoint AOPAroundMethod : Before method Javacodepoint!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("Javacodepoint AOPAroundMethod : Before after Javacodepoint!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out
					.println("Javacodepoint AOPAroundMethod : Throw exception Javacodepoint!");
			throw e;
		}
	}
}