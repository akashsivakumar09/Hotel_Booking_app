package com.example.hotelapp.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookingResponse {
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkoutDate;
    private String guestfullName;
    private String guestEmail;
    private int NumofAdults;
    private int NumOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;
    private RoomResponse room;

    public BookingResponse(Long id, LocalDate checkInDate, LocalDate checkoutDate,
                           String bookingConfirmationCode) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkoutDate = checkoutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

}
