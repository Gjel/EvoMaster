package org.evomaster.resource.rest.generator.implementation.java.em

import org.evomaster.resource.rest.generator.implementation.java.JavaMethod
import org.evomaster.resource.rest.generator.model.CommonTypes
import org.evomaster.resource.rest.generator.template.Boundary
import org.evomaster.resource.rest.generator.template.MethodScript

/**
 * created by manzh on 2019-10-11
 */
class GetDatabaseDriverName : JavaMethod() {

    override fun getParams(): Map<String, String> = mutableMapOf()

    override fun getBody(): List<String> {
        return listOf("return \"org.h2.Driver\";")
    }

    override fun getName(): String = "getDatabaseDriverName"

    override fun getBoundary(): Boundary = Boundary.PUBLIC

    override fun getTags(): List<String> = listOf("@Override")

    override fun getReturn(): String? = CommonTypes.STRING.toString()

}