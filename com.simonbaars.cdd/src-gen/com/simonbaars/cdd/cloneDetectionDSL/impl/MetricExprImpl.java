/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage;
import com.simonbaars.cdd.cloneDetectionDSL.MetricExpr;
import com.simonbaars.cdd.cloneDetectionDSL.SizeMetric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.MetricExprImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.MetricExprImpl#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricExprImpl extends MinimalEObjectImpl.Container implements MetricExpr
{
  /**
   * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected static final int AMOUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmount()
   * @generated
   * @ordered
   */
  protected int amount = AMOUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected static final SizeMetric METRIC_EDEFAULT = SizeMetric.TOKENS;

  /**
   * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetric()
   * @generated
   * @ordered
   */
  protected SizeMetric metric = METRIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetricExprImpl()
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
    return CloneDetectionDSLPackage.Literals.METRIC_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAmount()
  {
    return amount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAmount(int newAmount)
  {
    int oldAmount = amount;
    amount = newAmount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.METRIC_EXPR__AMOUNT, oldAmount, amount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SizeMetric getMetric()
  {
    return metric;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMetric(SizeMetric newMetric)
  {
    SizeMetric oldMetric = metric;
    metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.METRIC_EXPR__METRIC, oldMetric, metric));
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
      case CloneDetectionDSLPackage.METRIC_EXPR__AMOUNT:
        return getAmount();
      case CloneDetectionDSLPackage.METRIC_EXPR__METRIC:
        return getMetric();
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
      case CloneDetectionDSLPackage.METRIC_EXPR__AMOUNT:
        setAmount((Integer)newValue);
        return;
      case CloneDetectionDSLPackage.METRIC_EXPR__METRIC:
        setMetric((SizeMetric)newValue);
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
      case CloneDetectionDSLPackage.METRIC_EXPR__AMOUNT:
        setAmount(AMOUNT_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.METRIC_EXPR__METRIC:
        setMetric(METRIC_EDEFAULT);
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
      case CloneDetectionDSLPackage.METRIC_EXPR__AMOUNT:
        return amount != AMOUNT_EDEFAULT;
      case CloneDetectionDSLPackage.METRIC_EXPR__METRIC:
        return metric != METRIC_EDEFAULT;
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
    result.append(" (amount: ");
    result.append(amount);
    result.append(", metric: ");
    result.append(metric);
    result.append(')');
    return result.toString();
  }

} //MetricExprImpl
