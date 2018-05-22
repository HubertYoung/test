package bridge;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 15:15
 * @since:V$VERSION
 * @desc:bridge
 */
class GreenCircle implements DrawAPI {
	@Override
	public void drawCircle( int radius, int x, int y ) {
		System.out.println( "Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]" );
	}
}
