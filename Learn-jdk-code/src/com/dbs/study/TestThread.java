package com.dbs.study;

public class TestThread {
	private String name;
	private String password;
	
	private String testStr = new String();
	
	public void setNameAndPassword(String userName,String userPassword) {
		try {
			synchronized(testStr) {
				System.out.println(Thread.currentThread().getName()+"����ͬ��");
				name = userName;
				password = userPassword;
				System.out.println(Thread.currentThread().getName()+"�˳�ͬ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
