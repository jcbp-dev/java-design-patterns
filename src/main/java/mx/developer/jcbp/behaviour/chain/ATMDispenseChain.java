package mx.developer.jcbp.behaviour.chain;

public class ATMDispenseChain {
	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		// Amount should be in multiple of 10s.");
		int amount = 790;
		atmDispenser.c1.dispense(new Currency(amount));
	}

}
