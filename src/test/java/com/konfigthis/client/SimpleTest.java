package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.zoom.us/v2";
        
        configuration.openapiAuthorization  = "YOUR API KEY";
        
        // Configure OAuth2 access token for authorization: openapi_oauth
        configuration.accessToken = "YOUR ACCESS TOKEN";
        ZoomMeeting client = new ZoomMeeting(configuration);
        assertNotNull(client);
    }
}
