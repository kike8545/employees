package com.sogesac.core.log;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.sogesac.core.util.Parameters;

/**
 * Clase que define los logger
 *
 * @author JEREMY
 *
 */
public final class EMLogger {

  public static final Logger log = LoggerFactory.getLogger(Parameters.PROCESS_NAME);

  /**
   * Constructor privado requerido por Sonar
   */
  private EMLogger() {
  }
}
