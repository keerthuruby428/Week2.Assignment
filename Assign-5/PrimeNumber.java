	package week2.day2;

public class PrimeNumber {
	public static void main(String[] args) {
	int input=13;
	boolean flag=false;
	for(int i=2;i<=input/2;i++) {
	 if(input%i==0) {
		 flag=true;
	 }
	}
	 if (flag==true) {
		 System.out.println("Not a prime");
	 }
	 else {
		 System.out.println("Prime");
	 }
	}
}

