/*
 * Poly API
 * An example of a polymorphic API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.poly.model;

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
* NotFoundErrorDto
*/
public class NotFoundErrorDto {

    private String code;

    private String identifierValue;

    private String entityType;

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
                "code",
                "entityType",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getCode())) result.add("code");
        if (isMissing(getEntityType())) result.add("entityType");
        return result;
    }

    private boolean isMissing(String s) {
        return s == null || s.isEmpty();
    }

    private boolean isMissing(Object s) {
        return s == null;
    }


    /**
     * Get code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public NotFoundErrorDto code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get identifierValue
     * @return identifierValue
     */
    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

    public NotFoundErrorDto identifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
        return this;
    }

    /**
     * Get entityType
     * @return entityType
     */
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public NotFoundErrorDto entityType(String entityType) {
        this.entityType = entityType;
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
        NotFoundErrorDto notFoundError = (NotFoundErrorDto) o;
        return Objects.equals(this.getCode(), notFoundError.getCode()) &&
                Objects.equals(this.getIdentifierValue(), notFoundError.getIdentifierValue()) &&
                Objects.equals(this.getEntityType(), notFoundError.getEntityType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getIdentifierValue(), getEntityType());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotFoundErrorDto {\n");
        sb.append("    code: ").append(toIndentedString(getCode())).append("\n");
        sb.append("    identifierValue: ").append(toIndentedString(getIdentifierValue())).append("\n");
        sb.append("    entityType: ").append(toIndentedString(getEntityType())).append("\n");
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

