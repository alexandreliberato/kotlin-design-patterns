package com.iluwatar.visitor.kotlin.example1


interface UnitVisitor {

    fun visit(solider: Solider)

    fun visit(sergeant: Sergeant)

    fun visit(commander: Commander)
}