/*
 * WebSockets
 * An example of sending requests and commands
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: johannes@brodwall.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.websockets.model;

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
* PersonDto
*/
public class PersonDto implements PersonInterface {

    private UUID id = null;

    private String type;

    private String givenName;

    private String familyName;

    private String email = null;

    private String phone = null;

    private LocalDate birthDate = null;

    public static String[] readOnlyFields() {
        return new String[] {
                "id",
        };
    }

    public static String[] writeOnlyFields() {
        return new String[] {
        };
    }

    public static String[] requiredFields() {
        return new String[] {
                "type",
                "givenName",
                "familyName",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getType())) result.add("type");
        if (isMissing(getGivenName())) result.add("givenName");
        if (isMissing(getFamilyName())) result.add("familyName");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (!isMissing(getId())) {
            result.add("PersonDto.id");
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


    /**
     * Get id
     * read only
     * @return id
     */
    public UUID getId() {
        return id;
    }

    /** <strong>read only</strong> */
    public void setId(UUID id) {
        this.id = id;
    }

    public PersonDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PersonDto type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get givenName
     * @return givenName
     */
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public PersonDto givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * Get familyName
     * @return familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public PersonDto familyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PersonDto email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get phone
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PersonDto phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get birthDate
     * @return birthDate
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PersonDto birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
        PersonDto person = (PersonDto) o;
        return Objects.equals(this.getId(), person.getId()) &&
                Objects.equals(this.getType(), person.getType()) &&
                Objects.equals(this.getGivenName(), person.getGivenName()) &&
                Objects.equals(this.getFamilyName(), person.getFamilyName()) &&
                Objects.equals(this.getEmail(), person.getEmail()) &&
                Objects.equals(this.getPhone(), person.getPhone()) &&
                Objects.equals(this.getBirthDate(), person.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getGivenName(), getFamilyName(), getEmail(), getPhone(), getBirthDate());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonDto {\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    type: ").append(toIndentedString(getType())).append("\n");
        sb.append("    givenName: ").append(toIndentedString(getGivenName())).append("\n");
        sb.append("    familyName: ").append(toIndentedString(getFamilyName())).append("\n");
        sb.append("    email: ").append(toIndentedString(getEmail())).append("\n");
        sb.append("    phone: ").append(toIndentedString(getPhone())).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(getBirthDate())).append("\n");
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

