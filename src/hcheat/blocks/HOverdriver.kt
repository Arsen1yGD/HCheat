package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.OverdriveProjector
import mindustry.world.meta.BuildVisibility

class HOverdriver(name: String = "overdriver") : OverdriveProjector(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.defense, BuildVisibility.shown, ItemStack.with())
        speedBoost = 64F
    }
}