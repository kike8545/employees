/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.exceptions;

/**
 *
 * @author JEREMY
 */
public class EMException extends Exception {

  static final long serialVersionUID = -3387516993124229948L;
  private String application;
  private String process;
  private String module;
  private int numberException;
  private Throwable e;
  private ExceptionNumberEnum enume;
  private Exception causes;
  private String[] parameters;
  private Object params;

  /**
   * Constructs a new exception with {@code null} as its detail message. The
   * cause is not initialized, and may subsequently be initialized by a call to
   * {@link #initCause}.
   */
  public EMException() {
    super();
  }

  /**
   * Constructs a new exception with the specified detail message. The cause is
   * not initialized, and may subsequently be initialized by a call to
   * {@link #initCause}.
   *
   * @param message the detail message. The detail message is saved for later
   * retrieval by the {@link #getMessage()} method.
   */
  public EMException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   * <p>
   * Note that the detail message associated with {@code cause} is <i>not</i>
   * automatically incorporated in this exception's detail message.
   *
   * @param message the detail message (which is saved for later retrieval by
   * the {@link #getMessage()} method).
   * @param cause the cause (which is saved for later retrieval by the
   * {@link #getCause()} method). (A {@code null} value is permitted, and
   * indicates that the cause is nonexistent or unknown.)
   * @since 1.4
   */
  public EMException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified cause and a detail message of
   * {@code (cause==null ? null : cause.toString())} (which typically contains
   * the class and detail message of {@code cause}). This constructor is useful
   * for exceptions that are little more than wrappers for other throwables (for
   * example, {@link
   * java.security.PrivilegedActionException}).
   *
   * @param cause the cause (which is saved for later retrieval by the
   * {@link #getCause()} method). (A {@code null} value is permitted, and
   * indicates that the cause is nonexistent or unknown.)
   * @since 1.4
   */
  public EMException(Throwable cause) {
    super(cause);
  }

  /**
   * construye una nueva excepcion con los datos especificos aplicacion,
   * proceso,
   *
   * @param application aplicacion desde donde se genera la excepcion
   * @param process el proceso que se pretendia ejecutar
   * @param numberException numero de la excepcion
   * @param e causa de la excepcion
   * @param params parametros que se enviaron durante la excepcion
   */
  public EMException(String application,
          String process,
          int numberException,
          Throwable e,
          Object params) {

    this.application = application;
    this.process = process;
    this.numberException = numberException;
    this.e = e;
    this.params = params;

  }

  /**
   * Construye una nueva excepcion con los datos especificos aplicacion,
   * applicacion, proceso, enumeracion, causa y parametros
   *
   * @param application
   * @param process
   * @param enume
   * @param cause
   * @param params
   */
  public EMException(String application,
          String process,
          ExceptionNumberEnum enume,
          Exception cause,
          Object... params) {
    this.application = application;
    this.process = process;
    this.enume = enume;
    this.params = params;
  }

  public EMException(String application, String module, int numberException, Exception causes, Object... params) {
    this.application = application;
    this.module = module;
    this.numberException = numberException;
    this.causes = causes;
    this.params = params;
  }

  /**
   * Constructs a new exception with the specified detail message, cause,
   * suppression enabled or disabled, and writable stack trace enabled or
   * disabled.
   *
   * @param message the detail message.
   * @param cause the cause. (A {@code null} value is permitted, and indicates
   * that the cause is nonexistent or unknown.)
   * @param enableSuppression whether or not suppression is enabled or disabled
   * @param writableStackTrace whether or not the stack trace should be writable
   * @since 1.7
   */
  protected EMException(String message, Throwable cause,
          boolean enableSuppression,
          boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public String getApplication() {
    return application;
  }

  public String getProcess() {
    return process;
  }

  public int getNumberException() {
    return numberException;
  }

  public Throwable getE() {
    return e;
  }

  public String[] getParameters() {
    return parameters;
  }

}
