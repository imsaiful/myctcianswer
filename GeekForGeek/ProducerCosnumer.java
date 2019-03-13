//class Producer Consumer Problem


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

class ProducerCosnumer{
	public static void main(String[] args) throws InterruptedException{
		BlockingQueue<Integer> bq = new LinkedBlockingDeque<>(2);		
		Thread producer=new Thread(()->{
			try{
				int value=0;
				while(true){
					bq.put(value);
					System.out.println("Producer Produce ="+value);
					value++;
					Thread.sleep(1000);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		});
		Thread consumer=new Thread(()->{
			try{
				while(true){
					int value=bq.take();
					System.out.println("Cosumer consume ="+value);
					Thread.sleep(1000);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		});

		producer.start();
		consumer.start();
		producer.join();
		consumer.join();
	}
}

