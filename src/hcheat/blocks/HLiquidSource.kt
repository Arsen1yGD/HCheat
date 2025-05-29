package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.sandbox.LiquidSource
import mindustry.world.meta.BuildVisibility

class HLiquidSource(name: String = "liquid-source") : LiquidSource(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.liquid, BuildVisibility.shown, ItemStack.with())
    }

    inner class HLiquidSourceBuild : LiquidSourceBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}