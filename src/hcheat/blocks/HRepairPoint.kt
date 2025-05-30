package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.units.RepairTurret
import mindustry.world.meta.BuildVisibility

class HRepairPoint(name: String = "repair-point") : RepairTurret(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.units, BuildVisibility.shown, ItemStack.with())

    }
}