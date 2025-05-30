package hcheat.blocks

import arc.graphics.Color
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.MendProjector
import mindustry.world.meta.BlockGroup
import mindustry.world.meta.BuildVisibility

class HMender(name: String = "mender") : MendProjector(name) {
    init {
        baseColor = Color.valueOf("8aa3f4")
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.effect, BuildVisibility.shown, ItemStack.with())
        range = 32F * 30F
        reload = 1F
        group = BlockGroup.projectors
        healPercent = 100F
    }

    inner class HMenderBuild : MendBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}