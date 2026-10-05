package phase3;

public class CountOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,10,20,20,20,30};
		int num=20;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
			}
		}
System.out.println("the count is:"+count);
	}

}
