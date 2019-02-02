package qsp;

public class Account {
	private int bal;
	private String name;
	private int pin = 1234;

	public void setbal(int bal) {
		if (bal > 0) {
			this.bal = bal;

		} else {
			System.out.println("invalid balance");
		}

	}

	public int getBal(int pin) {
		if (this.pin == pin) {
			return bal;
		} else {
			System.out.println("invalid pin");
		}
		return 0;
	}

}
