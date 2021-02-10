package com.employees.core.exceptions;

public enum ExceptionNumberEnum {

  ERROR_UNDEFINED(1),
  ERROR_ELIMINANDO_EMPLOYEE(2),
  ERROR_EJECUTANDO_EMPLOYEE(3),
  ERROR_OBTENIENDO_EMPLOYEE(4),
  ERROR_ALMACENANDO_EMPLOYEE(5),
  ERROR_ACTUALIZANDO_EMPLOYEE(6);

  private final int code;

  /**
   * Define la estructura del enum
   *
   * @param code codigo del error.
   */
  ExceptionNumberEnum(final int code) {
    this.code = code;
  }

  /**
   * Método que obtiene el codigo de error del valor del enum.
   *
   * @date 13/07/2017
   *
   * @return el codigo del error
   */
  public int getCode() {
    return code;
  }

  /**
   * Método que busca un enum según su código de error
   *
   *
   * @param errorCode código de error a buscar
   * @return El valor buscado, en caso de no encontrarlo retorna ERROR_UNDEFINED.
   */
  public static ExceptionNumberEnum getEnum(final int errorCode) {
    for (ExceptionNumberEnum numeration : values()) {
      if (numeration.getCode() == errorCode) {
        return numeration;
      }
    }
    return ERROR_UNDEFINED;
  }
}
