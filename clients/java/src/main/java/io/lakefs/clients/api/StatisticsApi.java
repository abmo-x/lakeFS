/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.api;

import io.lakefs.clients.api.ApiCallback;
import io.lakefs.clients.api.ApiClient;
import io.lakefs.clients.api.ApiException;
import io.lakefs.clients.api.ApiResponse;
import io.lakefs.clients.api.Configuration;
import io.lakefs.clients.api.Pair;
import io.lakefs.clients.api.ProgressRequestBody;
import io.lakefs.clients.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.lakefs.clients.api.model.Error;
import io.lakefs.clients.api.model.StatsEventsList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class StatisticsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StatisticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatisticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for postStatsEvents
     * @param statsEventsList  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> reported successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postStatsEventsCall(StatsEventsList statsEventsList, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = statsEventsList;

        // create path and map variables
        String localVarPath = "/statistics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "oidc_auth", "saml_auth", "jwt_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postStatsEventsValidateBeforeCall(StatsEventsList statsEventsList, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'statsEventsList' is set
        if (statsEventsList == null) {
            throw new ApiException("Missing the required parameter 'statsEventsList' when calling postStatsEvents(Async)");
        }

        return postStatsEventsCall(statsEventsList, _callback);

    }

    /**
     * post stats events, this endpoint is meant for internal use only
     * 
     * @param statsEventsList  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> reported successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void postStatsEvents(StatsEventsList statsEventsList) throws ApiException {
        postStatsEventsWithHttpInfo(statsEventsList);
    }

    /**
     * post stats events, this endpoint is meant for internal use only
     * 
     * @param statsEventsList  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> reported successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> postStatsEventsWithHttpInfo(StatsEventsList statsEventsList) throws ApiException {
        okhttp3.Call localVarCall = postStatsEventsValidateBeforeCall(statsEventsList, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * post stats events, this endpoint is meant for internal use only (asynchronously)
     * 
     * @param statsEventsList  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> reported successfully </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> bad request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postStatsEventsAsync(StatsEventsList statsEventsList, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = postStatsEventsValidateBeforeCall(statsEventsList, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
