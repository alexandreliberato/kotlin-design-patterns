package com.iluwatar.strategy.kotlin


fun main(args: Array<String>) {

    println("Green dragon spotted ahead!")
    val dragonSlayer = DragonSlayerK(MeleeStrategyK())
    dragonSlayer.goToBattle()
    println("Red dragon emerges.")
    dragonSlayer.strategy = ProjectileStrategyK()
    dragonSlayer.goToBattle()

    println("***********")

    println("Green dragon spotted ahead!")
    val dragon = DragonSlayerK(strategy = object : DragonSlyingStrK {
        override fun execute() =
                println("With your Excalibur you sever the dragon's head!")
    })
    dragon.goToBattle()
    println("Red dragon emerges.")
    dragon.strategy = object : DragonSlyingStrK {
        override fun execute() =
                println("You shoot the dragon with the magical crossbow and it falls dead on the ground!")
    }
    dragon.goToBattle()
}