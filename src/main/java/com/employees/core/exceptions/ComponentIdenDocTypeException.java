package com.employees.core.exceptions;

public class ComponentIdenDocTypeException extends EMException {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public ComponentIdenDocTypeException(String application, String module, int number, Exception cause, Object... params) {
    super(application, module, number, cause, params);
  }

  public ComponentIdenDocTypeException(ExceptionNumberEnum enume, Exception cause, Object... params) {
    super("EmployeesCore", "IdenDocTypes", enume.getCode(), cause, params);
  }
}
