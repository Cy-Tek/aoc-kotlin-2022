fun main() {
    fun part1(input: String): Int {
        return input.split("\n\n").maxOf { snacks ->
            snacks.lines().sumOf { it.toInt() }
        }
    }

    fun part2(input: String): Int {
        return input.split("\n\n").map { snacks ->
            snacks.lines().sumOf { it.toInt() }
        }.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readFile("inputs/Day01_test")
    check(part1(testInput) == 24000)

    val input = readFile("inputs/Day01")
    println(part1(input))
    println(part2(input))
}
