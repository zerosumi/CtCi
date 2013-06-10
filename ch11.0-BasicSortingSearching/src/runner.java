
public class runner {
	//Bubble
	public static void bubbleSort(int[] numbers) {
		int tmp;
		for(int i = numbers.length-1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(numbers[j]>numbers[j+1]) {
					tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
				}
			}
		}
	}
	
	//Selection
	public static void selectSort(int[] numbers) {
		int maxIndex;
		int tmp;
		for(int i = numbers.length-1; i >= 0; i--) {
			maxIndex=0;
			for(int j = 0; j <= i; j++) {
				maxIndex=numbers[maxIndex]>numbers[j]?maxIndex:j;
			}
			tmp=numbers[maxIndex];
			numbers[maxIndex]=numbers[i];
			numbers[i]=tmp;
		}
	}
	
	//Merge
	public static void mergeSort(int[] numbers) {
		mergeSort(numbers,0,numbers.length-1);
	}
	public static void mergeSort(int[] numbers,int start,int end) {
		if(end>start) {
		int mid = (start+end)/2;
		mergeSort(numbers,start,mid);
		mergeSort(numbers,mid+1,end);
		merge(numbers,start,mid,end);
		}
	}
	public static void merge(int[] numbers, int lstart,int lend,int rend){
		int[] tmp = new int[numbers.length]; 
		for(int i = lstart;i<=rend;i++)
			tmp[i]=numbers[i];
		int rstart = lend+1;
		int pos = lstart;
		while(lstart<=lend&&rstart<=rend) {
			if (tmp[lstart] < tmp[rstart])
				numbers[pos++]=tmp[lstart++];
			else
				numbers[pos++]=tmp[rstart++];
		}
		int remaining = lend-lstart;
		for(int i = 0;i<=remaining;i++) {
			numbers[pos+i]=tmp[lstart+i];
		}
		
	}
	//Quick
	public static void quickSort(int[] numbers) {
		quickSort(numbers,0,numbers.length-1);
	}
	public static void quickSort(int[] numbers, int low, int high) {
		if(low>=high)
			return;
		int index=partition(numbers,low,high);
		quickSort(numbers,low,index-1);
		quickSort(numbers,index,high);
	}
	
	private static int partition(int[] numbers, int low, int high) {
		int mid = numbers[(low+high)/2];
		while(low<=high) {
			while(numbers[low]<mid)
				low++;
			while(numbers[high]>mid)
				high--;
			if(low<=high) 
				swap(numbers,low++,high--);
		}
		return low;
	}

	private static void swap(int[] numbers, int i, int j) {
		int tmp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=tmp;
	}

	public static void main(String[] args) {
		int[] numbers = {1,9,5,34,2313,6466,856,123,64,674,3,54,74,23,56,3,87,976,2,345,21,36,52,465,434,2,3456,878,98,23,7,87897,3,412,2,4,2653,34};
		//bubbleSort(numbers);
		//selectSort(numbers);
		//mergeSort(numbers);
		quickSort(numbers);
		for(int a:numbers)
			System.out.print(a+" ");

	}

}
