package com.mastercard.locations.atms;

import org.openapitools.client.model.AtmSearch;
import org.openapitools.client.model.Atms;
import org.openapitools.client.model.Countries;
import org.openapitools.client.model.CountrySubdivisions;

public class Main {

    private static ApiService apiService;

    public static void main(String[] args) throws Exception {

        if (apiService == null) {
            apiService = new ApiService();
        }

        // Get Atms by latitude and longitude
        AtmSearch atmSearch = new AtmSearch();
        atmSearch.setLatitude("38.794676");
        atmSearch.setLongitude("-90.5689");
        Atms atms = apiService.getAtms(atmSearch, 25, 0, 5, "MILE");
        System.out.println(atms.toString());

        // Get Atms by address
        AtmSearch atmSearchByAddress = new AtmSearch();
        atmSearchByAddress.setAddressLine1("4105 N CLOVERLEAF DR");
        atmSearchByAddress.setCity("SAINT PETERS");
        atmSearchByAddress.setCountryCode("USA");
        atmSearchByAddress.setPostalCode("63376");
        Atms atmsbyAddress = apiService.getAtms(atmSearchByAddress, 25, 0, 5, "MILE");
        System.out.println(atmsbyAddress.toString());

        // Get Countries
        Countries countries = apiService.getCountries();
        System.out.println(countries.toString());

        // Get Country Subdivisions
        CountrySubdivisions countrySubdivisions = apiService.getCountrySubdivisions("USA");
        System.out.println(countrySubdivisions.toString());
    }

}
