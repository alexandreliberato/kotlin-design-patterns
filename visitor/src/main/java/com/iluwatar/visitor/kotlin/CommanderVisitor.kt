package com.iluwatar.visitor.kotlin

import org.slf4j.LoggerFactory


class CommanderVisitor : UnitVisitor {

    private val LOGGER = LoggerFactory.getLogger(CommanderVisitor::class.java)

    override fun visit(solider: Solider) {
    }

    override fun visit(sergeant: Sergeant) {
    }

    override fun visit(commander: Commander) {
        LOGGER.info("Good to see you $commander")
    }
}