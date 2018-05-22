package singleton;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 15:00
 * @since:V$VERSION
 * @desc:singleton
 */
class SingletonNew {
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
