package com.iluwatar.visitor.kotlin.example2


interface Visitor {

    fun visit(computer: Computer)

    fun visit(school: School)

    fun visit(website: Website)

}