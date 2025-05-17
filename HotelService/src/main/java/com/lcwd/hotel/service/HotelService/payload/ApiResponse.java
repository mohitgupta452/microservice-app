package com.lcwd.hotel.service.HotelService.payload;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponse {
    String message;
    boolean success;
    HttpStatus status;
}
