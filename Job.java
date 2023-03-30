import java.util.*;
public class Job {
	String name;
	Long entered;
	Long burst;
	Long turnaroundtime;
	Long waitingtime;
	Long completiontime;
	
	
	


	public Job(String JobName, Long TimeEnetered, Long CPUBurst ) {
		name= JobName;
		entered= TimeEnetered;
		burst= CPUBurst;
		turnaroundtime=(burst-entered);
		waitingtime=(turnaroundtime-burst);
		completiontime=(turnaroundtime+entered);
	}



	public String getName() {
		return name;
	}



	public Long getEntered() {
		return entered;
	}



	public Long getBurst() {
		return burst;
	}
	
	
	public String toString() {
		return "The Job name is: "+name+ " The Time the Job was entered is: "+ entered;
		
	}

	public Long getTurnaroundtime() {
		return turnaroundtime;
	}



	public Long getWaitingtime() {
		return waitingtime;
	}



	public Long getCompletiontime() {
		return completiontime;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setEntered(Long entered) {
		this.entered = entered;
	}



	public void setBurst(Long burst) {
		this.burst = burst;
	}



	public void setTurnaroundtime(Long turnaroundtime) {
		this.turnaroundtime = turnaroundtime;
	}



	public void setWaitingtime(Long waitingtime) {
		this.waitingtime = waitingtime;
	}



	public void setCompletiontime(Long completiontime) {
		this.completiontime = completiontime;
	}


}
