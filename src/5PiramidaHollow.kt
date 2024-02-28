fun piramidahollow(bin: Int) {
    for (a in 1..bin) {
        for (b in 1..bin - a) {
            print(" ")
        }
        for (c in 1..2 * a - 1) {
            if (c == 1 || c == 2 * a - 1 || a == bin) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun main() {
    piramidahollow(8)
}