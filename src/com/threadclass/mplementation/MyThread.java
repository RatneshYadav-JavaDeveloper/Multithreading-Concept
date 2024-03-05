package com.threadclass.mplementation;

/**
 * first way to define the thread.
 * */
public class MyThread extends Thread {

	/**
	 * here override the run() method of the extended Thread class.
	 * 
	 * **/
	public void run() {
		System.out.println("run-method");
	}
	
	public static void main(String[] args) {
		/**
		 * at the begining main-thread is there
		 * who is responsible to exceute below all the statement
		 * **/
		MyThread mt = new MyThread();
		mt.start();
		/**
		 * after excuting the t.start() method new thread will be created and responsibe
		 * to exceute the run() method. 
		 * **/
		System.out.println("main-method");
		
		/**
		 * in this case there are two thread : main-thread & child-thread.
		 *so, we can't except the output.
		 *posiblities case of output:
		 * run-method followed by main-method
		 * main-method followed by run-method.
		 * **/
		
	}
}

