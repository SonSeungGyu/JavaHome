package chap06;

public class _05_Overloading {
	
	//메소드 오버로딩 - 서로 다른 자료형인 파라미터를 갖거나 개수가 다른면 이름이 같아도 
	//메소드명이 같고 인수의 타입이 다르거나 개수가 다르면 메소드 오버로딩.
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber);
		return number * number;
	}
	
	public static int getPower(int number, int exponent) {
		int result =1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getPower(3));
		System.out.println(getPower("4"));
		System.out.println(getPower(2, 3));
		
	}
}
