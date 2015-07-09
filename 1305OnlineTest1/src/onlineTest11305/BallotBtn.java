package onlineTest11305;

public class BallotBtn  extends Button{

	
	public void click(BallotingUnit BU) {
		// TODO Auto-generated method stub
		System.out.println("Ballot button clicked");
		BU.ready.setState("Ready");
	}

}
