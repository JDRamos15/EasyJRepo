// Generated from EasyJ.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyJParser}.
 */
public interface EasyJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyJParser#idstart}.
	 * @param ctx the parse tree
	 */
	void enterIdstart(EasyJParser.IdstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#idstart}.
	 * @param ctx the parse tree
	 */
	void exitIdstart(EasyJParser.IdstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#alphabetic}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetic(EasyJParser.AlphabeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#alphabetic}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetic(EasyJParser.AlphabeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#lowercase}.
	 * @param ctx the parse tree
	 */
	void enterLowercase(EasyJParser.LowercaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#lowercase}.
	 * @param ctx the parse tree
	 */
	void exitLowercase(EasyJParser.LowercaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#uppercase}.
	 * @param ctx the parse tree
	 */
	void enterUppercase(EasyJParser.UppercaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#uppercase}.
	 * @param ctx the parse tree
	 */
	void exitUppercase(EasyJParser.UppercaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#integerliteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerliteral(EasyJParser.IntegerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#integerliteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerliteral(EasyJParser.IntegerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#digits}.
	 * @param ctx the parse tree
	 */
	void enterDigits(EasyJParser.DigitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#digits}.
	 * @param ctx the parse tree
	 */
	void exitDigits(EasyJParser.DigitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(EasyJParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(EasyJParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(EasyJParser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(EasyJParser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#characterliteral}.
	 * @param ctx the parse tree
	 */
	void enterCharacterliteral(EasyJParser.CharacterliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#characterliteral}.
	 * @param ctx the parse tree
	 */
	void exitCharacterliteral(EasyJParser.CharacterliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(EasyJParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(EasyJParser.StringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#graphic}.
	 * @param ctx the parse tree
	 */
	void enterGraphic(EasyJParser.GraphicContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#graphic}.
	 * @param ctx the parse tree
	 */
	void exitGraphic(EasyJParser.GraphicContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(EasyJParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(EasyJParser.AlphanumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(EasyJParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(EasyJParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#escapesequence}.
	 * @param ctx the parse tree
	 */
	void enterEscapesequence(EasyJParser.EscapesequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#escapesequence}.
	 * @param ctx the parse tree
	 */
	void exitEscapesequence(EasyJParser.EscapesequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#nullliteral}.
	 * @param ctx the parse tree
	 */
	void enterNullliteral(EasyJParser.NullliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#nullliteral}.
	 * @param ctx the parse tree
	 */
	void exitNullliteral(EasyJParser.NullliteralContext ctx);
}