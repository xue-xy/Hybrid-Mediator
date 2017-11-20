// Generated from /Users/liyi/Library/Mobile Documents/com~apple~CloudDocs/项目/Mediator/src-antlr/MediatorLang.g4 by ANTLR 4.7
package org.fmgroup.mediator.language;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MediatorLangParser}.
 */
public interface MediatorLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MediatorLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MediatorLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#dependency}.
	 * @param ctx the parse tree
	 */
	void enterDependency(MediatorLangParser.DependencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#dependency}.
	 * @param ctx the parse tree
	 */
	void exitDependency(MediatorLangParser.DependencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#typedef}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(MediatorLangParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#typedef}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(MediatorLangParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MediatorLangParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MediatorLangParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code synchronizingStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizingStatement(MediatorLangParser.SynchronizingStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code synchronizingStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizingStatement(MediatorLangParser.SynchronizingStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MediatorLangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MediatorLangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIteStatement(MediatorLangParser.IteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteStatement}
	 * labeled alternative in {@link MediatorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIteStatement(MediatorLangParser.IteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MediatorLangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MediatorLangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#entityTemplate}.
	 * @param ctx the parse tree
	 */
	void enterEntityTemplate(MediatorLangParser.EntityTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#entityTemplate}.
	 * @param ctx the parse tree
	 */
	void exitEntityTemplate(MediatorLangParser.EntityTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MediatorLangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MediatorLangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#localVariableDef}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDef(MediatorLangParser.LocalVariableDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#localVariableDef}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDef(MediatorLangParser.LocalVariableDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#funcInterface}.
	 * @param ctx the parse tree
	 */
	void enterFuncInterface(MediatorLangParser.FuncInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#funcInterface}.
	 * @param ctx the parse tree
	 */
	void exitFuncInterface(MediatorLangParser.FuncInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#portsDecl}.
	 * @param ctx the parse tree
	 */
	void enterPortsDecl(MediatorLangParser.PortsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#portsDecl}.
	 * @param ctx the parse tree
	 */
	void exitPortsDecl(MediatorLangParser.PortsDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#compInterface}.
	 * @param ctx the parse tree
	 */
	void enterCompInterface(MediatorLangParser.CompInterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#compInterface}.
	 * @param ctx the parse tree
	 */
	void exitCompInterface(MediatorLangParser.CompInterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#variableSegment}.
	 * @param ctx the parse tree
	 */
	void enterVariableSegment(MediatorLangParser.VariableSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#variableSegment}.
	 * @param ctx the parse tree
	 */
	void exitVariableSegment(MediatorLangParser.VariableSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#transitionSegment}.
	 * @param ctx the parse tree
	 */
	void enterTransitionSegment(MediatorLangParser.TransitionSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#transitionSegment}.
	 * @param ctx the parse tree
	 */
	void exitTransitionSegment(MediatorLangParser.TransitionSegmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transitionSingle}
	 * labeled alternative in {@link MediatorLangParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransitionSingle(MediatorLangParser.TransitionSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transitionSingle}
	 * labeled alternative in {@link MediatorLangParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransitionSingle(MediatorLangParser.TransitionSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transitionGroup}
	 * labeled alternative in {@link MediatorLangParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransitionGroup(MediatorLangParser.TransitionGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transitionGroup}
	 * labeled alternative in {@link MediatorLangParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransitionGroup(MediatorLangParser.TransitionGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#automaton}.
	 * @param ctx the parse tree
	 */
	void enterAutomaton(MediatorLangParser.AutomatonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#automaton}.
	 * @param ctx the parse tree
	 */
	void exitAutomaton(MediatorLangParser.AutomatonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#componentSegment}.
	 * @param ctx the parse tree
	 */
	void enterComponentSegment(MediatorLangParser.ComponentSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#componentSegment}.
	 * @param ctx the parse tree
	 */
	void exitComponentSegment(MediatorLangParser.ComponentSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#internalSegment}.
	 * @param ctx the parse tree
	 */
	void enterInternalSegment(MediatorLangParser.InternalSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#internalSegment}.
	 * @param ctx the parse tree
	 */
	void exitInternalSegment(MediatorLangParser.InternalSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#connectionSegment}.
	 * @param ctx the parse tree
	 */
	void enterConnectionSegment(MediatorLangParser.ConnectionSegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#connectionSegment}.
	 * @param ctx the parse tree
	 */
	void exitConnectionSegment(MediatorLangParser.ConnectionSegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#componentDecl}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecl(MediatorLangParser.ComponentDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#componentDecl}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecl(MediatorLangParser.ComponentDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#connectionDecl}.
	 * @param ctx the parse tree
	 */
	void enterConnectionDecl(MediatorLangParser.ConnectionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#connectionDecl}.
	 * @param ctx the parse tree
	 */
	void exitConnectionDecl(MediatorLangParser.ConnectionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#system}.
	 * @param ctx the parse tree
	 */
	void enterSystem(MediatorLangParser.SystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#system}.
	 * @param ctx the parse tree
	 */
	void exitSystem(MediatorLangParser.SystemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterValueTerm(MediatorLangParser.ValueTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitValueTerm(MediatorLangParser.ValueTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIteTerm(MediatorLangParser.IteTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIteTerm(MediatorLangParser.IteTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOprTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOprTerm(MediatorLangParser.BinaryOprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOprTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOprTerm(MediatorLangParser.BinaryOprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterElementTerm(MediatorLangParser.ElementTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitElementTerm(MediatorLangParser.ElementTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBracketTerm(MediatorLangParser.BracketTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBracketTerm(MediatorLangParser.BracketTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTupleTerm(MediatorLangParser.TupleTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTupleTerm(MediatorLangParser.TupleTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleOprTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterSingleOprTerm(MediatorLangParser.SingleOprTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleOprTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitSingleOprTerm(MediatorLangParser.SingleOprTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListTerm(MediatorLangParser.ListTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListTerm(MediatorLangParser.ListTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCallTerm(MediatorLangParser.CallTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCallTerm(MediatorLangParser.CallTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFieldTerm(MediatorLangParser.FieldTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldTerm}
	 * labeled alternative in {@link MediatorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFieldTerm(MediatorLangParser.FieldTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(MediatorLangParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(MediatorLangParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterDoubleValue(MediatorLangParser.DoubleValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitDoubleValue(MediatorLangParser.DoubleValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStrValue(MediatorLangParser.StrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStrValue(MediatorLangParser.StrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(MediatorLangParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(MediatorLangParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdValue(MediatorLangParser.IdValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdValue(MediatorLangParser.IdValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(MediatorLangParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link MediatorLangParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(MediatorLangParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracketType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBracketType(MediatorLangParser.BracketTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracketType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBracketType(MediatorLangParser.BracketTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCharType(MediatorLangParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCharType(MediatorLangParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(MediatorLangParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(MediatorLangParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdType(MediatorLangParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdType(MediatorLangParser.IdTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterAbstractType(MediatorLangParser.AbstractTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitAbstractType(MediatorLangParser.AbstractTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(MediatorLangParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(MediatorLangParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(MediatorLangParser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(MediatorLangParser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInitType(MediatorLangParser.InitTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInitType(MediatorLangParser.InitTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterListType(MediatorLangParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitListType(MediatorLangParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(MediatorLangParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(MediatorLangParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(MediatorLangParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(MediatorLangParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boundedIntType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoundedIntType(MediatorLangParser.BoundedIntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boundedIntType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoundedIntType(MediatorLangParser.BoundedIntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStructType(MediatorLangParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStructType(MediatorLangParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterNullType(MediatorLangParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitNullType(MediatorLangParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterUnionType(MediatorLangParser.UnionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionType}
	 * labeled alternative in {@link MediatorLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitUnionType(MediatorLangParser.UnionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#typeorvalue}.
	 * @param ctx the parse tree
	 */
	void enterTypeorvalue(MediatorLangParser.TypeorvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#typeorvalue}.
	 * @param ctx the parse tree
	 */
	void exitTypeorvalue(MediatorLangParser.TypeorvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MediatorLangParser#scopedID}.
	 * @param ctx the parse tree
	 */
	void enterScopedID(MediatorLangParser.ScopedIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MediatorLangParser#scopedID}.
	 * @param ctx the parse tree
	 */
	void exitScopedID(MediatorLangParser.ScopedIDContext ctx);
}