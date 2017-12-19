package com.dbs.study;

public class Demo1 extends Thread{

	private TestThread tt ;
	
	public Demo1(TestThread tt) {
		super();
		this.tt = tt;
	}
	public void run() {
		tt.setNameAndPassword("1", "123");
	}
}
