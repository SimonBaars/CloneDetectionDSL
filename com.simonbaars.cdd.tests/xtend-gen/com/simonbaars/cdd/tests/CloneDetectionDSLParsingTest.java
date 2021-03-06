/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.tests;

import com.google.inject.Inject;
import com.simonbaars.cdd.cloneDetectionDSL.CloneDetection;
import com.simonbaars.cdd.tests.CloneDetectionDSLInjectorProvider;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CloneDetectionDSLInjectorProvider.class)
@SuppressWarnings("all")
public class CloneDetectionDSLParsingTest {
  @Inject
  private ParseHelper<CloneDetection> parseHelper;
  
  private static final String root = "com.github.javaparser.ast.";
  
  private static final List<String> packages = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("body", "expr", "stmt", "type"));
  
  @Test
  public void loadModel() {
    String name = "CompilationUnit";
    try {
      Class.forName((CloneDetectionDSLParsingTest.root + name));
      System.out.println((CloneDetectionDSLParsingTest.root + name));
      return;
    } catch (final Throwable _t) {
      if (_t instanceof ClassNotFoundException) {
        System.out.println((("Not found: " + CloneDetectionDSLParsingTest.root) + name));
        for (final String pack : CloneDetectionDSLParsingTest.packages) {
          try {
            Class.forName((((CloneDetectionDSLParsingTest.root + pack) + ".") + name));
            System.out.println((((CloneDetectionDSLParsingTest.root + pack) + ".") + name));
            return;
          } catch (final Throwable _t_1) {
            if (_t_1 instanceof ClassNotFoundException) {
              System.out.println((((("Not found: " + CloneDetectionDSLParsingTest.root) + pack) + ".") + name));
            } else {
              throw Exceptions.sneakyThrow(_t_1);
            }
          }
        }
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
