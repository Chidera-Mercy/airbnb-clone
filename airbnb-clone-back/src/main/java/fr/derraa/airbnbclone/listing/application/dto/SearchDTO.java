package fr.derraa.airbnbclone.listing.application.dto;

import fr.derraa.airbnbclone.booking.application.dto.BookedDateDTO;
import fr.derraa.airbnbclone.listing.application.dto.sub.ListingInfoDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record SearchDTO(@Valid BookedDateDTO dates,
                        @Valid ListingInfoDTO infos,
                        @NotEmpty String location) {
}