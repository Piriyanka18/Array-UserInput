package Lession1;

public class MinimumMaximumArray {



	public static void main(String[] args) {
		int listArray[]= {14,3,45,67,89,92,4,52,34,57,109};
		
		int smoll= listArray[0];
		int large = listArray[0];
		
	
		for(int i=0; i<=10;i++) {
			if(smoll >listArray[i]) smoll = listArray[i];
			if(large < listArray[i]) large = listArray[i];
			
		}
		System.out.println("The smollest Number is "+ smoll);
		System.out.println("The largest Number is "+ large);

	}

}
