package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCounterOutRhymer;

	public interface RhymersFactory {
	
		public DefaultCounterOutRhymer GetStandardRhymer();
		
		public DefaultCounterOutRhymer GetFalseRhymer();
		
		public DefaultCounterOutRhymer GetFIFORhymer();
		
		public DefaultCounterOutRhymer GetHanoiRhymer();
		
	}
