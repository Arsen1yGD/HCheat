package hcheat.blocks

import arc.graphics.Color
import mindustry.world.Block
import mindustry.world.meta.Env

object HBlocks {

    val accentColor: Color? = Color.valueOf("80a9ff")
    val shadeColor: Color? = Color.valueOf("7a8cdc")
    val lightColor: Color? = Color.valueOf("a4b8fa")
    const val CONVEYOR_SPEED: Float = 640F
    val blockMap: List<Block> = listOf(
        HItemSource(),
        HLiquidSource(),
        HPowerSource(),
        HPowerNode(),
        HAmazingBattery(),
        HConveyor(),
        HStackConveyor(),
        HRouter(),
        HDistributor(),
        HBridgeConveyor(),
        HTurret(),
        HWall(),
        HWall("wall-large").apply {
            size = 2
        }
    )

    fun setupBlock(block: Block) {
        block.health = Int.MAX_VALUE
        block.buildTime = 2F
        block.alwaysUnlocked = true
        block.envEnabled = Env.any
    }
}