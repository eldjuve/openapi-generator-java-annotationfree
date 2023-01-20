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
* LogMessageDto
*/
public class LogMessageDto {

    private String message;

    private Object error = null;

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
                "message",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getMessage())) result.add("message");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
    }

    public void mergeFrom(LogMessageDto target) {
        if (target.getMessage() != null) this.setMessage(target.getMessage());
        if (target.getError() != null) this.setError(target.getError());
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
     * Get message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogMessageDto message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get error
     * @return error
     */
    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public LogMessageDto error(Object error) {
        this.error = error;
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
        LogMessageDto logMessage = (LogMessageDto) o;
        return Objects.equals(this.getMessage(), logMessage.getMessage()) &&
                Objects.equals(this.getError(), logMessage.getError());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getError());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogMessageDto {\n");
        sb.append("    message: ").append(toIndentedString(getMessage())).append("\n");
        sb.append("    error: ").append(toIndentedString(getError())).append("\n");
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

