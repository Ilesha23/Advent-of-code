fun main(args: Array<String>) {

    fun task1() {
        var time = listOf<Int>()
        var distance = listOf<Int>()
        puzzle.lines()
            .filter { it.isNotBlank() }
            .map {
                val info = it.split(":").first()
                val results = it.split(":")
                    .last()
                    .split(" ")
                    .filter { it.isNotBlank() }
                    .map { it.toInt() }
                if (info == "Time") time = results
                else distance = results
            }

        var count = 0
        var mult = 1
        time.forEachIndexed { index, it ->
            for (i in 1..it) {
                if (i * (it - i) > distance[index]) {
                    count++
                }
            }
            mult *= count
            count = 0
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
                val result = it.split(":")
                    .last()
                    .replace(" ", "")
                    .toLong()
                if (info == "Time") time = result
                else distance = result
            }

        var count = 0L
        for (i in 1..time) {
            if (i * (time - i) > distance) {
                count++
            }
        }
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

