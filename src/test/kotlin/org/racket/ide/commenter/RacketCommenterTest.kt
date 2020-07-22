package org.racket.ide.commenter

import com.intellij.codeInsight.generation.actions.CommentByLineCommentAction
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase
import org.racket.lang.RacketFileType

class RacketCommenterTest : LightJavaCodeInsightFixtureTestCase() {
    override fun getTestDataPath(): String {
        return "src/test/testData"
    }

    fun testCommenter() {
        myFixture.configureByText(RacketFileType, "<caret>whatever")
        val commentAction = CommentByLineCommentAction()
        commentAction.actionPerformedImpl(project, myFixture.editor)
        myFixture.checkResult(";whatever")
        commentAction.actionPerformedImpl(project, myFixture.editor)
        myFixture.checkResult("whatever")
    }
}
