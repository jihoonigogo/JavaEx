package com.javaex.myself.tv;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//초기화 생성자 ?
	public TV () {
		int channel = 7;
		int volume = 20;
		boolean power = false;
		
	}
	//무슨 생성자라고 해야하지 ?
	public TV(int channel, int volume , boolean power) {
		this.channel= channel;
		this.volume=volume;
		this.power= power;				
	}
	
	//getter 
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	//메서드 
	public void power (boolean power) {
		if( power == true ) {
			this.power=power;

			System.out.println("TV 전원이 켜져있습니다.");

		}else if(power ==false) {
			this.power=power;
			System.out.println("TV 전원이 꺼져있습니다.");
		}
		
	}
	// 채널 메서드 int
	public void channel(int channel) {
		this.channel=channel;
	}
	//채널 메서드 boolean
	public void channel(boolean power) {
		if(power == true) {
			System.out.println("채널이 켜져있습니다.");
		}else if( power == false) {
			System.out.println("채널이 꺼져있습니다.");

		}
		
	}
	// 볼륨 메서드 int
	public void volume(int volume) {
	this.volume= volume;
		
	}
	//볼륨 메서드 boolean
    public void volume(boolean power) {
        if(power == true) {
			System.out.println("볼륨이 켜져있습니다.");

		}else if( power == false) {
			System.out.println("볼륨이 켜져있습니다.");

		}
		
	}
	
    //tv정보 출력 
	public void status() {
		System.out.printf("현재 tv의 볼륨은 %s , 채널은 %s번 입니다 %n",volume,channel);
	}
}
