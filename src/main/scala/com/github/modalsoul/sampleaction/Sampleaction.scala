package com.github.modalsoul.sampleaction

import com.google.gson.JsonObject

object SampleAction {
  def main(args:JsonObject):JsonObject = {
    val obj = new JsonObject()
    val name = if(args.has("name")) {
      args.getAsJsonPrimitive("name").getAsString()
    } else "World"
    obj.addProperty("greeting", s"Hello ${name}!")
    obj
  }
}
