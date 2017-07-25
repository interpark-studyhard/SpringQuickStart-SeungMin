package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
//	@Qualifier("apple")
//	@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("call LgTV constructor");
	}

	public void turnOn() {
		System.out.println("LgTV on");
	}
	
	public void turnOff() {
		System.out.println("LgTV off");
	}
	
	public void soundUp() {
		System.out.println("LgTV volume +");
	}
	
	public void soundDown() {
		System.out.println("LgTV volume -");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("LgTV volume +");
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTV volume -");
		speaker.volumeDown();
	}
}
