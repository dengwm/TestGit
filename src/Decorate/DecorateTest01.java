package Decorate;

// 实现放大器对声音的放大功能

public class DecorateTest01 {

	public static void main(String[] args) {
		Person p = new Person();
		p.say();
		
		// 装饰(原本为10，装饰之后为1000)
		Amplifier am = new Amplifier(p);
		am.say();
	}
}

// 接口
interface Say{
	void say();
}

class Person implements Say{
	private int voice = 10;

	@Override
	public void say() {
		System.out.println("voice:" + this.getVoice());
	}

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}
}

class Amplifier implements Say{
	private Person p;
	Amplifier(Person p){ // 构造器
		this.p = p;
	}
	
	public void say() {
		System.out.println("voice:" + p.getVoice()*100);
		System.out.println("噪音");
	}
}
