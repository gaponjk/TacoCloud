package com.example.secongstart;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {
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

    @Pattern(regexp = "^(0[1-9]|1[0-2]/[2-9]\\d)$",
            message = "Add correct expiration date from credit card")
    private String ccExpiration;

    @Pattern(regexp = "^\\d{3}$",
            message = "Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTacos(Taco taco) {
        tacos.add(taco);
    }
}

