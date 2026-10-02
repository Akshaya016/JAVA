package phase3;

public class OddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10, 15, 20, 25, 30};
		int OC=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				OC++;
			}
		}
		System.out.println("the even count is:"+OC);
	}

}
