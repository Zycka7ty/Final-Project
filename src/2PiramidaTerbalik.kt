fun piramidaterbalik(bin: Int) {
    for (a in bin downTo 1) {
        for (b in 1..bin - a) {
            print(" ")
        }
        for (c in 1..2 * a - 1) {
            print("*")
        }
        println()
    }
}

fun main() {
    piramidaterbalik(8)
}