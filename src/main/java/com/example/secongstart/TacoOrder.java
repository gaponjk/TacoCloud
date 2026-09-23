package com.example.secongstart;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

@Data
@Entity
public class TacoOrder implements Serializable {
  @Serial private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private LocalDateTime placedAt;

  @NotBlank(message = "Add your name")
  private String deliveryName;

  @NotBlank(message = "Add your Street")
  private String deliveryStreet;

  @NotBlank(message = "Add your City")
  private String deliveryCity;

  @NotBlank(message = "Add your State")
  private String deliveryState;

  @NotBlank(message = "Add your Zip code")
  private String deliveryZip;

  @CreditCardNumber(message = "Add your credit card number")
  private String ccNumber;

  @Pattern(
      regexp = "^(0[1-9]|1[0-2])/\\d{2}$",
      message = "Add correct expiration date from credit card")
  private String ccExpiration;

  @Pattern(regexp = "^\\d{3}$", message = "Invalid CVV")
  private String ccCVV;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Taco> tacos = new ArrayList<>();

  public void addTacos(Taco taco) {
    tacos.add(taco);
  }
}
