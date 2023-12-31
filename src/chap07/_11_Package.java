package chap07;

import java.util.Random;

public class _11_Package {
	public static void main(String[] args) {
		//패키지 : 서로 연관된 클래스들을 모아두는 곳
		//패키지 (랜덤 클래스)
		Random random = new Random();
		
		//int 의 범위 내에서 정수형 값 반환
		System.out.println("랜덤 정수 : " + random.nextInt() );
		//0 이상 10 미만의 정수형
		System.out.println("랜덤 정수(범위) : " + random.nextInt(10));
		//0.0 이상 1.0 미만의 실수값
		System.out.println("랜덤 실수 : " + random.nextDouble());
		
		//만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
		double min = 5.0;
		double max = 10.0;
		System.out.println("랜덤 실수 (범위) : " + (min+(max-min)*random.nextDouble()));
		
		//math, Scanner, StringBuilder, StringBuffer, StringTokenizer
		//BigInteger, BigDecimal
		//LocalDte, LocalTime, LocalDateTime, DateTimeFormatter 
	}
}