package hcheat.blocks

import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.distribution.Router
import mindustry.world.meta.BuildVisibility

class HRouter(name: String = "router") : Router(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.distribution, BuildVisibility.shown, ItemStack.with())
        speed = HBlocks.CONVEYOR_SPEED * 3
    }

    inner class HRouterBuild : RouterBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }
    }
}