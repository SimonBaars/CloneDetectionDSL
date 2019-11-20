/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.simonbaars.cdd.ide.contentassist.antlr.internal.InternalCloneDetectionDSLParser;
import com.simonbaars.cdd.services.CloneDetectionDSLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class CloneDetectionDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CloneDetectionDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CloneDetectionDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getNodeAccess().getAlternatives_0(), "rule__Node__Alternatives_0");
			builder.put(grammarAccess.getMinSizeAccess().getAlternatives_1(), "rule__MinSize__Alternatives_1");
			builder.put(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives(), "rule__BooleanExpressionLevel2__Alternatives");
			builder.put(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives(), "rule__BooleanExpressionLevel3__Alternatives");
			builder.put(grammarAccess.getExpressionLevel1Access().getAlternatives_1(), "rule__ExpressionLevel1__Alternatives_1");
			builder.put(grammarAccess.getExpressionLevel2Access().getAlternatives_1(), "rule__ExpressionLevel2__Alternatives_1");
			builder.put(grammarAccess.getExpressionLevel4Access().getAlternatives(), "rule__ExpressionLevel4__Alternatives");
			builder.put(grammarAccess.getExpressionLevel5Access().getAlternatives(), "rule__ExpressionLevel5__Alternatives");
			builder.put(grammarAccess.getMatchTargetAccess().getAlternatives(), "rule__MatchTarget__Alternatives");
			builder.put(grammarAccess.getSizeMetricAccess().getAlternatives(), "rule__SizeMetric__Alternatives");
			builder.put(grammarAccess.getBoolOperatorAccess().getAlternatives(), "rule__BoolOperator__Alternatives");
			builder.put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
			builder.put(grammarAccess.getUnderAccess().getAlternatives(), "rule__Under__Alternatives");
			builder.put(grammarAccess.getMetricAccess().getAlternatives(), "rule__Metric__Alternatives");
			builder.put(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives(), "rule__BinaryBooleanOperator__Alternatives");
			builder.put(grammarAccess.getCompareOperatorAccess().getAlternatives(), "rule__CompareOperator__Alternatives");
			builder.put(grammarAccess.getProjectAccess().getGroup(), "rule__Project__Group__0");
			builder.put(grammarAccess.getSearchRootAccess().getGroup(), "rule__SearchRoot__Group__0");
			builder.put(grammarAccess.getMatchAccess().getGroup(), "rule__Match__Group__0");
			builder.put(grammarAccess.getExcludeAccess().getGroup(), "rule__Exclude__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_1(), "rule__Node__Group_1__0");
			builder.put(grammarAccess.getNodesAccess().getGroup(), "rule__Nodes__Group__0");
			builder.put(grammarAccess.getNodesAccess().getGroup_1(), "rule__Nodes__Group_1__0");
			builder.put(grammarAccess.getMinSizeAccess().getGroup(), "rule__MinSize__Group__0");
			builder.put(grammarAccess.getMinSizeAccess().getGroup_1_1(), "rule__MinSize__Group_1_1__0");
			builder.put(grammarAccess.getMinSizeAccess().getGroup_2(), "rule__MinSize__Group_2__0");
			builder.put(grammarAccess.getMetricExprAccess().getGroup(), "rule__MetricExpr__Group__0");
			builder.put(grammarAccess.getDoNotCompareAccess().getGroup(), "rule__DoNotCompare__Group__0");
			builder.put(grammarAccess.getCompareAccess().getGroup(), "rule__Compare__Group__0");
			builder.put(grammarAccess.getPercentageAccess().getGroup(), "rule__Percentage__Group__0");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getGroup(), "rule__BooleanExpressionLevel1__Group__0");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1(), "rule__BooleanExpressionLevel1__Group_1__0");
			builder.put(grammarAccess.getNotExpressionAccess().getGroup(), "rule__NotExpression__Group__0");
			builder.put(grammarAccess.getComparisonExpressionAccess().getGroup(), "rule__ComparisonExpression__Group__0");
			builder.put(grammarAccess.getBooleanExpressionBracketAccess().getGroup(), "rule__BooleanExpressionBracket__Group__0");
			builder.put(grammarAccess.getExpressionLevel1Access().getGroup(), "rule__ExpressionLevel1__Group__0");
			builder.put(grammarAccess.getExpressionLevel1Access().getGroup_1_0(), "rule__ExpressionLevel1__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLevel1Access().getGroup_1_1(), "rule__ExpressionLevel1__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup(), "rule__ExpressionLevel2__Group__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_0(), "rule__ExpressionLevel2__Group_1_0__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_1(), "rule__ExpressionLevel2__Group_1_1__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_2(), "rule__ExpressionLevel2__Group_1_2__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_3(), "rule__ExpressionLevel2__Group_1_3__0");
			builder.put(grammarAccess.getExpressionLevel2Access().getGroup_1_4(), "rule__ExpressionLevel2__Group_1_4__0");
			builder.put(grammarAccess.getExpressionLevel3Access().getGroup(), "rule__ExpressionLevel3__Group__0");
			builder.put(grammarAccess.getExpressionLevel3Access().getGroup_1(), "rule__ExpressionLevel3__Group_1__0");
			builder.put(grammarAccess.getExpressionMinusAccess().getGroup(), "rule__ExpressionMinus__Group__0");
			builder.put(grammarAccess.getExpressionPlusAccess().getGroup(), "rule__ExpressionPlus__Group__0");
			builder.put(grammarAccess.getExpressionBracketAccess().getGroup(), "rule__ExpressionBracket__Group__0");
			builder.put(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0(), "rule__CloneDetection__ProjectAssignment_0");
			builder.put(grammarAccess.getCloneDetectionAccess().getRootAssignment_1(), "rule__CloneDetection__RootAssignment_1");
			builder.put(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2(), "rule__CloneDetection__MatchAssignment_2");
			builder.put(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3(), "rule__CloneDetection__ExcludeAssignment_3");
			builder.put(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4(), "rule__CloneDetection__SizeAssignment_4");
			builder.put(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5(), "rule__CloneDetection__NotCompareAssignment_5");
			builder.put(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6(), "rule__CloneDetection__CompareAssignment_6");
			builder.put(grammarAccess.getProjectAccess().getPathAssignment_1(), "rule__Project__PathAssignment_1");
			builder.put(grammarAccess.getSearchRootAccess().getNodesAssignment_1(), "rule__SearchRoot__NodesAssignment_1");
			builder.put(grammarAccess.getSearchRootAccess().getConditionAssignment_2(), "rule__SearchRoot__ConditionAssignment_2");
			builder.put(grammarAccess.getMatchAccess().getTargetAssignment_1(), "rule__Match__TargetAssignment_1");
			builder.put(grammarAccess.getNodeAccess().getNameAssignment_0_0(), "rule__Node__NameAssignment_0_0");
			builder.put(grammarAccess.getNodeAccess().getUnderAssignment_1_0(), "rule__Node__UnderAssignment_1_0");
			builder.put(grammarAccess.getNodeAccess().getNodeAssignment_1_1(), "rule__Node__NodeAssignment_1_1");
			builder.put(grammarAccess.getNodesAccess().getNodeAssignment_0(), "rule__Nodes__NodeAssignment_0");
			builder.put(grammarAccess.getNodesAccess().getNodesAssignment_1_1(), "rule__Nodes__NodesAssignment_1_1");
			builder.put(grammarAccess.getMinSizeAccess().getExprAssignment_1_0(), "rule__MinSize__ExprAssignment_1_0");
			builder.put(grammarAccess.getMinSizeAccess().getBracketsAssignment_1_1_1(), "rule__MinSize__BracketsAssignment_1_1_1");
			builder.put(grammarAccess.getMinSizeAccess().getOperatorAssignment_2_0(), "rule__MinSize__OperatorAssignment_2_0");
			builder.put(grammarAccess.getMinSizeAccess().getSizeAssignment_2_1(), "rule__MinSize__SizeAssignment_2_1");
			builder.put(grammarAccess.getMetricExprAccess().getAmountAssignment_0(), "rule__MetricExpr__AmountAssignment_0");
			builder.put(grammarAccess.getMetricExprAccess().getMetricAssignment_1(), "rule__MetricExpr__MetricAssignment_1");
			builder.put(grammarAccess.getCompareAccess().getNodesAssignment_1(), "rule__Compare__NodesAssignment_1");
			builder.put(grammarAccess.getCompareAccess().getComparisonMethodAssignment_2(), "rule__Compare__ComparisonMethodAssignment_2");
			builder.put(grammarAccess.getCompareAccess().getDeepestNodeAssignment_3(), "rule__Compare__DeepestNodeAssignment_3");
			builder.put(grammarAccess.getCompareAccess().getPercAssignment_4(), "rule__Compare__PercAssignment_4");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1(), "rule__BooleanExpressionLevel1__BopAssignment_1_1");
			builder.put(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2(), "rule__BooleanExpressionLevel1__RightAssignment_1_2");
			builder.put(grammarAccess.getNotExpressionAccess().getSubAssignment_1(), "rule__NotExpression__SubAssignment_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1(), "rule__ComparisonExpression__LeftAssignment_1");
			builder.put(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2(), "rule__ComparisonExpression__OpAssignment_2");
			builder.put(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3(), "rule__ComparisonExpression__RightAssignment_3");
			builder.put(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1(), "rule__BooleanExpressionBracket__SubAssignment_1");
			builder.put(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment(), "rule__BooleanExpressionConstant__ValueAssignment");
			builder.put(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2(), "rule__ExpressionLevel1__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2(), "rule__ExpressionLevel1__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2(), "rule__ExpressionLevel2__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2(), "rule__ExpressionLevel2__RightAssignment_1_1_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2(), "rule__ExpressionLevel2__RightAssignment_1_2_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2(), "rule__ExpressionLevel2__RightAssignment_1_3_2");
			builder.put(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2(), "rule__ExpressionLevel2__RightAssignment_1_4_2");
			builder.put(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2(), "rule__ExpressionLevel3__RightAssignment_1_2");
			builder.put(grammarAccess.getExpressionMinusAccess().getSubAssignment_1(), "rule__ExpressionMinus__SubAssignment_1");
			builder.put(grammarAccess.getExpressionPlusAccess().getSubAssignment_1(), "rule__ExpressionPlus__SubAssignment_1");
			builder.put(grammarAccess.getExpressionLevel5Access().getMetricAssignment_2(), "rule__ExpressionLevel5__MetricAssignment_2");
			builder.put(grammarAccess.getExpressionBracketAccess().getSubAssignment_1(), "rule__ExpressionBracket__SubAssignment_1");
			builder.put(grammarAccess.getExpressionConstantIntAccess().getValueAssignment(), "rule__ExpressionConstantInt__ValueAssignment");
			builder.put(grammarAccess.getCloneDetectionAccess().getUnorderedGroup(), "rule__CloneDetection__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CloneDetectionDSLGrammarAccess grammarAccess;

	@Override
	protected InternalCloneDetectionDSLParser createParser() {
		InternalCloneDetectionDSLParser result = new InternalCloneDetectionDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CloneDetectionDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CloneDetectionDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
