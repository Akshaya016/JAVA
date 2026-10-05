package phase3;

public class RevEachNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 34, 56};

        for(int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int rev = 0;

            while(num > 0) {
                int dig = num % 10;
                rev = rev * 10 + dig;
                num /= 10;
            }

            System.out.print(rev + " ");
        }

	}

}
