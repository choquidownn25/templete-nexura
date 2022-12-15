package org.exemple.utils;

public enum StringResponse {
    ErrorSAVE("Tipo de usuario no permitido en la biblioteca",1),
    ErrorSREMOVE("El usuario con identificación xxxxxx ya tiene un libro prestado por lo cual no se le puede realizar otro préstamo",2),
    ErrorNOHAYPRODUCTO("Producto no encontrado",3),
    ErrorSUPDATE("El usuario con identificación xxxxxx ya tiene un libro prestado por lo cual no se le puede realizar otro préstamo",401),
    OK("Registro agregado",200);



    private String name;
    private int code;


    private StringResponse (String name, int code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}
