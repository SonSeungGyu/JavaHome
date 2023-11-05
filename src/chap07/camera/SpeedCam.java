package chap07.camera;



public class SpeedCam extends Camera{
	public String name;
	
	public SpeedCam() {
		this.name = "과속단속 카메라";
	}
	

	
	public void checkSpeed() {
		System.out.println("속도를 축정합니다.");
	}
	
	public void recognuzeLicensePlate() {
		System.out.println("차량 번호를 인식합니다.");
	}
	
	@Override
	public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 속도 측정 , 차량 번호 인식");
	}
}
