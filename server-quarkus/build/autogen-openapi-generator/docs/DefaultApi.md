# DefaultApi

All URIs are relative to *https://test.example.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sayHello**](DefaultApi.md#sayHello) | **GET** /hello | Get a hello message



## sayHello

> String sayHello(requestId)

Get a hello message

says hello

### Example

```java
// Import classes:
import example.rest.invoker.ApiClient;
import example.rest.invoker.ApiException;
import example.rest.invoker.Configuration;
import example.rest.invoker.models.*;
import punyautogen.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://test.example.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        RequestTraceHeader requestId = new HashMap(); // RequestTraceHeader | 
        try {
            String result = apiInstance.sayHello(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#sayHello");
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
 **requestId** | [**RequestTraceHeader**](.md)|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Hello Guy, it says |  -  |

