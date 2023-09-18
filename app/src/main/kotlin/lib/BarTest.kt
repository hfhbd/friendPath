package lib

fun main() {
    val holder = MyInternalDataClass(42)
    if (holder.s is Int) {
        val a: Int = holder.s
        println(a)
    }
}
