/*
 * generated by Xtext 2.19.0
 */
package com.simonbaars.cdd.validation

import com.simonbaars.cdd.cloneDetectionDSL.Compare
import com.simonbaars.cdd.cloneDetectionDSL.Method
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CloneDetectionDSLValidator extends AbstractCloneDetectionDSLValidator {

	@Check
	def checkCompare(Compare compare){
		if(compare.comparisonMethod == Method.FQI || compare.comparisonMethod == Method.COMPLETE_MATCH || compare.comparisonMethod == Method.STRING_MATCH){
			if(compare.deepestNode !== null){
				warning("Node option is not allowed for comparison method "+compare.comparisonMethod+" and is thus ignored!", null)
			}
		}
		if(compare.comparisonMethod == Method.FQI || compare.comparisonMethod == Method.COMPLETE_MATCH){
			if(compare.perc !== null){
				warning("Similarity percentage option is not allowed for comparison method "+compare.comparisonMethod+" and is thus ignored!", null)
			}
		}
		if(compare.comparisonMethod == Method.STRING_MATCH){
			if(compare.perc === null){
				error("Similarity percentage must be specified for string comparison!", null)
			}
		}
		if(compare.comparisonMethod == Method.SUBNODES){
			if(compare.perc === null){
				error("Similarity percentage must be specified for subtree comparison!", null)
			}
		}
	}
	
}
