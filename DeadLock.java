class DeadLock{
	public static void main(String[] args) {
        ThredExamaple te=new ThredExamaple();
        te.start();
        //te.start();
        ThredExamaple t=Thread.currentThread();
        t.join();
        for (int i=0;i<5;i++)
        System.out.println(Thread.currentThread().getName()+" "+i);
    }

}

class ThredExamaple extends Thread{
    static Thread t;
    public void run(){
          try{
            t.join();
          }
          catch(Exception e){
                    for (int i=0;i<5;i++)
                  System.out.println(Thread.currentThread().getName()+" "+i);}
    }

} 