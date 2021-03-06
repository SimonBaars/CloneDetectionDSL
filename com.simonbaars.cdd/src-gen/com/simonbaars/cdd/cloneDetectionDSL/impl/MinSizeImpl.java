/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.BoolOperator;
import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage;
import com.simonbaars.cdd.cloneDetectionDSL.MetricExpr;
import com.simonbaars.cdd.cloneDetectionDSL.MinSize;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.MinSizeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.MinSizeImpl#getBrackets <em>Brackets</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.MinSizeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.MinSizeImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MinSizeImpl extends SizeImpl implements MinSize
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected MetricExpr expr;

  /**
   * The cached value of the '{@link #getBrackets() <em>Brackets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrackets()
   * @generated
   * @ordered
   */
  protected MinSize brackets;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final BoolOperator OPERATOR_EDEFAULT = BoolOperator.AND;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected BoolOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected MinSize size;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinSizeImpl()
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
    return CloneDetectionDSLPackage.Literals.MIN_SIZE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetricExpr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(MetricExpr newExpr, NotificationChain msgs)
  {
    MetricExpr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(MetricExpr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.MIN_SIZE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.MIN_SIZE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinSize getBrackets()
  {
    return brackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBrackets(MinSize newBrackets, NotificationChain msgs)
  {
    MinSize oldBrackets = brackets;
    brackets = newBrackets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__BRACKETS, oldBrackets, newBrackets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrackets(MinSize newBrackets)
  {
    if (newBrackets != brackets)
    {
      NotificationChain msgs = null;
      if (brackets != null)
        msgs = ((InternalEObject)brackets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.MIN_SIZE__BRACKETS, null, msgs);
      if (newBrackets != null)
        msgs = ((InternalEObject)newBrackets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.MIN_SIZE__BRACKETS, null, msgs);
      msgs = basicSetBrackets(newBrackets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__BRACKETS, newBrackets, newBrackets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(BoolOperator newOperator)
  {
    BoolOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinSize getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(MinSize newSize, NotificationChain msgs)
  {
    MinSize oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__SIZE, oldSize, newSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(MinSize newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.MIN_SIZE__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.MIN_SIZE__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.MIN_SIZE__SIZE, newSize, newSize));
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
      case CloneDetectionDSLPackage.MIN_SIZE__EXPR:
        return basicSetExpr(null, msgs);
      case CloneDetectionDSLPackage.MIN_SIZE__BRACKETS:
        return basicSetBrackets(null, msgs);
      case CloneDetectionDSLPackage.MIN_SIZE__SIZE:
        return basicSetSize(null, msgs);
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
      case CloneDetectionDSLPackage.MIN_SIZE__EXPR:
        return getExpr();
      case CloneDetectionDSLPackage.MIN_SIZE__BRACKETS:
        return getBrackets();
      case CloneDetectionDSLPackage.MIN_SIZE__OPERATOR:
        return getOperator();
      case CloneDetectionDSLPackage.MIN_SIZE__SIZE:
        return getSize();
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
      case CloneDetectionDSLPackage.MIN_SIZE__EXPR:
        setExpr((MetricExpr)newValue);
        return;
      case CloneDetectionDSLPackage.MIN_SIZE__BRACKETS:
        setBrackets((MinSize)newValue);
        return;
      case CloneDetectionDSLPackage.MIN_SIZE__OPERATOR:
        setOperator((BoolOperator)newValue);
        return;
      case CloneDetectionDSLPackage.MIN_SIZE__SIZE:
        setSize((MinSize)newValue);
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
      case CloneDetectionDSLPackage.MIN_SIZE__EXPR:
        setExpr((MetricExpr)null);
        return;
      case CloneDetectionDSLPackage.MIN_SIZE__BRACKETS:
        setBrackets((MinSize)null);
        return;
      case CloneDetectionDSLPackage.MIN_SIZE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.MIN_SIZE__SIZE:
        setSize((MinSize)null);
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
      case CloneDetectionDSLPackage.MIN_SIZE__EXPR:
        return expr != null;
      case CloneDetectionDSLPackage.MIN_SIZE__BRACKETS:
        return brackets != null;
      case CloneDetectionDSLPackage.MIN_SIZE__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case CloneDetectionDSLPackage.MIN_SIZE__SIZE:
        return size != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //MinSizeImpl
