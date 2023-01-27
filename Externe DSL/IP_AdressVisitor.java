// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IP_AdressParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IP_AdressVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IP_AdressParser#checkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckip(IP_AdressParser.CheckipContext ctx);
	/**
	 * Visit a parse tree produced by {@link IP_AdressParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(IP_AdressParser.ExprContext ctx);
}