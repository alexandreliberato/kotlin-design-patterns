package com.iluwatar.visitor.kotlin.example1

fun main(args: Array<String>) {

    val commander = Commander(Solider(), Solider())
    commander.accept(SergeantVisitor())
    commander.accept(SoliderVisitor())
}
