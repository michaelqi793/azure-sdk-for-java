// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation;

import com.azure.containers.containerregistry.implementation.models.AccessToken;
import com.azure.containers.containerregistry.implementation.models.PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema;
import com.azure.containers.containerregistry.models.AcrErrorsException;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AccessTokens. */
public final class AccessTokensImpl {
    /** The proxy service used to perform REST calls. */
    private final AccessTokensService service;

    /** The service client containing this operation class. */
    private final ContainerRegistryImpl client;

    /**
     * Initializes an instance of AccessTokensImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    AccessTokensImpl(ContainerRegistryImpl client) {
        this.service =
                RestProxy.create(AccessTokensService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ContainerRegistryAccessTokens to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ContainerRegistryAcc")
    public interface AccessTokensService {
        // @Multipart not supported by RestProxy
        @Post("/oauth2/token")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(AcrErrorsException.class)
        Mono<Response<AccessToken>> get(
                @HostParam("endpoint") String endpoint,
                @BodyParam("application/x-www-form-urlencoded")
                        PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema refreshToken,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/oauth2/token")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(AcrErrorsException.class)
        Mono<Response<AccessToken>> getFromLogin(
                @HostParam("endpoint") String endpoint,
                @QueryParam("service") String service,
                @QueryParam("scope") String scope,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Exchange ACR Refresh token for an ACR Access Token.
     *
     * @param refreshToken The refreshToken parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AccessToken>> getWithResponseAsync(
            PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema refreshToken) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.get(this.client.getEndpoint(), refreshToken, accept, context));
    }

    /**
     * Exchange ACR Refresh token for an ACR Access Token.
     *
     * @param refreshToken The refreshToken parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AccessToken>> getWithResponseAsync(
            PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema refreshToken,
            Context context) {
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), refreshToken, accept, context);
    }

    /**
     * Exchange ACR Refresh token for an ACR Access Token.
     *
     * @param refreshToken The refreshToken parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AccessToken> getAsync(
            PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema refreshToken) {
        return getWithResponseAsync(refreshToken)
                .flatMap(
                        (Response<AccessToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Exchange ACR Refresh token for an ACR Access Token.
     *
     * @param refreshToken The refreshToken parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AccessToken> getAsync(
            PathsV3R3RxOauth2TokenPostRequestbodyContentApplicationXWwwFormUrlencodedSchema refreshToken,
            Context context) {
        return getWithResponseAsync(refreshToken, context)
                .flatMap(
                        (Response<AccessToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Exchange Username, Password and Scope an ACR Access Token.
     *
     * @param serviceParam Indicates the name of your Azure container registry.
     * @param scope Expected to be a valid scope, and can be specified more than once for multiple scope requests. You
     *     can obtain this from the Www-Authenticate response header from the challenge.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AccessToken>> getFromLoginWithResponseAsync(String serviceParam, String scope) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.getFromLogin(this.client.getEndpoint(), serviceParam, scope, accept, context));
    }

    /**
     * Exchange Username, Password and Scope an ACR Access Token.
     *
     * @param serviceParam Indicates the name of your Azure container registry.
     * @param scope Expected to be a valid scope, and can be specified more than once for multiple scope requests. You
     *     can obtain this from the Www-Authenticate response header from the challenge.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AccessToken>> getFromLoginWithResponseAsync(
            String serviceParam, String scope, Context context) {
        final String accept = "application/json";
        return service.getFromLogin(this.client.getEndpoint(), serviceParam, scope, accept, context);
    }

    /**
     * Exchange Username, Password and Scope an ACR Access Token.
     *
     * @param serviceParam Indicates the name of your Azure container registry.
     * @param scope Expected to be a valid scope, and can be specified more than once for multiple scope requests. You
     *     can obtain this from the Www-Authenticate response header from the challenge.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AccessToken> getFromLoginAsync(String serviceParam, String scope) {
        return getFromLoginWithResponseAsync(serviceParam, scope)
                .flatMap(
                        (Response<AccessToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Exchange Username, Password and Scope an ACR Access Token.
     *
     * @param serviceParam Indicates the name of your Azure container registry.
     * @param scope Expected to be a valid scope, and can be specified more than once for multiple scope requests. You
     *     can obtain this from the Www-Authenticate response header from the challenge.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws AcrErrorsException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AccessToken> getFromLoginAsync(String serviceParam, String scope, Context context) {
        return getFromLoginWithResponseAsync(serviceParam, scope, context)
                .flatMap(
                        (Response<AccessToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }
}
