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
import com.mastercard.api.atms.model.Country;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of countries
 */
@ApiModel(description = "List of countries")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-02T08:45:21.825725200-05:00[America/Chicago]")
public class Countries {
  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<Country> countries = null;


  public Countries countries(List<Country> countries) {
    
    this.countries = countries;
    return this;
  }

  public Countries addCountriesItem(Country countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<Country>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * countries
   * @return countries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"countryName\":\"United States\",\"countryCode\":\"USA\"}]", value = "countries")

  public List<Country> getCountries() {
    return countries;
  }


  public void setCountries(List<Country> countries) {
    this.countries = countries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Countries countries = (Countries) o;
    return Objects.equals(this.countries, countries.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Countries {\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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
