

package day14;

class MyThreadClass extends Thread{ // Thread is a class in Java
	
	// call stack takes place here, where a method calls another method and that method calls another method and so...
	@Override
	public void run(){
		System.out.println("thread is running..");// run calls the other method..override
	}
}

public class ThreadExample01 {

	public static void main(String[] args) {

		MyThreadClass refMTC = new MyThreadClass();
		Thread t1 =new Thread(refMTC);
		t1.start(); // start calls run method, making thread initialization, creating a thread
		//t1.start(); // if a thread is called more than once, it is IllegalThreadStateException
		
		Thread t2 =new Thread(refMTC);
		t2.start();
		
		Thread t3 =new Thread(refMTC);
		t3.start();
		//t1, t2, t3 multi-threading.. same as running concurrently, using the same resource and executing at the same time
	}

}
