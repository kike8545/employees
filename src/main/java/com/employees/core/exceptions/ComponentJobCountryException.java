package com.employees.core.exceptions;

public class ComponentJobCountryException extends EMException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public ComponentJobCountryException(String application, String module, int number, Exception cause, Object... params) {
    super(application, module, number, cause, params);
  }

  public ComponentJobCountryException(ExceptionNumberEnum enume, Exception cause, Object... params) {
    super("EmployeesCore", "JobCountry", enume.getCode(), cause, params);
  }
}
