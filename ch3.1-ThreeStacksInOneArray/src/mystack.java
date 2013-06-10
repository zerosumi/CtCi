
public class mystack {
	int stacksize = 100;
	int[] stackbuffer = new int[stacksize*3];
	int[] stackcount = {-1,-1,-1};
	
	void push(int stacknumber, int number) throws Exception{
		if (stackcount[stacknumber]+1>stacksize)
			throw new Exception("out of space");
		stackcount[stacknumber]++;
		stackbuffer[stacksize*stacknumber+stackcount[stacknumber]]=number;
	}
	int pop(int stacknumber) throws Exception {
		if (stackcount[stacknumber]==-1)
			throw new Exception("stack is empty");
		int rvalue = stackbuffer[stacksize*stacknumber+stackcount[stacknumber]--];
		return rvalue;
	}
	
	
}
