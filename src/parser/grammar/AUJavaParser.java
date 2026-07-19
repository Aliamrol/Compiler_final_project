// Generated from grammar/AUJava.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AUJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, PUBLIC=2, STATIC=3, VOID=4, MAIN=5, STRING=6, EXTENDS=7, RETURN=8, 
		INT=9, BOOLEAN=10, IF=11, ELSE=12, WHILE=13, CONTINUE=14, BREAK=15, NEW=16, 
		THIS=17, PRINTLN=18, TRUE=19, FALSE=20, ASSIGN=21, PLUS=22, MINUS=23, 
		MULT=24, DIV=25, EQ=26, NEQ=27, LT=28, GT=29, LTE=30, GTE=31, AND=32, 
		OR=33, NOT=34, LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, 
		RBRACK=40, SEMI=41, COMMA=42, DOT=43, ID=44, INT_LITERAL=45, WS=46, LINE_COMMENT=47, 
		BLOCK_COMMENT=48;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_mainMethod = 2, RULE_classMember = 3, 
		RULE_parameterList = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_argumentList = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "mainMethod", "classMember", "parameterList", 
			"type", "statement", "expression", "argumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'public'", "'static'", "'void'", "'main'", "'String'", 
			"'extends'", "'return'", "'int'", "'boolean'", "'if'", "'else'", "'while'", 
			"'continue'", "'break'", "'new'", "'this'", "'System.out.println'", "'true'", 
			"'false'", "'='", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'&&'", "'||'", "'!'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "EXTENDS", 
			"RETURN", "INT", "BOOLEAN", "IF", "ELSE", "WHILE", "CONTINUE", "BREAK", 
			"NEW", "THIS", "PRINTLN", "TRUE", "FALSE", "ASSIGN", "PLUS", "MINUS", 
			"MULT", "DIV", "EQ", "NEQ", "LT", "GT", "LTE", "GTE", "AND", "OR", "NOT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ID", "INT_LITERAL", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "AUJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AUJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AUJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==PUBLIC) {
				{
				{
				setState(18);
				classDeclaration();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AUJavaParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(AUJavaParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(AUJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AUJavaParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public TerminalNode EXTENDS() { return getToken(AUJavaParser.EXTENDS, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(PUBLIC);
				setState(27);
				match(CLASS);
				setState(28);
				match(ID);
				setState(29);
				match(LBRACE);
				setState(30);
				mainMethod();
				setState(31);
				match(RBRACE);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(CLASS);
				setState(34);
				match(ID);
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(35);
					match(EXTENDS);
					setState(36);
					match(ID);
					}
				}

				setState(39);
				match(LBRACE);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186045952L) != 0)) {
					{
					{
					setState(40);
					classMember();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainMethodContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AUJavaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(AUJavaParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(AUJavaParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(AUJavaParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(AUJavaParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(AUJavaParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AUJavaParser.RBRACK, 0); }
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(PUBLIC);
			setState(50);
			match(STATIC);
			setState(51);
			match(VOID);
			setState(52);
			match(MAIN);
			setState(53);
			match(LPAREN);
			setState(54);
			match(STRING);
			setState(55);
			match(LBRACK);
			setState(56);
			match(RBRACK);
			setState(57);
			match(ID);
			setState(58);
			match(RPAREN);
			setState(59);
			match(LBRACE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52965538787072L) != 0)) {
				{
				{
				setState(60);
				statement();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMemberContext extends ParserRuleContext {
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
	 
		public ClassMemberContext() { }
		public void copyFrom(ClassMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ClassMemberContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ClassMemberContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public FieldDeclarationContext(ClassMemberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classMember);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new FieldDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				type();
				setState(69);
				match(ID);
				setState(70);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new MethodDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				type();
				setState(73);
				match(ID);
				setState(74);
				match(LPAREN);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186045952L) != 0)) {
					{
					setState(75);
					parameterList();
					}
				}

				setState(78);
				match(RPAREN);
				setState(79);
				match(LBRACE);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52965538787072L) != 0)) {
					{
					{
					setState(80);
					statement();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(AUJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AUJavaParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AUJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AUJavaParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type();
			setState(91);
			match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				type();
				setState(94);
				match(ID);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AUJavaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(AUJavaParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592186045952L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(AUJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINTLN() { return getToken(AUJavaParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends StatementContext {
		public TerminalNode LBRACE() { return getToken(AUJavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AUJavaParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends StatementContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(AUJavaParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(AUJavaParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(AUJavaParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(AUJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AUJavaParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(AUJavaParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationAssignContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AUJavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public VarDeclarationAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitVarDeclarationAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(AUJavaParser.SEMI, 0); }
		public VarDeclarationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(LBRACE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52965538787072L) != 0)) {
					{
					{
					setState(104);
					statement();
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new VarDeclarationAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				type();
				setState(112);
				match(ID);
				setState(113);
				match(ASSIGN);
				setState(114);
				expression(0);
				setState(115);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new VarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				type();
				setState(118);
				match(ID);
				setState(119);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				expression(0);
				setState(122);
				match(ASSIGN);
				setState(123);
				expression(0);
				setState(124);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(IF);
				setState(127);
				match(LPAREN);
				setState(128);
				expression(0);
				setState(129);
				match(RPAREN);
				setState(130);
				statement();
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(131);
					match(ELSE);
					setState(132);
					statement();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(WHILE);
				setState(136);
				match(LPAREN);
				setState(137);
				expression(0);
				setState(138);
				match(RPAREN);
				setState(139);
				statement();
				}
				break;
			case 7:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				match(PRINTLN);
				setState(142);
				match(LPAREN);
				setState(143);
				expression(0);
				setState(144);
				match(RPAREN);
				setState(145);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(RETURN);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52828099510272L) != 0)) {
					{
					setState(148);
					expression(0);
					}
				}

				setState(151);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(BREAK);
				setState(153);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				match(CONTINUE);
				setState(155);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(156);
				expression(0);
				setState(157);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class NewObjectExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(AUJavaParser.NEW, 0); }
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public NewObjectExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitNewObjectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisExprContext extends ExpressionContext {
		public TerminalNode THIS() { return getToken(AUJavaParser.THIS, 0); }
		public ThisExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitThisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode INT_LITERAL() { return getToken(AUJavaParser.INT_LITERAL, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AUJavaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AUJavaParser.MINUS, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueExprContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(AUJavaParser.TRUE, 0); }
		public TrueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AUJavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public FieldAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFieldAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AUJavaParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleMethodCallExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public SimpleMethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitSimpleMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(AUJavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(AUJavaParser.GT, 0); }
		public TerminalNode LTE() { return getToken(AUJavaParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(AUJavaParser.GTE, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AUJavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(AUJavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AUJavaParser.RPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMethodCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(AUJavaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseExprContext extends ExpressionContext {
		public TerminalNode FALSE() { return getToken(AUJavaParser.FALSE, 0); }
		public FalseExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(AUJavaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(AUJavaParser.DIV, 0); }
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(AUJavaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AUJavaParser.NEQ, 0); }
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(AUJavaParser.ID, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AUJavaParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				match(LPAREN);
				setState(163);
				expression(0);
				setState(164);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new SimpleMethodCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(ID);
				setState(167);
				match(LPAREN);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52828099510272L) != 0)) {
					{
					setState(168);
					argumentList();
					}
				}

				setState(171);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(NOT);
				setState(173);
				expression(13);
				}
				break;
			case 4:
				{
				_localctx = new NewObjectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(NEW);
				setState(175);
				match(ID);
				setState(176);
				match(LPAREN);
				setState(177);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ThisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(THIS);
				}
				break;
			case 6:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(INT_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(186);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(187);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(189);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(192);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(198);
						match(AND);
						setState(199);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(201);
						match(OR);
						setState(202);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new MethodCallExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(204);
						match(DOT);
						setState(205);
						match(ID);
						setState(206);
						match(LPAREN);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52828099510272L) != 0)) {
							{
							setState(207);
							argumentList();
							}
						}

						setState(210);
						match(RPAREN);
						}
						break;
					case 8:
						{
						_localctx = new FieldAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(212);
						match(DOT);
						setState(213);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AUJavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AUJavaParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AUJavaVisitor ) return ((AUJavaVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			expression(0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				expression(0);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00e4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000\u0017"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0003\u00010\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002>\b\u0002\n\u0002\f\u0002A\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003M\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003Y\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004a\b\u0004\n\u0004\f\u0004"+
		"d\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006"+
		"j\b\u0006\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0086\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0096\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a0\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00aa\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b8\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00d1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00d7\b\u0007\n\u0007\f\u0007\u00da\t\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00df\b\b\n\b\f\b\u00e2\t\b\u0001\b\u0000\u0001\u000e\t\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0000\u0005\u0002\u0000\t\n,,\u0001\u0000"+
		"\u0018\u0019\u0001\u0000\u0016\u0017\u0001\u0000\u001c\u001f\u0001\u0000"+
		"\u001a\u001b\u0103\u0000\u0015\u0001\u0000\u0000\u0000\u0002/\u0001\u0000"+
		"\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006X\u0001\u0000\u0000\u0000"+
		"\bZ\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000\u0000\f\u009f\u0001\u0000"+
		"\u0000\u0000\u000e\u00b7\u0001\u0000\u0000\u0000\u0010\u00db\u0001\u0000"+
		"\u0000\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000"+
		"\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001\u0000"+
		"\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000"+
		"\u0000\u0001\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0002"+
		"\u0000\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0005,\u0000"+
		"\u0000\u001d\u001e\u0005%\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000"+
		"\u001f \u0005&\u0000\u0000 0\u0001\u0000\u0000\u0000!\"\u0005\u0001\u0000"+
		"\u0000\"%\u0005,\u0000\u0000#$\u0005\u0007\u0000\u0000$&\u0005,\u0000"+
		"\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'+\u0005%\u0000\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000"+
		"\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		".0\u0005&\u0000\u0000/\u001a\u0001\u0000\u0000\u0000/!\u0001\u0000\u0000"+
		"\u00000\u0003\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u000023\u0005"+
		"\u0003\u0000\u000034\u0005\u0004\u0000\u000045\u0005\u0005\u0000\u0000"+
		"56\u0005#\u0000\u000067\u0005\u0006\u0000\u000078\u0005\'\u0000\u0000"+
		"89\u0005(\u0000\u00009:\u0005,\u0000\u0000:;\u0005$\u0000\u0000;?\u0005"+
		"%\u0000\u0000<>\u0003\f\u0006\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005&\u0000\u0000"+
		"C\u0005\u0001\u0000\u0000\u0000DE\u0003\n\u0005\u0000EF\u0005,\u0000\u0000"+
		"FG\u0005)\u0000\u0000GY\u0001\u0000\u0000\u0000HI\u0003\n\u0005\u0000"+
		"IJ\u0005,\u0000\u0000JL\u0005#\u0000\u0000KM\u0003\b\u0004\u0000LK\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"NO\u0005$\u0000\u0000OS\u0005%\u0000\u0000PR\u0003\f\u0006\u0000QP\u0001"+
		"\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VW\u0005&\u0000\u0000WY\u0001\u0000\u0000\u0000XD\u0001\u0000\u0000"+
		"\u0000XH\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000Z[\u0003"+
		"\n\u0005\u0000[b\u0005,\u0000\u0000\\]\u0005*\u0000\u0000]^\u0003\n\u0005"+
		"\u0000^_\u0005,\u0000\u0000_a\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000c\t\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0007"+
		"\u0000\u0000\u0000f\u000b\u0001\u0000\u0000\u0000gk\u0005%\u0000\u0000"+
		"hj\u0003\f\u0006\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000n\u00a0\u0005&\u0000\u0000op\u0003\n\u0005"+
		"\u0000pq\u0005,\u0000\u0000qr\u0005\u0015\u0000\u0000rs\u0003\u000e\u0007"+
		"\u0000st\u0005)\u0000\u0000t\u00a0\u0001\u0000\u0000\u0000uv\u0003\n\u0005"+
		"\u0000vw\u0005,\u0000\u0000wx\u0005)\u0000\u0000x\u00a0\u0001\u0000\u0000"+
		"\u0000yz\u0003\u000e\u0007\u0000z{\u0005\u0015\u0000\u0000{|\u0003\u000e"+
		"\u0007\u0000|}\u0005)\u0000\u0000}\u00a0\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u000b\u0000\u0000\u007f\u0080\u0005#\u0000\u0000\u0080\u0081\u0003"+
		"\u000e\u0007\u0000\u0081\u0082\u0005$\u0000\u0000\u0082\u0085\u0003\f"+
		"\u0006\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084\u0086\u0003\f\u0006"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u00a0\u0001\u0000\u0000\u0000\u0087\u0088\u0005\r\u0000\u0000"+
		"\u0088\u0089\u0005#\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a"+
		"\u008b\u0005$\u0000\u0000\u008b\u008c\u0003\f\u0006\u0000\u008c\u00a0"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0012\u0000\u0000\u008e\u008f"+
		"\u0005#\u0000\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091\u0005"+
		"$\u0000\u0000\u0091\u0092\u0005)\u0000\u0000\u0092\u00a0\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0005\b\u0000\u0000\u0094\u0096\u0003\u000e\u0007\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u00a0\u0005)\u0000\u0000\u0098"+
		"\u0099\u0005\u000f\u0000\u0000\u0099\u00a0\u0005)\u0000\u0000\u009a\u009b"+
		"\u0005\u000e\u0000\u0000\u009b\u00a0\u0005)\u0000\u0000\u009c\u009d\u0003"+
		"\u000e\u0007\u0000\u009d\u009e\u0005)\u0000\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009fg\u0001\u0000\u0000\u0000\u009fo\u0001\u0000\u0000\u0000"+
		"\u009fu\u0001\u0000\u0000\u0000\u009fy\u0001\u0000\u0000\u0000\u009f~"+
		"\u0001\u0000\u0000\u0000\u009f\u0087\u0001\u0000\u0000\u0000\u009f\u008d"+
		"\u0001\u0000\u0000\u0000\u009f\u0093\u0001\u0000\u0000\u0000\u009f\u0098"+
		"\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009c"+
		"\u0001\u0000\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006"+
		"\u0007\uffff\uffff\u0000\u00a2\u00a3\u0005#\u0000\u0000\u00a3\u00a4\u0003"+
		"\u000e\u0007\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005,\u0000\u0000\u00a7\u00a9\u0005#\u0000\u0000"+
		"\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00b8\u0005$\u0000\u0000\u00ac\u00ad\u0005\"\u0000\u0000\u00ad\u00b8"+
		"\u0003\u000e\u0007\r\u00ae\u00af\u0005\u0010\u0000\u0000\u00af\u00b0\u0005"+
		",\u0000\u0000\u00b0\u00b1\u0005#\u0000\u0000\u00b1\u00b8\u0005$\u0000"+
		"\u0000\u00b2\u00b8\u0005\u0011\u0000\u0000\u00b3\u00b8\u0005,\u0000\u0000"+
		"\u00b4\u00b8\u0005-\u0000\u0000\u00b5\u00b8\u0005\u0013\u0000\u0000\u00b6"+
		"\u00b8\u0005\u0014\u0000\u0000\u00b7\u00a1\u0001\u0000\u0000\u0000\u00b7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00b7\u00ac\u0001\u0000\u0000\u0000\u00b7"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00d8\u0001\u0000\u0000\u0000\u00b9\u00ba\n\f\u0000\u0000\u00ba\u00bb"+
		"\u0007\u0001\u0000\u0000\u00bb\u00d7\u0003\u000e\u0007\r\u00bc\u00bd\n"+
		"\u000b\u0000\u0000\u00bd\u00be\u0007\u0002\u0000\u0000\u00be\u00d7\u0003"+
		"\u000e\u0007\f\u00bf\u00c0\n\n\u0000\u0000\u00c0\u00c1\u0007\u0003\u0000"+
		"\u0000\u00c1\u00d7\u0003\u000e\u0007\u000b\u00c2\u00c3\n\t\u0000\u0000"+
		"\u00c3\u00c4\u0007\u0004\u0000\u0000\u00c4\u00d7\u0003\u000e\u0007\n\u00c5"+
		"\u00c6\n\b\u0000\u0000\u00c6\u00c7\u0005 \u0000\u0000\u00c7\u00d7\u0003"+
		"\u000e\u0007\t\u00c8\u00c9\n\u0007\u0000\u0000\u00c9\u00ca\u0005!\u0000"+
		"\u0000\u00ca\u00d7\u0003\u000e\u0007\b\u00cb\u00cc\n\u0010\u0000\u0000"+
		"\u00cc\u00cd\u0005+\u0000\u0000\u00cd\u00ce\u0005,\u0000\u0000\u00ce\u00d0"+
		"\u0005#\u0000\u0000\u00cf\u00d1\u0003\u0010\b\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d7\u0005$\u0000\u0000\u00d3\u00d4\n\u000f"+
		"\u0000\u0000\u00d4\u00d5\u0005+\u0000\u0000\u00d5\u00d7\u0005,\u0000\u0000"+
		"\u00d6\u00b9\u0001\u0000\u0000\u0000\u00d6\u00bc\u0001\u0000\u0000\u0000"+
		"\u00d6\u00bf\u0001\u0000\u0000\u0000\u00d6\u00c2\u0001\u0000\u0000\u0000"+
		"\u00d6\u00c5\u0001\u0000\u0000\u0000\u00d6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00d6\u00cb\u0001\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u000f\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00e0\u0003\u000e\u0007\u0000"+
		"\u00dc\u00dd\u0005*\u0000\u0000\u00dd\u00df\u0003\u000e\u0007\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u0011\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u0013"+
		"\u0015%+/?LSXbk\u0085\u0095\u009f\u00a9\u00b7\u00d0\u00d6\u00d8\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}