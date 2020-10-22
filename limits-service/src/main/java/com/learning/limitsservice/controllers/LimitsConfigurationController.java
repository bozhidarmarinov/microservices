package com.learning.limitsservice.controllers;

import com.learning.limitsservice.configuration.Configuration;
import com.learning.limitsservice.domain.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

  @Autowired
  private Configuration configuration;

  @GetMapping("/limits")
  public LimitConfiguration retrieveLimitsFromConfiguration() {
    return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
  }
}
