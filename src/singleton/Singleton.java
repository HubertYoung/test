package singleton;

/**
 * <br>
 * function:
 * <p>
 *
 * @author:Yang
 * @date:2018/5/22 14:58
 * @since:V$VERSION
 * @desc:singleton
 */
class Singleton {
	private volatile static Singleton mSingleton;

	public static Singleton getmSingleton() {
		if(mSingleton == null) {
		    synchronized ( Singleton.class ){
				if(mSingleton == null) {
					mSingleton = new Singleton();
				}
			}
		}
		return mSingleton;
	}
}
