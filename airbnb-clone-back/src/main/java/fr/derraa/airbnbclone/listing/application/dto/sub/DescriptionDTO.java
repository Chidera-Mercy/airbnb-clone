package fr.derraa.airbnbclone.listing.application.dto.sub;

import fr.derraa.airbnbclone.listing.application.dto.vo.DescriptionVO;
import fr.derraa.airbnbclone.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
    @NotNull TitleVO title,
    @NotNull DescriptionVO description
) {

}
