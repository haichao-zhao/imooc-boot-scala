package com.zhc.service

import com.zhc.domain.MetaTable
import com.zhc.repository.MetaTableRepository
import com.zhc.utils.{ResultVO, ResultVOUtil}
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class MetaTableService @Autowired()(metaTableRepository: MetaTableRepository) {

  @Transactional
  def save(metaTable: MetaTable) = {

    metaTableRepository.save(metaTable)

  }

  def query() = {
    metaTableRepository.findAll()
  }
}
