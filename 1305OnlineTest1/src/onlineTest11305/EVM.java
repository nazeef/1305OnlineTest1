package onlineTest11305;

public class EVM {

	 ControlUnit CU;
	 BallotingUnit BU;
	 
	 EVM(int numOfCand){
		 
		 CU=new ControlUnit();
		 BU=new BallotingUnit(numOfCand);
	 }
	 
	 public void addCandidate(String name,int ind){
		 BU.addCandidate(name, ind);
	 }
	 
	 public void vote(int candNo){         // voting
		 CU.allowVoting(BU, candNo);
	 }
	 
	 public int totalCount(){
		 
		return CU.getTotalVotes();		 
	 }
	 
	 public void closePoll(){
		 
	 }
	 
	 public void readResult(){
		 CU.displayResult(BU,3);
	 }
	 
	 public void resetCounter(){
		 
	 }
	 
	
	 
	 
}
