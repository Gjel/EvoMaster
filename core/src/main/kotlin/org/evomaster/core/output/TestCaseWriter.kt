package org.evomaster.core.output

import org.evomaster.core.search.EvaluatedIndividual



class TestCaseWriter {

    //EvaluatedIndividual

    fun convertToCompilableTestCode(test: EvaluatedIndividual<*>, format: OutputFormat, name: String)
            : List<String>{
        if(name.isBlank()){
            throw IllegalArgumentException("Blank name for test")
        }

        //TODO

        return listOf("TODO")
    }
}