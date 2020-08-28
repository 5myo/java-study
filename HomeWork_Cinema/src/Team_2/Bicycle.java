package Team_2;

public class Bicycle {
	private int wheel;
	private int body;
	private int handle;
	private String color;
	static int count;

	public Bicycle() {
		this("black");
	}

	public Bicycle(String color) {
		this.wheel = 17;
		this.handle = 30;
		this.body = 200;
		this.color = color;
	}

	public int getWheel() {
		return wheel;
	}

	public int getBody() {
		return body;
	}

	public int getHandle() {
		return handle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}