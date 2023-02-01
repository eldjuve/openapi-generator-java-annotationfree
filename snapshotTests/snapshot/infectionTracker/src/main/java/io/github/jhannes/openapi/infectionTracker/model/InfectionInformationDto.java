/*
 * Infection Tracker
 * Infection Tracker - A case management system for tracking the spread of diseases
 *
 * The version of the OpenAPI document: 1.0.0-draft
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.jhannes.openapi.infectionTracker.model;

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
* InfectionInformationDto
*/
public class InfectionInformationDto {

    private String patientName = null;

    private String patientPhoneNumber = null;

    private LocalDate likelyInfectionDate = null;

    private String notes = null;

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

    public InfectionInformationDto mergeFrom(InfectionInformationDto target) {
        if (target.getPatientName() != null) this.setPatientName(target.getPatientName());
        if (target.getPatientPhoneNumber() != null) this.setPatientPhoneNumber(target.getPatientPhoneNumber());
        if (target.getLikelyInfectionDate() != null) this.setLikelyInfectionDate(target.getLikelyInfectionDate());
        if (target.getNotes() != null) this.setNotes(target.getNotes());
        return this;
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
     * Get patientName
     * example: John Smith
     * @return patientName
     */
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public InfectionInformationDto patientName(String patientName) {
        this.patientName = patientName;
        return this;
    }

    /**
     * Get patientPhoneNumber
     * @return patientPhoneNumber
     */
    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public InfectionInformationDto patientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
        return this;
    }

    /**
     * Get likelyInfectionDate
     * @return likelyInfectionDate
     */
    public LocalDate getLikelyInfectionDate() {
        return likelyInfectionDate;
    }

    public void setLikelyInfectionDate(LocalDate likelyInfectionDate) {
        this.likelyInfectionDate = likelyInfectionDate;
    }

    public InfectionInformationDto likelyInfectionDate(LocalDate likelyInfectionDate) {
        this.likelyInfectionDate = likelyInfectionDate;
        return this;
    }

    /**
     * Free form text to describe anything about the patient
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public InfectionInformationDto notes(String notes) {
        this.notes = notes;
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
        InfectionInformationDto infectionInformation = (InfectionInformationDto) o;
        return Objects.equals(this.getPatientName(), infectionInformation.getPatientName()) &&
                Objects.equals(this.getPatientPhoneNumber(), infectionInformation.getPatientPhoneNumber()) &&
                Objects.equals(this.getLikelyInfectionDate(), infectionInformation.getLikelyInfectionDate()) &&
                Objects.equals(this.getNotes(), infectionInformation.getNotes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatientName(), getPatientPhoneNumber(), getLikelyInfectionDate(), getNotes());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InfectionInformationDto {\n");
        sb.append("    patientName: ").append(toIndentedString(getPatientName())).append("\n");
        sb.append("    patientPhoneNumber: ").append(toIndentedString(getPatientPhoneNumber())).append("\n");
        sb.append("    likelyInfectionDate: ").append(toIndentedString(getLikelyInfectionDate())).append("\n");
        sb.append("    notes: ").append(toIndentedString(getNotes())).append("\n");
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

