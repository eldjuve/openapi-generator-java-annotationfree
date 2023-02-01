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
* PersonInterface
*/
public interface PersonInterface {

    List<String> missingRequiredFields();

    void readOnlyFieldsWithValue(List<String> result);


    /**
     * Get id
     * read only
     * @return id
     */
    UUID getId();

    /** <strong>read only</strong> */
    void setId(UUID id);

    PersonInterface id(UUID id);

    /**
     * Get type
     * @return type
     */
    String getType();

    void setType(String type);

    PersonInterface type(String type);

    /**
     * Get givenName
     * @return givenName
     */
    String getGivenName();

    void setGivenName(String givenName);

    PersonInterface givenName(String givenName);

    /**
     * Get familyName
     * @return familyName
     */
    String getFamilyName();

    void setFamilyName(String familyName);

    PersonInterface familyName(String familyName);

    /**
     * Get email
     * @return email
     */
    String getEmail();

    void setEmail(String email);

    PersonInterface email(String email);

    /**
     * Get phone
     * @return phone
     */
    String getPhone();

    void setPhone(String phone);

    PersonInterface phone(String phone);

    /**
     * Get birthDate
     * @return birthDate
     */
    LocalDate getBirthDate();

    void setBirthDate(LocalDate birthDate);

    PersonInterface birthDate(LocalDate birthDate);

    default PersonInterface mergeFrom(PersonInterface target) {
        if (target.getId() != null) this.setId(target.getId());
        if (target.getType() != null) this.setType(target.getType());
        if (target.getGivenName() != null) this.setGivenName(target.getGivenName());
        if (target.getFamilyName() != null) this.setFamilyName(target.getFamilyName());
        if (target.getEmail() != null) this.setEmail(target.getEmail());
        if (target.getPhone() != null) this.setPhone(target.getPhone());
        if (target.getBirthDate() != null) this.setBirthDate(target.getBirthDate());
        return this;
    }
}

