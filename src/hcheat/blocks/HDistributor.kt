package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.Router
import mindustry.world.meta.BuildVisibility

class HDistributor(name: String = "distributor") : Router(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = HBlocks.CONVEYOR_SPEED * 7
        size = 2
    }

    inner class HDistributorBuild : RouterBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}