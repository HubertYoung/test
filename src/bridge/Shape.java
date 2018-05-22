package bridge;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 15:16
 * @since:V$VERSION
 * @desc:bridge
 */
abstract class Shape {
	protected DrawAPI drawAPI;

	protected Shape( DrawAPI drawAPI ) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
