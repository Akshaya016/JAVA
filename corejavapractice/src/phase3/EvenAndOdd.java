package phase3;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,13,53,13,7};
		System.out.println("even numbers");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
		System.out.println("odd numbers");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			System.out.print(arr[i]+" ");	
				
			}
		}
	
	}

}
