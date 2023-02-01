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
* UpdatePersonCommandDto
*/
public class UpdatePersonCommandDto implements WebSocketCommandDto {

    private String command = "updatePerson";

    private UUID id;

    private PersonDto person;

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
                "command",
                "id",
                "person",
        };
    }

    public List<String> missingRequiredFields() {
        List<String> result = new ArrayList<>();
        if (isMissing(getCommand())) result.add("command");
        if (isMissing(getId())) result.add("id");
        if (isMissing(getPerson())) result.add("person");
        return result;
    }

    public void readOnlyFieldsWithValue(List<String> result) {
        if (person != null) {
            person.readOnlyFieldsWithValue(result);
        }
    }

    public UpdatePersonCommandDto mergeFrom(UpdatePersonCommandDto target) {
        if (target.getCommand() != null) this.setCommand(target.getCommand());
        if (target.getId() != null) this.setId(target.getId());
        if (target.getPerson() != null) this.setPerson(target.getPerson());
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
     * Get command
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public UpdatePersonCommandDto command(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UpdatePersonCommandDto id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get person
     * @return person
     */
    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public UpdatePersonCommandDto person(PersonDto person) {
        this.person = person;
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
        UpdatePersonCommandDto updatePersonCommand = (UpdatePersonCommandDto) o;
        return Objects.equals(this.getCommand(), updatePersonCommand.getCommand()) &&
                Objects.equals(this.getId(), updatePersonCommand.getId()) &&
                Objects.equals(this.getPerson(), updatePersonCommand.getPerson());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCommand(), getId(), getPerson());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePersonCommandDto {\n");
        sb.append("    command: ").append(toIndentedString(getCommand())).append("\n");
        sb.append("    id: ").append(toIndentedString(getId())).append("\n");
        sb.append("    person: ").append(toIndentedString(getPerson())).append("\n");
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

