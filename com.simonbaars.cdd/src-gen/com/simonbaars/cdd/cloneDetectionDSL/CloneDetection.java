/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clone Detection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#getProject <em>Project</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#isRoot <em>Root</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#isMatch <em>Match</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#isExclude <em>Exclude</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#getSize <em>Size</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#getNotCompare <em>Not Compare</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection()
 * @model
 * @generated
 */
public interface CloneDetection extends EObject
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference.
   * @see #setProject(Project)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Root</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' attribute.
   * @see #setRoot(boolean)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_Root()
   * @model
   * @generated
   */
  boolean isRoot();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#isRoot <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' attribute.
   * @see #isRoot()
   * @generated
   */
  void setRoot(boolean value);

  /**
   * Returns the value of the '<em><b>Match</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match</em>' attribute.
   * @see #setMatch(boolean)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_Match()
   * @model
   * @generated
   */
  boolean isMatch();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#isMatch <em>Match</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match</em>' attribute.
   * @see #isMatch()
   * @generated
   */
  void setMatch(boolean value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude</em>' attribute.
   * @see #setExclude(boolean)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_Exclude()
   * @model
   * @generated
   */
  boolean isExclude();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#isExclude <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' attribute.
   * @see #isExclude()
   * @generated
   */
  void setExclude(boolean value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' containment reference.
   * @see #setSize(Size)
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_Size()
   * @model containment="true"
   * @generated
   */
  Size getSize();

  /**
   * Sets the value of the '{@link com.simonbaars.cdd.cloneDetectionDSL.CloneDetection#getSize <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' containment reference.
   * @see #getSize()
   * @generated
   */
  void setSize(Size value);

  /**
   * Returns the value of the '<em><b>Not Compare</b></em>' containment reference list.
   * The list contents are of type {@link com.simonbaars.cdd.cloneDetectionDSL.DoNotCompare}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Compare</em>' containment reference list.
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_NotCompare()
   * @model containment="true"
   * @generated
   */
  EList<DoNotCompare> getNotCompare();

  /**
   * Returns the value of the '<em><b>Compare</b></em>' containment reference list.
   * The list contents are of type {@link com.simonbaars.cdd.cloneDetectionDSL.Compare}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compare</em>' containment reference list.
   * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getCloneDetection_Compare()
   * @model containment="true"
   * @generated
   */
  EList<Compare> getCompare();

} // CloneDetection
