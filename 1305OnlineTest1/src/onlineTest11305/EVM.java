package onlineTest11305;

public class EVM {       

	//  Acts as proxy class for control unit and balloting unit
	//  Also acts as facade main class as simplifies interface
	
	
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
		 CU.reset();
	 }
	 
	 public int readResultEachCandidate(int candNo){
		 return CU.displayResultEachCandidate(candNo);
	 }
	 
	 public void readResult(){
		 CU.displayResult(BU,3);
	 }
	 
	 public void resetCounter(){
		 CU.reset();
	 }
	 	 
	 
}
