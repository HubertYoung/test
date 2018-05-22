package bridge;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 15:17
 * @since:V$VERSION
 * @desc:bridge
 */
class Circle  extends Shape {
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius,x,y);
	}
}
