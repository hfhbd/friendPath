package foo

fun main() {
    val holder = lib2.MyAnyDataClass(42)
    if (holder.s is Int) {
        val a: Int = holder.s
        println(a)
    }
}
