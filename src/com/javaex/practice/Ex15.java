package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}

/*
num을 어떤숫자로 나눴을때 0이 되는숫자를 약수라 하기때문에 i라는 변수를 num값까지 반복하게하고
만약에 num % 로 해서 0이된다면 출력하라는 문제의도를 잘파악해야한다.
*/