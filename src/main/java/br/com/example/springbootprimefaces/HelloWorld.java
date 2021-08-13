package br.com.example.springbootprimefaces;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.Arrays;
import java.util.List;

@Component
@ViewScoped
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