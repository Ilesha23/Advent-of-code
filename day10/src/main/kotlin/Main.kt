fun main(args: Array<String>) {
    task1()
}

fun task1() {
    var steps = 0
    val grid = puzzle.lines().filter { it.isNotBlank() }.map { it.toList() }
    var current = 0 to 0
    grid.forEachIndexed { index, it ->
        if (it.contains('S')) {
            current = index to it.indexOf('S')
        }
    }

    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    for (i in -1..1) {
        for (j in -1..1) {

        }
    }

}

const val puzzle = """
.....
.S-7.
.|.|.
.L-J.
.....
"""