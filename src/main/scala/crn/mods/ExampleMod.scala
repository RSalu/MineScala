package crn.mods

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry
import crn.mods.minescala.BaseBlock
import net.minecraft.block.material.Material
import org.apache.logging.log4j.LogManager

@Mod(modid = "MineScala", name = "Mine Scala", version = "SNAPSHOT", modLanguage="scala")
object ExampleMod{
  val logger = LogManager.getLogger("MineScala")

  @Mod.EventHandler
  def preInit(e: FMLPreInitializationEvent) {
    GameRegistry.registerBlock(new BaseBlock("blockA", Material.rock), "blockA")
    GameRegistry.registerBlock(new BaseBlock("blockB", Material.rock), "blockB")
  }

  @Mod.EventHandler
  def init(e: FMLInitializationEvent) {
    logger.info("OMG I'm in the init method! Hooray!")
  }

  @Mod.EventHandler
  def postInit(e: FMLPostInitializationEvent) {
    logger.info("OMG I'm in the postInit method! Hooray!")
  }
}