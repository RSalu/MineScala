package crn.mods.minescala

import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs

class BaseBlock(nam: String, mat: Material) extends Block(mat){
  setBlockName(nam)
  setCreativeTab(CreativeTabs.tabBlock)
}