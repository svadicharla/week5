package state;

public class DiaperState {

	public static void main(String[] args) {
		Diaper diaper = new Diaper();
		System.out.println(diaper);
		diaper.throwAwayDiapers();
		diaper.unwrapDiapers();
		System.out.println(diaper);
		diaper.getNewDiapers();
		diaper.wrapDiapers();
		System.out.println(diaper);
		diaper.throwAwayDiapers();
		
		diaper.unwrapDiapers();
		System.out.println(diaper);
		diaper.getNewDiapers();
		System.out.println(diaper);
	}

}
