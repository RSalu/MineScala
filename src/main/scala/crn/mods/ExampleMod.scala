package crn.mods

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.registry.GameRegistry
import crn.mods.minescala.BaseBlock
import crn.mods.minescala.traits.DiamondClicker
import crn.mods.minescala.traits.ParticleClicker
import net.minecraft.block.material.Material
import org.apache.logging.log4j.LogManager

@Mod(modid = "MineScala", name = "Mine Scala", version = "SNAPSHOT", modLanguage="scala")
object ExampleMod{
  val logger = LogManager.getLogger("MineScala")

  @Mod.EventHandler
  def preInit(e: FMLPreInitializationEvent) {
    GameRegistry.registerBlock(new BaseBlock("blockA", Material.rock) with DiamondClicker, "blockA")
    GameRegistry.registerBlock(new BaseBlock("blockB", Material.rock) with ParticleClicker, "blockB")
    GameRegistry.registerBlock(new BaseBlock("blockC", Material.rock) with ParticleClicker with DiamondClicker, "blockC")
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