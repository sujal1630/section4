package com.airtel.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND )
public class ResourceNotFoundException extends RuntimeException  {

    public ResourceNotFoundException(String resourceName,String fieldName,String fieldValue){
        super(String.format("%s not found with given input data%s:'%s'",resourceName,fieldName,fieldValue));  //it only takes single field as input so string.format we will use.

    }
}
