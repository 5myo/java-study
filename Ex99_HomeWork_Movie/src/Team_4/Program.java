package Team_4;

public class Program {

	public static void main(String[] args) {
		Cinema c = new Cinema();	
		while(true) {
			switch (c.showMenu()) {
			case "1": c.selectSeat();			
				break;
			case "2": c.showTicket();			
				break;
			case "3" : c.cancleTickt();
				break;
			default: 
				break;
			}
		}

	}

}
