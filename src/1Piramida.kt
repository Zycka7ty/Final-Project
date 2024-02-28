fun piramida(bin: Int) {
    for (a in 1..bin) {
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
    piramida(8)
}