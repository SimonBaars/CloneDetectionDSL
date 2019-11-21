/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.Node#getName <em>Name</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.Node#getUnder <em>Under</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.Node#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getNode_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.Node#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Under</b></em>' attribute.
   * The literals are from the enumeration {@link com.simonbaars.cdd.cloneDetectionDSL.Under}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Under</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Under</em>' attribute.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Under
   * @see #setUnder(Under)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getNode_Under()
   * @model
   * @generated
   */
  Under getUnder();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.Node#getUnder <em>Under</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Under</em>' attribute.
   * @see com.simonbaars.cdd.cloneDetectionDSL.Under
   * @see #getUnder()
   * @generated
   */
  void setUnder(Under value);

  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference.
   * @see #setNode(Node)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getNode_Node()
   * @model containment="true"
   * @generated
   */
  Node getNode();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.Node#getNode <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node</em>' containment reference.
   * @see #getNode()
   * @generated
   */
  void setNode(Node value);

} // Node
