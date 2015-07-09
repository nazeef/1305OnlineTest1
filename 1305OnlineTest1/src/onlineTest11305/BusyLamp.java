package onlineTest11305;

public class BusyLamp  extends Lamp{
     
	public void beep(){
		System.out.println("Beep sound");
	}
	
	public void showStatus(){
		System.out.println("Busy Lamp on CU is "+this.getState());
		beep();
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
		this.showStatus();
	}
}
