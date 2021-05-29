package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i = i+1;
			 
					
		}

	}

}

/*
초기값 i=1부터 5까지 i>=5 성립되기때문에 
1
2
3
4
5 가 출력되고
6은 성립되지않기때문에 flag = false에 걸려서 출력이 멈춘다.
*/