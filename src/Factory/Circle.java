package Factory;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 14:40
 * @since:V$VERSION
 * @desc:Factory
 */
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
