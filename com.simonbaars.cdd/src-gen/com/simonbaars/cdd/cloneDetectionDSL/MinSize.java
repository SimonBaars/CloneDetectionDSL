/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getBrackets <em>Brackets</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getMinSize()
 * @model
 * @generated
 */
public interface MinSize extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(MetricExpr)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getMinSize_Expr()
   * @model containment="true"
   * @generated
   */
  MetricExpr getExpr();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(MetricExpr value);

  /**
   * Returns the value of the '<em><b>Brackets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Brackets</em>' containment reference.
   * @see #setBrackets(MinSize)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getMinSize_Brackets()
   * @model containment="true"
   * @generated
   */
  MinSize getBrackets();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getBrackets <em>Brackets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Brackets</em>' containment reference.
   * @see #getBrackets()
   * @generated
   */
  void setBrackets(MinSize value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The literals are from the enumeration {@link com.simonbaars.cdd.cloneDetectionDSL.BoolOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.simonbaars.cdd.cloneDetectionDSL.BoolOperator
   * @see #setOperator(BoolOperator)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getMinSize_Operator()
   * @model
   * @generated
   */
  BoolOperator getOperator();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.simonbaars.cdd.cloneDetectionDSL.BoolOperator
   * @see #getOperator()
   * @generated
   */
  void setOperator(BoolOperator value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(MinSize)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getMinSize_Size()
   * @model containment="true"
   * @generated
   */
  MinSize getSize();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.MinSize#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(MinSize value);

} // MinSize
