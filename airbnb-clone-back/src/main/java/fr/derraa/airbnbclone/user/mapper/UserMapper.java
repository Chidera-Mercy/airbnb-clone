package fr.derraa.airbnbclone.user.mapper;

import org.mapstruct.Mapper;

import fr.derraa.airbnbclone.user.application.dto.ReadUserDTO;
import fr.derraa.airbnbclone.user.domain.Authority;
import fr.derraa.airbnbclone.user.domain.User;;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority){
        return authority.getName();
    }


}
