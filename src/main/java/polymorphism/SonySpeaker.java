package polymorphism;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker {

	public SonySpeaker() {
		System.out.println("call SonySpeaker constructor");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeUp()
	 */
	@Override
	public void volumeUp(){
		System.out.println("SonySpeaker +");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumeDown()
	 */
	@Override
	public void volumeDown(){
		System.out.println("SonySpeaker -");
	}
	
}
