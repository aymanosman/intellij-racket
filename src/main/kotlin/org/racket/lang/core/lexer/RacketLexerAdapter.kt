package org.racket.lang.core.lexer

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class RacketLexerAdapter : FlexAdapter(RacketLexer(null as Reader?))
