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
			builder.put(grammarAccess.getMatchTargetAccess().getAlternatives(), "rule__MatchTarget__Alternatives");
			builder.put(grammarAccess.getSizeMetricAccess().getAlternatives(), "rule__SizeMetric__Alternatives");
			builder.put(grammarAccess.getBoolOperatorAccess().getAlternatives(), "rule__BoolOperator__Alternatives");
			builder.put(grammarAccess.getMethodAccess().getAlternatives(), "rule__Method__Alternatives");
			builder.put(grammarAccess.getUnderAccess().getAlternatives(), "rule__Under__Alternatives");
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
			builder.put(grammarAccess.getCloneDetectionAccess().getProjectAssignment_0(), "rule__CloneDetection__ProjectAssignment_0");
			builder.put(grammarAccess.getCloneDetectionAccess().getRootAssignment_1(), "rule__CloneDetection__RootAssignment_1");
			builder.put(grammarAccess.getCloneDetectionAccess().getMatchAssignment_2(), "rule__CloneDetection__MatchAssignment_2");
			builder.put(grammarAccess.getCloneDetectionAccess().getExcludeAssignment_3(), "rule__CloneDetection__ExcludeAssignment_3");
			builder.put(grammarAccess.getCloneDetectionAccess().getSizeAssignment_4(), "rule__CloneDetection__SizeAssignment_4");
			builder.put(grammarAccess.getCloneDetectionAccess().getNotCompareAssignment_5(), "rule__CloneDetection__NotCompareAssignment_5");
			builder.put(grammarAccess.getCloneDetectionAccess().getCompareAssignment_6(), "rule__CloneDetection__CompareAssignment_6");
			builder.put(grammarAccess.getProjectAccess().getPathAssignment_1(), "rule__Project__PathAssignment_1");
			builder.put(grammarAccess.getSearchRootAccess().getNodesAssignment_1(), "rule__SearchRoot__NodesAssignment_1");
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
