package com.venly.testtask.config.exception;

public class InverseException extends RuntimeException {

  public InverseException() {
    super("Words are already exist and saved in inverse manner");
  }
}
