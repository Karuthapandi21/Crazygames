package Bank;
public class AxisBank{
	public class AxisBank extends BankInfo {
	    public void deposit() {
	        System.out.println("Deposit Amount in Axis Bank: 1,50,000");
	    }
	    public static void main(String[] args) {
	         AxisBank ab = new AxisBank();
	        ab.saving();   
	        ab.fixed();   
	        ab.deposit();  
	    }
	}

}
