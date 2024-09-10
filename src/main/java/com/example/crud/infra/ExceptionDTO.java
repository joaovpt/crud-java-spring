package com.example.crud.infra;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionDTO {

    String message;

    public ExceptionDTO(String message){
        this.message = message;
    }
}
