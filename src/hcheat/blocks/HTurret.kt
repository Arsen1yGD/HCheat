package hcheat.blocks

import arc.Core
import arc.graphics.Texture
import arc.graphics.g2d.TextureRegion
import mindustry.entities.bullet.BulletType
import mindustry.entities.bullet.MissileBulletType
import mindustry.gen.Building
import mindustry.gen.Bullet
import mindustry.gen.Hitboxc
import mindustry.gen.Unit
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.Turret
import mindustry.world.meta.BuildVisibility
import mindustry.content.Fx

class HTurret(name: String = "turret") : Turret(name) {
    init {
        super.init()
        HBlocks.setupBlock(this)
        requirements(Category.turret, BuildVisibility.shown, ItemStack.with())
        size = 2
        rotateSpeed = 256F
        reload = 0.25F
        reloadWhileCharging = true
        recoil = 0F
        recoilTime = 2F
        inaccuracy = 0F
        range = 2048F
    }

    class HTurretBullet : MissileBulletType(8F, Float.POSITIVE_INFINITY) {
        init {
            mixColorFrom = HBlocks.accentColor
            width = 7F
            height = 9F
            lifetime = 30F * 60F
            hitEffect = Fx.hitBulletColor
            despawnEffect = hitEffect
            hitColor = HBlocks.shadeColor
            backColor = hitColor
            trailColor = hitColor
            frontColor = HBlocks.accentColor
            splashDamage = Float.POSITIVE_INFINITY
            splashDamageRadius = 30F
            splashDamagePierce = true
            homingPower = 0.3F
            homingRange = 240F
            pierce = true
            pierceArmor = true
            pierceBuilding = true
            pierceCap = Int.MAX_VALUE
            hitSize = 8F
            reloadMultiplier = 0.025F
            // ye
            backRegion = Core.atlas.find("missile-back")
            frontRegion = Core.atlas.find("missile")
        }

        override fun hitTile(b: Bullet?, build: Building?, x: Float, y: Float, initialHealth: Float, direct: Boolean) {
            super.hitTile(b, build, x, y, initialHealth, direct)

            if (build?.tile?.team() != b?.team) {
                build?.killed()
            }
        }

        override fun hitEntity(b: Bullet?, entity: Hitboxc?, health: Float) {
            super.hitEntity(b, entity, health)

            entity as Unit? // smart cast lol

            if ((entity?.team ?: b?.team) != b?.team) {
                entity?.killed()
            }
        }
    }

    inner class HTurretBuild : TurretBuild() {
        override fun handleDamage(amount: Float): Float {
            return 0F
        }

        override fun hasAmmo(): Boolean {
            return true
        }

        override fun peekAmmo(): BulletType? {
            return HTurretBullet()
        }

        override fun useAmmo(): BulletType? {
            return HTurretBullet()
        }
    }
}