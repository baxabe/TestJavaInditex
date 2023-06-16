# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByRange**](DefaultApi.md#getByRange) | **GET** /price |  |
| [**getByRangeWithHttpInfo**](DefaultApi.md#getByRangeWithHttpInfo) | **GET** /price |  |



## getByRange

> Price getByRange(date, prodId, brandId)



Get actual price in a data range

### Example

```java
// Import classes:
import com.baxabe.inditex.ApiClient;
import com.baxabe.inditex.ApiException;
import com.baxabe.inditex.Configuration;
import com.baxabe.inditex.models.*;
import com.baxabe.inditex.controller.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

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

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **String**| Date to find price | |
| **prodId** | **Long**| Product Id to search | |
| **brandId** | **Long**| Brand Id to search | |

### Return type

[**Price**](Price.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | price response |  -  |
| **0** | unexpected error |  -  |

## getByRangeWithHttpInfo

> ApiResponse<Price> getByRange getByRangeWithHttpInfo(date, prodId, brandId)



Get actual price in a data range

### Example

```java
// Import classes:
import com.baxabe.inditex.ApiClient;
import com.baxabe.inditex.ApiException;
import com.baxabe.inditex.ApiResponse;
import com.baxabe.inditex.Configuration;
import com.baxabe.inditex.models.*;
import com.baxabe.inditex.controller.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String date = "date_example"; // String | Date to find price
        Long prodId = 56L; // Long | Product Id to search
        Long brandId = 56L; // Long | Brand Id to search
        try {
            ApiResponse<Price> response = apiInstance.getByRangeWithHttpInfo(date, prodId, brandId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getByRange");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **date** | **String**| Date to find price | |
| **prodId** | **Long**| Product Id to search | |
| **brandId** | **Long**| Brand Id to search | |

### Return type

ApiResponse<[**Price**](Price.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | price response |  -  |
| **0** | unexpected error |  -  |

