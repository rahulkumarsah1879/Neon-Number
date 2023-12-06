package com.MethodProgram;
import java.util.Scanner;
public class NeonNumber {
public static boolean isNeon(int num) {
	int square=num*num;
	int sum=0;
	while(square!=0) {
		int rem=square%10;
		sum=sum+rem;
		square/=10;
	}
	if(sum==num) {
		return true;
	}else {
		return false;
	}
  }
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scanner.nextInt();
	if(isNeon(num)) {
		System.out.println("Neon Number");
	}else {
		System.out.println("Not a neon number");
	}
}
}
