package onlineTest11305;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
	
	BusyLamp busy=new BusyLamp();
	TotalBtn total=new TotalBtn();
	BallotBtn ballot=new BallotBtn();
	Display display=new Display();
	List<Integer> count=new ArrayList<Integer>();
	
	int totalVotes=0;
	
	public void allowVoting(BallotingUnit BU,int candNo){
		ballot.click();
		//busy.setState("On");
		BU.ready.setState("Ready");
	}
	
}
