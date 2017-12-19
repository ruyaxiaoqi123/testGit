package com.dbs.study;

import java.util.concurrent.ConcurrentHashMap;

public class Demo extends Thread{
	private TestThread tt;
	public Demo(TestThread thread) {
		super();
		this.tt = thread;
	}
	
	public void run() {
		tt.setNameAndPassword("1", "123");
	}
}
