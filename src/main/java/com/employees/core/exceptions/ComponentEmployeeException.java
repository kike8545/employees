package com.employees.core.exceptions;

public class ComponentEmployeeException extends EMException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public ComponentEmployeeException(String application, String module, int number, Exception cause, Object... params) {
    super(application, module, number, cause, params);
  }

  public ComponentEmployeeException(ExceptionNumberEnum enume, Exception cause, Object... params) {
    super("EmployeesCore", "Employee", enume.getCode(), cause, params);
  }
}
