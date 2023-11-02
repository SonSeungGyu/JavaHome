package chap03;

public class Quiz {
	public static void main(String[] args) {
		String s = "907123-1234561";
		String s2 = "030708-4123456";
		
		System.out.println(s.substring(0,8));//0위치부터 8 위치까지
		System.out.println(s2.substring(0,8));
		System.out.println(s.substring(0,s.indexOf("-")+2));
		//0위치부터 하이픈 위치 +2 직전까지
	}
}
