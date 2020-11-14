// This is a generated file. Not intended for manual editing.
package org.racket.lang.core.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.racket.lang.core.psi.RacketElementTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RacketParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return RacketFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // CONSTANT Form
  //   | UNQUOTE Form
  public static boolean Datum(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Datum")) return false;
    if (!nextTokenIs(builder_, "<datum>", CONSTANT, UNQUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DATUM, "<datum>");
    result_ = Datum_0(builder_, level_ + 1);
    if (!result_) result_ = Datum_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // CONSTANT Form
  private static boolean Datum_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Datum_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONSTANT);
    result_ = result_ && Form(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // UNQUOTE Form
  private static boolean Datum_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Datum_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UNQUOTE);
    result_ = result_ && Form(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Datum
  //   | DOT
  //   | CHARACTER
  //   | NUMBER
  //   | BOOLEAN
  //   | STRING
  //   | HERE_STRING
  //   | IDENTIFIER
  //   | KEYWORD
  //   | OPEN_PAREN Item* CLOSE_PAREN
  //   | OPEN_SQUARE Item* CLOSE_SQUARE
  //   | OPEN_BRACE Item* CLOSE_BRACE
  public static boolean Form(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FORM, "<form>");
    result_ = Datum(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, CHARACTER);
    if (!result_) result_ = consumeToken(builder_, NUMBER);
    if (!result_) result_ = consumeToken(builder_, BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, HERE_STRING);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    if (!result_) result_ = consumeToken(builder_, KEYWORD);
    if (!result_) result_ = Form_9(builder_, level_ + 1);
    if (!result_) result_ = Form_10(builder_, level_ + 1);
    if (!result_) result_ = Form_11(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // OPEN_PAREN Item* CLOSE_PAREN
  private static boolean Form_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_PAREN);
    result_ = result_ && Form_9_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_PAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Item*
  private static boolean Form_9_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form_9_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Form_9_1", pos_)) break;
    }
    return true;
  }

  // OPEN_SQUARE Item* CLOSE_SQUARE
  private static boolean Form_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_SQUARE);
    result_ = result_ && Form_10_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_SQUARE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Item*
  private static boolean Form_10_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form_10_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Form_10_1", pos_)) break;
    }
    return true;
  }

  // OPEN_BRACE Item* CLOSE_BRACE
  private static boolean Form_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form_11")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OPEN_BRACE);
    result_ = result_ && Form_11_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CLOSE_BRACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Item*
  private static boolean Form_11_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Form_11_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Form_11_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Form
  //   | COMMENT
  //   | SEXP_COMMENT
  //   | CRLF
  static boolean Item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Item")) return false;
    boolean result_;
    result_ = Form(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, COMMENT);
    if (!result_) result_ = consumeToken(builder_, SEXP_COMMENT);
    if (!result_) result_ = consumeToken(builder_, CRLF);
    return result_;
  }

  /* ********************************************************** */
  // HASH_LANG Item* | Item*
  static boolean RacketFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RacketFile")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RacketFile_0(builder_, level_ + 1);
    if (!result_) result_ = RacketFile_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // HASH_LANG Item*
  private static boolean RacketFile_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RacketFile_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, HASH_LANG);
    result_ = result_ && RacketFile_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Item*
  private static boolean RacketFile_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RacketFile_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RacketFile_0_1", pos_)) break;
    }
    return true;
  }

  // Item*
  private static boolean RacketFile_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RacketFile_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Item(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RacketFile_1", pos_)) break;
    }
    return true;
  }

}
