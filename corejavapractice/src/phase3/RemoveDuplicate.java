package phase3;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,10,20,30,45,10};
		boolean dupi;
		for(int i=0;i<arr.length;i++) {
			dupi=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					dupi=true;
					break;
				}
			
			}
			
			if(!dupi) {
				System.out.print(arr[i]+" ");
			}
		}
		

	}

	}
