package com.iluwatar.visitor.kotlin.example1


abstract class Unit constructor(vararg val units: Unit) {

    open fun accept(unitVisitor: UnitVisitor) {
        units.forEach {
            it.accept(unitVisitor)
        }
    }
}