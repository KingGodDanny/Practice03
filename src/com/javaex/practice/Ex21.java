package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt(); 
		
		for(int i=1; i<=num; i++) {
				if (i%2==0) {
					 i = i + 0 ;
				} else if(i%2==1){
					i = i + 0;
				}
				System.out.println(i);
			}
				
													

		sc.close();
	}

}
