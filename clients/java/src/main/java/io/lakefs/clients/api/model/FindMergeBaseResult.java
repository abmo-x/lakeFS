/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.lakefs.clients.api.JSON;

/**
 * FindMergeBaseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FindMergeBaseResult {
  public static final String SERIALIZED_NAME_SOURCE_COMMIT_ID = "source_commit_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_COMMIT_ID)
  private String sourceCommitId;

  public static final String SERIALIZED_NAME_DESTINATION_COMMIT_ID = "destination_commit_id";
  @SerializedName(SERIALIZED_NAME_DESTINATION_COMMIT_ID)
  private String destinationCommitId;

  public static final String SERIALIZED_NAME_BASE_COMMIT_ID = "base_commit_id";
  @SerializedName(SERIALIZED_NAME_BASE_COMMIT_ID)
  private String baseCommitId;

  public FindMergeBaseResult() {
  }

  public FindMergeBaseResult sourceCommitId(String sourceCommitId) {
    
    this.sourceCommitId = sourceCommitId;
    return this;
  }

   /**
   * The commit ID of the merge source
   * @return sourceCommitId
  **/
  @javax.annotation.Nonnull

  public String getSourceCommitId() {
    return sourceCommitId;
  }


  public void setSourceCommitId(String sourceCommitId) {
    this.sourceCommitId = sourceCommitId;
  }


  public FindMergeBaseResult destinationCommitId(String destinationCommitId) {
    
    this.destinationCommitId = destinationCommitId;
    return this;
  }

   /**
   * The commit ID of the merge destination
   * @return destinationCommitId
  **/
  @javax.annotation.Nonnull

  public String getDestinationCommitId() {
    return destinationCommitId;
  }


  public void setDestinationCommitId(String destinationCommitId) {
    this.destinationCommitId = destinationCommitId;
  }


  public FindMergeBaseResult baseCommitId(String baseCommitId) {
    
    this.baseCommitId = baseCommitId;
    return this;
  }

   /**
   * The commit ID of the merge base
   * @return baseCommitId
  **/
  @javax.annotation.Nonnull

  public String getBaseCommitId() {
    return baseCommitId;
  }


  public void setBaseCommitId(String baseCommitId) {
    this.baseCommitId = baseCommitId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindMergeBaseResult findMergeBaseResult = (FindMergeBaseResult) o;
    return Objects.equals(this.sourceCommitId, findMergeBaseResult.sourceCommitId) &&
        Objects.equals(this.destinationCommitId, findMergeBaseResult.destinationCommitId) &&
        Objects.equals(this.baseCommitId, findMergeBaseResult.baseCommitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCommitId, destinationCommitId, baseCommitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindMergeBaseResult {\n");
    sb.append("    sourceCommitId: ").append(toIndentedString(sourceCommitId)).append("\n");
    sb.append("    destinationCommitId: ").append(toIndentedString(destinationCommitId)).append("\n");
    sb.append("    baseCommitId: ").append(toIndentedString(baseCommitId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("source_commit_id");
    openapiFields.add("destination_commit_id");
    openapiFields.add("base_commit_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("source_commit_id");
    openapiRequiredFields.add("destination_commit_id");
    openapiRequiredFields.add("base_commit_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FindMergeBaseResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FindMergeBaseResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FindMergeBaseResult is not found in the empty JSON string", FindMergeBaseResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FindMergeBaseResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FindMergeBaseResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FindMergeBaseResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("source_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_commit_id").toString()));
      }
      if (!jsonObj.get("destination_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination_commit_id").toString()));
      }
      if (!jsonObj.get("base_commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_commit_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FindMergeBaseResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FindMergeBaseResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FindMergeBaseResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FindMergeBaseResult.class));

       return (TypeAdapter<T>) new TypeAdapter<FindMergeBaseResult>() {
           @Override
           public void write(JsonWriter out, FindMergeBaseResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FindMergeBaseResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FindMergeBaseResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FindMergeBaseResult
  * @throws IOException if the JSON string is invalid with respect to FindMergeBaseResult
  */
  public static FindMergeBaseResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FindMergeBaseResult.class);
  }

 /**
  * Convert an instance of FindMergeBaseResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

