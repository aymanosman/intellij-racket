// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RacketForm extends RacketElement {

  @Nullable
  RacketDatum getDatum();

  @NotNull
  List<RacketForm> getFormList();

}
