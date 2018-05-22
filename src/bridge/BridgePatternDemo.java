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
class BridgePatternDemo {
	public static void main( String[] args ) {
		Shape redCircle = new Circle( 100, 100, 10, new RedCircle() );
		Shape greenCircle = new Circle( 100, 100, 10, new GreenCircle() );

		redCircle.draw();
		greenCircle.draw();
	}
}
