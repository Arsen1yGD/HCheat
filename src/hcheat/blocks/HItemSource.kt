package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.sandbox.ItemSource
import mindustry.world.meta.BuildVisibility

class HItemSource(name: String = "item-source") : ItemSource(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        itemsPerSecond = 262144
    }

    inner class HItemSourceBuilding : ItemSourceBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}