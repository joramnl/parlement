// Generated from C:/data/A416939/Desktop/43-master/src\Parlement.g4 by ANTLR 4.9.1
package nl.saxion.cos.joramsjamaar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParlementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T_INT=9, 
		T_STRING=10, T_BOOLEAN=11, LEFT_PARENTHESES=12, RIGHT_PARENTHESES=13, 
		LEFT_CURLYBRACKET=14, RIGHT_CURLYBRACKET=15, INT=16, BOOLEAN=17, STRING=18, 
		ADD=19, SUB=20, MUL=21, DIV=22, ASSIGN=23, GT=24, LT=25, EQUAL=26, NOTEQUAL=27, 
		AND=28, OR=29, IDENTIFIER=30, WS=31, COMMENT=32, BLOCK_COMMENT=33;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assigment = 2, RULE_expression = 3, 
		RULE_printStmt = 4, RULE_ifStmt = 5, RULE_ifBlock = 6, RULE_loop = 7, 
		RULE_function = 8, RULE_invokeFunction = 9, RULE_declaration = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assigment", "expression", "printStmt", "ifStmt", 
			"ifBlock", "loop", "function", "invokeFunction", "declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT'", "'ALS'", "'DAN'", "'ANDERS'", 
			"'MARK RUTTE WIL JE DIT'", "'KEER HERHALEN'", "'OKE STOP MAAR'", "'MOTIE'", 
			"'int'", "'string'", "'bool'", "'('", "')'", "'{'", "'}'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'=='", "'!='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "T_INT", "T_STRING", 
			"T_BOOLEAN", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "LEFT_CURLYBRACKET", 
			"RIGHT_CURLYBRACKET", "INT", "BOOLEAN", "STRING", "ADD", "SUB", "MUL", 
			"DIV", "ASSIGN", "GT", "LT", "EQUAL", "NOTEQUAL", "AND", "OR", "IDENTIFIER", 
			"WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parlement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParlementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParlementParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__7) | (1L << T_INT) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__4:
				case T_INT:
				case T_STRING:
				case T_BOOLEAN:
				case IDENTIFIER:
					{
					setState(22);
					statement();
					}
					break;
				case T__7:
					{
					setState(23);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public InvokeFunctionContext invokeFunction() {
			return getRuleContext(InvokeFunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				printStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				assigment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				invokeFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParlementParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ParlementParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(IDENTIFIER);
			setState(40);
			match(ASSIGN);
			setState(41);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExOrOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode OR() { return getToken(ParlementParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExOrOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExGreaterThanOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode GT() { return getToken(ParlementParser.GT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExGreaterThanOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExGreaterThanOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ParlementParser.IDENTIFIER, 0); }
		public ExIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMulOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode MUL() { return getToken(ParlementParser.MUL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExMulOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExMulOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExSubOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode SUB() { return getToken(ParlementParser.SUB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExSubOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExSubOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExStrLiteralContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(ParlementParser.STRING, 0); }
		public ExStrLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExStrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAddOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode ADD() { return getToken(ParlementParser.ADD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExAddOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExAddOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExBoolLiteralContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(ParlementParser.BOOLEAN, 0); }
		public ExBoolLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExLessThanOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LT() { return getToken(ParlementParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExLessThanOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExLessThanOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntLiteralContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ParlementParser.INT, 0); }
		public ExIntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExDivOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode DIV() { return getToken(ParlementParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExDivOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExDivOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExEqualOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode EQUAL() { return getToken(ParlementParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExEqualOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExEqualOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenthesesContext extends ExpressionContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(ParlementParser.LEFT_PARENTHESES, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(ParlementParser.RIGHT_PARENTHESES, 0); }
		public ExParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExInvokeFunctionContext extends ExpressionContext {
		public InvokeFunctionContext invokeFunction() {
			return getRuleContext(InvokeFunctionContext.class,0);
		}
		public ExInvokeFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExInvokeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExNotEqualOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode NOTEQUAL() { return getToken(ParlementParser.NOTEQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExNotEqualOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExNotEqualOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAndOpContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode AND() { return getToken(ParlementParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExAndOpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitExAndOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				match(LEFT_PARENTHESES);
				setState(45);
				expression(0);
				setState(46);
				match(RIGHT_PARENTHESES);
				}
				break;
			case 2:
				{
				_localctx = new ExInvokeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				invokeFunction();
				}
				break;
			case 3:
				{
				_localctx = new ExIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new ExIntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new ExStrLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new ExBoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExMulOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(56);
						match(MUL);
						setState(57);
						((ExMulOpContext)_localctx).right = expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExDivOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExDivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(59);
						match(DIV);
						setState(60);
						((ExDivOpContext)_localctx).right = expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExAddOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExAddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(62);
						match(ADD);
						setState(63);
						((ExAddOpContext)_localctx).right = expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExSubOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExSubOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(65);
						match(SUB);
						setState(66);
						((ExSubOpContext)_localctx).right = expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExEqualOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExEqualOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(67);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(68);
						match(EQUAL);
						setState(69);
						((ExEqualOpContext)_localctx).right = expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExNotEqualOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExNotEqualOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(70);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(71);
						match(NOTEQUAL);
						setState(72);
						((ExNotEqualOpContext)_localctx).right = expression(11);
						}
						break;
					case 7:
						{
						_localctx = new ExGreaterThanOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExGreaterThanOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(73);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(74);
						match(GT);
						setState(75);
						((ExGreaterThanOpContext)_localctx).right = expression(10);
						}
						break;
					case 8:
						{
						_localctx = new ExLessThanOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExLessThanOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(77);
						match(LT);
						setState(78);
						((ExLessThanOpContext)_localctx).right = expression(9);
						}
						break;
					case 9:
						{
						_localctx = new ExAndOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExAndOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(80);
						match(AND);
						setState(81);
						((ExAndOpContext)_localctx).right = expression(8);
						}
						break;
					case 10:
						{
						_localctx = new ExOrOpContext(new ExpressionContext(_parentctx, _parentState));
						((ExOrOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(83);
						match(OR);
						setState(84);
						((ExOrOpContext)_localctx).right = expression(7);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__0);
			setState(91);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public IfBlockContext ifTrue;
		public IfBlockContext ifFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__1);
			setState(94);
			expression(0);
			setState(95);
			match(T__2);
			setState(96);
			((IfStmtContext)_localctx).ifTrue = ifBlock();
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(97);
				match(T__3);
				setState(98);
				((IfStmtContext)_localctx).ifFalse = ifBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LEFT_CURLYBRACKET() { return getToken(ParlementParser.LEFT_CURLYBRACKET, 0); }
		public TerminalNode RIGHT_CURLYBRACKET() { return getToken(ParlementParser.RIGHT_CURLYBRACKET, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifBlock);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__4:
			case T_INT:
			case T_STRING:
			case T_BOOLEAN:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				statement();
				}
				break;
			case LEFT_CURLYBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(LEFT_CURLYBRACKET);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T_INT) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(103);
					statement();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(RIGHT_CURLYBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public ExpressionContext times;
		public StatementContext content;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__4);
			setState(113);
			((LoopContext)_localctx).times = expression(0);
			setState(114);
			match(T__5);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T_INT) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(115);
				((LoopContext)_localctx).content = statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParlementParser.IDENTIFIER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__7);
			setState(124);
			match(IDENTIFIER);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T_INT) | (1L << T_STRING) | (1L << T_BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvokeFunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LEFT_PARENTHESES() { return getToken(ParlementParser.LEFT_PARENTHESES, 0); }
		public TerminalNode RIGHT_PARENTHESES() { return getToken(ParlementParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ParlementParser.IDENTIFIER, 0); }
		public InvokeFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitInvokeFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeFunctionContext invokeFunction() throws RecognitionException {
		InvokeFunctionContext _localctx = new InvokeFunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invokeFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((InvokeFunctionContext)_localctx).name = match(IDENTIFIER);
			setState(134);
			match(LEFT_PARENTHESES);
			setState(135);
			match(RIGHT_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Token type;
		public ExpressionContext val;
		public TerminalNode IDENTIFIER() { return getToken(ParlementParser.IDENTIFIER, 0); }
		public TerminalNode T_INT() { return getToken(ParlementParser.T_INT, 0); }
		public TerminalNode T_STRING() { return getToken(ParlementParser.T_STRING, 0); }
		public TerminalNode T_BOOLEAN() { return getToken(ParlementParser.T_BOOLEAN, 0); }
		public TerminalNode ASSIGN() { return getToken(ParlementParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParlementVisitor ) return ((ParlementVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((DeclarationContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_STRING) | (1L << T_BOOLEAN))) != 0)) ) {
				((DeclarationContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			match(IDENTIFIER);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(139);
				match(ASSIGN);
				setState(140);
				((DeclarationContext)_localctx).val = expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7f\n\7\3\b"+
		"\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\5\bq\n\b\3\t\3\t\3\t\3\t\7\tw\n\t"+
		"\f\t\16\tz\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\f\2\3\b\r"+
		"\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\13\r\2\u00a2\2\34\3\2\2\2\4\'\3\2"+
		"\2\2\6)\3\2\2\2\b\67\3\2\2\2\n\\\3\2\2\2\f_\3\2\2\2\16p\3\2\2\2\20r\3"+
		"\2\2\2\22}\3\2\2\2\24\u0087\3\2\2\2\26\u008b\3\2\2\2\30\33\5\4\3\2\31"+
		"\33\5\22\n\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34"+
		"\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!(\5\26"+
		"\f\2\"(\5\n\6\2#(\5\f\7\2$(\5\6\4\2%(\5\20\t\2&(\5\24\13\2\'!\3\2\2\2"+
		"\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*"+
		"\7 \2\2*+\7\31\2\2+,\5\b\5\2,\7\3\2\2\2-.\b\5\1\2./\7\16\2\2/\60\5\b\5"+
		"\2\60\61\7\17\2\2\618\3\2\2\2\628\5\24\13\2\638\7 \2\2\648\7\22\2\2\65"+
		"8\7\24\2\2\668\7\23\2\2\67-\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64"+
		"\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28Y\3\2\2\29:\f\21\2\2:;\7\27\2\2;"+
		"X\5\b\5\22<=\f\20\2\2=>\7\30\2\2>X\5\b\5\21?@\f\17\2\2@A\7\25\2\2AX\5"+
		"\b\5\20BC\f\16\2\2CD\7\26\2\2DX\5\b\5\17EF\f\r\2\2FG\7\34\2\2GX\5\b\5"+
		"\16HI\f\f\2\2IJ\7\35\2\2JX\5\b\5\rKL\f\13\2\2LM\7\32\2\2MX\5\b\5\fNO\f"+
		"\n\2\2OP\7\33\2\2PX\5\b\5\13QR\f\t\2\2RS\7\36\2\2SX\5\b\5\nTU\f\b\2\2"+
		"UV\7\37\2\2VX\5\b\5\tW9\3\2\2\2W<\3\2\2\2W?\3\2\2\2WB\3\2\2\2WE\3\2\2"+
		"\2WH\3\2\2\2WK\3\2\2\2WN\3\2\2\2WQ\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2"+
		"\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\]\7\3\2\2]^\5\b\5\2^\13\3\2\2\2_`\7"+
		"\4\2\2`a\5\b\5\2ab\7\5\2\2be\5\16\b\2cd\7\6\2\2df\5\16\b\2ec\3\2\2\2e"+
		"f\3\2\2\2f\r\3\2\2\2gq\5\4\3\2hl\7\20\2\2ik\5\4\3\2ji\3\2\2\2kn\3\2\2"+
		"\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2oq\7\21\2\2pg\3\2\2\2ph\3\2"+
		"\2\2q\17\3\2\2\2rs\7\7\2\2st\5\b\5\2tx\7\b\2\2uw\5\4\3\2vu\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\t\2\2|\21\3\2\2\2}"+
		"~\7\n\2\2~\u0082\7 \2\2\177\u0081\5\4\3\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\t\2\2\u0086\23\3\2\2\2\u0087\u0088\7 \2\2"+
		"\u0088\u0089\7\16\2\2\u0089\u008a\7\17\2\2\u008a\25\3\2\2\2\u008b\u008c"+
		"\t\2\2\2\u008c\u008f\7 \2\2\u008d\u008e\7\31\2\2\u008e\u0090\5\b\5\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\27\3\2\2\2\16\32\34\'\67WYel"+
		"px\u0082\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}