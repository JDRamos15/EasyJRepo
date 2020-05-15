package JFLex;

/* The following code was generated by JFlex 1.7.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>C:/Users/Val/Desktop/EasyJ.flex</tt>
 */
class EasyJLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\0\1\0\1\1\1\1\1\1\1\1\22\0\1\0\1\0"+
    "\2\0\1\32\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\1\0\1\0\1\33\1\33\1\33\1\33\1\33\1\33\1\33"+
    "\1\33\1\33\1\33\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0\1\0"+
    "\1\32\1\0\1\2\1\3\1\7\1\22\1\14\1\23\1\15\1\21"+
    "\1\12\1\0\1\17\1\24\1\26\1\11\1\10\1\16\1\0\1\6"+
    "\1\4\1\5\1\13\1\25\1\20\1\30\1\27\1\31\1\0\1\0"+
    "\1\0\1\0\6\0\1\1\32\0\1\0\101\0\1\0\u159d\0\1\0"+
    "\u097f\0\13\0\35\0\1\1\1\1\5\0\1\0\57\0\1\0\114\0"+
    "\1\0\165\0\1\0\u0edd\0\1\0\ucffc\0\1\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\22\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\1\21\2\1\3\26\1\1\4\10\1"+
    "\1\4\36\1\1\4\35\1\1\4\26\1\1\4\14\1"+
    "\2\4\23\1\1\4\33\1\1\5\2\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[201];
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
    "\0\0\0\34\0\34\0\70\0\124\0\160\0\214\0\250"+
    "\0\304\0\340\0\374\0\u0118\0\u0134\0\u0150\0\u016c\0\u0188"+
    "\0\u01a4\0\u01c0\0\u01dc\0\u01f8\0\34\0\u0214\0\u0230\0\u024c"+
    "\0\u0268\0\u0284\0\u02a0\0\u02bc\0\u02d8\0\u02f4\0\u0310\0\u032c"+
    "\0\u0348\0\u0364\0\u0380\0\u039c\0\u03b8\0\u03d4\0\u03f0\0\u040c"+
    "\0\u0428\0\u0444\0\u0460\0\34\0\u047c\0\u0498\0\u04b4\0\u04d0"+
    "\0\u04ec\0\u0508\0\u0524\0\u0540\0\u055c\0\u0578\0\u0594\0\u05b0"+
    "\0\u05cc\0\u05e8\0\u0604\0\u0620\0\u063c\0\u0658\0\u0674\0\u0690"+
    "\0\u06ac\0\u06c8\0\u06e4\0\u0700\0\u071c\0\u0738\0\u0754\0\u0770"+
    "\0\u078c\0\u07a8\0\u07c4\0\u07e0\0\u07fc\0\u0818\0\u0834\0\u0850"+
    "\0\u086c\0\u0888\0\u08a4\0\u08c0\0\u08dc\0\u08f8\0\u0914\0\u0930"+
    "\0\u094c\0\u0968\0\u0984\0\u09a0\0\u09bc\0\u09d8\0\u09f4\0\u0a10"+
    "\0\u0a2c\0\u0a48\0\u0a64\0\u0a80\0\u0a9c\0\u0ab8\0\u0ad4\0\u0af0"+
    "\0\u0b0c\0\u0b28\0\u0b44\0\u0b60\0\u0b7c\0\u0b98\0\u0bb4\0\u0bd0"+
    "\0\u0bec\0\u0c08\0\u0c24\0\u0c40\0\u0c5c\0\u0c78\0\u0c94\0\u0cb0"+
    "\0\u0ccc\0\u0ce8\0\u0d04\0\u0d20\0\u0d3c\0\u0d58\0\u0d74\0\u0d90"+
    "\0\u0dac\0\u0dc8\0\u0de4\0\u0e00\0\u0e1c\0\u0e38\0\u0e54\0\u0e70"+
    "\0\u07c4\0\u0e8c\0\u0ea8\0\u0ec4\0\u0ee0\0\u0efc\0\u0f18\0\u0f34"+
    "\0\u0f50\0\u0f6c\0\u0f88\0\u0fa4\0\u0fc0\0\u0fdc\0\u0ff8\0\u1014"+
    "\0\u1030\0\u104c\0\u1068\0\u1084\0\u10a0\0\u10bc\0\u10d8\0\u10f4"+
    "\0\u1110\0\u112c\0\u1148\0\u1164\0\u1180\0\u119c\0\u11b8\0\u11d4"+
    "\0\u11f0\0\u120c\0\u0c40\0\u1228\0\u1244\0\u1260\0\u127c\0\u1298"+
    "\0\u12b4\0\u12d0\0\u12ec\0\u1308\0\u1324\0\u1340\0\u135c\0\u1378"+
    "\0\u1394\0\u13b0\0\u13cc\0\u13e8\0\u1404\0\u1420\0\u143c\0\u1458"+
    "\0\u1474\0\u1490\0\u01f8\0\u14ac\0\u14c8\0\u14e4\0\34\0\u1500"+
    "\0\u151c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[201];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\2\1\12\1\13\1\2\1\14\1\15\1\16\1\2"+
    "\1\17\1\2\1\20\1\21\1\22\1\23\4\2\1\24"+
    "\1\25\37\3\1\26\1\27\17\3\1\30\15\3\1\31"+
    "\1\3\1\32\16\3\1\33\11\3\1\34\5\3\1\35"+
    "\4\3\1\36\1\37\5\3\1\40\12\3\1\41\12\3"+
    "\1\42\26\3\1\43\21\3\1\44\5\3\1\45\10\3"+
    "\1\46\2\3\1\47\11\3\1\50\10\3\1\51\1\52"+
    "\30\3\1\53\11\3\1\54\2\3\1\55\31\3\1\56"+
    "\3\3\1\57\13\3\1\60\25\3\1\61\3\3\1\62"+
    "\4\3\1\63\41\3\1\64\22\3\1\65\3\3\1\66"+
    "\27\3\1\67\1\3\1\70\11\3\1\71\17\3\1\72"+
    "\33\3\1\73\25\3\1\74\27\3\1\25\5\3\1\75"+
    "\33\3\1\76\45\3\1\77\31\3\1\100\27\3\1\101"+
    "\30\3\1\102\30\3\1\103\3\3\1\104\43\3\1\105"+
    "\27\3\1\106\31\3\1\107\34\3\1\110\24\3\1\111"+
    "\24\3\1\54\12\3\1\112\3\3\1\113\26\3\1\114"+
    "\32\3\1\102\1\115\37\3\1\116\24\3\1\117\33\3"+
    "\1\120\36\3\1\121\52\3\1\122\27\3\1\54\17\3"+
    "\1\123\1\124\44\3\1\125\21\3\1\102\34\3\1\126"+
    "\33\3\1\127\35\3\1\130\34\3\1\131\1\3\1\132"+
    "\24\3\1\133\42\3\1\134\34\3\1\135\43\3\1\136"+
    "\16\3\1\54\36\3\1\137\32\3\1\140\34\3\1\141"+
    "\34\3\1\142\11\3\1\143\33\3\1\144\14\3\1\145"+
    "\42\3\1\107\40\3\1\146\14\3\1\147\55\3\1\150"+
    "\23\3\1\54\24\3\1\151\40\3\1\152\35\3\1\67"+
    "\24\3\1\115\34\3\1\153\34\3\1\154\35\3\1\155"+
    "\32\3\1\156\27\3\1\54\42\3\1\157\27\3\1\160"+
    "\30\3\1\54\1\161\34\3\1\162\31\3\1\113\41\3"+
    "\1\163\45\3\1\164\14\3\1\165\42\3\1\166\27\3"+
    "\1\107\13\3\1\167\23\3\1\170\27\3\1\54\42\3"+
    "\1\171\21\3\1\172\53\3\1\173\32\3\1\151\33\3"+
    "\1\102\12\3\1\134\32\3\1\174\33\3\1\175\33\3"+
    "\1\176\46\3\1\54\40\3\1\54\13\3\1\177\47\3"+
    "\1\200\23\3\1\201\27\3\1\202\50\3\1\54\30\3"+
    "\1\203\31\3\1\204\30\3\1\205\1\3\1\206\27\3"+
    "\1\54\47\3\1\207\16\3\1\210\47\3\1\211\21\3"+
    "\1\212\46\3\1\54\24\3\1\213\23\3\1\214\56\3"+
    "\1\102\32\3\1\215\11\3\1\216\37\3\1\217\6\3"+
    "\1\220\32\3\1\221\30\3\1\222\24\3\1\223\45\3"+
    "\1\224\21\3\1\33\44\3\1\225\44\3\1\226\14\3"+
    "\1\227\33\3\1\64\47\3\1\230\14\3\1\231\34\3"+
    "\1\232\32\3\1\233\40\3\1\54\31\3\1\234\43\3"+
    "\1\164\24\3\1\235\37\3\1\236\32\3\1\54\33\3"+
    "\1\237\31\3\1\240\36\3\1\241\32\3\1\242\45\3"+
    "\1\243\24\3\1\244\45\3\1\245\27\3\1\113\26\3"+
    "\1\102\25\3\1\246\50\3\1\153\33\3\1\247\21\3"+
    "\1\250\23\3\1\251\40\3\1\153\40\3\1\252\30\3"+
    "\1\253\45\3\1\254\20\3\1\255\37\3\1\256\32\3"+
    "\1\102\25\3\1\220\33\3\1\257\35\3\1\260\26\3"+
    "\1\261\37\3\1\164\41\3\1\262\24\3\1\263\55\3"+
    "\1\54\15\3\1\264\25\3\1\265\35\3\1\266\44\3"+
    "\1\54\26\3\1\267\33\3\1\153\36\3\1\270\33\3"+
    "\1\271\26\3\1\102\35\3\1\272\36\3\1\142\34\3"+
    "\1\273\32\3\1\274\31\3\1\275\33\3\1\276\27\3"+
    "\1\277\35\3\1\300\30\3\1\113\44\3\1\301\22\3"+
    "\1\302\35\3\1\303\55\3\1\263\4\3\1\304\54\3"+
    "\1\54\20\3\1\305\35\3\1\306\45\3\1\307\21\3"+
    "\1\310\30\3\1\25\35\3\1\311\27\3\1\164\26\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5432];
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\311\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[201];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  EasyJLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 288) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
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
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Operator \""+yytext()+"\" at line "+yyline);
            } 
            // fall through
          case 6: break;
          case 2: 
            { System.out.println("Separator \""+yytext()+"\" at line "+yyline);
            } 
            // fall through
          case 7: break;
          case 3: 
            { System.out.println("Identifier \""+yytext()+"\" at line "+yyline);
            } 
            // fall through
          case 8: break;
          case 4: 
            { System.out.println("Keyword \""+yytext()+"\" at line "+yyline);
            } 
            // fall through
          case 9: break;
          case 5: 
            { System.out.println("Literal \""+yytext()+"\" at line "+yyline);
            } 
            // fall through
          case 10: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java EasyJLexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        EasyJLexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new EasyJLexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
