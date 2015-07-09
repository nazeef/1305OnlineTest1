package onlineTest11305;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EVM evm=new EVM(3);
        evm.addCandidate("a",0);
        evm.addCandidate("b",1);
        evm.addCandidate("c",2);
      //  System.out.println(evm.BU.slots.get(0).cand.getName());
        evm.vote(0); evm.vote(0); evm.vote(0);
        System.out.println(evm.totalCount());
        
        System.out.println("Results-------------------------");
        evm.readResult();
	}

}
