package br.com.example.springbootprimefaces;

import java.util.Arrays;
import java.util.List;

import javax.inject.Named;

import lombok.Getter;
import lombok.Setter;

@Named
public class HelloWorld {

  private String firstName = "John";
  private String lastName = "Doe";
  
  @Getter
  @Setter
  private List<String> lista = Arrays.asList("Uva", "Banana", "Laranja");

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String showGreeting() {
    return "Hello " + firstName + " " + lastName + "!";
  }
}