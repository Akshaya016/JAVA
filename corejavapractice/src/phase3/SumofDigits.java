package phase3;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {12,13,12};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			int num=arr[i];
			while(num>0) {
				int dig=num%10;
				sum+=dig;
				num/=10;
			}
		}
		System.out.println("the sum is:"+sum);

	}

}
