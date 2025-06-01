package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.OverdriveProjector
import mindustry.world.meta.BuildVisibility

class HOverdriver(name: String = "overdriver") : OverdriveProjector(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.effect, BuildVisibility.shown, ItemStack.with())
        speedBoost = 64F
        range = 1024F
        size = 2
    }

    inner class HOverdriverBuild : OverdriveBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}