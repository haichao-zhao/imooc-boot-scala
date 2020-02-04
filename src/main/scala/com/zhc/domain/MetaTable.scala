package com.zhc.domain

import javax.persistence._

import scala.beans.BeanProperty


@Entity
@Table
class MetaTable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: Integer = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var tableType: String = _

  @BeanProperty
  var dbId: Integer = _
}
