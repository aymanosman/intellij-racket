package org.racket.lang.core.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import org.racket.lang.core.psi.RacketNamedElement

abstract class RacketNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), RacketNamedElement
