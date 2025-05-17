package com.lcwd.hotel.service.HotelService.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resource not found exception");
    }

    public ResourceNotFoundException(String message){
        super(message);
    }
}
