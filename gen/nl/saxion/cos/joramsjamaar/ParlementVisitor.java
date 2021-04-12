// Generated from C:/data/A416939/Desktop/43-master/src\Parlement.g4 by ANTLR 4.9.1
package nl.saxion.cos.joramsjamaar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParlementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParlementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParlementParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParlementParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParlementParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(ParlementParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExOrOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExOrOp(ParlementParser.ExOrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIdentifier}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIdentifier(ParlementParser.ExIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExMulOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMulOp(ParlementParser.ExMulOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExSubOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExSubOp(ParlementParser.ExSubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExStrLiteral}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExStrLiteral(ParlementParser.ExStrLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAddOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAddOp(ParlementParser.ExAddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExBoolLiteral}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExBoolLiteral(ParlementParser.ExBoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExIntLiteral}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExIntLiteral(ParlementParser.ExIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExDivOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExDivOp(ParlementParser.ExDivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExEqualOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExEqualOp(ParlementParser.ExEqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExParentheses}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParentheses(ParlementParser.ExParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExInvokeFunction}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExInvokeFunction(ParlementParser.ExInvokeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExNotEqualOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExNotEqualOp(ParlementParser.ExNotEqualOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExAndOp}
	 * labeled alternative in {@link ParlementParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAndOp(ParlementParser.ExAndOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ParlementParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ParlementParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(ParlementParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ParlementParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ParlementParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(ParlementParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(ParlementParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#invokeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvokeFunction(ParlementParser.InvokeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ParlementParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParlementParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParlementParser.DeclarationContext ctx);
}