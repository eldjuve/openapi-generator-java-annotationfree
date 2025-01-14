/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * The version of the OpenAPI document: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.typeHierarchy.model;

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
* AddressDto
*/
public class AddressDto {

    private String addressLine1 = null;

    private String addressLine2 = null;

    private String city;

    private String country;

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
                "city",
                "country",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getCity())) result.add("city");
        if (isMissing(getCountry())) result.add("country");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public <T extends AddressDto> T copyTo(T target) {
        if (this.getAddressLine1() != null) target.setAddressLine1(this.getAddressLine1());
        if (this.getAddressLine2() != null) target.setAddressLine2(this.getAddressLine2());
        if (this.getCity() != null) target.setCity(this.getCity());
        if (this.getCountry() != null) target.setCountry(this.getCountry());
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


    /**
     * Get addressLine1
     * @return addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public AddressDto addressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    /**
     * Get addressLine2
     * @return addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public AddressDto addressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    /**
     * Get city
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressDto city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get country
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public AddressDto country(String country) {
        this.country = country;
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
        AddressDto address = (AddressDto) o;
        return Objects.equals(this.getAddressLine1(), address.getAddressLine1()) &&
                Objects.equals(this.getAddressLine2(), address.getAddressLine2()) &&
                Objects.equals(this.getCity(), address.getCity()) &&
                Objects.equals(this.getCountry(), address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressLine1(), getAddressLine2(), getCity(), getCountry());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddressDto {\n");
        sb.append("    addressLine1: ").append(toIndentedString(getAddressLine1())).append("\n");
        sb.append("    addressLine2: ").append(toIndentedString(getAddressLine2())).append("\n");
        sb.append("    city: ").append(toIndentedString(getCity())).append("\n");
        sb.append("    country: ").append(toIndentedString(getCountry())).append("\n");
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

