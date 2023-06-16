# TestJava-Inditex

Java Test

- API version: 1.0.0

- Build date: 2023-06-16T12:42:05.742187229+02:00[Europe/Madrid]

API-REST End point to get price by data range


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.baxabe.inditex</groupId>
  <artifactId>TestJava-Inditex</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.baxabe.inditex:TestJava-Inditex:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/TestJava-Inditex-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.baxabe.inditex.*;
import com.baxabe.inditex.controller.model.*;
import com.baxabe.inditex.controller.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String date = "date_example"; // String | Date to find price
        Long prodId = 56L; // Long | Product Id to search
        Long brandId = 56L; // Long | Brand Id to search
        try {
            Price result = apiInstance.getByRange(date, prodId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getByRange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getByRange**](docs/DefaultApi.md#getByRange) | **GET** /price | 
*DefaultApi* | [**getByRangeWithHttpInfo**](docs/DefaultApi.md#getByRangeWithHttpInfo) | **GET** /price | 


## Documentation for Models

 - [Error](docs/Error.md)
 - [Price](docs/Price.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author


