package org.evomaster.core.problem.rest.service

import com.google.inject.AbstractModule
import com.google.inject.TypeLiteral
import org.evomaster.core.problem.rest.RestIndividual
import org.evomaster.core.remote.service.RemoteController
import org.evomaster.core.search.service.mutator.StandardMutator
import org.evomaster.core.search.service.*
import org.evomaster.core.search.service.mutator.Mutator
import org.evomaster.core.search.service.mutator.StructureMutator


class ObjModule : AbstractModule(){

    override fun configure() {
        bind(object : TypeLiteral<Sampler<RestIndividual>>() {})
                .to(ObjRestSampler::class.java)
                .asEagerSingleton()

        bind(ObjRestSampler::class.java)
                .asEagerSingleton()

        bind(object : TypeLiteral<FitnessFunction<RestIndividual>>() {})
                .to(ObjFitness::class.java)
                .asEagerSingleton()

        bind(object : TypeLiteral<Archive<RestIndividual>>() {})
                .asEagerSingleton()

        bind(object : TypeLiteral<Archive<*>>() {})
                .to(object : TypeLiteral<Archive<RestIndividual>>() {})

        bind(RemoteController::class.java)
                .asEagerSingleton()

        bind(object : TypeLiteral<Mutator<RestIndividual>>() {})
                .to(object : TypeLiteral<StandardMutator<RestIndividual>>(){})
                .asEagerSingleton()

        bind(StructureMutator::class.java)
                .to(ObjStructureMutator::class.java)
                .asEagerSingleton()
    }
}