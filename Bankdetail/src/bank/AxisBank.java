package bank;
public class AxisBank extends BankInfo {
	    public void deposit() {
	        System.out.println("Axis Bank Deposit: Minimum deposit ₹500");
	    }

	    public static void main(String[] args) {
	        AxisBank bank = new AxisBank();
	        bank.saving();
	        bank.fixed();
	        bank.deposit(); 
	    }
	}


