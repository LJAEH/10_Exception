package edu.kh.exc.test;

import java.util.Scanner;

public class EceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 컴파일 에러
		
		// int a = 99.9; 
		// 개발자가 코드를 잘못 입력한 경우
		// 코드로 수정 가능
		int b = (int)99.9; // 1) 변수 자료형을 double 로
		double c = 99.9;  // 2) (int)99.9 강제 형변환
		
		//=============================================
		
		// 런타임 에러 
		
		/* while(true) {
			// 0 입력시에 종료되도록 함
			System.out.print("0입력시 종료");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			} // 탈출구문
			
		}
		*/
		
		
		// 정수 입력시 에러 발생
		// 프로그램 수행 중 발생하는 에러
		// 주로 if문으로 처리가능
		
		int[] arr = new int[3]; // 길이 3 : 인덱스 0, 1, 2 까지
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		if(3 >= arr.length) {
			System.out.println("배열 범위를 초과했습니다");	
		} else {
			arr[3]=40;
			
		}
		
		
		// ********* <== 배열 예외처리 잘 알아 두기 **********
	}
	
	

}
