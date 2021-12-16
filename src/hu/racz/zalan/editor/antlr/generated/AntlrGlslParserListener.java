// Generated from AntlrGlslParser.g4 by ANTLR 4.7.1
package hu.racz.zalan.editor.antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AntlrGlslParser}.
 */
public interface AntlrGlslParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AntlrGlslParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AntlrGlslParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(AntlrGlslParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(AntlrGlslParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(AntlrGlslParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(AntlrGlslParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_subroutine_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_subroutine_qualifier(AntlrGlslParser.Function_subroutine_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_subroutine_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_subroutine_qualifier(AntlrGlslParser.Function_subroutine_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void enterType_name_list(AntlrGlslParser.Type_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#type_name_list}.
	 * @param ctx the parse tree
	 */
	void exitType_name_list(AntlrGlslParser.Type_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter_list(AntlrGlslParser.Function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter_list(AntlrGlslParser.Function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameter(AntlrGlslParser.Function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameter(AntlrGlslParser.Function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#parameter_qualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParameter_qualifiers(AntlrGlslParser.Parameter_qualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#parameter_qualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParameter_qualifiers(AntlrGlslParser.Parameter_qualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#parameter_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_qualifier(AntlrGlslParser.Parameter_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#parameter_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_qualifier(AntlrGlslParser.Parameter_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void enterFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_prototype}.
	 * @param ctx the parse tree
	 */
	void exitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(AntlrGlslParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(AntlrGlslParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AntlrGlslParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AntlrGlslParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#function_call_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_parameter_list(AntlrGlslParser.Function_call_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#function_call_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_parameter_list(AntlrGlslParser.Function_call_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AntlrGlslParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AntlrGlslParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(AntlrGlslParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(AntlrGlslParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(AntlrGlslParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(AntlrGlslParser.Simple_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(AntlrGlslParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(AntlrGlslParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(AntlrGlslParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(AntlrGlslParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#case_group}.
	 * @param ctx the parse tree
	 */
	void enterCase_group(AntlrGlslParser.Case_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#case_group}.
	 * @param ctx the parse tree
	 */
	void exitCase_group(AntlrGlslParser.Case_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#case_label}.
	 * @param ctx the parse tree
	 */
	void enterCase_label(AntlrGlslParser.Case_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#case_label}.
	 * @param ctx the parse tree
	 */
	void exitCase_label(AntlrGlslParser.Case_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#case_statement_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement_list(AntlrGlslParser.Case_statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#case_statement_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement_list(AntlrGlslParser.Case_statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(AntlrGlslParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(AntlrGlslParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#for_iteration}.
	 * @param ctx the parse tree
	 */
	void enterFor_iteration(AntlrGlslParser.For_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#for_iteration}.
	 * @param ctx the parse tree
	 */
	void exitFor_iteration(AntlrGlslParser.For_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#while_iteration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_iteration(AntlrGlslParser.While_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#while_iteration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_iteration(AntlrGlslParser.While_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#do_while_iteration}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_iteration(AntlrGlslParser.Do_while_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#do_while_iteration}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_iteration(AntlrGlslParser.Do_while_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(AntlrGlslParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(AntlrGlslParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(AntlrGlslParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(AntlrGlslParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(AntlrGlslParser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(AntlrGlslParser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(AntlrGlslParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(AntlrGlslParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_declaration(AntlrGlslParser.Member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_declaration(AntlrGlslParser.Member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(AntlrGlslParser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(AntlrGlslParser.Member_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(AntlrGlslParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(AntlrGlslParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#identifier_optarray}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_optarray(AntlrGlslParser.Identifier_optarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#identifier_optarray}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_optarray(AntlrGlslParser.Identifier_optarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#identifier_optarray_optassignment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_optarray_optassignment(AntlrGlslParser.Identifier_optarray_optassignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#identifier_optarray_optassignment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_optarray_optassignment(AntlrGlslParser.Identifier_optarray_optassignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AntlrGlslParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AntlrGlslParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(AntlrGlslParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(AntlrGlslParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AntlrGlslParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AntlrGlslParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#array_subscript}.
	 * @param ctx the parse tree
	 */
	void enterArray_subscript(AntlrGlslParser.Array_subscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#array_subscript}.
	 * @param ctx the parse tree
	 */
	void exitArray_subscript(AntlrGlslParser.Array_subscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(AntlrGlslParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(AntlrGlslParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_qualifier(AntlrGlslParser.Storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_qualifier(AntlrGlslParser.Storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#auxiliary_storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliary_storage_qualifier(AntlrGlslParser.Auxiliary_storage_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#auxiliary_storage_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliary_storage_qualifier(AntlrGlslParser.Auxiliary_storage_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#memory_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterMemory_qualifier(AntlrGlslParser.Memory_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#memory_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitMemory_qualifier(AntlrGlslParser.Memory_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier(AntlrGlslParser.Layout_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#layout_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier(AntlrGlslParser.Layout_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id_list(AntlrGlslParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#layout_qualifier_id_list}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id_list(AntlrGlslParser.Layout_qualifier_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void enterLayout_qualifier_id(AntlrGlslParser.Layout_qualifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#layout_qualifier_id}.
	 * @param ctx the parse tree
	 */
	void exitLayout_qualifier_id(AntlrGlslParser.Layout_qualifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_qualifier(AntlrGlslParser.Precision_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#precision_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_qualifier(AntlrGlslParser.Precision_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation_qualifier(AntlrGlslParser.Interpolation_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#interpolation_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation_qualifier(AntlrGlslParser.Interpolation_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AntlrGlslParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AntlrGlslParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AntlrGlslParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(AntlrGlslParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AntlrGlslParser#number_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(AntlrGlslParser.Number_literalContext ctx);
}