package com.employees.core.exceptions;

public class ComponentJobAreaException extends EMException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public ComponentJobAreaException(String application, String module, int number, Exception cause, Object... params) {
    super(application, module, number, cause, params);
  }

  public ComponentJobAreaException(ExceptionNumberEnum enume, Exception cause, Object... params) {
    super("EmployeesCore", "JobArea", enume.getCode(), cause, params);
  }
}
