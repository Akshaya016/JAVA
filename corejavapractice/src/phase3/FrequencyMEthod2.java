package phase3;

public class FrequencyMEthod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int[] arr = {10,20,10,10,20,30};

		        for(int i=0;i<arr.length;i++) {

		            boolean repeat = false;

		            for(int k=0;k<i;k++) {
		                if(arr[i] == arr[k]) {
		                    repeat = true;
		                    break;
		                }
		            }

		            if(repeat) {
		                continue;
		            }

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
	
