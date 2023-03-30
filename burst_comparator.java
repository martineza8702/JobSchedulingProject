import java.util.Comparator;

public class burst_comparator implements Comparator<Job>{

	@Override
	public int compare(Job o1, Job o2) {
		// TODO Auto-generated method stub
		return Long.compare(o1.getBurst(), o2.getBurst());
	}

}
