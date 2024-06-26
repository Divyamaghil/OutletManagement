package com.example.Outlet_Management.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicDetailsDto {

    private String locationId;
    private List<RestaurantSessionDto> restaurantSessionDto;
    private List<String> cuisines;
    private List<String> amenities;
    private List<String> parking;
    private String safetyMeasures;
    private String alcohol;
}
