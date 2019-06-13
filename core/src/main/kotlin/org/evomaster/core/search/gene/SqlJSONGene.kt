package org.evomaster.core.search.gene

import org.evomaster.core.output.OutputFormat
import org.evomaster.core.search.service.Randomness

class SqlJSONGene(name: String, val objectGene: ObjectGene = ObjectGene(name, fields = listOf())) : Gene(name) {


    override fun copy(): Gene = SqlJSONGene(
            name,
            objectGene = this.objectGene.copy() as ObjectGene)


    override fun randomize(randomness: Randomness, forceNewValue: Boolean, allGenes: List<Gene>) {
        objectGene.randomize(randomness, forceNewValue, allGenes)
    }


    override fun getValueAsPrintableString(previousGenes: List<Gene>, mode: String?, targetFormat: OutputFormat?): String {
        return "\"%s\"".format(objectGene.getValueAsPrintableString(previousGenes, mode, targetFormat))
    }

    override fun copyValueFrom(other: Gene) {
        if (other !is SqlJSONGene) {
            throw IllegalArgumentException("Invalid gene type ${other.javaClass}")
        }
        this.objectGene.copyValueFrom(other.objectGene)
    }

    /**
     * Genes might contain a value that is also stored
     * in another gene of the same type.
     */
    override fun containsSameValueAs(other: Gene): Boolean {
        if (other !is SqlJSONGene) {
            throw IllegalArgumentException("Invalid gene type ${other.javaClass}")
        }
        return this.objectGene.containsSameValueAs(other.objectGene)
    }

}