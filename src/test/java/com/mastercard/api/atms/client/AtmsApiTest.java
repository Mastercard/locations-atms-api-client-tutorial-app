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


package com.mastercard.api.atms.client;

import com.mastercard.api.atms.ApiClient;
import com.mastercard.api.atms.ApiException;
import com.mastercard.api.atms.model.AtmSearch;
import com.mastercard.api.atms.model.Atms;
import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.security.PrivateKey;

/**
 * API tests for AtmsApi
 */
@Ignore
public class AtmsApiTest {

    private final AtmsApi api = new AtmsApi();
    private static final String BASE_URL = "https://sandbox.api.mastercard.com/locations/atms";
    private static final String CONSUMER_KEY = "yourconsumerkeystring";
    private static final String PKCS_12_KEY_FILE_PATH = "./path/to/your/signing-key.p12";
    private static final String SIGNIN_KEY_ALIAS = "yourkeyalias";
    private static final String SIGNIN_KEY_PASSWORD = "yourpassword";

    private ApiClient client;
    private PrivateKey signingKey;

    @Before
    public void setUp() throws Exception {
        signingKey = AuthenticationUtils.loadSigningKey(PKCS_12_KEY_FILE_PATH, SIGNIN_KEY_ALIAS, SIGNIN_KEY_PASSWORD);

        client = new ApiClient();
        client.setBasePath(BASE_URL);
        client.setConnectTimeout(60);
        client.setDebugging(true);
        client.setHttpClient(client
                .getHttpClient()
                .newBuilder()
                .addInterceptor(new OkHttpOAuth1Interceptor(CONSUMER_KEY, signingKey))
                .build()
        );

        api.setApiClient(client);
    }

    /**
     * Get a list of ATM details
     *
     * Returns detailed information on ATMs based on the provided query parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAtmsTestByGeoCode() throws ApiException {
        AtmSearch atmSearch = new AtmSearch();
        atmSearch.setLatitude("38.79516");
        atmSearch.setLongitude("-90.575499");

        Integer limit = 1;
        Integer offset = 0;
        Integer distance = null;
        String distanceUnit = null;
        Atms response = api.getAtms(atmSearch, limit, offset, distance, distanceUnit);

        Integer expectedOffset =  0;
        Assert.assertEquals(expectedOffset,response.getOffset());
        Assert.assertTrue("0",response.getAtms().size() > 0);
        Assert.assertNotNull(response.getAtms().get(0).getDistance());
        Assert.assertEquals("CAVE SPRINGS",response.getAtms().get(0).getLocationName());
        Assert.assertEquals("4189 VETERANS MEMORIAL PKWY", response.getAtms().get(0).getAddressLine1());
        Assert.assertEquals("63376", response.getAtms().get(0).getPostalCode());
        Assert.assertEquals("38.79516",response.getAtms().get(0).getLatitude());
        Assert.assertEquals("-90.575499",response.getAtms().get(0).getLongitude());

        System.out.println(response.getAtms().get(0).toString());
    }


    /**
     * Get a list of ATM details
     *
     * Returns detailed information on ATMs based on the provided query parameters
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAtmsTestByAddress() throws ApiException {
        AtmSearch atmSearch = new AtmSearch();
        atmSearch.setAddressLine1("1077 CAVE SPRINGS BLVD");
        atmSearch.setCity("SAINT PETERS");
        atmSearch.setPostalCode("63376");
        atmSearch.setCountrySubdivisionCode("MO");
        atmSearch.setCountryCode("USA");

        Integer limit = 1;
        Integer offset = 0;
        Integer distance = null;
        String distanceUnit = null;
        Atms response = api.getAtms(atmSearch, limit, offset, distance, distanceUnit);

        Integer expectedOffset =  0;
        Assert.assertEquals(expectedOffset,response.getOffset());
        Assert.assertTrue("0",response.getAtms().size() > 0);
        Assert.assertNotNull(response.getAtms().get(0).getDistance());
        Assert.assertEquals("VANTAGE CREDIT UNION",response.getAtms().get(0).getLocationName());
        Assert.assertEquals("1077 CAVE SPRINGS BLVD", response.getAtms().get(0).getAddressLine1());
        Assert.assertEquals("63376", response.getAtms().get(0).getPostalCode());
        Assert.assertEquals("38.791373",response.getAtms().get(0).getLatitude());
        Assert.assertEquals("-90.572222",response.getAtms().get(0).getLongitude());

    }
}
