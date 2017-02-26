package lcdnumbers

object Patterns {
    val lcdByDigit = mapOf(
            0 to listOf (
                    Line(" - "),
                    Line("| |"),
                    Line("   "),
                    Line("| |"),
                    Line(" - ")),
            1 to listOf (
                    Line("   "),
                    Line("  |"),
                    Line("   "),
                    Line("  |"),
                    Line("   ")),
            2 to listOf (
                    Line(" - "),
                    Line("  |"),
                    Line(" - "),
                    Line("|  "),
                    Line(" - ")),
            3 to listOf (
                    Line(" - "),
                    Line("  |"),
                    Line(" - "),
                    Line("  |"),
                    Line(" - ")),
            4 to listOf (
                    Line("   "),
                    Line("| |"),
                    Line(" - "),
                    Line("  |"),
                    Line("   ")),
            5 to listOf (
                    Line(" - "),
                    Line("|  "),
                    Line(" - "),
                    Line("  |"),
                    Line(" - ")),
            6 to listOf (
                    Line(" - "),
                    Line("|  "),
                    Line(" - "),
                    Line("| |"),
                    Line(" - ")),
            7 to listOf (
                    Line(" - "),
                    Line("  |"),
                    Line("   "),
                    Line("  |"),
                    Line("   ")),
            8 to listOf (
                    Line(" - "),
                    Line("| |"),
                    Line(" - "),
                    Line("| |"),
                    Line(" - ")),
            9 to listOf (
                    Line(" - "),
                    Line("| |"),
                    Line(" - "),
                    Line("  |"),
                    Line(" - "))
            )

    fun of(digit: Int): List<Line> {
        val result = lcdByDigit.get(digit)
        if (result == null) throw IllegalArgumentException("no pattern defined for digit " + digit)
        return result
    }

}