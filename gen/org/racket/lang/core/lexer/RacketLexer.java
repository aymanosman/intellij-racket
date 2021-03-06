/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

package org.racket.lang.core.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.racket.lang.core.psi.RacketElementTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>/Users/ayman/git/github.com/aymanosman/intellij-racket/src/main/grammars/Racket.flex</tt>
 */
class RacketLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int MAIN = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1672 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\76\2\1\3\277\2");

  /* The ZZ_CMAP_A table has 512 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\50\1\4\1\2\1\5\2\3\22\50\1\75\1\76\1\47\1\42\1\50\1\66\1\101\1\60\1\105"+
    "\1\106\1\50\1\36\1\102\1\36\1\61\1\77\1\62\1\34\2\44\4\35\2\33\1\67\1\37\1"+
    "\104\3\50\1\103\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\15\1\17\1\20"+
    "\1\15\1\21\1\22\1\23\1\15\1\40\1\25\1\26\1\27\1\30\1\31\1\32\2\15\1\107\1"+
    "\43\1\110\1\50\1\15\1\100\1\51\1\52\1\10\1\11\1\57\1\56\1\74\1\70\1\16\1\15"+
    "\1\17\1\73\1\15\1\54\1\63\1\45\1\72\1\24\1\71\1\53\1\41\1\55\1\31\1\46\2\15"+
    "\1\111\1\65\1\64\7\50\1\5\172\50\250\0\2\1\126\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\2\2\1\3\1\1\1\4\3\5\1\6"+
    "\1\7\1\10\1\5\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\5\2\0\3\1\2\0\1\17\3\0\1\20"+
    "\3\0\1\21\7\0\1\22\1\11\1\3\2\1\1\3"+
    "\1\0\1\3\3\0\1\3\1\0\14\23\6\0\1\24"+
    "\2\0\1\1\17\0\1\23\2\0\1\23\1\0\1\4"+
    "\4\0\1\1\2\3\2\0\1\3\3\0\1\23\4\0"+
    "\1\23\3\0\1\3\6\0\1\23\12\0\1\3\5\0"+
    "\1\25";

  private static int [] zzUnpackAction() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\112\0\224\0\336\0\u0128\0\u0172\0\u01bc\0\u0206"+
    "\0\u0250\0\u029a\0\u02e4\0\u032e\0\u0378\0\224\0\u0378\0\u03c2"+
    "\0\u040c\0\u0378\0\u0378\0\u0378\0\u0378\0\u0378\0\u0378\0\u02e4"+
    "\0\u03c2\0\u0456\0\u04a0\0\u04ea\0\u0534\0\u057e\0\u05c8\0\u0612"+
    "\0\u065c\0\u06a6\0\u0378\0\u06f0\0\u073a\0\u0784\0\u07ce\0\u0818"+
    "\0\u0862\0\u08ac\0\u08f6\0\u0940\0\u032e\0\u098a\0\u0378\0\u0378"+
    "\0\u0456\0\u09d4\0\u0a1e\0\u0a68\0\u0ab2\0\u0afc\0\u0b46\0\u0b90"+
    "\0\u0bda\0\u0c24\0\u0c6e\0\u0378\0\u0cb8\0\u0d02\0\u0d4c\0\u0d96"+
    "\0\u0de0\0\u0e2a\0\u0e74\0\u0ebe\0\u0f08\0\u0f52\0\u0f9c\0\u0fe6"+
    "\0\u1030\0\u107a\0\u10c4\0\u110e\0\u1158\0\u11a2\0\u11ec\0\u1236"+
    "\0\u1280\0\u12ca\0\u1314\0\u135e\0\u13a8\0\u13f2\0\u143c\0\u1486"+
    "\0\u14d0\0\u151a\0\u1564\0\u15ae\0\u15f8\0\u1642\0\u168c\0\u16d6"+
    "\0\u1720\0\u0e74\0\u176a\0\u17b4\0\u17fe\0\u0378\0\u1848\0\u1892"+
    "\0\u11a2\0\u18dc\0\u1926\0\u12ca\0\u1314\0\u1970\0\u19ba\0\u143c"+
    "\0\u1a04\0\u1a4e\0\u1a98\0\u1ae2\0\u1b2c\0\u1b76\0\u1bc0\0\u1c0a"+
    "\0\u1c54\0\u1c9e\0\u1ce8\0\u1d32\0\224\0\u1d7c\0\u1dc6\0\u1e10"+
    "\0\u1e5a\0\u1ea4\0\u1eee\0\u1f38\0\u1f82\0\u1fcc\0\u2016\0\u0e2a"+
    "\0\u2060\0\u20aa\0\u20f4\0\u213e\0\u2188\0\u21d2\0\u0378\0\u221c"+
    "\0\u2266\0\u22b0\0\u22fa\0\u2344\0\u0378";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\2\5\1\6\1\4\25\3\3\7\1\10"+
    "\1\11\2\3\1\12\1\13\1\7\2\3\1\14\10\3"+
    "\1\15\1\16\1\7\1\3\1\17\1\20\7\3\1\6"+
    "\2\3\1\15\1\3\1\21\2\3\1\22\1\23\1\24"+
    "\1\25\1\26\112\27\2\3\3\0\32\3\1\0\3\3"+
    "\1\30\3\3\1\0\10\3\1\0\3\3\1\0\1\31"+
    "\7\3\1\0\2\3\1\0\1\3\1\0\2\3\5\0"+
    "\1\3\1\4\3\5\1\4\31\3\1\0\3\3\1\30"+
    "\3\3\1\0\10\3\1\0\3\3\1\0\1\31\7\3"+
    "\1\5\2\3\1\0\1\3\1\0\2\3\6\0\5\5"+
    "\67\0\1\5\16\0\3\6\70\0\1\6\14\0\2\3"+
    "\3\0\26\3\3\7\1\3\1\0\3\3\1\30\1\7"+
    "\2\3\1\0\10\3\1\0\1\32\1\7\1\3\1\0"+
    "\1\31\7\3\1\0\1\3\1\32\1\0\1\3\1\0"+
    "\2\3\5\0\2\3\3\0\11\3\1\33\2\3\1\34"+
    "\11\3\3\7\1\3\1\0\3\3\1\30\1\7\2\3"+
    "\1\0\4\3\1\34\3\3\1\0\1\3\1\7\1\3"+
    "\1\0\1\31\7\3\1\0\2\3\1\0\1\3\1\0"+
    "\2\3\5\0\1\11\3\0\1\11\1\0\104\11\7\0"+
    "\1\35\2\0\1\36\1\37\2\0\1\36\5\0\1\40"+
    "\1\0\1\37\3\0\1\41\3\42\1\0\1\43\3\0"+
    "\1\44\1\42\1\40\1\41\1\45\2\0\1\35\1\37"+
    "\2\0\1\37\1\36\1\15\1\0\1\42\2\0\1\46"+
    "\1\3\1\47\1\50\1\51\1\0\1\52\2\0\1\53"+
    "\1\0\2\15\1\21\1\0\1\54\1\22\1\0\1\24"+
    "\1\0\1\26\1\3\3\0\1\3\1\0\104\3\43\55"+
    "\1\56\3\55\1\57\42\55\112\0\65\31\1\3\24\31"+
    "\103\0\1\60\6\0\2\3\3\0\26\3\3\61\1\3"+
    "\1\0\3\3\1\30\1\61\2\3\1\0\10\3\1\0"+
    "\1\3\1\61\1\3\1\0\1\31\7\3\1\0\2\3"+
    "\1\0\1\3\1\0\2\3\5\0\2\3\3\0\14\3"+
    "\1\62\15\3\1\0\3\3\1\30\3\3\1\0\4\3"+
    "\1\62\3\3\1\0\3\3\1\0\1\31\7\3\1\0"+
    "\2\3\1\0\1\3\1\0\2\3\5\0\2\3\3\0"+
    "\1\3\1\63\30\3\1\0\3\3\1\30\3\3\1\0"+
    "\1\3\1\63\6\3\1\0\3\3\1\0\1\31\7\3"+
    "\1\0\2\3\1\0\1\3\1\0\2\3\41\0\1\64"+
    "\1\0\1\65\23\0\1\64\62\0\3\66\1\67\3\0"+
    "\1\70\1\0\1\66\15\0\1\66\27\0\2\37\3\0"+
    "\32\37\1\0\3\37\1\0\3\37\1\0\10\37\1\0"+
    "\3\37\2\0\7\37\1\0\2\37\1\0\1\37\1\0"+
    "\2\37\53\0\1\71\51\0\6\72\17\0\3\72\1\73"+
    "\5\0\1\72\4\0\2\72\3\0\2\72\2\0\1\72"+
    "\62\0\3\42\6\0\1\42\15\0\1\42\22\0\1\22"+
    "\1\0\1\24\1\0\1\26\1\74\3\0\1\74\1\0"+
    "\1\74\1\75\10\74\1\76\1\77\1\74\1\100\1\101"+
    "\1\102\1\103\1\104\1\105\3\74\1\106\3\74\1\101"+
    "\1\107\2\74\1\106\1\100\4\74\1\75\1\103\1\77"+
    "\1\105\4\74\1\106\6\74\1\102\1\74\1\76\16\74"+
    "\2\0\41\45\1\110\3\45\1\57\42\45\65\46\1\111"+
    "\24\46\2\47\3\0\32\47\1\0\3\47\1\112\3\47"+
    "\1\0\10\47\1\0\3\47\1\0\1\113\7\47\1\0"+
    "\2\47\1\0\1\47\1\0\2\47\56\0\1\114\145\0"+
    "\1\22\1\0\1\24\1\0\1\26\51\0\1\115\46\0"+
    "\31\116\1\0\2\116\2\0\3\116\2\0\7\116\2\0"+
    "\2\116\4\0\5\116\121\0\1\117\6\0\3\55\1\0"+
    "\1\55\16\0\1\55\2\0\1\120\4\0\2\55\3\0"+
    "\1\120\1\0\2\55\1\0\1\120\1\55\1\0\10\55"+
    "\1\0\1\55\27\0\2\3\3\0\6\3\1\121\23\3"+
    "\1\0\3\3\1\30\3\3\1\0\6\3\1\121\1\3"+
    "\1\0\3\3\1\0\1\31\7\3\1\0\2\3\1\0"+
    "\1\3\1\0\2\3\5\0\2\3\3\0\14\3\1\121"+
    "\15\3\1\0\3\3\1\30\3\3\1\0\4\3\1\121"+
    "\3\3\1\0\3\3\1\0\1\31\7\3\1\0\2\3"+
    "\1\0\1\3\1\0\2\3\41\0\1\64\24\0\1\122"+
    "\1\64\14\0\1\122\46\0\1\64\25\0\1\64\62\0"+
    "\3\66\6\0\1\66\14\0\1\123\1\66\14\0\1\123"+
    "\30\0\1\124\2\0\1\125\11\0\3\66\6\0\1\66"+
    "\7\0\1\125\5\0\1\66\36\0\1\35\22\0\1\41"+
    "\13\0\1\41\3\0\1\35\101\0\1\126\4\0\1\55"+
    "\50\0\6\72\17\0\3\72\6\0\1\72\4\0\2\72"+
    "\3\0\2\72\1\0\1\127\1\72\14\0\1\127\20\0"+
    "\6\72\17\0\3\72\6\0\1\72\4\0\2\72\3\0"+
    "\2\72\2\0\1\72\35\0\1\130\42\0\1\130\56\0"+
    "\1\131\105\0\1\132\14\0\1\133\11\0\1\133\15\0"+
    "\1\132\40\0\1\134\42\0\1\134\52\0\1\135\14\0"+
    "\1\136\11\0\1\136\15\0\1\135\55\0\1\137\21\0"+
    "\1\137\52\0\1\140\42\0\1\140\46\0\6\141\17\0"+
    "\3\141\6\0\1\141\4\0\2\141\3\0\2\141\2\0"+
    "\1\141\55\0\1\142\24\0\1\142\72\0\2\143\6\0"+
    "\1\143\15\0\1\143\35\0\6\144\17\0\3\144\6\0"+
    "\1\144\4\0\2\144\3\0\2\144\2\0\1\144\30\0"+
    "\3\45\1\0\1\45\16\0\1\45\7\0\2\45\5\0"+
    "\2\45\1\0\1\145\1\45\1\0\10\45\1\0\1\45"+
    "\27\0\42\46\1\146\22\46\1\111\24\46\1\47\3\0"+
    "\1\47\1\0\104\47\65\113\1\47\24\113\71\0\1\147"+
    "\74\0\1\150\43\0\31\116\1\0\2\116\2\0\3\116"+
    "\2\0\7\116\2\0\2\116\4\0\5\116\2\0\1\151"+
    "\24\0\1\152\105\0\6\55\17\0\3\55\6\0\1\55"+
    "\4\0\2\55\3\0\2\55\2\0\1\55\27\0\2\3"+
    "\3\0\32\3\1\0\3\3\1\30\3\3\1\0\10\3"+
    "\1\0\1\153\2\3\1\0\1\31\7\3\1\0\2\3"+
    "\1\0\1\3\1\0\2\3\41\0\1\154\25\0\1\154"+
    "\62\0\3\155\6\0\1\155\15\0\1\155\50\0\1\156"+
    "\32\0\1\156\43\0\1\157\42\0\1\157\107\0\1\45"+
    "\50\0\6\160\17\0\3\160\6\0\1\160\4\0\2\160"+
    "\3\0\2\160\2\0\1\160\37\0\1\161\122\0\1\162"+
    "\32\0\1\162\66\0\1\163\100\0\1\164\52\0\1\164"+
    "\32\0\1\165\57\0\1\165\43\0\1\166\24\0\1\166"+
    "\45\0\1\167\42\0\1\167\45\0\1\170\42\0\1\170"+
    "\47\0\1\74\42\0\1\74\45\0\6\107\17\0\3\107"+
    "\6\0\1\107\4\0\2\107\3\0\2\107\2\0\1\107"+
    "\63\0\2\74\6\0\1\74\15\0\1\74\35\0\6\171"+
    "\17\0\3\171\6\0\1\171\4\0\2\171\3\0\2\171"+
    "\2\0\1\171\35\0\6\45\17\0\3\45\6\0\1\45"+
    "\4\0\2\45\3\0\2\45\2\0\1\45\117\0\1\172"+
    "\115\0\1\173\37\0\1\174\67\0\2\3\3\0\32\3"+
    "\1\0\3\3\1\30\3\3\1\0\6\3\1\175\1\3"+
    "\1\0\1\3\1\175\1\3\1\0\1\31\7\3\1\0"+
    "\2\3\1\0\1\3\1\0\2\3\20\0\1\176\42\0"+
    "\1\176\54\0\1\176\32\0\1\176\54\0\1\177\104\0"+
    "\1\200\44\0\1\200\52\0\1\201\52\0\1\201\36\0"+
    "\1\74\52\0\1\74\30\0\1\74\44\0\1\74\61\0"+
    "\1\202\11\0\1\202\72\0\1\203\40\0\1\203\36\0"+
    "\1\165\107\0\6\204\17\0\3\204\6\0\1\204\4\0"+
    "\2\204\3\0\2\204\2\0\1\204\106\0\1\205\25\0"+
    "\1\22\1\0\1\24\1\0\1\26\75\0\1\53\27\0"+
    "\1\206\157\0\1\207\55\0\1\210\43\0\1\210\33\0"+
    "\1\211\42\0\1\211\51\0\1\212\117\0\1\213\13\0"+
    "\1\213\100\0\1\214\11\0\1\214\56\0\6\74\17\0"+
    "\3\74\6\0\1\74\4\0\2\74\3\0\2\74\2\0"+
    "\1\74\121\0\1\215\21\0\1\216\165\0\1\217\3\0"+
    "\1\217\41\0\1\220\44\0\1\220\53\0\1\165\32\0"+
    "\1\165\56\0\1\74\32\0\1\74\63\0\1\74\24\0"+
    "\1\74\113\0\1\51\27\0\1\22\1\0\1\24\1\0"+
    "\1\26\2\216\1\221\107\216\12\0\1\222\44\0\1\222"+
    "\32\0\2\216\1\221\7\216\1\223\77\216\11\0\1\74"+
    "\100\0\2\216\1\221\17\216\1\224\71\216\1\221\10\216"+
    "\1\225\76\216";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9102];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\12\1\1\11\1\1\1\11\2\1\6\11\2\0"+
    "\3\1\2\0\1\1\3\0\1\11\3\0\1\1\7\0"+
    "\2\11\4\1\1\0\1\1\3\0\1\1\1\0\1\11"+
    "\13\1\6\0\1\1\2\0\1\1\17\0\1\1\2\0"+
    "\1\1\1\0\1\11\4\0\3\1\2\0\1\1\3\0"+
    "\1\1\4\0\1\1\3\0\1\1\6\0\1\1\12\0"+
    "\1\11\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[149];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  RacketLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return RacketElementTypes.IDENTIFIER;
            } 
            // fall through
          case 22: break;
          case 2: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 23: break;
          case 3: 
            { return RacketElementTypes.NUMBER;
            } 
            // fall through
          case 24: break;
          case 4: 
            { return RacketElementTypes.COMMENT;
            } 
            // fall through
          case 25: break;
          case 5: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 26: break;
          case 6: 
            { return RacketElementTypes.CONSTANT;
            } 
            // fall through
          case 27: break;
          case 7: 
            { return RacketElementTypes.DOT;
            } 
            // fall through
          case 28: break;
          case 8: 
            { return RacketElementTypes.CLOSE_BRACE;
            } 
            // fall through
          case 29: break;
          case 9: 
            { return RacketElementTypes.UNQUOTE;
            } 
            // fall through
          case 30: break;
          case 10: 
            { return RacketElementTypes.OPEN_PAREN;
            } 
            // fall through
          case 31: break;
          case 11: 
            { return RacketElementTypes.CLOSE_PAREN;
            } 
            // fall through
          case 32: break;
          case 12: 
            { return RacketElementTypes.OPEN_SQUARE;
            } 
            // fall through
          case 33: break;
          case 13: 
            { return RacketElementTypes.CLOSE_SQUARE;
            } 
            // fall through
          case 34: break;
          case 14: 
            { return RacketElementTypes.OPEN_BRACE;
            } 
            // fall through
          case 35: break;
          case 15: 
            { {
              String xs = yytext().toString();
              if (xs.equals("#true")
                  || xs.equals("#false")
                  || xs.equals("#t")
                  || xs.equals("#f")
                  || xs.equals("#T")
                  || xs.equals("#F")) {
                  return RacketElementTypes.BOOLEAN;
              } else {
                  return TokenType.ERROR_ELEMENT;
              }
          }
            } 
            // fall through
          case 36: break;
          case 16: 
            { return RacketElementTypes.SEXP_COMMENT;
            } 
            // fall through
          case 37: break;
          case 17: 
            { return RacketElementTypes.KEYWORD;
            } 
            // fall through
          case 38: break;
          case 18: 
            { return RacketElementTypes.STRING;
            } 
            // fall through
          case 39: break;
          case 19: 
            { return RacketElementTypes.CHARACTER;
            } 
            // fall through
          case 40: break;
          case 20: 
            { return RacketElementTypes.HASH_LANG;
            } 
            // fall through
          case 41: break;
          case 21: 
            { return RacketElementTypes.HERE_STRING;
            } 
            // fall through
          case 42: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
