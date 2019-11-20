/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.util;

import com.simonbaars.cdd.cloneDetectionDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage
 * @generated
 */
public class CloneDetectionDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CloneDetectionDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CloneDetectionDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CloneDetectionDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CloneDetectionDSLSwitch<Adapter> modelSwitch =
    new CloneDetectionDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseCloneDetection(CloneDetection object)
      {
        return createCloneDetectionAdapter();
      }
      @Override
      public Adapter caseProject(Project object)
      {
        return createProjectAdapter();
      }
      @Override
      public Adapter caseSearchRoot(SearchRoot object)
      {
        return createSearchRootAdapter();
      }
      @Override
      public Adapter caseMatch(Match object)
      {
        return createMatchAdapter();
      }
      @Override
      public Adapter caseExclude(Exclude object)
      {
        return createExcludeAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseNodes(Nodes object)
      {
        return createNodesAdapter();
      }
      @Override
      public Adapter caseMinSize(MinSize object)
      {
        return createMinSizeAdapter();
      }
      @Override
      public Adapter caseMetricExpr(MetricExpr object)
      {
        return createMetricExprAdapter();
      }
      @Override
      public Adapter caseDoNotCompare(DoNotCompare object)
      {
        return createDoNotCompareAdapter();
      }
      @Override
      public Adapter caseCompare(Compare object)
      {
        return createCompareAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection <em>Clone Detection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetection
   * @generated
   */
  public Adapter createCloneDetectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Project
   * @generated
   */
  public Adapter createProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.SearchRoot <em>Search Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.SearchRoot
   * @generated
   */
  public Adapter createSearchRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.Match <em>Match</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Match
   * @generated
   */
  public Adapter createMatchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.Exclude <em>Exclude</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Exclude
   * @generated
   */
  public Adapter createExcludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.Nodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Nodes
   * @generated
   */
  public Adapter createNodesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize <em>Min Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.MinSize
   * @generated
   */
  public Adapter createMinSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.MetricExpr <em>Metric Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.MetricExpr
   * @generated
   */
  public Adapter createMetricExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.DoNotCompare <em>Do Not Compare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.DoNotCompare
   * @generated
   */
  public Adapter createDoNotCompareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.simonbaars.cdd.cloneDetectionDSL.Compare <em>Compare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Compare
   * @generated
   */
  public Adapter createCompareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CloneDetectionDSLAdapterFactory
