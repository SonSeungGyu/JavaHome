package chap03;

public class _04_EscapeSequence {
	public static void main(String[] args) {
		//특수문자, 이스케이프 문자 
		System.out.println("자바가");
		System.out.println("너무");
		System.out.println("재밌어요");
		
		// \n : 줄바꿈
		System.out.println("자바가\n너무\n재밌어요");
		
		//해물파전 		9000원
		//김치전 		8000원
		//부추전 		8000원
		System.out.println("해물파전\t\t9000원");
		System.out.println("김치전\t\t8000원");
		System.out.println("부추전\t\t8000원");
		
		// \\ : 하나의 역슬래쉬로 인식
		System.out.println("C:\\Prgrams Files\\Java");
		
		// \" : 큰따옴표 
		//단비가 "냐옹" 이라고 했다
		System.out.println("단비가 \"냐옹\"이라고 했어요");
		
		// \' : 작은따옴표
		//단비가 '뭘 봐' 라는 표정을 지었다.
		System.out.println("단비가 \'뭘 봐\'라는 표정을 지었다.");
		
		
		char c = 'A';
		c = '\'';
		System.out.println(c);
	}
}
