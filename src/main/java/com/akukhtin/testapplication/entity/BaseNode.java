package com.akukhtin.testapplication.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
An abstract node with a basic functional
 */
@AllArgsConstructor
@NoArgsConstructor
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document(collection = "node")
abstract public class BaseNode implements NodeRootI{
  @Id
  private Long id;
  private String name;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }
}
