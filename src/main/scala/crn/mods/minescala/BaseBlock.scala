package crn.mods.minescala

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.item.EntityItem
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraft.world.World

class BaseBlock(nam: String, mat: Material) extends Block(mat){
  setBlockName(nam)
  setCreativeTab(CreativeTabs.tabBlock)
  
  override def onBlockActivated(world: World, x: Int, y: Int, z: Int,
                                  player: EntityPlayer, meta: Int,
                                  hitX: Float, hitY: Float, hitZ: Float) = {
  world.spawnEntityInWorld(new EntityItem(world, x+0.5, y+1.0, z+0.5, new ItemStack(Items.diamond)))
  true
  }
}