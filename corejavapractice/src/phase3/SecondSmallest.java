package phase3;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {21,23,45,66,43,2};
		int fs=arr[0];
		int ss=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<fs) {
				ss=fs;
				fs=arr[i];
			}
			else if(arr[i]<ss && arr[i]!=fs) {
				ss=arr[i];
			}
		}
System.out.println("the second small:"+ss);
	}

}
