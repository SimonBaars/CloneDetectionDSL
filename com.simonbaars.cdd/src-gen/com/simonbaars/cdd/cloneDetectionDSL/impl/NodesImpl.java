/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage;
import com.simonbaars.cdd.cloneDetectionDSL.Node;
import com.simonbaars.cdd.cloneDetectionDSL.Nodes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nodes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.NodesImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.NodesImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodesImpl extends ExcludeImpl implements Nodes
{
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
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected Nodes nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodesImpl()
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
    return CloneDetectionDSLPackage.Literals.NODES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODES__NODE, oldNode, newNode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNode(Node newNode)
  {
    if (newNode != node)
    {
      NotificationChain msgs = null;
      if (node != null)
        msgs = ((InternalEObject)node).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.NODES__NODE, null, msgs);
      if (newNode != null)
        msgs = ((InternalEObject)newNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.NODES__NODE, null, msgs);
      msgs = basicSetNode(newNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODES__NODE, newNode, newNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nodes getNodes()
  {
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs)
  {
    Nodes oldNodes = nodes;
    nodes = newNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODES__NODES, oldNodes, newNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodes(Nodes newNodes)
  {
    if (newNodes != nodes)
    {
      NotificationChain msgs = null;
      if (nodes != null)
        msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.NODES__NODES, null, msgs);
      if (newNodes != null)
        msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.NODES__NODES, null, msgs);
      msgs = basicSetNodes(newNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.NODES__NODES, newNodes, newNodes));
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
      case CloneDetectionDSLPackage.NODES__NODE:
        return basicSetNode(null, msgs);
      case CloneDetectionDSLPackage.NODES__NODES:
        return basicSetNodes(null, msgs);
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
      case CloneDetectionDSLPackage.NODES__NODE:
        return getNode();
      case CloneDetectionDSLPackage.NODES__NODES:
        return getNodes();
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
      case CloneDetectionDSLPackage.NODES__NODE:
        setNode((Node)newValue);
        return;
      case CloneDetectionDSLPackage.NODES__NODES:
        setNodes((Nodes)newValue);
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
      case CloneDetectionDSLPackage.NODES__NODE:
        setNode((Node)null);
        return;
      case CloneDetectionDSLPackage.NODES__NODES:
        setNodes((Nodes)null);
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
      case CloneDetectionDSLPackage.NODES__NODE:
        return node != null;
      case CloneDetectionDSLPackage.NODES__NODES:
        return nodes != null;
    }
    return super.eIsSet(featureID);
  }

} //NodesImpl
