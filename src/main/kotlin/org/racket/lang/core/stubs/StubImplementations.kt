package org.racket.lang.core.stubs

import com.intellij.psi.stubs.*
import org.racket.lang.core.psi.RacketForm

fun factory(name: String): RacketStubElementType<*, *> = when (name) {
    "FORM" -> RacketFormStub.Type
    else -> error("Unknown element $name")
}

class RacketFormStub(
        parent: StubElement<*>?,
        elementType: IStubElementType<*, *>
) : StubBase<RacketForm>(parent, elementType) {
    object Type : RacketStubElementType<RacketFormStub, RacketForm>("FORM") {
        override fun createPsi(stub: RacketFormStub): RacketForm {
            TODO("Not yet implemented")
        }

        override fun serialize(stub: RacketFormStub, dataStream: StubOutputStream) {
            TODO("Not yet implemented")
        }

        override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): RacketFormStub {
            TODO("Not yet implemented")
        }

        override fun createStub(psi: RacketForm, parentStub: StubElement<*>?): RacketFormStub {
            TODO("Not yet implemented")
        }
    }
}
