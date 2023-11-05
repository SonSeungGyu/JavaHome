package chap07;

import chap07.camera.Camera;
import chap07.camera.FactoryCam;
import chap07.camera.SpeedCam;

public class _14_Polymorphism {
	public static void main(String[] args) {
		//다형성
		
		Camera camera = new Camera();
		Camera factoryCam = new FactoryCam();
		Camera speedCam = new SpeedCam();
		
		camera.showMainFeature();
		factoryCam.showMainFeature();
		speedCam.showMainFeature();
		
		System.out.println("-----------------------------------");
		
		Camera[] cameras = new Camera[3];
		cameras[0] = new Camera();
		cameras[1] = new FactoryCam();
		cameras[2] = new SpeedCam();
		
		for (Camera cam : cameras) {
			cam.showMainFeature();
		}
		
		System.out.println();
		
		if(camera instanceof Camera) {//camera 가 Camera의 인스턴스인지 확인
			System.out.println("카메라입니다.");
		}
		if(factoryCam instanceof FactoryCam) {
			((FactoryCam)factoryCam).detectFire();//형변환을 이용해 FactoryCam의 메소드를 이용
		}
		if(speedCam instanceof SpeedCam) {
			((SpeedCam)speedCam).checkSpeed();
			((SpeedCam)speedCam).recognuzeLicensePlate();;
		}
		
	}
}
