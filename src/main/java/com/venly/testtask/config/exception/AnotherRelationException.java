package com.venly.testtask.config.exception;

public class AnotherRelationException extends RuntimeException {

  public AnotherRelationException() {
    super("Words are already exist and can not be added with another relation");
  }
}
