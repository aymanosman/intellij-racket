package org.racket.lang.core.psi

import com.intellij.psi.tree.IElementType
import org.jetbrains.annotations.NonNls
import org.racket.lang.RacketLanguage

class RacketElementType(@NonNls debugName: String) : IElementType(debugName, RacketLanguage)
