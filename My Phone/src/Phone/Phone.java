package Phone;

public class Phone{
 public void phoneInfo() {
	        System.out.println("Phone Info: Default Phone");
	    }
	     public void phoneInfo(String brand, int price) {
	        System.out.println("Brand: " + brand + ", Price: " + price);
	    }
	    public void phoneInfo(int price, String brand) {
	        System.out.println("Price: " + price + ", Brand: " + brand);
	    }
	    public static void main(String[] args) {
	        Phone p = new Phone();
	        p.phoneInfo();                         
	        p.phoneInfo("Samsung", 15000);         
	        p.phoneInfo(20000, "iPhone");          
	    }
	}


