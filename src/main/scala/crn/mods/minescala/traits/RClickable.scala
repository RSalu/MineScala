package crn.mods.minescala.traits

import net.minecraft.world.World

trait RClickable {
  def executeRightClick(world: World, x: Int, y: Int, z: Int) :Boolean = {true}
}
