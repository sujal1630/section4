package com.airtel.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //it contains all getter and setter and all args and no args.so no need to write separately
public class CustomerDto {
//no need to write custId as client has no need of it.

    @NotEmpty(message = "Name can't be null")
    @Size(min = 3,max = 20,message = "Length should be between 3 and 20")
    private String name;

    @NotEmpty(message = "email can't be null")
    @Email(message = "pattern is invalid")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
