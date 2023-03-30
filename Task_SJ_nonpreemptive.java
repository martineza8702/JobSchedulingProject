import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Task_SJ_nonpreemptive implements Runnable{
	ArrayList<Job> task;
	Timer timer= new Timer();
	completion_comparator sort=new completion_comparator();
		public Task_SJ_nonpreemptive(ArrayList<Job>jobs) {
			task=jobs;
			
		}
		@Override
		public void run() {
			
			Collections.sort(task,sort);
			for(Job job: task) {
				try {
					final long start=System.currentTimeMillis();
					long seconds =job.getBurst();
					long ms=TimeUnit.SECONDS.toMillis(seconds);
					synchronized(job) {
					Thread current=Thread.currentThread();
					current.sleep(ms);
				
					System.out.println(job.toString()+" ");
					
					}
				
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}

	}
