/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage;
import com.simonbaars.cdd.cloneDetectionDSL.Node;
import com.simonbaars.cdd.cloneDetectionDSL.Under;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.NodeImpl#getUnder <em>Under</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.NodeImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getUnder() <em>Under</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnder()
   * @generated
   * @ordered
   */
  protected static final Under UNDER_EDEFAULT = Under.ONE_LEVEL;

  /**
   * The cached value of the '{@link #getUnder() <em>Under</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnder()
   * @generated
   * @ordered
   */
  protected Under under = UNDER_EDEFAULT;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected Node node;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CloneDetectionDSLPackage.Literals.NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Under getUnder()
  {
    return under;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnder(Under newUnder)
  {
    Under oldUnder = under;
    under = newUnder == null ? UNDER_EDEFAULT : newUnder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODE__UNDER, oldUnder, under));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Node getNode()
  {
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNode(Node newNode, NotificationChain msgs)
  {
    Node oldNode = node;
    node = newNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODE__NODE, oldNode, newNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNode(Node newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.NODE__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.NODE__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODE__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CloneDetectionDSLPackage.NODE__NODE:
        return basicSetNode(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CloneDetectionDSLPackage.NODE__NAME:
        return getName();
      case CloneDetectionDSLPackage.NODE__UNDER:
        return getUnder();
      case CloneDetectionDSLPackage.NODE__NODE:
        return getNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CloneDetectionDSLPackage.NODE__NAME:
        setName((String)newValue);
        return;
      case CloneDetectionDSLPackage.NODE__UNDER:
        setUnder((Under)newValue);
        return;
      case CloneDetectionDSLPackage.NODE__NODE:
        setNode((Node)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CloneDetectionDSLPackage.NODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.NODE__UNDER:
        setUnder(UNDER_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.NODE__NODE:
        setNode((Node)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CloneDetectionDSLPackage.NODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CloneDetectionDSLPackage.NODE__UNDER:
        return under != UNDER_EDEFAULT;
      case CloneDetectionDSLPackage.NODE__NODE:
        return node != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", under: ");
    result.append(under);
    result.append(')');
    return result.toString();
  }

} //NodeImpl
