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
 * Repository
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Repository {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private Long creationDate;

  public static final String SERIALIZED_NAME_DEFAULT_BRANCH = "default_branch";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BRANCH)
  private String defaultBranch;

  public static final String SERIALIZED_NAME_STORAGE_NAMESPACE = "storage_namespace";
  @SerializedName(SERIALIZED_NAME_STORAGE_NAMESPACE)
  private String storageNamespace;

  public Repository() {
  }

  public Repository id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Repository creationDate(Long creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Unix Epoch in seconds
   * @return creationDate
  **/
  @javax.annotation.Nonnull

  public Long getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }


  public Repository defaultBranch(String defaultBranch) {
    
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * Get defaultBranch
   * @return defaultBranch
  **/
  @javax.annotation.Nonnull

  public String getDefaultBranch() {
    return defaultBranch;
  }


  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }


  public Repository storageNamespace(String storageNamespace) {
    
    this.storageNamespace = storageNamespace;
    return this;
  }

   /**
   * Filesystem URI to store the underlying data in (e.g. \&quot;s3://my-bucket/some/path/\&quot;)
   * @return storageNamespace
  **/
  @javax.annotation.Nonnull

  public String getStorageNamespace() {
    return storageNamespace;
  }


  public void setStorageNamespace(String storageNamespace) {
    this.storageNamespace = storageNamespace;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Repository repository = (Repository) o;
    return Objects.equals(this.id, repository.id) &&
        Objects.equals(this.creationDate, repository.creationDate) &&
        Objects.equals(this.defaultBranch, repository.defaultBranch) &&
        Objects.equals(this.storageNamespace, repository.storageNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creationDate, defaultBranch, storageNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Repository {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    storageNamespace: ").append(toIndentedString(storageNamespace)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("creation_date");
    openapiFields.add("default_branch");
    openapiFields.add("storage_namespace");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("creation_date");
    openapiRequiredFields.add("default_branch");
    openapiRequiredFields.add("storage_namespace");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Repository
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Repository.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Repository is not found in the empty JSON string", Repository.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Repository.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Repository` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Repository.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("default_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_branch").toString()));
      }
      if (!jsonObj.get("storage_namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storage_namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storage_namespace").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Repository.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Repository' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Repository> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Repository.class));

       return (TypeAdapter<T>) new TypeAdapter<Repository>() {
           @Override
           public void write(JsonWriter out, Repository value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Repository read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Repository given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Repository
  * @throws IOException if the JSON string is invalid with respect to Repository
  */
  public static Repository fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Repository.class);
  }

 /**
  * Convert an instance of Repository to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

