package onlineTest11305;

import static org.junit.Assert.*;

import org.junit.Test;

public class EVMTest {

	EVM evm=new EVM(3);
	@Test
	public void testTotalCount() {
		evm.addCandidate("mario",0);
		evm.addCandidate("sudin",1);
		evm.addCandidate("paresh",2);
		
		evm.vote(0);
		evm.vote(1);
		evm.vote(0);
		evm.vote(2);
		evm.vote(0);
		
		assertEquals(5,evm.totalCount());
		
		
	}

}
