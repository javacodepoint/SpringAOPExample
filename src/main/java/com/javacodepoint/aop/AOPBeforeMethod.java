package com.javacodepoint.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class AOPBeforeMethod implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("Javacodepoint BeforeMethod : Before method Javacodepoint!");
	}
}