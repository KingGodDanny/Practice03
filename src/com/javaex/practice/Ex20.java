package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		int point = 40;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=====================================");
		System.out.println("	[숫자맞추기게임 시작]	");
		System.out.println("=====================================");
		
		while(true) {
			System.out.print(">>");
			int num = sc.nextInt();
				
				if(num == point) {
						
						System.out.println("맞았습니다.");
						System.out.print("게임을 종료하시겠습니까?(y/n)  ");
						String input = sc.next();
						
						if (input.equals("n")) {
							System.out.println("다시 게임이 시작됩니다.");
					
						} else if (input.equals("y")) {
							System.out.println("===================================");
							System.out.println("	[숫자맞추기게임 종료]	");
							System.out.println("===================================");
							break;
						}	
				} else if(num > point) {
					System.out.println("더 낮게");
					
				} else if(num < point) {
					System.out.println("더 높게");
				
				 	
				 }
			 
		 
		}
		sc.close();
		
	}

}

