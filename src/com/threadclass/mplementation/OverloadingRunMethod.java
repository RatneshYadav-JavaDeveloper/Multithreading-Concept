package com.threadclass.mplementation;

public class OverloadingRunMethod extends Thread {

	/**
	 * start-method always call no-args run method
	 * **/
	public void run() {
		System.out.println("no-args-run-method");
	}
	/**
	 * if we create the args-run-method
	 * it treat like as normal method and it's executed by the main-thread.
	 * **/
	public void run(int a) {
		System.out.println("args-run-method");
	}
	
	public static void main(String[] args) {
		
		OverloadingRunMethod om = new OverloadingRunMethod();
		/**
		 * here main thread execute the start() method
		 * **/
		om.start();
		om.run(MAX_PRIORITY);
		/**
		 * and here new child thread has been created.
		 * 
		 * **/
	}
}
