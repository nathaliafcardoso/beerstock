package com.nathaliafcardoso.beerStock.mapper;

import com.nathaliafcardoso.beerStock.dto.BeerDTO;
import com.nathaliafcardoso.beerStock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}