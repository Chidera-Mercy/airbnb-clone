package fr.derraa.airbnbclone.listing.application.dto;

import fr.derraa.airbnbclone.listing.application.dto.sub.PictureDTO;
import fr.derraa.airbnbclone.listing.application.dto.vo.PriceVO;
import fr.derraa.airbnbclone.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}