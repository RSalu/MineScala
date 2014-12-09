package crn.mods

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.FMLInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.LogManager

@Mod(modid = "MineScala", name = "Mine Scala", version = "SNAPSHOT", modLanguage="scala")
object ExampleMod{
  val logger = LogManager.getLogger("MineScala")

  @Mod.EventHandler
  def preInit(e: FMLPreInitializationEvent) {
    logger.info("OMG I'm in the preInit method! Hooray!")
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