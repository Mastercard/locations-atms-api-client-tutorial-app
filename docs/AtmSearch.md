

# AtmSearch

Atm Search Request Info

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressLine1** | **String** | Line 1 of the street address for the ATM location. Usually includes the street number and name. This parameter is ignored if latitude and longitude are provided. If you provide this parameter you must also provide the Country parameter and either City parameter or PostalCode parameter. |  [optional]
**addressLine2** | **String** | Line 2 of the street address usually an apartment number or suite number. This parameter is used rarely and is ignored if latitude and longitude are provided. If you provide this parameter you must also provide the Country parameter and either City parameter or PostalCode parameter. |  [optional]
**city** | **String** | The name of the city for a ATM location. This parameter is ignored if latitude and longitude are provided. If you provide this parameter you must also provide the Country parameter. |  [optional]
**countryCode** | **String** | Any three character country code for an ATM location. Valid values are three digit alpha country codes. This parameter is ignored if latitude and longitude are provided. This parameter is required if any other address information is provided including AddressLine1 AddressLine2 City PostalCode or CountrySubdivision. |  [optional]
**countrySubdivisionCode** | **String** | The state or province for an ATM location (only supported for US and Canada locations). This parameter is ignored if latitude and longitude are provided. If you provide this parameter you must also provide the Country parameter. |  [optional]
**latitude** | **String** | The latitude of a ATM location. If latitude is provided longitude must also be provided. |  [optional]
**longitude** | **String** | The longitude of a ATM location. If longitude is provided latitude must also be provided. |  [optional]
**postalCode** | **String** | The zip code or postal code for an ATM location. This parameter is ignored if latitude and longitude are provided. If you provide this parameter you must also provide the Country parameter. |  [optional]



