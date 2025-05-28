package hcheat

import hcheat.blocks.HBlocks
import mindustry.mod.Mod

class H : Mod(){
    companion object {
        val modId = "hcheat"
    }

    override fun loadContent() {
        for (block in HBlocks.blockMap) {
            block.load()
        }
    }
}
