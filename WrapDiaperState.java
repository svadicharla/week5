package state;

public class WrapDiaperState implements State {
	Diaper diaper;
	public WrapDiaperState(Diaper diaper) {
		this.diaper = diaper;
	}

	@Override
	public void getNewDiapers() {
		System.out.println("You already have new diaper");

	}

	@Override
	public void wrapDiapers() {
		System.out.println("Wrapping diaper");

	}

	@Override
	public void unwrapDiapers() {
		System.out.println("Unwrapping diaper");
		diaper.setState(diaper.getUnwrapState());
	}

	@Override
	public void throwAwayDiapers() {
		System.out.println("you have to unwrap diaper first to throw away");

	}
	public String toString() {
		return " wrap";
	}
}
