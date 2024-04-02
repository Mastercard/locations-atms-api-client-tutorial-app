/*
 * ATM Locations API
 * ATM Locations API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.api.atms.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Available information the Country Subdivision such as the name and code
 */
@ApiModel(description = "Available information the Country Subdivision such as the name and code")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-02T08:45:21.825725200-05:00[America/Chicago]")
public class CountrySubdivision {
  public static final String SERIALIZED_NAME_COUNTRY_SUBDIVISION_CODE = "countrySubdivisionCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_SUBDIVISION_CODE)
  private String countrySubdivisionCode;

  public static final String SERIALIZED_NAME_COUNTRY_SUBDIVISION_NAME = "countrySubdivisionName";
  @SerializedName(SERIALIZED_NAME_COUNTRY_SUBDIVISION_NAME)
  private String countrySubdivisionName;


  public CountrySubdivision countrySubdivisionCode(String countrySubdivisionCode) {
    
    this.countrySubdivisionCode = countrySubdivisionCode;
    return this;
  }

   /**
   * Abbreviated code for the state or province
   * @return countrySubdivisionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AL", value = "Abbreviated code for the state or province")

  public String getCountrySubdivisionCode() {
    return countrySubdivisionCode;
  }


  public void setCountrySubdivisionCode(String countrySubdivisionCode) {
    this.countrySubdivisionCode = countrySubdivisionCode;
  }


  public CountrySubdivision countrySubdivisionName(String countrySubdivisionName) {
    
    this.countrySubdivisionName = countrySubdivisionName;
    return this;
  }

   /**
   * Name of the country subdivision
   * @return countrySubdivisionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Alabama", value = "Name of the country subdivision")

  public String getCountrySubdivisionName() {
    return countrySubdivisionName;
  }


  public void setCountrySubdivisionName(String countrySubdivisionName) {
    this.countrySubdivisionName = countrySubdivisionName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountrySubdivision countrySubdivision = (CountrySubdivision) o;
    return Objects.equals(this.countrySubdivisionCode, countrySubdivision.countrySubdivisionCode) &&
        Objects.equals(this.countrySubdivisionName, countrySubdivision.countrySubdivisionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countrySubdivisionCode, countrySubdivisionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountrySubdivision {\n");
    sb.append("    countrySubdivisionCode: ").append(toIndentedString(countrySubdivisionCode)).append("\n");
    sb.append("    countrySubdivisionName: ").append(toIndentedString(countrySubdivisionName)).append("\n");
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

}

