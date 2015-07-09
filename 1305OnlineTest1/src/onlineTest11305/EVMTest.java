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
		
		evm.vote(0);                          // voting
		evm.vote(1);
		evm.vote(0);
		assertEquals(3,evm.totalCount());
		evm.vote(2);
		evm.vote(0);
		
		assertEquals(5,evm.totalCount());      
		
		assertEquals(3,evm.readResultEachCandidate(0));       // result of candidate no 0
		assertEquals(1,evm.readResultEachCandidate(1));       // result of candidate no 1
		
		
		evm.resetCounter();                                  // reset counter
		assertEquals(0,evm.readResultEachCandidate(0));       // result of candidate no 0 after reset

		
		evm.closePoll();                                      // close polling  		
		assertEquals(0,evm.totalCount());  
		
		
	}

}
