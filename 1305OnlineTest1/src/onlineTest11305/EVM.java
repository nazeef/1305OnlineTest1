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
	 
	 public void vote(int candNo){
		 
	 }
	 
	 public int totalCount(){
		 
		return 0;		 
	 }
	 
	 public void closePoll(){
		 
	 }
	 
	 public void readResult(){
		 
	 }
	 
	 public void resetCounter(){
		 
	 }
	 
	
	 
	 
}
