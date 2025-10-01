package com.ei.office;
import java.time.LocalDateTime; import java.time.Duration;
public class Booking {
    private final String bookingId; private final String roomId; private final LocalDateTime start; private final Duration duration;
    public Booking(String bookingId,String roomId,LocalDateTime start,Duration duration){ this.bookingId=bookingId; this.roomId=roomId; this.start=start; this.duration=duration; }
    public String getBookingId(){ return bookingId; } public String getRoomId(){ return roomId; }
}
