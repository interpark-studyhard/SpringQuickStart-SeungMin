package polymorphism;

public class SamTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamTV() {
		System.out.println("call samTv constructor");
	}
	
	public SamTV(Speaker speaker) {
		System.out.println("call samTv constructor(2)");
		this.speaker = speaker;
	}
	
	public SamTV(Speaker speaker, int price) {
		System.out.println("call samTv constructor(3)");
		this.speaker = speaker;
		this.price = price;
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("call setSpeaker method");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("call setPrice method");
		this.price = price;
	}

	public void initSamTv(){
		System.out.println("initSamTv");
	}
	
	public void destroySamTv(){
		System.out.println("destroySamTv");
	}
	
	public void powerOn() {
		System.out.println("SamTV on & (price:"+price+")");
	}
	
	public void powerOff() {
		System.out.println("SamTV off");
	}
	
	public void volumeUp() {
		System.out.println("SamTV volume +");
//		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		System.out.println("SamTV volume -");
//		speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}
