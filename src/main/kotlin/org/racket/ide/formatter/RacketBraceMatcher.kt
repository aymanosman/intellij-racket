package org.racket.ide.formatter

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import org.racket.lang.core.psi.RacketElementTypes.*

class RacketBraceMatcher : PairedBraceMatcher {
    companion object {
        val PAIRS = arrayOf(
                BracePair(OPEN_PAREN, CLOSE_PAREN, true),
                BracePair(OPEN_BRACE, CLOSE_BRACE, true),
                BracePair(OPEN_SQUARE, CLOSE_SQUARE, true))
    }

    override fun getPairs(): Array<BracePair> {
        return PAIRS
    }

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        return true
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }
}
