package com.zhc.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class HelloScalaBoot {
  @RequestMapping(value = Array("/sayScalaHello"), method = Array(RequestMethod.GET))
  def sayJavaHello = "Hello Scala boot..."

}
