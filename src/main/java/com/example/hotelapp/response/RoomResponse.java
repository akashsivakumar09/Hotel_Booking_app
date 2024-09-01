package com.example.hotelapp.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class RoomResponse {
    private Long id;
    private String roomType;
    private BigDecimal roomPrice;
    private Boolean isBooked;
    private String photo;
    private List<BookingResponse> bookings;

    public RoomResponse(Long id,String roomType, BigDecimal roomPrice, boolean isBooked,
                        byte[] PhotoBytes, List<BookingResponse> bookings){
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.photo = PhotoBytes != null ? Base64.encodeBase64String(PhotoBytes):null;
        this.bookings = bookings;

    }
    public RoomResponse(Long id,String roomType, BigDecimal roomPrice){
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

}
