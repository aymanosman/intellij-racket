// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RacketList extends RacketElement {

  @NotNull
  List<RacketDatum> getDatumList();

  @NotNull
  List<RacketList> getListList();

}
