package chap07.camera;

public class FactoryCam extends Camera{
	
	
	public FactoryCam() {
		super("공장 카메라");
	}
	
	public void recordVideo() {
		//동영상 녹화
		super.recordVideo();//부모클래스의 recordVideo 호출 
		detectFire();//자식 클래스의 메소드 호출
	}
	
	public void detectFire() {
		System.out.println("화재를 감지합니다.");
	}
	
	@Override
	public void showMainFeature() {
		System.out.println(this.name + "의 주요 기능 : 화재 감지");
	}
}
