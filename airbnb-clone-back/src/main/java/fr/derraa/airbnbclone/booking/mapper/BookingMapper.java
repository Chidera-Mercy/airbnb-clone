package fr.derraa.airbnbclone.booking.mapper;

import fr.derraa.airbnbclone.booking.application.dto.BookedDateDTO;
import fr.derraa.airbnbclone.booking.application.dto.NewBookingDTO;
import fr.derraa.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}