package io.glimpse.swiftgen

case class ConversionSettings(splitLongLines: Boolean = true)

object ConversionSettings {
  def defaultSettings = ConversionSettings()
}