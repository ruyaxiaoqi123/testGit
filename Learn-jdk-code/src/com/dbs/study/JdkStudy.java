package com.dbs.study;

import java.util.concurrent.FutureTask;

public class JdkStudy extends Thread{
	public static void main(String[] args) {
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(1 & (1 << (Integer.SIZE-3)) - 1);
//		System.out.println((-1 << (Integer.SIZE-3)) | 0);
//		List<String> ls = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//		ls.forEach(n -> System.out.println(n));
		byte[] b = new byte[1024*1024];
		for(int i = 0;i<11;i++) {
			b = new byte [1024*1024];
		}
	}

}
