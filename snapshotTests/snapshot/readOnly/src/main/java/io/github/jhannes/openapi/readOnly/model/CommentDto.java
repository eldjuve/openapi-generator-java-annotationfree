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


package io.github.jhannes.openapi.readOnly.model;

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
* CommentDto
*/
public class CommentDto {

    private String title = null;

    private String comment = null;

    private OffsetDateTime created_at = null;

    private UserDto user = null;

    public static String[] readOnlyFields() {
        return new String[] {
                "created_at",
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
        if (!isMissing(getCreatedAt())) {
            result.add("CommentDto.created_at");
        }
        if (user != null) {
            user.readOnlyFieldsWithValue(result);
        }
    }

    public <T extends CommentDto> T copyTo(T target) {
        if (this.getTitle() != null) target.setTitle(this.getTitle());
        if (this.getComment() != null) target.setComment(this.getComment());
        if (this.getCreatedAt() != null) target.setCreatedAt(this.getCreatedAt());
        if (this.getUser() != null) target.setUser(this.getUser());
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
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CommentDto title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get comment
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CommentDto comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get created_at
     * read only
     * @return created_at
     */
    public OffsetDateTime getCreatedAt() {
        return created_at;
    }

    /** <strong>read only</strong> */
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.created_at = createdAt;
    }

    public CommentDto createdAt(OffsetDateTime createdAt) {
        this.created_at = createdAt;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public CommentDto user(UserDto user) {
        this.user = user;
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
        CommentDto comment = (CommentDto) o;
        return Objects.equals(this.getTitle(), comment.getTitle()) &&
                Objects.equals(this.getComment(), comment.getComment()) &&
                Objects.equals(this.getCreatedAt(), comment.getCreatedAt()) &&
                Objects.equals(this.getUser(), comment.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getComment(), getCreatedAt(), getUser());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommentDto {\n");
        sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
        sb.append("    comment: ").append(toIndentedString(getComment())).append("\n");
        sb.append("    created_at: ").append(toIndentedString(getCreatedAt())).append("\n");
        sb.append("    user: ").append(toIndentedString(getUser())).append("\n");
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

