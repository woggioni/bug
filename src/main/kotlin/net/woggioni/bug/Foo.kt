package net.woggioni.bug

class Foo {

    fun method1(s: String = "") {}

    @JvmOverloads
    fun method2(s: String = "") {
    }

    fun method3(i: Int, s: String = "") {}

    @JvmOverloads
    fun method4(i: Int, s: String = "") {
    }

    fun method5(i : Int, s : String) {}
}