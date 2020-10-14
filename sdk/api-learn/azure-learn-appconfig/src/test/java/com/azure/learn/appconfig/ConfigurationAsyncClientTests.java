// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.appconfig;

import com.azure.core.http.HttpClient;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigurationAsyncClientTests extends ConfigurationClientTestBase {
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";
    private ConfigurationAsyncClient client;

    private void initializeClient(HttpClient httpClient) {
        client = new ConfigurationClientBuilder()
            .pipeline(getHttpPipeline(httpClient))
            .endpoint(getEndpoint())
            .buildAsyncClient();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void getConfiguration(HttpClient httpClient) {
        // arrange
        initializeClient(httpClient);

        // act
        StepVerifier.create(client.getConfigurationSetting("FontColor"))
            .assertNext(actual -> {
                // assert
                assertEquals("FontColor", actual.getKey());
                assertEquals("Green", actual.getValue());
            })
            .verifyComplete();

        // act
        StepVerifier.create(client.getConfigurationSetting("GreetingText"))
            .assertNext(actual -> {
                // assert
                assertEquals("GreetingText", actual.getKey());
                assertEquals("Hello World!", actual.getValue());
            })
            .verifyComplete();
    }
}