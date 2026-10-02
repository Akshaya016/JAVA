package phase3;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {23,45,3,6};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
		System.out.println("the min is :"+min);

	}

}
