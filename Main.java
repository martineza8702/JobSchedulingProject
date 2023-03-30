//import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Timer;

public class Main implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
static ArrayList<Job>jobs= new ArrayList<Job>();






public static void ReadfromJobsToRun(File Filename) throws NumberFormatException, IOException {
	Scanner FileScan= new Scanner(Filename);
	String kb="";
	//FileScan.useDelimiter(",");
	BufferedReader Reader = new BufferedReader(new FileReader("JobsToRun"));
	while((kb=Reader.readLine())!=null) {
		String [] data=kb.split(",");
		
		String name=data[0];
		Long entered=Long.parseLong(data[1]);
		Long burst=Long.parseLong(data[2]);
		FileScan.nextLine();
		jobs.add(new Job(name,entered,burst));
		
	}
	Reader.close();
	FileScan.close();
}

public static void print_jobs() {
	for(Job b: jobs) {
		System.out.println(b.toString());
}
}




	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		File file=new File("JobsToRun");
		ReadfromJobsToRun(file);

		/*Task task= new Task(jobs);
		Thread run= new Thread(task);
		run.start();
		*/
		/*
		Task_SJ_nonpreemptive task= new Task_SJ_nonpreemptive(jobs);
		Thread run= new Thread(task);
		run.start();
		*/
		Task_Shortest_Job_PreEmptive task=new Task_Shortest_Job_PreEmptive(jobs);
		Thread run=new Thread(task);
		run.start();
		for(Job j: jobs) {
			if(j.getBurst()==0)
				System.out.print(j.toString());
		}
	}
	

}
