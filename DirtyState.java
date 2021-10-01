package state;

public class DirtyState implements State {
	Diaper diaper;
	public DirtyState(Diaper diaper) {
		this.diaper = diaper;
	}

	@Override
	public void getNewDiapers() {
		System.out.println("Get new diapers");
		diaper.setState(diaper.getNewState());
	}

	@Override
	public void wrapDiapers() {
		System.out.println("Diapers dirty cannot be used");

	}

	@Override
	public void unwrapDiapers() {
		System.out.println("Unwrapping dirty diapers");
		diaper.setState(diaper.getUnwrapState());
	}

	@Override
	public void throwAwayDiapers() {
		System.out.println("Unwrap diapers first");

	}
	public String toString() {
		return " dirty";
	}
}
