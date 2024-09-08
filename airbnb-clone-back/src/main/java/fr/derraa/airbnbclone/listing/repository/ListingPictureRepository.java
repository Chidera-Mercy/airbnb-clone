package fr.derraa.airbnbclone.listing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.derraa.airbnbclone.listing.domain.ListingPicture;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long>{

}
