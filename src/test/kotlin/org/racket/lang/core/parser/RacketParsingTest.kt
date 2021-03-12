package org.racket.lang.core.parser

import com.intellij.testFramework.ParsingTestCase

class RacketParsingTest : ParsingTestCase("", "rkt", RacketParserDefinition()) {
    fun testParsingTestData() {
        doTest(true)
    }

    fun testParsingTestData2() {
        doTest(true)
    }

    fun testParsingIdentifiers() {
        doTest(true)
    }

    fun testParsingSymbols() {
        doTest(true)
    }

    fun testParsingStrings() {
        doTest(true)
    }

    fun testParsingBytes() {
        doTest(true)
    }

    fun testParsingCharacters() {
        doTest(true)
    }

    //    public void testParsingCharactersError() { doTest(true); }
    fun testParsingNumbers() {
        doTest(true)
    }

    fun testParsingNumber16s() {
        doTest(true)
    }

    fun testParsingSpecialNumbers() {
        doTest(true)
    }

    fun testParsingRationalNumbers() {
        doTest(true)
    }

    fun testParsingRealNumbers() {
        doTest(true)
    }

    fun testParsingInexactNumbers() {
        doTest(true)
    }

    fun testParsingBooleans() {
        doTest(true)
    }

    fun testParsingBooleansError() {
        doTest(true)
    }

    fun testParsingLineComments() {
        doTest(true)
    }

    fun testParsingBlockComments() {
        doTest(true)
    }

    fun testParsingHereStrings() {
        doTest(true)
    }

    fun testParsingToplevelModuleForm() {
        doTest(true)
    }

    fun testParsingToplevelModuleFormWithStringModulePath() {
        doTest(true)
    }

    fun testParsingBraces() {
        doTest(true)
    }

    override fun getTestDataPath(): String {
        return "src/test/testData"
    }

    override fun skipSpaces(): Boolean {
        return false
    }

    override fun includeRanges(): Boolean {
        return true
    }
}
