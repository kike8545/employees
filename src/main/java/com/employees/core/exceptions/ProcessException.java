package com.employees.core.exceptions;

import com.sogesac.core.util.Parameters;
import com.sogesac.core.log.EMLogger;

/**
 * Clase que maneja las excepciones del proceso y envia al log la informacion
 * correspondiente del error
 *
 * @author JEREMY
 *
 */
public class ProcessException extends EMException {

  private static final long serialVersionUID = 8159309372304862520L;

  /**
   * Constructor que llama al constructor de la clase padre con el nombre de la
   * aplicacion y el nombre del proceso
   *
   * @param number Numero de la excepcion
   * @param e Excepcion generada
   * @param parameters Parametros
   */
  public ProcessException(int number, Exception e, String... parameters) {
    super(Parameters.APPLICATION_NAME, Parameters.PROCESS_NAME, number, e, parameters);

    EMLogger.log.error("", e);
  }

  /**
   * Constructor que llama al constructor de la clase padre sin enviar la
   * excepcion, el nombre de la aplicacion ni el nombre del proceso
   *
   * @param number Numero de la excepcion
   * @param parameters Parametros
   */
  public ProcessException(int number, String... parameters) {
    this(number, null, parameters);
  }

}
