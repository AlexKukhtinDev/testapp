package com.akukhtin.testapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*
node Desc entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NodeDesc extends BaseNode{
  private String description;
}
