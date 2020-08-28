package Team_4;

public class Stock {
	private int water;
	private int milk;
	private int syrup;
	private int whipping;
	private int shot;
	private int money;
	public Stock(){
		this(100, 100, 100, 100, 100, 100000);
	}
	public Stock(int water, int milk, int syrup, int whipping, int shot, int money){
		this.water = water;
		this.milk = milk;
		this.syrup=syrup;
		this.whipping=whipping;
		this.shot = shot;
		this.money = money;
	}
	public void water1() {
		water--;
	}
	public void milk1() {
		milk--;
	}
	public void syrup1() {
		syrup--;
	}
	public void whipping1() {
		whipping--;	
	}
	public void shot1() {
		shot--;
	}
	public void setMoney(int money) {
		this.money += money;
	}	
	public int getMoney() {
		return money;
	}
	public int getWater() {
		return water;
	}
	public int getMilk() {
		return milk;
	}
	public int getSyrup() {
		return syrup;
	}
	public int getWhipping() {
		return whipping;
	}
	public int getShot() {
		return shot;
	}	
}