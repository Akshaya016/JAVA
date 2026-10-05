package phase3;

public class PAliOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {121, 123, 44, 56, 77};

		for(int i = 0; i < arr.length; i++) {

		    int num = arr[i];
		    int original = num;
		    int rev = 0;

		    while(num > 0) {
		        int dig = num % 10;
		        rev = rev * 10 + dig;
		        num /= 10;
		    }

		    if(original == rev) {
		        System.out.print(original + " ");
		    }
		}

	}

}
