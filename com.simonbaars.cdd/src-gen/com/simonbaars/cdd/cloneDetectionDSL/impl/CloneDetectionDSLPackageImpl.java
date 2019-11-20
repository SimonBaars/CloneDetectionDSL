/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.BoolOperator;
import com.simonbaars.cdd.cloneDetectionDSL.CloneDetection;
import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLFactory;
import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage;
import com.simonbaars.cdd.cloneDetectionDSL.Compare;
import com.simonbaars.cdd.cloneDetectionDSL.DoNotCompare;
import com.simonbaars.cdd.cloneDetectionDSL.Exclude;
import com.simonbaars.cdd.cloneDetectionDSL.Match;
import com.simonbaars.cdd.cloneDetectionDSL.MatchTarget;
import com.simonbaars.cdd.cloneDetectionDSL.Method;
import com.simonbaars.cdd.cloneDetectionDSL.MetricExpr;
import com.simonbaars.cdd.cloneDetectionDSL.MinSize;
import com.simonbaars.cdd.cloneDetectionDSL.Node;
import com.simonbaars.cdd.cloneDetectionDSL.Nodes;
import com.simonbaars.cdd.cloneDetectionDSL.Project;
import com.simonbaars.cdd.cloneDetectionDSL.SearchRoot;
import com.simonbaars.cdd.cloneDetectionDSL.SizeMetric;
import com.simonbaars.cdd.cloneDetectionDSL.Under;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloneDetectionDSLPackageImpl extends EPackageImpl implements CloneDetectionDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cloneDetectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass excludeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minSizeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metricExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doNotCompareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum matchTargetEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum sizeMetricEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum boolOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum methodEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum underEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CloneDetectionDSLPackageImpl()
  {
    super(eNS_URI, CloneDetectionDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link CloneDetectionDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CloneDetectionDSLPackage init()
  {
    if (isInited) return (CloneDetectionDSLPackage)EPackage.Registry.INSTANCE.getEPackage(CloneDetectionDSLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredCloneDetectionDSLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    CloneDetectionDSLPackageImpl theCloneDetectionDSLPackage = registeredCloneDetectionDSLPackage instanceof CloneDetectionDSLPackageImpl ? (CloneDetectionDSLPackageImpl)registeredCloneDetectionDSLPackage : new CloneDetectionDSLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theCloneDetectionDSLPackage.createPackageContents();

    // Initialize created meta-data
    theCloneDetectionDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCloneDetectionDSLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CloneDetectionDSLPackage.eNS_URI, theCloneDetectionDSLPackage);
    return theCloneDetectionDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCloneDetection()
  {
    return cloneDetectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCloneDetection_Project()
  {
    return (EReference)cloneDetectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCloneDetection_Root()
  {
    return (EAttribute)cloneDetectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCloneDetection_Match()
  {
    return (EAttribute)cloneDetectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCloneDetection_Exclude()
  {
    return (EAttribute)cloneDetectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCloneDetection_Size()
  {
    return (EReference)cloneDetectionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCloneDetection_NotCompare()
  {
    return (EReference)cloneDetectionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCloneDetection_Compare()
  {
    return (EReference)cloneDetectionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProject()
  {
    return projectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProject_Path()
  {
    return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSearchRoot()
  {
    return searchRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSearchRoot_Nodes()
  {
    return (EReference)searchRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMatch()
  {
    return matchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMatch_Target()
  {
    return (EAttribute)matchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExclude()
  {
    return excludeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNode()
  {
    return nodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNode_Name()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNode_Under()
  {
    return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNode_Node()
  {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodes()
  {
    return nodesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodes_Node()
  {
    return (EReference)nodesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodes_Nodes()
  {
    return (EReference)nodesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMinSize()
  {
    return minSizeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinSize_Expr()
  {
    return (EReference)minSizeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinSize_Brackets()
  {
    return (EReference)minSizeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMinSize_Operator()
  {
    return (EAttribute)minSizeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMinSize_Size()
  {
    return (EReference)minSizeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMetricExpr()
  {
    return metricExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMetricExpr_Amount()
  {
    return (EAttribute)metricExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMetricExpr_Metric()
  {
    return (EAttribute)metricExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDoNotCompare()
  {
    return doNotCompareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCompare()
  {
    return compareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompare_Nodes()
  {
    return (EReference)compareEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCompare_ComparisonMethod()
  {
    return (EAttribute)compareEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCompare_DeepestNode()
  {
    return (EReference)compareEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCompare_Perc()
  {
    return (EAttribute)compareEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getMatchTarget()
  {
    return matchTargetEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getSizeMetric()
  {
    return sizeMetricEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getBoolOperator()
  {
    return boolOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getMethod()
  {
    return methodEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getUnder()
  {
    return underEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CloneDetectionDSLFactory getCloneDetectionDSLFactory()
  {
    return (CloneDetectionDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    cloneDetectionEClass = createEClass(CLONE_DETECTION);
    createEReference(cloneDetectionEClass, CLONE_DETECTION__PROJECT);
    createEAttribute(cloneDetectionEClass, CLONE_DETECTION__ROOT);
    createEAttribute(cloneDetectionEClass, CLONE_DETECTION__MATCH);
    createEAttribute(cloneDetectionEClass, CLONE_DETECTION__EXCLUDE);
    createEReference(cloneDetectionEClass, CLONE_DETECTION__SIZE);
    createEReference(cloneDetectionEClass, CLONE_DETECTION__NOT_COMPARE);
    createEReference(cloneDetectionEClass, CLONE_DETECTION__COMPARE);

    projectEClass = createEClass(PROJECT);
    createEAttribute(projectEClass, PROJECT__PATH);

    searchRootEClass = createEClass(SEARCH_ROOT);
    createEReference(searchRootEClass, SEARCH_ROOT__NODES);

    matchEClass = createEClass(MATCH);
    createEAttribute(matchEClass, MATCH__TARGET);

    excludeEClass = createEClass(EXCLUDE);

    nodeEClass = createEClass(NODE);
    createEAttribute(nodeEClass, NODE__NAME);
    createEAttribute(nodeEClass, NODE__UNDER);
    createEReference(nodeEClass, NODE__NODE);

    nodesEClass = createEClass(NODES);
    createEReference(nodesEClass, NODES__NODE);
    createEReference(nodesEClass, NODES__NODES);

    minSizeEClass = createEClass(MIN_SIZE);
    createEReference(minSizeEClass, MIN_SIZE__EXPR);
    createEReference(minSizeEClass, MIN_SIZE__BRACKETS);
    createEAttribute(minSizeEClass, MIN_SIZE__OPERATOR);
    createEReference(minSizeEClass, MIN_SIZE__SIZE);

    metricExprEClass = createEClass(METRIC_EXPR);
    createEAttribute(metricExprEClass, METRIC_EXPR__AMOUNT);
    createEAttribute(metricExprEClass, METRIC_EXPR__METRIC);

    doNotCompareEClass = createEClass(DO_NOT_COMPARE);

    compareEClass = createEClass(COMPARE);
    createEReference(compareEClass, COMPARE__NODES);
    createEAttribute(compareEClass, COMPARE__COMPARISON_METHOD);
    createEReference(compareEClass, COMPARE__DEEPEST_NODE);
    createEAttribute(compareEClass, COMPARE__PERC);

    // Create enums
    matchTargetEEnum = createEEnum(MATCH_TARGET);
    sizeMetricEEnum = createEEnum(SIZE_METRIC);
    boolOperatorEEnum = createEEnum(BOOL_OPERATOR);
    methodEEnum = createEEnum(METHOD);
    underEEnum = createEEnum(UNDER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nodesEClass.getESuperTypes().add(this.getExclude());
    nodesEClass.getESuperTypes().add(this.getDoNotCompare());

    // Initialize classes and features; add operations and parameters
    initEClass(cloneDetectionEClass, CloneDetection.class, "CloneDetection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCloneDetection_Project(), this.getProject(), null, "project", null, 0, 1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloneDetection_Root(), ecorePackage.getEBoolean(), "root", null, 0, 1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloneDetection_Match(), ecorePackage.getEBoolean(), "match", null, 0, 1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCloneDetection_Exclude(), ecorePackage.getEBoolean(), "exclude", null, 0, 1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloneDetection_Size(), this.getMinSize(), null, "size", null, 0, 1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloneDetection_NotCompare(), this.getDoNotCompare(), null, "notCompare", null, 0, -1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCloneDetection_Compare(), this.getCompare(), null, "compare", null, 0, -1, CloneDetection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProject_Path(), ecorePackage.getEString(), "path", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchRootEClass, SearchRoot.class, "SearchRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSearchRoot_Nodes(), this.getNodes(), null, "nodes", null, 0, 1, SearchRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMatch_Target(), this.getMatchTarget(), "target", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(excludeEClass, Exclude.class, "Exclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNode_Under(), this.getUnder(), "under", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Node(), this.getNode(), null, "node", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodesEClass, Nodes.class, "Nodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodes_Node(), this.getNode(), null, "node", null, 0, 1, Nodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodes_Nodes(), this.getNodes(), null, "nodes", null, 0, 1, Nodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(minSizeEClass, MinSize.class, "MinSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMinSize_Expr(), this.getMetricExpr(), null, "expr", null, 0, 1, MinSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinSize_Brackets(), this.getMinSize(), null, "brackets", null, 0, 1, MinSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMinSize_Operator(), this.getBoolOperator(), "operator", null, 0, 1, MinSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMinSize_Size(), this.getMinSize(), null, "size", null, 0, 1, MinSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metricExprEClass, MetricExpr.class, "MetricExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetricExpr_Amount(), ecorePackage.getEInt(), "amount", null, 0, 1, MetricExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetricExpr_Metric(), this.getSizeMetric(), "metric", null, 0, 1, MetricExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doNotCompareEClass, DoNotCompare.class, "DoNotCompare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(compareEClass, Compare.class, "Compare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompare_Nodes(), this.getNodes(), null, "nodes", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompare_ComparisonMethod(), this.getMethod(), "comparisonMethod", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompare_DeepestNode(), this.getNode(), null, "deepestNode", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCompare_Perc(), ecorePackage.getEString(), "perc", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(matchTargetEEnum, MatchTarget.class, "MatchTarget");
    addEEnumLiteral(matchTargetEEnum, MatchTarget.SUBTREE);
    addEEnumLiteral(matchTargetEEnum, MatchTarget.LLOC);
    addEEnumLiteral(matchTargetEEnum, MatchTarget.SLOC);

    initEEnum(sizeMetricEEnum, SizeMetric.class, "SizeMetric");
    addEEnumLiteral(sizeMetricEEnum, SizeMetric.TOKENS);
    addEEnumLiteral(sizeMetricEEnum, SizeMetric.DECLARATIONS);
    addEEnumLiteral(sizeMetricEEnum, SizeMetric.STATEMENTS);
    addEEnumLiteral(sizeMetricEEnum, SizeMetric.NODES);
    addEEnumLiteral(sizeMetricEEnum, SizeMetric.LINES);
    addEEnumLiteral(sizeMetricEEnum, SizeMetric.CYCLOMATIC_COMPLEXITY);

    initEEnum(boolOperatorEEnum, BoolOperator.class, "BoolOperator");
    addEEnumLiteral(boolOperatorEEnum, BoolOperator.AND);
    addEEnumLiteral(boolOperatorEEnum, BoolOperator.OR);

    initEEnum(methodEEnum, Method.class, "Method");
    addEEnumLiteral(methodEEnum, Method.SUBNODES);
    addEEnumLiteral(methodEEnum, Method.STRING_MATCH);
    addEEnumLiteral(methodEEnum, Method.COMPLETE_MATCH);
    addEEnumLiteral(methodEEnum, Method.FQI);

    initEEnum(underEEnum, Under.class, "Under");
    addEEnumLiteral(underEEnum, Under.ONE_LEVEL);
    addEEnumLiteral(underEEnum, Under.ANY_LEVEL);

    // Create resource
    createResource(eNS_URI);
  }

} //CloneDetectionDSLPackageImpl
