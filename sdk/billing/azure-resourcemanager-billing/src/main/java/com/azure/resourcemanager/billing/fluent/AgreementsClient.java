// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.AgreementInner;

/** An instance of this class provides access to all the operations defined in AgreementsClient. */
public interface AgreementsClient {
    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgreementInner> listByBillingAccount(String billingAccountName);

    /**
     * Lists the agreements for a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing agreements.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AgreementInner> listByBillingAccount(String billingAccountName, String expand, Context context);

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AgreementInner get(String billingAccountName, String agreementName);

    /**
     * Gets an agreement by ID.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param agreementName The ID that uniquely identifies an agreement.
     * @param expand May be used to expand the participants.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an agreement by ID.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AgreementInner> getWithResponse(
        String billingAccountName, String agreementName, String expand, Context context);
}
