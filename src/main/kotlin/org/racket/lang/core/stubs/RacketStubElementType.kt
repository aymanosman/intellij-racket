package org.racket.lang.core.stubs

import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.IndexSink
import com.intellij.psi.stubs.StubElement
import org.racket.lang.RacketLanguage
import org.racket.lang.core.psi.RacketElement

abstract class RacketStubElementType<StubT : StubElement<*>, PsiT : RacketElement>(
        debugName: String
) : IStubElementType<StubT, PsiT>(debugName, RacketLanguage) {
    final override fun getExternalId(): String = "racket.${super.toString()}"

    override fun indexStub(stub: StubT, sink: IndexSink) {}
}

//fun createStubIfParentIsStub()
