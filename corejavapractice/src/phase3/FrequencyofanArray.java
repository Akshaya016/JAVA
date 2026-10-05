package phase3;

public class FrequencyofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {10,20,10,10,20,30};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println(arr[i]+"->"+count);
		}
		
	}

}
