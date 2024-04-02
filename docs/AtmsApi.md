# AtmsApi

All URIs are relative to *https://api.mastercard.com/locations/atms*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAtms**](AtmsApi.md#getAtms) | **POST** /searches | Get a list of ATM details


<a name="getAtms"></a>
# **getAtms**
> Atms getAtms(atmSearch, limit, offset, distance, distanceUnit)

Get a list of ATM details

Returns detailed information on ATMs based on the provided query parameters

### Example
```java
// Import classes:
import com.mastercard.api.atms.ApiClient;
import com.mastercard.api.atms.ApiException;
import com.mastercard.api.atms.Configuration;
import com.mastercard.api.atms.models.*;
import com.mastercard.api.atms.client.AtmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mastercard.com/locations/atms");

    AtmsApi apiInstance = new AtmsApi(defaultClient);
    AtmSearch atmSearch = new AtmSearch(); // AtmSearch | A JSON object containing item data
    Integer limit = 25; // Integer | The number of items to be retrieved
    Integer offset = 1; // Integer | The page offset used for the query
    Integer distance = 5; // Integer | Distance measurement for calculating the radius search. Optional The length of distance from the centroid point. Value string(<25). The default will be 5 units
    String distanceUnit = "MILE"; // String | Unit of measurement for calculating the radius search. Optional. Measurement of distance unit in miles or kilometers. Value string (MILE or KM)
    try {
      Atms result = apiInstance.getAtms(atmSearch, limit, offset, distance, distanceUnit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AtmsApi#getAtms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **atmSearch** | [**AtmSearch**](AtmSearch.md)| A JSON object containing item data |
 **limit** | **Integer**| The number of items to be retrieved | [optional]
 **offset** | **Integer**| The page offset used for the query | [optional]
 **distance** | **Integer**| Distance measurement for calculating the radius search. Optional The length of distance from the centroid point. Value string(&lt;25). The default will be 5 units | [optional]
 **distanceUnit** | **String**| Unit of measurement for calculating the radius search. Optional. Measurement of distance unit in miles or kilometers. Value string (MILE or KM) | [optional] [enum: MILE, KM]

### Return type

[**Atms**](Atms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of ATM details |  -  |
**400** | Something was wrong with the request. |  -  |
**401** | Authentication information was missing or invalid. |  -  |
**403** | Insufficient permissions for interacting with the resource. |  -  |

