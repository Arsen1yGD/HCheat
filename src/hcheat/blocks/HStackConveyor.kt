package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.StackConveyor
import mindustry.world.meta.BuildVisibility

class HStackConveyor(name: String = "stack-conveyor") : StackConveyor(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = HBlocks.CONVEYOR_SPEED / 60F
    }

    inner class HStackConveyorBuild : StackConveyorBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}