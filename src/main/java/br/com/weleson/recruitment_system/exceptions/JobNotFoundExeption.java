package br.com.weleson.recruitment_system.exceptions;

public class JobNotFoundExeption extends RuntimeException {

  public JobNotFoundExeption() {
    super(("Job not found"));
  }

}