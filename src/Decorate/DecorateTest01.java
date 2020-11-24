package Decorate;

// ʵ�ַŴ����������ķŴ���

public class DecorateTest01 {

	public static void main(String[] args) {
		Person p = new Person();
		p.say();
		
		// װ��(ԭ��Ϊ10��װ��֮��Ϊ1000)
		Amplifier am = new Amplifier(p);
		am.say();
	}
}

// �ӿ�
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
	Amplifier(Person p){ // ������
		this.p = p;
	}
	
	public void say() {
		System.out.println("voice:" + p.getVoice()*100);
		System.out.println("����");
	}
}
