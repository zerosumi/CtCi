
public class runner {

	public static int findString(String[] strings, String str, int start, int end) {
		if(start>end)
			return -1;
		int midindex = (start+end)/2;
		if(strings[midindex].isEmpty()) {
			for(int i = 1;;) {
				if(midindex+i>end&&midindex-i<start)
					return -1;
				if(midindex+i<=end&&!strings[midindex+i].isEmpty()) {
					midindex += i;
					break;
				}
				else if(midindex-1>=start&&!strings[midindex-i].isEmpty()) {
					midindex -= i;
					break;
				}
				i++;
			}
		}
		
		if(strings[midindex].equals(str))
			return midindex;
		else if(strings[midindex].compareTo(str)>0)
			return findString(strings,str,start,midindex-1);
		else 
			return findString(strings,str,midindex+1,end);
	}
	public static void main(String[] args) {
		String [] strings = {"asjndj","","","",
				"awnoiiasd","","","","baisdjo",
				"cjounsaod","","joinas","oams","",
				"","qiabniu","","tnounaoksd","vinaisd",
				"wdiuansd","","","","yibasond",""};
		
		System.out.print(findString(strings,"wdiuansd",0,strings.length-1));

	}

}
