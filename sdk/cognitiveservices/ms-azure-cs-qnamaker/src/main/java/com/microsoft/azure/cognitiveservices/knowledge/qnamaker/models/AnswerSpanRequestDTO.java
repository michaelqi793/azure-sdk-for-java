/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * To configure Answer span prediction feature.
 */
public class AnswerSpanRequestDTO {
    /**
     * Enable or Disable Answer Span prediction.
     */
    @JsonProperty(value = "enable")
    private Boolean enable;

    /**
     * Minimum threshold score required to include an answer span.
     */
    @JsonProperty(value = "scoreThreshold")
    private Double scoreThreshold;

    /**
     * Number of Top answers to be considered for span prediction.
     */
    @JsonProperty(value = "topAnswersWithSpan")
    private Integer topAnswersWithSpan;

    /**
     * Get the enable value.
     *
     * @return the enable value
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable value.
     *
     * @param enable the enable value to set
     * @return the AnswerSpanRequestDTO object itself.
     */
    public AnswerSpanRequestDTO withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get the scoreThreshold value.
     *
     * @return the scoreThreshold value
     */
    public Double scoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * Set the scoreThreshold value.
     *
     * @param scoreThreshold the scoreThreshold value to set
     * @return the AnswerSpanRequestDTO object itself.
     */
    public AnswerSpanRequestDTO withScoreThreshold(Double scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }

    /**
     * Get the topAnswersWithSpan value.
     *
     * @return the topAnswersWithSpan value
     */
    public Integer topAnswersWithSpan() {
        return this.topAnswersWithSpan;
    }

    /**
     * Set the topAnswersWithSpan value.
     *
     * @param topAnswersWithSpan the topAnswersWithSpan value to set
     * @return the AnswerSpanRequestDTO object itself.
     */
    public AnswerSpanRequestDTO withTopAnswersWithSpan(Integer topAnswersWithSpan) {
        this.topAnswersWithSpan = topAnswersWithSpan;
        return this;
    }

}