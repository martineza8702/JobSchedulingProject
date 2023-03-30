import java.util.*;

public class Task_Shortest_Job_PreEmptive implements Runnable{
	ArrayList<Job> Jobs;
	Timer timer= new Timer();
	int count=0;
	
	
	public Task_Shortest_Job_PreEmptive(ArrayList<Job> job) {
	Jobs=job;
	}
	public void run() {

	
	TimerTask mytask=new TimerTask() {
	@Override
	public void run() {
		
	if(count<=15)	 {
	System.out.println(count +" "+Jobs.get(0).getBurst()+ " "+ Jobs.get(0).getName());
	Jobs.get(0).setBurst(Jobs.get(0).getBurst()-1);
	count++;
					}
	
	
	if(count>=15 && count<=20) {
		if(Jobs.get(0).getBurst()>Jobs.get(1).getBurst()) {
			System.out.println(count +" "+Jobs.get(1).getBurst()+ " "+ Jobs.get(1).getName());
			Jobs.get(1).setBurst(Jobs.get(1).getBurst()-1);
			count++;
		}
		if(Jobs.get(0).getBurst()<Jobs.get(1).getBurst()) {
			System.out.println(count +" "+Jobs.get(0).getBurst()+ " "+ Jobs.get(0).getName());
			Jobs.get(0).setBurst(Jobs.get(0).getBurst()-1);
			count++;
		}
	}
	
	
	
		if(count>=20 && count <=28)
		{
			
			if(Jobs.get(0).getBurst()<Jobs.get(1).getBurst()&&Jobs.get(0).getBurst()<Jobs.get(2).getBurst() && Jobs.get(0).getBurst()!=-1) {
				System.out.println(count +" "+Jobs.get(0).getBurst()+ " "+ Jobs.get(0).getName());
				Jobs.get(0).setBurst(Jobs.get(0).getBurst()-1);
				count++;
			}
			
			if(Jobs.get(0).getBurst()>Jobs.get(2).getBurst()&&Jobs.get(0).getBurst()!= -1)
					{
				System.out.println(count +" "+Jobs.get(2).getBurst()+ " "+ Jobs.get(2).getName());
				Jobs.get(2).setBurst(Jobs.get(2).getBurst()-1);
				count++;
				
			}
			if(Jobs.get(0).getBurst()==0)
			{
				System.out.println(Jobs.get(0).toString());
			}
			if(Jobs.get(0).getBurst()==0 && Jobs.get(1).getBurst()<Jobs.get(2).getBurst())
			{
				System.out.println(count+ " " + Jobs.get(1).getBurst()+ Jobs.get(1).getName());
				count++;
			}
			if(Jobs.get(0).getBurst()==0 && Jobs.get(2).getBurst()<Jobs.get(2).getBurst())
			{
				System.out.println(count+ " " + Jobs.get(1).getBurst()+ Jobs.get(1).getName());
				count++;
			}
		}
		
		
			if(count>=28 && count <=35)
			{
			
			
			if(Jobs.get(2).getBurst()<Jobs.get(3).getBurst())
			{
				System.out.println(count +" "+ Jobs.get(2).getBurst()+ " "+ Jobs.get(2).getName());
				Jobs.get(2).setBurst(Jobs.get(2).getBurst()-1);
				count++;
			}
			
			
	
		
		
	}

	
	}
	
	
};

timer.schedule(mytask,1000,1000);

}
}