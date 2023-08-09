class GotIntrupted{
	public static void main(String[] args) {
		MyThread t=new 	MyThread();
		t.start();
		MyThread.t=Thread.currentThread();
		try{
			Thread.currentThread().join();
		} 
	}
}