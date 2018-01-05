package com.iluwatar.visitor.kotlin

import com.iluwatar.visitor.SoldierVisitor
import org.slf4j.LoggerFactory


class SoliderVisitor : UnitVisitor {
    private val LOGGER = LoggerFactory.getLogger(SoldierVisitor::class.java)

    override fun visit(solider: Solider) {
        LOGGER.info("Greetings {} $solider")
    }

    override fun visit(sergeant: Sergeant) {
    }

    override fun visit(commander: Commander) {
    }
}