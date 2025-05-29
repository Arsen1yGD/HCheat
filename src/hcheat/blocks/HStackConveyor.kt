package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.StackConveyor
import mindustry.world.meta.BuildVisibility

class HStackConveyor(name: String = "h-stack-conveyor") : StackConveyor(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = 6400f / 60f
    }

    inner class HStackConveyorBuild : StackConveyorBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}