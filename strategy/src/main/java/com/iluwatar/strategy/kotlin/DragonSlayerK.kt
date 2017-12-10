package com.iluwatar.strategy.kotlin


class DragonSlayerK(var strategy: DragonSlyingStrK) {
    fun goToBattle() = strategy.execute()
}