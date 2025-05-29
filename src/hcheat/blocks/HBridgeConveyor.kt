package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.BufferedItemBridge
import mindustry.world.blocks.distribution.ItemBridge
import mindustry.world.meta.BuildVisibility

class HBridgeConveyor(name: String = "bridge-conveyor") : BufferedItemBridge(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = 74F
        bufferCapacity = 256
        range = 256
        fadeIn = false
        moveArrows = false
        arrowSpacing = 6f
    }

    inner class HBridgeConveyorBuild : BufferedItemBridgeBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}