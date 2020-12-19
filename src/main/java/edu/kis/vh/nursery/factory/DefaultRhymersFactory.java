RhymersFactorypackage edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCounterOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCounterOutRhymer GetStandardRhymer() {
		return new DefaultCounterOutRhymer();
	}

	@Override
	public DefaultCounterOutRhymer GetFalseRhymer() {
		return new DefaultCounterOutRhymer();
	}

	@Override
	public DefaultCounterOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCounterOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
