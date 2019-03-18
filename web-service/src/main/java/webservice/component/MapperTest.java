package webservice.component;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperTest {
    Dto entityToDto(Entity entity);
}
