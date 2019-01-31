class Count{
	int count;
	public void increament(){
		count++;
	}
}

class Synchronized {
	public static void main(String[] args) throws Exception{
	Count c=new Count();
	Thread t1=new Thread(new Runnable(){
		public void Run(){
			for(int i=1;i<100;i++){
				c.increament();
			}
		}
	});
	Thread t2=new Thread(new Runnable(){
		public void Run(){
			for(int i=1;i<100;i++){
				c.increament();
			}
		}
	});
	System.out.println(c);


	}
}