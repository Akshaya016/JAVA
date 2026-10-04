package phase3;

public class SortedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,30,40,50};
		boolean sort=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					sort=true;
				}
			}
		}
		if(!sort) {
			System.out.println("the array is sorted");
		}
		else {
			System.out.println("not sorted");
		}

	}

}
