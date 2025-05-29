package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.Conveyor
import mindustry.world.meta.BuildVisibility

class HConveyor(name: String = "h-conveyor") : Conveyor(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = 640F
        displayedSpeed = 640F
    }

    inner class HConveyorBuild : ConveyorBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}