package 프로젝트20251204;

public class MyRectangle {
	private int x, y;
	int width;
	private int height;
	
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void resize(int newW, int newH) {
		width = newW;
		height = newH;
	}
	
	public int getArea() {
		return width * height;
	}
}
