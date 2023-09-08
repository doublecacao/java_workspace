package day10;

public class class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t1 = new TV("100inch","LG", 40000000);
		t1.tvPowerOnOff();
		t1.tvChannelUp();
		t1.tvChannelDown();
		t1.tvChannelDown();
		t1.tvChannelDown();
		t1.tvVolumeDown();
		t1.tvVolumeDown();
		t1.tvVolumeDown();
		t1.tvVolumeDown();
		t1.tvVolumeDown();
		t1.tvPowerOnOff();
		t1.tvChannelUp();
	}

}

class TV{
	private String tvSize;
	private String tvModel;
	private int tvPrice;
	private int tvChannel=1;
	private int tvVolume;
	private boolean tvPower;
	private int tvPowerC;
	
	
	
	public TV() {}
	public TV(String tvSize, String tvModel, int tvPrice) {
		this.tvSize = tvSize;
		this.tvModel = tvModel;
		this.tvPrice = tvPrice;
	}
	
	
	
	
	public void tvPowerOnOff() {
		tvPowerC++;
		if(tvPowerC%2==0) {
			System.out.println("전원이 꺼졌습니다.");
			tvPower=false;
		}else {
			System.out.println("전원이 켜졌습니다.");
			System.out.println("현재채널: "+tvChannel);
			tvPower=true;
		}
	}
	
	public void tvChannelUp() {
		if(tvPower) {
			tvChannel++;
			if(tvChannel>20) {
				tvChannel=1;
			}
			System.out.println("현재채널: "+tvChannel);
		}else {
			System.out.println("TV전원을 켜주세요.");
		}
		
	}
	public void tvChannelDown() {
		if(tvPower){
			tvChannel--;
			if(tvChannel==0) {
				tvChannel=20;
			}
			System.out.println("현재채널: "+tvChannel);
		}else {
			System.out.println("TV전원을 켜주세요.");
		}
	}
	
	public void tvVolumeUp() {
		if(tvPower) {
			if(tvVolume==100) {
				System.out.println("현재음량: "+tvVolume);
			}else {
				tvVolume++;
				System.out.println("현재음량: "+tvVolume);
			}
		}else {
			System.out.println("TV전원을 켜주세요.");
		}
	}
	public void tvVolumeDown() {
		if(tvPower) {
			if(tvVolume==0) {
				System.out.println("음소거");
			}else {
				tvVolume--;
				System.out.println("현재음량: "+tvVolume);
			}
		}else {
			System.out.println("TV전원을 켜주세요.");
		}
	}
	
	
	
	
	public String getTvSize() {
		return tvSize;
	}
	public void setTvSize(String tvSize) {
		this.tvSize = tvSize;
	}
	public String getTvModel() {
		return tvModel;
	}
	public void setTvModel(String tvModel) {
		this.tvModel = tvModel;
	}
	public int getTvPrice() {
		return tvPrice;
	}
	public void setTvPrice(int tvPrice) {
		this.tvPrice = tvPrice;
	}
	public int getTvChannel() {
		return tvChannel;
	}
	public void setTvChannel(int tvChannel) {
		this.tvChannel = tvChannel;
	}
	public int getTvVolume() {
		return tvVolume;
	}
	public void setTvVolume(int tvVolume) {
		this.tvVolume = tvVolume;
	}
	public boolean getTvPower() {
		return tvPower;
	}
	public void setTvPower(boolean tvPower) {
		this.tvPower = tvPower;
	}
	public int getTvPowerC() {
		return tvPowerC;
	}
	public void setTvPowerC(int tvPowerC) {
		this.tvPowerC = tvPowerC;
	}
}