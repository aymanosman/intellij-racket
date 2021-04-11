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

public class RacketDatumImpl extends ASTWrapperPsiElement implements RacketDatum {

  public RacketDatumImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitDatum(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RacketDatum getDatum() {
    return findChildByClass(RacketDatum.class);
  }

  @Override
  @Nullable
  public RacketList getList() {
    return findChildByClass(RacketList.class);
  }

}
