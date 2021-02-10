/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.core.controllers;

import com.employees.core.dto.EmployeesDTO;
import com.employees.core.services.EmployeesInterfaceService;
import com.employees.core.entities.Employees;
import com.employees.core.exceptions.EMException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author JEREMY
 */
@RestController
@RequestMapping("/employees")
public class EmployeesRestController {

  private static final Logger logger = LoggerFactory.getLogger(EmployeesRestController.class);

  @Autowired
  private EmployeesInterfaceService employeesService;

  @RequestMapping(method = RequestMethod.GET, produces = "application/json")
  @ResponseBody
  public List<EmployeesDTO> list() {
    List<EmployeesDTO> res = new ArrayList<>(employeesService.findAll());

    return res;
  }

  @GetMapping("/{id}")
  public Object get(@PathVariable String id) {
    return null;
  }

  @GetMapping(value = "generateEmail/{email}", produces = "application/json")
  @ResponseBody
  public String generateEmail(@PathVariable String email) {
    String res = employeesService.generateEmail(email);

    return new JSONObject()
            .put("emailGenerated", res)
            .toString();
  }

  @PostMapping(value = "findByIdentifNumAndIdentifType", produces = "application/json")
  @ResponseBody
  public String findByIdentifNumAndIdentifType(@RequestBody String data) {
    String[] _data = data.split("@");
    Boolean res = employeesService
            .findByIdentifNumAndIdentifType(_data[0], Integer.parseInt(_data[1]));
    return new JSONObject()
            .put("identificacionDuplicada", res)
            .toString();
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
    return null;
  }

  @PostMapping(produces = "application/json")
  @ResponseBody
  public String post(@RequestBody Employees employee) {
    employeesService.create(employee);
    return new JSONObject()
            .put("Creado", "Empleado registrado exitosamente.")
            .toString();
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> delete(@PathVariable String id) {
    return null;
  }

  @ExceptionHandler(EMException.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Error on server")
  public Object handleError(HttpServletRequest req, Exception ex) {
    Object errorObject = new Object();
    return errorObject;
  }

}
