package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.Wall
import mindustry.world.meta.BuildVisibility

class HWall(name: String = "wall") : Wall(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.defense, BuildVisibility.shown, ItemStack.with())
        health = Int.MAX_VALUE
        absorbLasers = true
        chanceDeflect = Float.POSITIVE_INFINITY
        lightningChance = 1F
        flashHit = true
    }
}