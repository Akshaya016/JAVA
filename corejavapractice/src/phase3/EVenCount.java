package phase3;

public class EVenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input:  10 15 20 25 30
		//Output: 3
		int []arr= {10, 15, 20, 25, 30};
		int EC=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				EC++;
			}
		}
		System.out.println("the even count is:"+EC);

	}

}
