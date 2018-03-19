package com.iluwatar.visitor.kotlin.example2


class Engineer : Visitor {
    override fun visit(computer: Computer) {
        println("Fixing computer ${computer.name}")
    }

    override fun visit(school: School) {
        println("Teaching at ${school.name}")
    }

    override fun visit(website: Website) {
        println("Design ${website.name}")
    }


}