/*
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * The version of the OpenAPI document: 1.0.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.github.jhannes.openapi.petstore.api;

import io.github.jhannes.openapi.petstore.model.*;

import java.io.File;
import io.github.jhannes.openapi.petstore.model.PetDto;

import org.actioncontroller.actions.*;
import org.actioncontroller.values.*;
import org.actioncontroller.values.json.JsonBody;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface PetApi {
    /**
     * Add a new pet to the store
     * @param petDto Pet object that needs to be added to the store (optional)
     */
    @POST("/pet")
    public void addPet(
            @JsonBody PetDto petDto
    ) throws IOException;
    /**
     * Deletes a pet
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     */
    @DELETE("/pet/{petId}")
    public void deletePet(
            @PathParam("petId") Long petId,
            @HttpHeader("api_key") Optional<String> apiKey
    ) throws IOException;
    /**
     * downloads image
     * @param petId  (required)
     * @return File
     */
    @GET("/pet/{petId}/image")
    @ContentBody
    public byte[] downloadImage(
            @PathParam("petId") Long petId
    ) throws IOException;
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (optional
     * @return List&lt;PetDto&gt;
     */
    @GET("/pet/findByStatus")
    @JsonBody
    public List<PetDto> findPetsByStatus(
            @RequestParam("status") Optional<List<String>> status
    ) throws IOException;
    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (optional
     * @return List&lt;PetDto&gt;
     * @deprecated
     */
        @Deprecated
    @GET("/pet/findByTags")
    @JsonBody
    public List<PetDto> findPetsByTags(
            @RequestParam("tags") Optional<List<String>> tags
    ) throws IOException;
    /**
     * Find pet by ID
     * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
     * @param petId ID of pet that needs to be fetched (required)
     * @return PetDto
     */
    @GET("/pet/{petId}")
    @JsonBody
    public PetDto getPetById(
            @PathParam("petId") Long petId
    ) throws IOException;
    /**
     * Update an existing pet
     * @param petDto Pet object that needs to be added to the store (optional)
     */
    @PUT("/pet")
    public void updatePet(
            @JsonBody PetDto petDto
    ) throws IOException;
    /**
     * Updates a pet in the store with form data
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     */
    @POST("/pet/{petId}")
    public void updatePetWithForm(
            @PathParam("petId") String petId,
            @RequestParam("name") Optional<String> name,
            @RequestParam("status") Optional<String> status
    ) throws IOException;
    /**
     * uploads an image
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param _file file to upload (optional)
     */
    @POST("/pet/{petId}/uploadImage")
    public void uploadFile(
            @PathParam("petId") Long petId,
            @RequestParam("additionalMetadata") Optional<String> additionalMetadata,
            @RequestParam("file") Optional<File> file
    ) throws IOException;
}
