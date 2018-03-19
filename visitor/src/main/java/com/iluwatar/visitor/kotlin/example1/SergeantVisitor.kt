package com.iluwatar.visitor.kotlin.example1

import org.slf4j.LoggerFactory


class SergeantVisitor : UnitVisitor {
    private val LOGGER = LoggerFactory.getLogger(SergeantVisitor::class.java)

    override fun visit(solider: Solider) {

    }

    override fun visit(sergeant: Sergeant) {
        LOGGER.info("Hello $sergeant")
    }

    override fun visit(commander: Commander) {
    }
}