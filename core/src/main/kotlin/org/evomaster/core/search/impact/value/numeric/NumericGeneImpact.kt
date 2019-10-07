package org.evomaster.core.search.impact.value.numeric

import org.evomaster.core.search.impact.GeneImpact

/**
 * created by manzh on 2019-09-09
 */
abstract class NumericGeneImpact (
        id: String,
        degree: Double = 0.0,
        timesToManipulate: Int = 0,
        timesOfImpact: Int = 0,
        timesOfNoImpacts: Int =0,
        counter: Int = 0,
        niCounter : Int = 0,
        positionSensitive: Boolean = false
): GeneImpact(id, degree, timesToManipulate, timesOfImpact, timesOfNoImpacts, counter,niCounter, positionSensitive)