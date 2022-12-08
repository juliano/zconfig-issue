package example

import zio._

object Main extends ZIOAppDefault {
  def run: ZIO[Environment, Any, Any] = {
    for {
      _ <- ZIO.logInfo("It's starting!")
      cfg <- ZIO.config(TheConfig.config)
      _ <- ZIO.logInfo("It's running!")
    } yield ()
  }
}