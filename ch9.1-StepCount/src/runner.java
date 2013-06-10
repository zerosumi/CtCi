
public class runner {

	
	//no dp
	public static int stepCount(int step) {
		if (step < 0)
			return 0;
		else if (step==0) 
			return 1;
		else {
			return stepCount(step-1)+stepCount(step-2)+stepCount(step-3);
		}
	}
	//dp
	public static int stepCountDP(int[] cache, int step) {
		if (step < 0)
			return 0;
		else if (step==0) 
			return 1;
		else if(cache[step] > -1)
			return cache[step];
		else {
			cache[step]=stepCountDP(cache,step-1)+stepCountDP(cache,step-2)+stepCountDP(cache,step-3);
			return cache[step];
		}
	}
	
	
	
	public static void main(String[] args) {
		int step=6;
		
		int[] cache = new int[2000];
		for(int i=0;i<cache.length;i++) {
			cache[i]=Integer.MIN_VALUE;
		}
		System.out.println(stepCount(step));
		
		System.out.println(stepCountDP(cache,step));

	}

}
