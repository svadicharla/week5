package state;

public class UnwrapDiaper implements State {
	Diaper diaper;
	public UnwrapDiaper(Diaper diaper) {
		this.diaper = diaper;
	}

	@Override
	public void getNewDiapers() {
		System.out.println("Getting new diapers");
		diaper.setState(diaper.getNewState());
	}

	@Override
	public void wrapDiapers() {
		System.out.println("Get new diapers first");

	}

	@Override
	public void unwrapDiapers() {
		System.out.println("Unwrapping diapers");

	}

	@Override
	public void throwAwayDiapers() {
		System.out.println("throwing away dirty diapers");
		diaper.setState(diaper.getDirtyState());
	}
	public String toString() {
		return " unwrap";
	}
}
