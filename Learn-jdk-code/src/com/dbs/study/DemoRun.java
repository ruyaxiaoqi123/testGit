package com.dbs.study;

public class DemoRun {
	public static void main(String[] args) {
		TestThread tt = new TestThread();
		Demo demo1= new Demo(tt);
		demo1.setName("线程A");
		demo1.start();
		Demo demo2= new Demo(tt);
		demo2.setName("线程B");
		demo2.start();
	}

}
