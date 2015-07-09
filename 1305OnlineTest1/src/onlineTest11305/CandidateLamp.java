package onlineTest11305;

public class CandidateLamp extends Lamp{

	public void showStatus(){
		System.out.println("Candidate Lamp is "+this.getState());
	}
	
	@Override
	public void setState(String state) {
		this.state = state;
		this.showStatus();
	}
}
