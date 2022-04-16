package com.hqz.wow.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class CorpCustomerVO {
//    private CustomerVO customer;

    @Email(message = "Please input valid email address")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
    private String password;

    @NotEmpty(message = "Please input your street")
    private String street;

    @NotEmpty(message = "Please input your city")
    private String city;

    @NotEmpty(message = "Please choose your state")
    private String state;

    @NotEmpty(message = "Please input your postal code")
    private String zipcode;

    @NotEmpty(message = "Please input your phone number")
    @Pattern(regexp="(^$|[0-9]{10})")
    private String phone;

    private String customerType;

    @NotNull(message = "Please provide your employee ID")
    private int employeeId;

    @NotEmpty(message = "Please provide your corporation registration number")
    private String corpRegisterNo;
}
