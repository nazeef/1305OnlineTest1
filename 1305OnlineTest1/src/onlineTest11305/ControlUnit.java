package onlineTest11305;

import java.util.ArrayList;
import java.util.List;

public class ControlUnit {
	
	BusyLamp busy=new BusyLamp();
	TotalBtn total=new TotalBtn();
	BallotBtn ballot=new BallotBtn();
	Display display=new Display();
	int[] count=new int[20];
	
	int totalVotes=0;	
	

	                  // voting
	public void allowVoting(BallotingUnit BU,int candNo){
		ballot.click();
		busy.setState("On");
		BU.ready.setState("Ready");
		
		if(BU.allowVoting(candNo)==1){		 // check if vote casted
		   count[candNo]++;
		   totalVotes++;
		   //System.out.println("voted"+count[candNo]);
		} 
		
		busy.setState("Off");
	    BU.ready.setState("Off");
		
	}
	
	
	public int getTotalVotes() {
		return totalVotes;
	}

	
	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}
	
	//   display result-------------------------
	public void displayResult(BallotingUnit BU,int numOfCand){
		
		for(int i=0;i<numOfCand;i++){
			System.out.println(BU.slots.get(i).cand.getName()+" ==> "+count[i]);
		}
	}
	
	//  reset
	public void reset(){
		this.totalVotes=0;
		for(int i=0;i<20;i++){
			count[i]=0;
		}
	}
	
}
