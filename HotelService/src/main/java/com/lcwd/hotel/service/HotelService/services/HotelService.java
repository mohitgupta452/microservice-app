package com.lcwd.hotel.service.HotelService.services;

import com.lcwd.hotel.service.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getAll();

    Hotel getHotelById(String hotelId);

    Hotel createHotel(Hotel hotel);


}
