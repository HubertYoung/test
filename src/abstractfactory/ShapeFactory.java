package abstractfactory;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 14:46
 * @since:V$VERSION
 * @desc:abstractfactory
 */
class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape( String shapeType ) {
		if ( shapeType == null ) {
			return null;
		}
		if ( shapeType.equalsIgnoreCase( "CIRCLE" ) ) {
			return new Circle();
		} else if ( shapeType.equalsIgnoreCase( "RECTANGLE" ) ) {
			return new Rectangle();
		} else if ( shapeType.equalsIgnoreCase( "SQUARE" ) ) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor( String color ) {
		return null;
	}
}