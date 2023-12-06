fun main(args: Array<String>) {

    fun task1() {
        var times = listOf<Int>()
        var distances = listOf<Int>()
        puzzle.lines()
            .filter { it.isNotBlank() }
            .map {
                val info = it.split(":").first()
                val results = it.split(":").last().split(" ").filter { it.isNotBlank() }.map { it.toInt() }
                if (info == "Time") times = results
                else distances = results
            }

        var count: Int
        var mult = 1
        times.forEachIndexed { index, time ->
            count = (1..time).count { it * (time - it) > distances[index] }
            mult *= count
        }
        println(mult)
    }

    fun task2() {
        var time = 0L
        var distance = 0L
        puzzle.lines()
            .filter { it.isNotBlank() }
            .map {
                val info = it.split(":").first()
                val result = it.split(":").last().replace(" ", "").toLong()
                if (info == "Time") time = result
                else distance = result
            }

        var count = 0L
        count += (1..time).count { it * (time - it) > distance }
        println(count)
    }

    task1()
    task2()

}

const val puzzle = """
Time:        40     82     84     92
Distance:   233   1011   1110   1487
"""

//const val puzzle = """
//Time:      7  15   30
//Distance:  9  40  200
//"""

