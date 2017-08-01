package day14;

class MyThreadClass2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class ThreadExample03 {
	
	public static void main(String[] args) {
		
		MyThreadClass2 t1 = new MyThreadClass2();
		MyThreadClass2 t2 = new MyThreadClass2();
		
		/*t1.start();
		t2.start();*/
		
		t1.run();
		t2.run();
	}

}
