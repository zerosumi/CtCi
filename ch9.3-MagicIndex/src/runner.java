
public class runner {

	//distinct
	public static int magicIndex(int[] data,int start, int end) {
		if(start > end)
			return -1;
		int mid = (start+end)/2;
		if(data[mid]==mid)
			return mid;
		else if(data[mid]<mid)
			return magicIndex(data,mid+1,end);
		else
			return magicIndex(data,start,mid-1);
	}
	
	//not distinct
	public static int magicIndexND(int[] data, int start, int end) {
		if(start > end)
			return -1;
		int mid = (start+end)/2;
		if(data[mid]==mid)
			return mid;
		//right
		int right = magicIndexND(data,mid+1>data[mid]?mid+1:data[mid],end);
		if(right>=0)
			return right;
		//left
		int left = magicIndexND(data,start, (mid-1)<data[mid]?(mid-1):data[mid]);
		return left;
		
		
		
	}
	public static void main(String[] args) {
		int[] data = {-2,-1,0,1,2,3,4,6,8,10};
		int[] dataND = {-1,2,2,2,2,3,4,6,9,10};

		System.out.println(magicIndex(data,0,data.length-1));
		System.out.println(magicIndexND(dataND,0,dataND.length-1));
		
		
	}

}
