package lcdnumers

import io.kotlintest.specs.FunSpec
import lcdnumbers.Line

class PatternsTest : FunSpec() { init {

    test("Patterns.of(1) should return the right list of strings") {
        listOf(
            Line("  x "),
            Line("  |"),
            Line("   "),
            Line("  |"),
            Line("   ")
        )
    }

}}