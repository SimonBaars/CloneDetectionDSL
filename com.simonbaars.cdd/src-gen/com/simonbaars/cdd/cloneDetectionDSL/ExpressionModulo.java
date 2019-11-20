/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.ExpressionModulo#getLeft <em>Left</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.ExpressionModulo#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getExpressionModulo()
 * @model
 * @generated
 */
public interface ExpressionModulo extends IntExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(IntExpression)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getExpressionModulo_Left()
   * @model containment="true"
   * @generated
   */
  IntExpression getLeft();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.ExpressionModulo#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(IntExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(IntExpression)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getExpressionModulo_Right()
   * @model containment="true"
   * @generated
   */
  IntExpression getRight();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.ExpressionModulo#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(IntExpression value);

} // ExpressionModulo
