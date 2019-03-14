package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer defaultCountingOutRhymer = new DefaultCountingOutRhymer();
	
	@Override
	public int countOut() {
		while (!callCheck())
			
		defaultCountingOutRhymer.countIn(super.countOut());
		
		int countOut = defaultCountingOutRhymer.countOut();
		
		while (!defaultCountingOutRhymer.callCheck())
			
		countIn(defaultCountingOutRhymer.countOut());
		
		return countOut;
	}
}
