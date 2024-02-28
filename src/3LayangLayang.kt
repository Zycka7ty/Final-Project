fun layanglayang(bin: Int) {
    for (a in 1..bin) {
        for (b in 1..bin - a) {
            print(" ")
        }
        for (c in 1..2 * a - 1) {
            print("*")
        }
        println()
    }
    for (a in bin - 1 downTo 1) {
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
    layanglayang(8)
}