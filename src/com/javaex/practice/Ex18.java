package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		for(int y=1; y<=num; y++) {
			for(int x = y; x<=num; x++) {
				System.out.print("*");			
			}			
				System.out.println("");				
		} 
		for(int s=1; s<num; s++) {
			for(int g=0; g<=s; g++) {
				System.out.print("*");
		}
	
				System.out.println("");
	}
		sc.close();
	}

}

/*
두번째 반복문에 반복문 안에 반복문의 초기값을 1로 줫을경우엔 별이 하나씩 찍힌다. 
g의 초기값을 1로 주기위해선 s=2; g<=num; 으로 줘야한다.
*/