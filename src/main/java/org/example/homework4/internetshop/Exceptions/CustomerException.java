package org.example.homework4.internetshop.Exceptions;

public class CustomerException extends RuntimeException{
    private String name;
    public CustomerException(String name) {
        super();
        this.name = name;
    }
    @Override
    public String getMessage() {
        return String.format("Данный покупатель %s отсутствует в списке", name);
    }
}