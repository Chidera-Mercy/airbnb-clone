package fr.derraa.airbnbclone.listing.application.dto;

import fr.derraa.airbnbclone.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}