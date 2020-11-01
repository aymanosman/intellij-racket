// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.racket.lang.core.stubs.StubImplementationsKt;
import org.racket.lang.core.psi.impl.*;

public interface RacketElementTypes {

  IElementType DATUM = new RacketElementType("DATUM");
  IElementType FORM = StubImplementationsKt.factory("FORM");

  IElementType BOOLEAN = new RacketTokenType("BOOLEAN");
  IElementType CHARACTER = new RacketTokenType("CHARACTER");
  IElementType CLOSE_PAREN = new RacketTokenType("CLOSE_PAREN");
  IElementType CLOSE_SQUARE = new RacketTokenType("CLOSE_SQUARE");
  IElementType COMMENT = new RacketTokenType("COMMENT");
  IElementType CONSTANT = new RacketTokenType("CONSTANT");
  IElementType CRLF = new RacketTokenType("CRLF");
  IElementType DOT = new RacketTokenType("DOT");
  IElementType HASH_LANG = new RacketTokenType("HASH_LANG");
  IElementType HERE_STRING = new RacketTokenType("HERE_STRING");
  IElementType IDENTIFIER = new RacketTokenType("IDENTIFIER");
  IElementType KEYWORD = new RacketTokenType("KEYWORD");
  IElementType NUMBER = new RacketTokenType("NUMBER");
  IElementType OPEN_PAREN = new RacketTokenType("OPEN_PAREN");
  IElementType OPEN_SQUARE = new RacketTokenType("OPEN_SQUARE");
  IElementType SEXP_COMMENT = new RacketTokenType("SEXP_COMMENT");
  IElementType STRING = new RacketTokenType("STRING");
  IElementType UNQUOTE = new RacketTokenType("UNQUOTE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DATUM) {
        return new RacketDatumImpl(node);
      }
      else if (type == FORM) {
        return new RacketFormImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
