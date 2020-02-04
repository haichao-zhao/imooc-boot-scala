package com.zhc.controller

import com.zhc.domain.MetaTable
import com.zhc.service.MetaTableService
import com.zhc.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {


  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable: MetaTable) = {
    metaTableService.save(metaTable)
    ResultVOUtil.success()
  }

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }

}
