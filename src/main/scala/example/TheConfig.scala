package example

import zio.Config

case class TheConfig(e1: String, e2: String)

object TheConfig {
  val config: Config[TheConfig] = {
    val eA = Config.string("ENV_A")
    val eB = Config.string("ENV_B")

    (eA ++ eB).map {
      case (a, b) => TheConfig(a, b)
    }
  }
}
