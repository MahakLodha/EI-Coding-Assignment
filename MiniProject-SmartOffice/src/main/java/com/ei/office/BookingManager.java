package com.ei.office;
import java.util.concurrent.Executors; import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit; import java.util.Map; import java.util.concurrent.ConcurrentHashMap;
public class BookingManager {
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private final Map<String, Booking> bookings = new ConcurrentHashMap<>();
    public void addBooking(Booking b){
        bookings.put(b.getBookingId(), b);
        long delay = OfficeConfig.getInstance().getAutoReleaseTimeout().toSeconds();
        scheduler.schedule(() -> { bookings.remove(b.getBookingId()); System.out.println("Auto-released " + b.getBookingId()); }, delay, TimeUnit.SECONDS);
    }
    public void cancelBooking(String id){ bookings.remove(id); }
    public void shutdown(){ scheduler.shutdownNow(); }
}
