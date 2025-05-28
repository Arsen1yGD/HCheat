package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.power.PowerNode
import mindustry.world.meta.BuildVisibility

class HPowerNode(name: String = "power-node") : PowerNode(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.power, BuildVisibility.shown, ItemStack.with())
        maxNodes = Int.MAX_VALUE
        laserRange = 32F
        laserColor1 = HBlocks.lightColor
        laserColor2 = HBlocks.accentColor
    }

    inner class HPowerNodeBuilding : PowerNodeBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}