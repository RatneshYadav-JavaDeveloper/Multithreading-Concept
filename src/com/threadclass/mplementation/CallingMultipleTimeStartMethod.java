package com.threadclass.mplementation;

public class CallingMultipleTimeStartMethod extends Thread {

	public void run() {
		System.out.println("run-method");
	}
	
	public static void main(String[] args) {
		CallingMultipleTimeStartMethod c = new CallingMultipleTimeStartMethod();
		/**
		 * here main thread exceute the first statrt() method
		 * */
		c.start();
		/**
		 * here one child thread is created and execute the run-method.
		 * 
		 * **/
		
		/**
		 * we can't call the start() method more than one time becoz
		 * same as living being cycle we can't start our life from childhood.
		 * **/
		c.start();
	}
}
