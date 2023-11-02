package chap07;

public class _10_AccessMidifier {
	public static void main(String[] args) {
		
		//캡슐화  : 관련이 있는 기능들을 하나의 클래스에 
		//정보은닉  : 정보를 숨긴다, 객체 내에 있는 변수나 메소드에 직접적인 접근을 막고 객체에서 허용하는 메소드로만
	    //접근 할수 있도록
		
		//접근 제어자
		//private : 해당 클래스 내에서만 접근 가능
		//public : 모든 클래스에서 접근이 가능
		//default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
		//protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래서에서 접근 가능
		
		BlackBoxRefur b1 = new BlackBoxRefur();
		b1.modelName = "노랑이";
		b1.resolution = "fhd";
		b1.setPrice(200000);
		b1.color = "블랙";
		
		//할인행사
		b1.setPrice(-5000);
		System.out.println("가격 : " + b1.getPrice() + "원");
		
		System.out.println("해상도 : " + b1.resolution);
		
		BlackBoxRefur b2 = new BlackBoxRefur();
		b2.setModelName("하양이");
		b2.setPrice(-5000);
		b2.setColor("호ㅏ이트");
		
		System.out.println("가격 : " + b2.getPrice() + "원");
		System.out.println("해상도 : " + b2.getResolution());

	}
}
