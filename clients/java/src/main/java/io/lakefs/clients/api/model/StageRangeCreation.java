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
 * StageRangeCreation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StageRangeCreation {
  public static final String SERIALIZED_NAME_FROM_SOURCE_U_R_I = "fromSourceURI";
  @SerializedName(SERIALIZED_NAME_FROM_SOURCE_U_R_I)
  private String fromSourceURI;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_PREPEND = "prepend";
  @SerializedName(SERIALIZED_NAME_PREPEND)
  private String prepend;

  public static final String SERIALIZED_NAME_CONTINUATION_TOKEN = "continuation_token";
  @SerializedName(SERIALIZED_NAME_CONTINUATION_TOKEN)
  private String continuationToken;

  public StageRangeCreation() {
  }

  public StageRangeCreation fromSourceURI(String fromSourceURI) {
    
    this.fromSourceURI = fromSourceURI;
    return this;
  }

   /**
   * The source location of the ingested files. Must match the lakeFS installation blockstore type.
   * @return fromSourceURI
  **/
  @javax.annotation.Nonnull

  public String getFromSourceURI() {
    return fromSourceURI;
  }


  public void setFromSourceURI(String fromSourceURI) {
    this.fromSourceURI = fromSourceURI;
  }


  public StageRangeCreation after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * Only objects after this key would be ingested.
   * @return after
  **/
  @javax.annotation.Nonnull

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public StageRangeCreation prepend(String prepend) {
    
    this.prepend = prepend;
    return this;
  }

   /**
   * A prefix to prepend to ingested objects.
   * @return prepend
  **/
  @javax.annotation.Nonnull

  public String getPrepend() {
    return prepend;
  }


  public void setPrepend(String prepend) {
    this.prepend = prepend;
  }


  public StageRangeCreation continuationToken(String continuationToken) {
    
    this.continuationToken = continuationToken;
    return this;
  }

   /**
   * Opaque. Client should pass the continuation_token received from server to continue creation ranges from the same key.
   * @return continuationToken
  **/
  @javax.annotation.Nullable

  public String getContinuationToken() {
    return continuationToken;
  }


  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StageRangeCreation stageRangeCreation = (StageRangeCreation) o;
    return Objects.equals(this.fromSourceURI, stageRangeCreation.fromSourceURI) &&
        Objects.equals(this.after, stageRangeCreation.after) &&
        Objects.equals(this.prepend, stageRangeCreation.prepend) &&
        Objects.equals(this.continuationToken, stageRangeCreation.continuationToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromSourceURI, after, prepend, continuationToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StageRangeCreation {\n");
    sb.append("    fromSourceURI: ").append(toIndentedString(fromSourceURI)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    prepend: ").append(toIndentedString(prepend)).append("\n");
    sb.append("    continuationToken: ").append(toIndentedString(continuationToken)).append("\n");
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
    openapiFields.add("fromSourceURI");
    openapiFields.add("after");
    openapiFields.add("prepend");
    openapiFields.add("continuation_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fromSourceURI");
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("prepend");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StageRangeCreation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StageRangeCreation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StageRangeCreation is not found in the empty JSON string", StageRangeCreation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StageRangeCreation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StageRangeCreation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StageRangeCreation.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("fromSourceURI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromSourceURI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromSourceURI").toString()));
      }
      if (!jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      if (!jsonObj.get("prepend").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prepend` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prepend").toString()));
      }
      if ((jsonObj.get("continuation_token") != null && !jsonObj.get("continuation_token").isJsonNull()) && !jsonObj.get("continuation_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `continuation_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("continuation_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StageRangeCreation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StageRangeCreation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StageRangeCreation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StageRangeCreation.class));

       return (TypeAdapter<T>) new TypeAdapter<StageRangeCreation>() {
           @Override
           public void write(JsonWriter out, StageRangeCreation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StageRangeCreation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StageRangeCreation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StageRangeCreation
  * @throws IOException if the JSON string is invalid with respect to StageRangeCreation
  */
  public static StageRangeCreation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StageRangeCreation.class);
  }

 /**
  * Convert an instance of StageRangeCreation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

