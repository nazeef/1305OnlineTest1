package onlineTest11305;

import java.util.ArrayList;
import java.util.List;

public class BallotingUnit {

	List<BUSlot> slots=new ArrayList<BUSlot>();
	BUReadyLamp ready=new BUReadyLamp();
	
	BallotingUnit(int numOfCandidates){
		
		 for(int i=0;i<numOfCandidates;i++){
			 slots.add(new BUSlot());
		 }
	}
	
	public void addCandidate(String name,int index){
		 slots.get(index).cand.setName(name);
	}
	
	public int allowVoting(int candNo){
		
		if(ready.getState().equals("Ready")){
			slots.get(candNo).blue.click();
			slots.get(candNo).lamp.setState("Blinking");
			return 1;
		}
		return 0;
	}
}
