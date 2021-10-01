package state;

public class Diaper {
	State newDiaperState;
	State dirtyState;
	State unwrapState;
	State wrapState;
	State state;
	public Diaper() {
		newDiaperState = new NewDiapersState(this);
		dirtyState = new DirtyState(this);
		unwrapState = new UnwrapDiaper(this);
		wrapState = new WrapDiaperState(this);
		state = newDiaperState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getNewState() {
		return newDiaperState;
	}
	public State getDirtyState() {
		return dirtyState;
	}
	public State getWrapState() {
		return wrapState;
	}
	public State getUnwrapState() {
		return unwrapState;
	}
	public void getNewDiapers() {
		state.getNewDiapers();
	}
	public void throwAwayDiapers() {
		state.throwAwayDiapers();
	}
	public void unwrapDiapers() {
		state.unwrapDiapers();
	}
	public void wrapDiapers() {
		state.wrapDiapers();
	}
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n----------Baby care --------\n");
		
		result.append("Diapers " + state + "\n");
		
		return result.toString();
	}

}
