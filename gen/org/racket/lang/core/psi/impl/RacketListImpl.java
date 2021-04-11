// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.racket.lang.core.psi.RacketElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.racket.lang.core.psi.*;

public class RacketListImpl extends ASTWrapperPsiElement implements RacketList {

  public RacketListImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitList(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RacketDatum> getDatumList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RacketDatum.class);
  }

  @Override
  @NotNull
  public List<RacketList> getListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RacketList.class);
  }

}
