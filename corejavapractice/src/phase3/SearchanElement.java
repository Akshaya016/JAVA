package phase3;

public class SearchanElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr= {12,13,7,8,9,4};
int target=90;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==target) {
		System.out.println("element found");
	}
	
}

//Another method
int[] arr = {12, 13, 7, 8, 9, 4};
int target = 7;

boolean found = false;

for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        found = true;
        break;
    }
}

if(found) {
    System.out.println("Element Found");
} else {
    System.out.println("Element Not Found");
}


	}

}
