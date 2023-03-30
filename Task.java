import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Task implements Runnable{
	ArrayList<Job> task;
	ArrayList<Job> removed= new ArrayList<Job>();
	
		public Task(ArrayList<Job>jobs){
			task= jobs;
			
		}
	
	@Override
	public void run() {

		// TODO Auto-generated method stub
		for(Job job: task) {
			try {
				final long start=System.currentTimeMillis();
				long seconds =job.getBurst();
				long ms=TimeUnit.SECONDS.toMillis(seconds);
				synchronized(job) {
				Thread current=Thread.currentThread();
				current.sleep(ms);
				removed.add(job);
				System.out.println(job.toString()+" ");
				
				}
				task.removeAll(removed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
