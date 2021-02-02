package com.akukhtin.testapplication.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
An abstract node with a basic functional
 */
@AllArgsConstructor
@NoArgsConstructor
abstract class BaseNode implements NodeRootI{
  private long id;
  private String name;

  @Override
  public long getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }
}
