// Generated from EasyJ.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyJParser}.
 */
public interface EasyJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyJParser#alphabetic}.
	 * @param ctx the parse tree
	 */
	void enterAlphabetic(@NotNull EasyJParser.AlphabeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#alphabetic}.
	 * @param ctx the parse tree
	 */
	void exitAlphabetic(@NotNull EasyJParser.AlphabeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#idstart}.
	 * @param ctx the parse tree
	 */
	void enterIdstart(@NotNull EasyJParser.IdstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#idstart}.
	 * @param ctx the parse tree
	 */
	void exitIdstart(@NotNull EasyJParser.IdstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyJParser#nullliteral}.
	 * @param ctx the parse tree
	 */
	void enterNullliteral(@NotNull EasyJParser.NullliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyJParser#nullliteral}.
	 * @param ctx the parse tree
	 */
	void exitNullliteral(@NotNull EasyJParser.NullliteralContext ctx);
}