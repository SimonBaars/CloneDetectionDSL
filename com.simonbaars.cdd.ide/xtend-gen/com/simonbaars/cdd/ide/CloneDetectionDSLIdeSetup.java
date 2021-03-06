/**
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.simonbaars.cdd.CloneDetectionDSLRuntimeModule;
import com.simonbaars.cdd.CloneDetectionDSLStandaloneSetup;
import com.simonbaars.cdd.ide.CloneDetectionDSLIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CloneDetectionDSLIdeSetup extends CloneDetectionDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    CloneDetectionDSLRuntimeModule _cloneDetectionDSLRuntimeModule = new CloneDetectionDSLRuntimeModule();
    CloneDetectionDSLIdeModule _cloneDetectionDSLIdeModule = new CloneDetectionDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_cloneDetectionDSLRuntimeModule, _cloneDetectionDSLIdeModule));
  }
}
