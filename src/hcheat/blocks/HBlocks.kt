package hcheat.blocks

import arc.graphics.Color
import mindustry.world.Block
import mindustry.world.meta.Env

object HBlocks {

    val accentColor: Color? = Color.valueOf("7a8cdc")
    val shadeColor: Color? = Color.valueOf("626f9b")
    val lightColor: Color? = Color.valueOf("8aa3f4")
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
        },
        HMender(),
        HOverdriver()
    )

    fun setupBlock(block: Block) {
        block.health = Int.MAX_VALUE
        block.buildTime = 2F
        block.alwaysUnlocked = true
        block.envEnabled = Env.any
    }
}