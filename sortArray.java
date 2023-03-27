package Shriram;

public class sortArray {
	public static void main(String[] args) {
		
		int arr[] = new int[] {2,5,1,6,7,3,10};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(" "+arr[i]);
		}
		
	}
}
