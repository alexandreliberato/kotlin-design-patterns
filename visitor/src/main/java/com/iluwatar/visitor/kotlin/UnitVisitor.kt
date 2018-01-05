package com.iluwatar.visitor.kotlin


interface UnitVisitor {

    fun visit(solider: Solider)

    fun visit(sergeant: Sergeant)

    fun visit(commander: Commander)
}