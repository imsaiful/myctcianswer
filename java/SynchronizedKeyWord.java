class Count{
	int count;
	public synchronized void increament(){
		count++;
	}
}

class SynchronizedKeyWord {
	public static void main(String[] args) throws Exception{
	Count c=new Count();
	Thread t1=new Thread(new Runnable(){
		public void run(){
			for(int i=1;i<=100;i++){
				c.increament();
			}
		}
	});
	Thread t2=new Thread(new Runnable(){
		public void run(){
			for(int i=1;i<=100;i++){
				c.increament();
			}
		}
	});
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println(c.count);
	}
}