package java0121;

public class ThreadCore implements Runnable{
	public long sum = 0;
	private final long from;
	private final long to;
	
	public ThreadCore(long from, long to) {
		this.from = from;
		this.to = to;
	}
	
	public long getsum() {
		return sum;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (long i=from; i <=to; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
	}
}
