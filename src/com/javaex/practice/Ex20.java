package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		int rd = (int)(Math.random()*100)+1;

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=====================================");
		System.out.println("	[숫자맞추기게임 시작]	");
		System.out.println("=====================================");
		
		while(true) {
			System.out.print(">>");
			int num = sc.nextInt();
				
				if(num == rd) {
						System.out.println("맞았습니다.");
						System.out.print("게임을 종료하시겠습니까?(y/n)  ");
						String input = sc.next();
						System.out.println(input);
							
						
						if ("n".equals(input)) {
							System.out.println("다시 게임이 시작됩니다."); 
							rd = (int)(Math.random()*100)+1;
							
							
						} else if ("y".equals(input)) {
							System.out.println("===================================");
							System.out.println("	[숫자맞추기게임 종료]	");
							System.out.println("===================================");
							break;
						}	else {
							System.out.println("gg");
						}
						
						
				} else if(num > rd) {
					System.out.println("더 낮게");
					
				} else if(num < rd) {
					System.out.println("더 높게");
				
				 	
				 }
			 
		 
		}
		sc.close();
		
	}

}

/*

한번 공부해본 개인적인 생각으론 String input = sc.nextLine; 에서 y라는 스트링 타입을 넣어줬을때 오류가 나는 이유는 
이미 Scanner Sc에 int라는 자료형에 정수값이 들어갔기때문인것같다. 그래서 구글검색으로 이것저것 고쳐보니 sc.next();를 사용하여
y , n값을 입력시키는데 성공했다. 이부분은 더 공부해야할것같다. 결론은 sc.nextLine();을 사용해주기 위해서는 
Scanner st(string의 약자로 넣어줌) = new Scanner(System.in); 를 하나 더 생성해주고 사용하면 똑같이 실행이 가능하다.						
 
 */
