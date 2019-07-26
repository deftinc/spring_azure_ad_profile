package com.testapt.app.security;


import java.security.Principal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.ui.Model;

@RestController
public class HelloController {
   @Autowired
   @PreAuthorize("hasRole('aptportal')")
   @RequestMapping("/")
   public String helloWorld() {
      return "Hello World!";
   }

  @RequestMapping("/user")
  public Principal user(Principal principal) {
    return principal;
  }

  @RequestMapping("/name")
  public String name(Principal principal) {
    return principal.getName();
  }
}
