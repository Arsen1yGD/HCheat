package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.Conveyor
import mindustry.world.meta.BuildVisibility

class HConveyor(name: String = "conveyor") : Conveyor(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = HBlocks.CONVEYOR_SPEED / 137.5F // idfk why i have to divide by this
        displayedSpeed = HBlocks.CONVEYOR_SPEED
    }

    inner class HConveyorBuild : ConveyorBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}