/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL.impl;

import com.simonbaars.cdd.cloneDetectionDSL.CloneDetection;
import com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage;
import com.simonbaars.cdd.cloneDetectionDSL.Compare;
import com.simonbaars.cdd.cloneDetectionDSL.DoNotCompare;
import com.simonbaars.cdd.cloneDetectionDSL.Project;
import com.simonbaars.cdd.cloneDetectionDSL.Size;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clone Detection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#getProject <em>Project</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#isMatch <em>Match</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#isExclude <em>Exclude</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#getNotCompare <em>Not Compare</em>}</li>
 *   <li>{@link com.simonbaars.cdd.cloneDetectionDSL.impl.CloneDetectionImpl#getCompare <em>Compare</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloneDetectionImpl extends MinimalEObjectImpl.Container implements CloneDetection
{
  /**
   * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProject()
   * @generated
   * @ordered
   */
  protected Project project;

  /**
   * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRoot()
   * @generated
   * @ordered
   */
  protected static final boolean ROOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRoot() <em>Root</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRoot()
   * @generated
   * @ordered
   */
  protected boolean root = ROOT_EDEFAULT;

  /**
   * The default value of the '{@link #isMatch() <em>Match</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMatch()
   * @generated
   * @ordered
   */
  protected static final boolean MATCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMatch() <em>Match</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMatch()
   * @generated
   * @ordered
   */
  protected boolean match = MATCH_EDEFAULT;

  /**
   * The default value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExclude() <em>Exclude</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExclude()
   * @generated
   * @ordered
   */
  protected boolean exclude = EXCLUDE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected Size size;

  /**
   * The cached value of the '{@link #getNotCompare() <em>Not Compare</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotCompare()
   * @generated
   * @ordered
   */
  protected EList<DoNotCompare> notCompare;

  /**
   * The cached value of the '{@link #getCompare() <em>Compare</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompare()
   * @generated
   * @ordered
   */
  protected EList<Compare> compare;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CloneDetectionImpl()
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
    return CloneDetectionDSLPackage.Literals.CLONE_DETECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Project getProject()
  {
    return project;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProject(Project newProject, NotificationChain msgs)
  {
    Project oldProject = project;
    project = newProject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT, oldProject, newProject);
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
  public void setProject(Project newProject)
  {
    if (newProject != project)
    {
      NotificationChain msgs = null;
      if (project != null)
        msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT, null, msgs);
      if (newProject != null)
        msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT, null, msgs);
      msgs = basicSetProject(newProject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT, newProject, newProject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isRoot()
  {
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRoot(boolean newRoot)
  {
    boolean oldRoot = root;
    root = newRoot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__ROOT, oldRoot, root));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isMatch()
  {
    return match;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMatch(boolean newMatch)
  {
    boolean oldMatch = match;
    match = newMatch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__MATCH, oldMatch, match));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExclude(boolean newExclude)
  {
    boolean oldExclude = exclude;
    exclude = newExclude;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__EXCLUDE, oldExclude, exclude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Size getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSize(Size newSize, NotificationChain msgs)
  {
    Size oldSize = size;
    size = newSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__SIZE, oldSize, newSize);
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
  public void setSize(Size newSize)
  {
    if (newSize != size)
    {
      NotificationChain msgs = null;
      if (size != null)
        msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.CLONE_DETECTION__SIZE, null, msgs);
      if (newSize != null)
        msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CloneDetectionDSLPackage.CLONE_DETECTION__SIZE, null, msgs);
      msgs = basicSetSize(newSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CloneDetectionDSLPackage.CLONE_DETECTION__SIZE, newSize, newSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DoNotCompare> getNotCompare()
  {
    if (notCompare == null)
    {
      notCompare = new EObjectContainmentEList<DoNotCompare>(DoNotCompare.class, this, CloneDetectionDSLPackage.CLONE_DETECTION__NOT_COMPARE);
    }
    return notCompare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Compare> getCompare()
  {
    if (compare == null)
    {
      compare = new EObjectContainmentEList<Compare>(Compare.class, this, CloneDetectionDSLPackage.CLONE_DETECTION__COMPARE);
    }
    return compare;
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
      case CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT:
        return basicSetProject(null, msgs);
      case CloneDetectionDSLPackage.CLONE_DETECTION__SIZE:
        return basicSetSize(null, msgs);
      case CloneDetectionDSLPackage.CLONE_DETECTION__NOT_COMPARE:
        return ((InternalEList<?>)getNotCompare()).basicRemove(otherEnd, msgs);
      case CloneDetectionDSLPackage.CLONE_DETECTION__COMPARE:
        return ((InternalEList<?>)getCompare()).basicRemove(otherEnd, msgs);
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
      case CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT:
        return getProject();
      case CloneDetectionDSLPackage.CLONE_DETECTION__ROOT:
        return isRoot();
      case CloneDetectionDSLPackage.CLONE_DETECTION__MATCH:
        return isMatch();
      case CloneDetectionDSLPackage.CLONE_DETECTION__EXCLUDE:
        return isExclude();
      case CloneDetectionDSLPackage.CLONE_DETECTION__SIZE:
        return getSize();
      case CloneDetectionDSLPackage.CLONE_DETECTION__NOT_COMPARE:
        return getNotCompare();
      case CloneDetectionDSLPackage.CLONE_DETECTION__COMPARE:
        return getCompare();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT:
        setProject((Project)newValue);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__ROOT:
        setRoot((Boolean)newValue);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__MATCH:
        setMatch((Boolean)newValue);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__EXCLUDE:
        setExclude((Boolean)newValue);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__SIZE:
        setSize((Size)newValue);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__NOT_COMPARE:
        getNotCompare().clear();
        getNotCompare().addAll((Collection<? extends DoNotCompare>)newValue);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__COMPARE:
        getCompare().clear();
        getCompare().addAll((Collection<? extends Compare>)newValue);
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
      case CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT:
        setProject((Project)null);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__ROOT:
        setRoot(ROOT_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__MATCH:
        setMatch(MATCH_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__EXCLUDE:
        setExclude(EXCLUDE_EDEFAULT);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__SIZE:
        setSize((Size)null);
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__NOT_COMPARE:
        getNotCompare().clear();
        return;
      case CloneDetectionDSLPackage.CLONE_DETECTION__COMPARE:
        getCompare().clear();
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
      case CloneDetectionDSLPackage.CLONE_DETECTION__PROJECT:
        return project != null;
      case CloneDetectionDSLPackage.CLONE_DETECTION__ROOT:
        return root != ROOT_EDEFAULT;
      case CloneDetectionDSLPackage.CLONE_DETECTION__MATCH:
        return match != MATCH_EDEFAULT;
      case CloneDetectionDSLPackage.CLONE_DETECTION__EXCLUDE:
        return exclude != EXCLUDE_EDEFAULT;
      case CloneDetectionDSLPackage.CLONE_DETECTION__SIZE:
        return size != null;
      case CloneDetectionDSLPackage.CLONE_DETECTION__NOT_COMPARE:
        return notCompare != null && !notCompare.isEmpty();
      case CloneDetectionDSLPackage.CLONE_DETECTION__COMPARE:
        return compare != null && !compare.isEmpty();
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
    result.append(" (root: ");
    result.append(root);
    result.append(", match: ");
    result.append(match);
    result.append(", exclude: ");
    result.append(exclude);
    result.append(')');
    return result.toString();
  }

} //CloneDetectionImpl
