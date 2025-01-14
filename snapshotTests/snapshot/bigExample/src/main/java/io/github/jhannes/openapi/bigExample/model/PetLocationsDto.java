/*
 * Sample API
 * A small example to demonstrate individual problems
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.bigExample.model;

import java.io.File;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
* PetLocationsDto
*/
public class PetLocationsDto {

    private Map<String, Map<String, List<Double>>> locations = null;

    public static String[] readOnlyFields() {
        return new String[] {
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends PetLocationsDto> T copyTo(T target) {
        if (this.getLocations() != null) target.setLocations(this.getLocations());
        return target;
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(List<?> list) {
        return list == null;
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    public PetLocationsDto putLocationsItem(String key, Map<String, List<Double>> locationsItem) {
         if (this.locations == null) {
             this.locations = new HashMap<>();
         }
         this.locations.put(key, locationsItem);
         return this;
    }

    /**
     * Get locations
     * @return locations
     */
    public Map<String, Map<String, List<Double>>> getLocations() {
        return locations;
    }

    public void setLocations(Map<String, Map<String, List<Double>>> locations) {
        this.locations = locations;
    }

    public PetLocationsDto locations(Map<String, Map<String, List<Double>>> locations) {
        this.locations = locations;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PetLocationsDto petLocations = (PetLocationsDto) o;
        return Objects.equals(this.getLocations(), petLocations.getLocations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocations());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PetLocationsDto {\n");
        sb.append("    locations: ").append(toIndentedString(getLocations())).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

