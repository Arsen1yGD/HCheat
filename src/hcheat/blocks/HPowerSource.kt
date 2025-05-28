package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.sandbox.PowerSource
import mindustry.world.meta.BuildVisibility

class HPowerSource(name: String = "power-source") : PowerSource(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.power, BuildVisibility.shown, ItemStack.with())
        maxNodes = Int.MAX_VALUE
        powerProduction = Float.MAX_VALUE
        laserRange = 32F
        laserColor1 = HBlocks.lightColor
        laserColor2 = HBlocks.accentColor
    }

    inner class HPowerSourceBuilding : PowerSourceBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}