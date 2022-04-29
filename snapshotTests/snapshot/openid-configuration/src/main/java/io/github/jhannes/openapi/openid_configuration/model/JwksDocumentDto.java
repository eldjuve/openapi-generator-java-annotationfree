/*
 * Open ID Connect
 * Open ID Connect Discovery
 *
 * The version of the OpenAPI document: 1.0.0-draft
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.openid_configuration.model;

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
* JwksDocumentDto
*/
public class JwksDocumentDto {

    private List<JwksKeyDto> keys = null;

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
        if (keys != null) {
            keys.forEach(o -> o.readOnlyFieldsWithValue(result));
        }
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


    public <T> JwksDocumentDto keys(Collection<T> items, Function<T, JwksKeyDto> mapper) {
        return keys(items.stream().map(mapper).collect(Collectors.toList()));
    }

    public <T> List<T> getKeys(Function<JwksKeyDto, T> mapper) {
        return getKeys().stream().map(mapper).collect(Collectors.toList());
    }

    public JwksDocumentDto addKeysItem(JwksKeyDto keysItem) {
        if (this.keys == null) {
            this.keys = new ArrayList<>();
        }
        this.keys.add(keysItem);
        return this;
    }

    /**
     * Get keys
     * @return keys
     */
    public List<JwksKeyDto> getKeys() {
        return keys;
    }

    public void setKeys(List<JwksKeyDto> keys) {
        this.keys = keys;
    }

    public JwksDocumentDto keys(List<JwksKeyDto> keys) {
        this.keys = keys;
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
        JwksDocumentDto jwksDocument = (JwksDocumentDto) o;
        return Objects.equals(this.getKeys(), jwksDocument.getKeys());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKeys());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JwksDocumentDto {\n");
        sb.append("    keys: ").append(toIndentedString(getKeys())).append("\n");
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

