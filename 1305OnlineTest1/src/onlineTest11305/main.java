package onlineTest11305;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EVM evm=new EVM(3);
        evm.addCandidate("a",0);
        evm.addCandidate("b",1);
        evm.addCandidate("c",2);
      //  System.out.println(evm.BU.slots.get(0).cand.getName());
        System.out.println("-----------Vote------------------");
        evm.vote(0);
        
        System.out.println("------------Vote-----------------");
        evm.vote(1);
        
        System.out.println("------------Vote-----------------");
        evm.vote(0);
        
        
        System.out.println(evm.totalCount());
        
        System.out.println("---------Results-------------------------");
        evm.readResult();
        
        System.out.println("------reset----------");
        evm.resetCounter();
        evm.totalCount();
        evm.readResult();
	}

}
