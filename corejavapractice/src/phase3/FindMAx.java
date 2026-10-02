package phase3;

public class FindMAx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {23,45,3,6};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println("the min is :"+max);

	}

}
