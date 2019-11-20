/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.cloneDetectionDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Match Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.simonbaars.cdd.cloneDetectionDSL.CloneDetectionDSLPackage#getMatchTarget()
 * @model
 * @generated
 */
public enum MatchTarget implements Enumerator
{
  /**
   * The '<em><b>Subtree</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBTREE_VALUE
   * @generated
   * @ordered
   */
  SUBTREE(0, "Subtree", "Subtree"),

  /**
   * The '<em><b>LLOC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LLOC_VALUE
   * @generated
   * @ordered
   */
  LLOC(1, "LLOC", "LLOC"),

  /**
   * The '<em><b>SLOC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLOC_VALUE
   * @generated
   * @ordered
   */
  SLOC(2, "SLOC", "SLOC");

  /**
   * The '<em><b>Subtree</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUBTREE
   * @model name="Subtree"
   * @generated
   * @ordered
   */
  public static final int SUBTREE_VALUE = 0;

  /**
   * The '<em><b>LLOC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LLOC
   * @model
   * @generated
   * @ordered
   */
  public static final int LLOC_VALUE = 1;

  /**
   * The '<em><b>SLOC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SLOC
   * @model
   * @generated
   * @ordered
   */
  public static final int SLOC_VALUE = 2;

  /**
   * An array of all the '<em><b>Match Target</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final MatchTarget[] VALUES_ARRAY =
    new MatchTarget[]
    {
      SUBTREE,
      LLOC,
      SLOC,
    };

  /**
   * A public read-only list of all the '<em><b>Match Target</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<MatchTarget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Match Target</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MatchTarget get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MatchTarget result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Match Target</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MatchTarget getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      MatchTarget result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Match Target</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static MatchTarget get(int value)
  {
    switch (value)
    {
      case SUBTREE_VALUE: return SUBTREE;
      case LLOC_VALUE: return LLOC;
      case SLOC_VALUE: return SLOC;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private MatchTarget(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //MatchTarget