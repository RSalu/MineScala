package crn.mods.minescala.traits

import net.minecraft.entity.item.EntityItem
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraft.world.World

trait DiamondClicker extends RClickable {
  override def executeRightClick(world: World, x: Int, y: Int, z: Int): Boolean = {
    world.spawnEntityInWorld(new EntityItem(world, x+0.5, y+1.0, z+0.5, new ItemStack(Items.diamond)))
    super.executeRightClick(world, x, y, z)
  }
}
