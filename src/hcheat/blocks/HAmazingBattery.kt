package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.power.Battery
import mindustry.world.meta.BuildVisibility

class HAmazingBattery(name: String = "amazing-battery") : Battery(name) {
    init {
        emptyLightColor = HBlocks.accentColor
        fullLightColor = HBlocks.shadeColor
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.power, BuildVisibility.shown, ItemStack.with())
        consumePowerBuffered(Float.MAX_VALUE)
    }

    inner class HAmazingSourceBuilding : BatteryBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}