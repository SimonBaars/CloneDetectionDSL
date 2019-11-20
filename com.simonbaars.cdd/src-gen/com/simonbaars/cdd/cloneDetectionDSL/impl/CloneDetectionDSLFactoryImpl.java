/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloneDetectionDSLFactoryImpl extends EFactoryImpl implements CloneDetectionDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CloneDetectionDSLFactory init()
  {
    try
    {
      CloneDetectionDSLFactory theCloneDetectionDSLFactory = (CloneDetectionDSLFactory)EPackage.Registry.INSTANCE.getEFactory(CloneDetectionDSLPackage.eNS_URI);
      if (theCloneDetectionDSLFactory != null)
      {
        return theCloneDetectionDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CloneDetectionDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloneDetectionDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CloneDetectionDSLPackage.CLONE_DETECTION: return createCloneDetection();
      case CloneDetectionDSLPackage.PROJECT: return createProject();
      case CloneDetectionDSLPackage.SEARCH_ROOT: return createSearchRoot();
      case CloneDetectionDSLPackage.MATCH: return createMatch();
      case CloneDetectionDSLPackage.EXCLUDE: return createExclude();
      case CloneDetectionDSLPackage.NODE: return createNode();
      case CloneDetectionDSLPackage.NODES: return createNodes();
      case CloneDetectionDSLPackage.MIN_SIZE: return createMinSize();
      case CloneDetectionDSLPackage.METRIC_EXPR: return createMetricExpr();
      case CloneDetectionDSLPackage.DO_NOT_COMPARE: return createDoNotCompare();
      case CloneDetectionDSLPackage.COMPARE: return createCompare();
      case CloneDetectionDSLPackage.BOOLEAN_EXPRESSION: return createBooleanExpression();
      case CloneDetectionDSLPackage.NOT_EXPRESSION: return createNotExpression();
      case CloneDetectionDSLPackage.BOOLEAN_EXPRESSION_BRACKET: return createBooleanExpressionBracket();
      case CloneDetectionDSLPackage.BOOLEAN_EXPRESSION_CONSTANT: return createBooleanExpressionConstant();
      case CloneDetectionDSLPackage.INT_EXPRESSION: return createIntExpression();
      case CloneDetectionDSLPackage.EXPRESSION_MINUS: return createExpressionMinus();
      case CloneDetectionDSLPackage.EXPRESSION_PLUS: return createExpressionPlus();
      case CloneDetectionDSLPackage.EXPRESSION_BRACKET: return createExpressionBracket();
      case CloneDetectionDSLPackage.EXPRESSION_CONSTANT_INT: return createExpressionConstantInt();
      case CloneDetectionDSLPackage.EXPRESSION_BIN_OP: return createExpressionBinOp();
      case CloneDetectionDSLPackage.EXPRESSION_COMP_OP: return createExpressionCompOp();
      case CloneDetectionDSLPackage.EXPRESSION_ADDITION: return createExpressionAddition();
      case CloneDetectionDSLPackage.EXPRESSION_SUBTRACTION: return createExpressionSubtraction();
      case CloneDetectionDSLPackage.EXPRESSION_MULTIPLY: return createExpressionMultiply();
      case CloneDetectionDSLPackage.EXPRESSION_DIVISION: return createExpressionDivision();
      case CloneDetectionDSLPackage.EXPRESSION_MAXIMUM: return createExpressionMaximum();
      case CloneDetectionDSLPackage.EXPRESSION_MINIMUM: return createExpressionMinimum();
      case CloneDetectionDSLPackage.EXPRESSION_MODULO: return createExpressionModulo();
      case CloneDetectionDSLPackage.EXPRESSION_POWER: return createExpressionPower();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CloneDetectionDSLPackage.MATCH_TARGET:
        return createMatchTargetFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.SIZE_METRIC:
        return createSizeMetricFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.BOOL_OPERATOR:
        return createBoolOperatorFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.METHOD:
        return createMethodFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.UNDER:
        return createUnderFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.METRIC:
        return createMetricFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.BINARY_BOOLEAN_OPERATOR:
        return createBinaryBooleanOperatorFromString(eDataType, initialValue);
      case CloneDetectionDSLPackage.COMPARE_OPERATOR:
        return createCompareOperatorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CloneDetectionDSLPackage.MATCH_TARGET:
        return convertMatchTargetToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.SIZE_METRIC:
        return convertSizeMetricToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.BOOL_OPERATOR:
        return convertBoolOperatorToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.METHOD:
        return convertMethodToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.UNDER:
        return convertUnderToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.METRIC:
        return convertMetricToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.BINARY_BOOLEAN_OPERATOR:
        return convertBinaryBooleanOperatorToString(eDataType, instanceValue);
      case CloneDetectionDSLPackage.COMPARE_OPERATOR:
        return convertCompareOperatorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CloneDetection createCloneDetection()
  {
    CloneDetectionImpl cloneDetection = new CloneDetectionImpl();
    return cloneDetection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Project createProject()
  {
    ProjectImpl project = new ProjectImpl();
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SearchRoot createSearchRoot()
  {
    SearchRootImpl searchRoot = new SearchRootImpl();
    return searchRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Match createMatch()
  {
    MatchImpl match = new MatchImpl();
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Exclude createExclude()
  {
    ExcludeImpl exclude = new ExcludeImpl();
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nodes createNodes()
  {
    NodesImpl nodes = new NodesImpl();
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MinSize createMinSize()
  {
    MinSizeImpl minSize = new MinSizeImpl();
    return minSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetricExpr createMetricExpr()
  {
    MetricExprImpl metricExpr = new MetricExprImpl();
    return metricExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoNotCompare createDoNotCompare()
  {
    DoNotCompareImpl doNotCompare = new DoNotCompareImpl();
    return doNotCompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Compare createCompare()
  {
    CompareImpl compare = new CompareImpl();
    return compare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpression createBooleanExpression()
  {
    BooleanExpressionImpl booleanExpression = new BooleanExpressionImpl();
    return booleanExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpressionBracket createBooleanExpressionBracket()
  {
    BooleanExpressionBracketImpl booleanExpressionBracket = new BooleanExpressionBracketImpl();
    return booleanExpressionBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExpressionConstant createBooleanExpressionConstant()
  {
    BooleanExpressionConstantImpl booleanExpressionConstant = new BooleanExpressionConstantImpl();
    return booleanExpressionConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntExpression createIntExpression()
  {
    IntExpressionImpl intExpression = new IntExpressionImpl();
    return intExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMinus createExpressionMinus()
  {
    ExpressionMinusImpl expressionMinus = new ExpressionMinusImpl();
    return expressionMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionPlus createExpressionPlus()
  {
    ExpressionPlusImpl expressionPlus = new ExpressionPlusImpl();
    return expressionPlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionBracket createExpressionBracket()
  {
    ExpressionBracketImpl expressionBracket = new ExpressionBracketImpl();
    return expressionBracket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstantInt createExpressionConstantInt()
  {
    ExpressionConstantIntImpl expressionConstantInt = new ExpressionConstantIntImpl();
    return expressionConstantInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionBinOp createExpressionBinOp()
  {
    ExpressionBinOpImpl expressionBinOp = new ExpressionBinOpImpl();
    return expressionBinOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionCompOp createExpressionCompOp()
  {
    ExpressionCompOpImpl expressionCompOp = new ExpressionCompOpImpl();
    return expressionCompOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionAddition createExpressionAddition()
  {
    ExpressionAdditionImpl expressionAddition = new ExpressionAdditionImpl();
    return expressionAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionSubtraction createExpressionSubtraction()
  {
    ExpressionSubtractionImpl expressionSubtraction = new ExpressionSubtractionImpl();
    return expressionSubtraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMultiply createExpressionMultiply()
  {
    ExpressionMultiplyImpl expressionMultiply = new ExpressionMultiplyImpl();
    return expressionMultiply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionDivision createExpressionDivision()
  {
    ExpressionDivisionImpl expressionDivision = new ExpressionDivisionImpl();
    return expressionDivision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMaximum createExpressionMaximum()
  {
    ExpressionMaximumImpl expressionMaximum = new ExpressionMaximumImpl();
    return expressionMaximum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionMinimum createExpressionMinimum()
  {
    ExpressionMinimumImpl expressionMinimum = new ExpressionMinimumImpl();
    return expressionMinimum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionModulo createExpressionModulo()
  {
    ExpressionModuloImpl expressionModulo = new ExpressionModuloImpl();
    return expressionModulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionPower createExpressionPower()
  {
    ExpressionPowerImpl expressionPower = new ExpressionPowerImpl();
    return expressionPower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatchTarget createMatchTargetFromString(EDataType eDataType, String initialValue)
  {
    MatchTarget result = MatchTarget.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMatchTargetToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SizeMetric createSizeMetricFromString(EDataType eDataType, String initialValue)
  {
    SizeMetric result = SizeMetric.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSizeMetricToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolOperator createBoolOperatorFromString(EDataType eDataType, String initialValue)
  {
    BoolOperator result = BoolOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBoolOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethodFromString(EDataType eDataType, String initialValue)
  {
    Method result = Method.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMethodToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Under createUnderFromString(EDataType eDataType, String initialValue)
  {
    Under result = Under.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnderToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metric createMetricFromString(EDataType eDataType, String initialValue)
  {
    Metric result = Metric.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMetricToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryBooleanOperator createBinaryBooleanOperatorFromString(EDataType eDataType, String initialValue)
  {
    BinaryBooleanOperator result = BinaryBooleanOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryBooleanOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompareOperator createCompareOperatorFromString(EDataType eDataType, String initialValue)
  {
    CompareOperator result = CompareOperator.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCompareOperatorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CloneDetectionDSLPackage getCloneDetectionDSLPackage()
  {
    return (CloneDetectionDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CloneDetectionDSLPackage getPackage()
  {
    return CloneDetectionDSLPackage.eINSTANCE;
  }

} //CloneDetectionDSLFactoryImpl