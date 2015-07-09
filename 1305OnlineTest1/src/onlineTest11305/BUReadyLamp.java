package onlineTest11305;

public class BUReadyLamp extends Lamp{
	
	public void showStatus(){
		System.out.println("Ready Lamp is "+this.getState());
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
		this.showStatus();
	}
	
}
