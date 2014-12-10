
package crn.mods.minescala.traits

import net.minecraft.world.World

trait ParticleClicker extends RClickable {
  override def executeRightClick(world: World, x: Int, y: Int, z: Int): Boolean = {
    world.spawnParticle("fireworksSpark", x+0.5, y, z+0.5, 0.0, 1.0, 0.0)
    super.executeRightClick(world, x, y, z)
  }
}
