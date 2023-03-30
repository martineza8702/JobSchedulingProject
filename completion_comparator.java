import java.util.Comparator;

public class completion_comparator implements Comparator<Job>{


	@Override
	public int compare(Job o1, Job o2) {
		// TODO Auto-generated method stub
		return Long.compare(o1.getCompletiontime(), o2.getCompletiontime());
	}

}
