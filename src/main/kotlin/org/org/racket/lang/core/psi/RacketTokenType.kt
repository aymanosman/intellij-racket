package org.racket.lang.core.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.racket.lang.RacketLanguage

class RacketTokenType(@NonNls debugName: String) : IElementType(debugName, RacketLanguage) {
    override fun toString(): String {
        return "RacketTokenType." + super.toString()
    }
}
