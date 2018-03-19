package com.iluwatar.visitor.kotlin.example1


class Commander(vararg val unitss: Unit) : Unit(*unitss) {

    override fun accept(unitVisitor: UnitVisitor) {
        unitVisitor.visit(this)
        super.accept(unitVisitor)
    }

    override fun toString(): String {
        return "Commander"
    }


}