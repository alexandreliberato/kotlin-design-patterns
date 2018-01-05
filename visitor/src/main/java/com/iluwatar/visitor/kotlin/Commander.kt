package com.iluwatar.visitor.kotlin

import java.util.*


class Commander(vararg val unitss: Unit) : Unit(*unitss) {

    override fun accept(unitVisitor: UnitVisitor) {
        unitVisitor.visit(this)
        super.accept(unitVisitor)
    }

    override fun toString(): String {
        return "Commander"
    }


}