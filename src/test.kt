/**
 * <br>
 * function:
 * <p>
 * @author:Yang
 * @date:2018/5/16 20:20
 * @since:V$VERSION
 * @desc:
 */
object test {
	private lateinit var data: ArrayList<String>
	@JvmStatic
	fun main(args: Array<String>) {
//		data = ArrayList()
//		(data as ArrayList<String>).add("asdfasdf")
		println(data?.size ?:0)

	}
}
