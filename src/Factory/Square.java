package Factory;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 14:37
 * @since:V$VERSION
 * @desc:Factory
 */
class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
