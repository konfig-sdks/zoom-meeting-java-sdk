/*
 * Zoom Meeting API
 * The Zoom Meeting APIs let developers to access information from Zoom. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.PacListAccountsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PacApi
 */
@Disabled
public class PacApiTest {

    private static PacApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PacApi(apiClient);
    }

    /**
     * List a user&#39;s PAC accounts
     *
     * Retrieve a list of a user&#39;s [personal audio conference (PAC)](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) accounts. For user-level apps, pass [the &#x60;me&#x60; value](https://developers.zoom.us/docs/api/rest/using-zoom-apis/#the-me-keyword) instead of the &#x60;userId&#x60; parameter.    PAC allows Pro or higher account holders to host meetings through PSTN (phone dial-in) only.    **Prerequisites**  * A Pro or higher plan with an [Audio Conferencing](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference) subscription.  * The [**Personal Audio Conference**](https://support.zoom.us/hc/en-us/articles/204517069-Getting-Started-with-Personal-Audio-Conference#h_01F5BPM447M6QDJXX50RSFXKJ3) setting enabled in the user&#39;s profile.  **Scopes:** &#x60;pac:read:admin&#x60;,&#x60;pac:read&#x60;  **[Rate Limit Label](https://marketplace.zoom.us/docs/api-reference/rate-limits#rate-limits):** &#x60;Light&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAccountsTest() throws ApiException {
        String userId = null;
        PacListAccountsResponse response = api.listAccounts(userId)
                .execute();
        // TODO: test validations
    }

}
