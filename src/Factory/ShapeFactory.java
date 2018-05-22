package Factory;


/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 14:38
 * @since:V$VERSION
 * @desc:Factory
 */
class ShapeFactory {
	//创建获取形状类型对象
	public Shape getShape( String shapeType ) {
		switch ( shapeType ) {
			case "CIRCLE":
				return new Circle();
			case "RECTANGLE":
				return new Rectangle();
			case "SQUARE":
				return new Square();
			default:
				return null;
		}
	}
}
