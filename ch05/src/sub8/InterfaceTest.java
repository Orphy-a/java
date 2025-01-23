package sub8;

import java.rmi.Remote;

/*
 * 날짜 : 2025/01/10
 * 이름 : 오재영
 * Java 추상 실습
 * */
public class InterfaceTest {
	
	public static void main(String[] args) {
		
		//인터페이스 예제1 - 표준화된 공통 클래스 구조 설계
		RemoteLG lg = new RemoteLG();
		RemoteSamsung samsung = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.chDown();
		lg.soundUp();
		lg.soundDown();
		lg.powerOff();
		
		samsung.powerOn();
		samsung.chUp();
		samsung.chDown();
		samsung.soundUp();
		samsung.soundDown();
		samsung.powerOff();
		
		
		//인터페이스 예제2 - 유연성(다형성을 통한 결합도 완화)
		
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		//인터페이스 예제3 - 다중 상속 효과 
		SmartTV stv = new SmartTV();
		stv.process();
		
		
		
		
		
		
	}
}
