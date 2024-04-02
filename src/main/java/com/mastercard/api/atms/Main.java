package com.mastercard.api.atms;

import com.mastercard.api.atms.client.AtmsApi;
import com.mastercard.api.atms.client.CountriesApi;
import com.mastercard.api.atms.model.AtmSearch;
import com.mastercard.api.atms.model.Atms;
import com.mastercard.api.atms.model.Countries;
import com.mastercard.api.atms.model.CountrySubdivisions;
import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;

import java.security.PrivateKey;

public class Main {

  private static final String BASE_URL = "https://sandbox.api.mastercard.com/locations/atms";
  private static final String CONSUMER_KEY = "yourconsumerkeystring";
  private static final String PKCS_12_KEY_FILE_PATH = "./path/to/your/signing-key.p12";
  private static final String SIGNIN_KEY_ALIAS = "yourkeyalias";
  private static final String SIGNIN_KEY_PASSWORD = "yourpassword";

  public static void main(String[] args) throws Exception  {

    try {

      PrivateKey signingKey = AuthenticationUtils.loadSigningKey(PKCS_12_KEY_FILE_PATH, SIGNIN_KEY_ALIAS, SIGNIN_KEY_PASSWORD);

      ApiClient client = new ApiClient();
      client.setBasePath(BASE_URL);
      client.setConnectTimeout(60);
      client.setDebugging(false);
      client.setHttpClient(client
        .getHttpClient()
        .newBuilder()
        .addInterceptor(new OkHttpOAuth1Interceptor(CONSUMER_KEY, signingKey))
        .build()
      );

      AtmsApi apiInstance = new AtmsApi(client);

      System.out.println("-------------------------------------------------------------- " );
      System.out.println("Test #1 : Searching for ATMs at Latitude:38.79516  Longitude:-90.575499 " );
      AtmSearch atmSearch = new AtmSearch();
      atmSearch.setLatitude("38.79516");
      atmSearch.setLongitude("-90.575499");
      Atms response = apiInstance.getAtms(atmSearch, 1, 0, 5, "MILE");
      System.out.println("Test #1 : Result structure: ");
      System.out.println(response);

      System.out.println("-------------------------------------------------------------- " );
      System.out.println("Test #2 : Get Countries " );
      CountriesApi apiCountriesInstance = new CountriesApi(client);
      Countries countriesResponse = apiCountriesInstance.getCountries();
      System.out.println("Test #2 : Result structure: ");
      System.out.println(countriesResponse);

      System.out.println("-------------------------------------------------------------- " );
      System.out.println("Test #3 : Get Country Subdivisions " );
      CountrySubdivisions countrySubdivisions = apiCountriesInstance.getCountrySubdivisions("USA");
      System.out.println("Test #3 : Result structure: ");
      System.out.println(countrySubdivisions);


    } catch (ApiException e) {
      System.err.println("Exception when calling Apis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }

}
