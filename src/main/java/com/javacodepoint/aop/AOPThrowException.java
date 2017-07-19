package com.javacodepoint.aop;

import org.springframework.aop.ThrowsAdvice;

public class AOPThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println(" Javacodepoint ThrowException : Throw exception Javacodepoint!");
	}
}