package com.iluwatar.visitor.kotlin.example2


fun main(args: Array<String>) {

    /**
     * Visitor pattern simply to add functionality to different types of classes
     * if you need to add a functionality without manipulating the concrete class
     */

    val engineer = Engineer()

    val school = School("Cairo secondary school")
    val website = Website("Souq.com")
    val computer = Computer("GeekyMind")

    engineer.visit(school)
    engineer.visit(computer)
    engineer.visit(website)


}