package onlineTest11305;

public class EVM {

	 ControlUnit CU;
	 BallotingUnit BU;
	 
	 EVM(int numOfCand){
		 
		 CU=new ControlUnit();
		 BU=new BallotingUnit(numOfCand);
	 }
	 
	 public void addCandidate(String name,int ind){
		 
	 }
}
