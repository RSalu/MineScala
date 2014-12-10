package crn.mods.minescala

import crn.mods.minescala.traits.RClickable
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.world.World

class BaseBlock(nam: String, mat: Material) extends Block(mat) with RClickable{
  setBlockName(nam)
  setCreativeTab(CreativeTabs.tabBlock)
  
  override def onBlockActivated(world: World, x: Int, y: Int, z: Int,
                                  player: EntityPlayer, meta: Int,
                                  hitX: Float, hitY: Float, hitZ: Float) = {
    executeRightClick(world, x, y, z)
  }
}