package chap07;

public class _08_Constructor {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();//기본 생성자 호출 가능
		b1.modelName = "하양";
		b1.resolution = "fhd";
		b1.price = 200000;
		b1.color = "노랑색";
		System.out.println(b1.modelName);
		System.out.println(b1.serialNumber);
		
		System.out.println("---------------------------");
		
		BlackBox b2 = new BlackBox("호동이","uhd",300000,"퍼플");
		System.out.println(b2.modelName);
		System.out.println(b2.serialNumber);
		
		
	}
}
