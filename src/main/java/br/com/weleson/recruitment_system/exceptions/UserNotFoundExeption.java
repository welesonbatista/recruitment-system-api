package br.com.weleson.recruitment_system.exceptions;

public class UserNotFoundExeption extends RuntimeException {

  public UserNotFoundExeption() {
    super(("User not found"));
  }

}
