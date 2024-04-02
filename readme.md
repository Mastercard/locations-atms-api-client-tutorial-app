# ATM Locations API Client
[![](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/Mastercard/loyalty-user-management-reference/blob/master/LICENSE)

## Table of Contents

- [Overview](#overview)
  * [Compatibility](#compatibility)
  * [References](#references)
  * [Tutorial](#tutorial)
  * [Frameworks](#frameworks)
- [Setup](#setup)
  * [Prerequisites](#prerequisites)
  * [Application Configuration](#configuration)
  * [Build and Execute](#build-and-execute)
  * [Reference Application Usage](#client-application-usage)
  * [Integrating with OpenAPI Generator](#integrating-with-openapi-generator)
- [Documentation for API Endpoints](#documentation-for-api-endpoints)
  * [Parameters](#parameters)
  * [Countries](#countries)
  * [ATM Search](#atms)
- [API Reference](#api-reference)
- [Authentication](#authentication)
  * [Mastercard's OAuth Library](#oauth-library)
- [Glossary](#glossary)
- [Support](#support)
- [License](#license)

## Overview <a name="overview"/>
This project showcases the use case of retrieving atm locations and related information using the Atm Locations API [here](https://developer.mastercard.com/locations/documentation/)

### Compatibility <a name="compatibility"></a>
* [Java 11](https://www.oracle.com/java/technologies/downloads/#java11) or later

### References <a name="references"></a>
* [Mastercard’s OAuth Signer library](https://github.com/Mastercard/oauth1-signer-java)
* [Using OAuth 1.0a to Access Mastercard APIs](https://developer.mastercard.com/platform/documentation/using-oauth-1a-to-access-mastercard-apis/)

### Tutorial <a name="tutorial"></a>
A tutorial can be found [here](https://developer.mastercard.com/locations/documentation/tutorials-and-guides/tutorial-1/) for setting up and using this service.

## Frameworks <a name="frameworks"></a>
- OpenAPI Generator
- [Java 11+](https://www.oracle.com/java/technologies/downloads/#java11)
- [Maven](https://maven.apache.org/download.cgi)

## Setup <a name="setup"></a>

### Prerequisites <a name="prerequisites"></a>

* [Mastercard Developers Account](https://developer.mastercard.com/dashboard)
* A text editor or IDE
* [Java 11+](https://www.oracle.com/java/technologies/downloads/#java11)
* [Apache Maven 3.3+](https://maven.apache.org/download.cgi)
* Set up the `JAVA_HOME` environment variable to match the location of your Java installation.

### Application Configuration <a name="configuration"> </a>
1. Create an account at [Mastercard Developers](https://developer.mastercard.com).
2. Copy the [Atms Locations API Spec](https://developer.mastercard.com/locations/documentation/api-reference/) (`atms-locations-api-spec.yaml`) to `/src/main/resources`.
3. Create a new project and add the `ATM Locations` API to your project.
4. Take note of the given **consumer key, keyalias, and keystore password** given upon the project creation.
5. Copy the downloaded `.p12` file to `/src/main/resources`.
6. Update the properties found in `src/main/java/com/mastercard/api/atms/Main.java`.

```java
    private static final String BASE_URL = "https://sandbox.api.mastercard.com/locations/atms";

    //Below properties will be required for authentication of API calls.
    private static final String CONSUMER_KEY = "Your consumer key"; // This refers to your consumer key. Copy it from "Keys" section on your project page in [Mastercard Developers](https://developer.mastercard.com/dashboard)
    private static final String SIGNING_KEY_ALIAS = "your key alias"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
    private static final String SIGNING_KEY_FILE_PATH = "path to your.p12 private key file"; // This refers to .p12 file found in the signing key. Please place .p12 file at src\main\resources in the project folder and add classpath for .p12 file.
    private static final String SIGNING_KEY_PASSWORD = "your password"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).



```

7. run `mvn compile exec:java` to run the project.



## Documentation for API Endpoints

All URIs are relative to *https://api.mastercard.com/locations/atms*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AtmsApi* | [**getAtms**](docs/AtmsApi.md#getAtms) | **POST** /searches | Get a list of ATM details
*CountriesApi* | [**getCountries**](docs/CountriesApi.md#getCountries) | **GET** /countries | Get a list of countries
*CountriesApi* | [**getCountrySubdivisions**](docs/CountriesApi.md#getCountrySubdivisions) | **GET** /country-subdivisions | Get a list of country subdivisions


## Documentation for Models

- [Atm](docs/Atm.md)
- [AtmSearch](docs/AtmSearch.md)
- [Atms](docs/Atms.md)
- [Countries](docs/Countries.md)
- [Country](docs/Country.md)
- [CountrySubdivision](docs/CountrySubdivision.md)
- [CountrySubdivisions](docs/CountrySubdivisions.md)
- [Error](docs/Error.md)
- [ErrorResponse](docs/ErrorResponse.md)
- [Errors](docs/Errors.md)


## Support <a name="support"></a>
If you would like further information, please send an email to apisupport@mastercard.com

## License <a name="license"></a>
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.

## License
[Apache 2 License](https://apache.org/licenses/LICENSE-2.0)

**Copyright © 1994-2020, All Right Reserved by Mastercard.**