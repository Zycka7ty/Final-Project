fun bentukx(bin: Int) {
    for (a in 1..bin) {
        for (b in 1..bin) {
            if (b == a || b == bin - a + 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}

fun main() {
    bentukx(8)
}