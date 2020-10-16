// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util;

import java.util.NoSuchElementException;

/**
 * The Option type to describe tri-state. Every Option instance is in one of
 * the three states: a state representing a non-null-value, null-value, or no-value.
 *
 * <p><strong>Code sample</strong></p>
 * {@codesnippet com.azure.core.util.Option}
 *
 * @param <T> The value type.
 */
public final class Option<T> {
    private static final Option<?> UNINITIALIZED = new Option<>();
    private static final Option<?> EMPTY = new Option<>(null);
    private final boolean isInitialized;
    private final T value;

    /**
     * Returns an {@link Option} with the specified null-value or non-null-value.
     *
     * @param <T> The value type.
     * @param value the value.
     * @return an {@link Option} with the value present.
     */
    public static <T> Option<T> of(T value) {
        return value == null ? empty() : new Option<>(value);
    }

    /**
     * Returns an {@link Option} with null-value.
     * <p>
     * {@code Option.empty()} is a syntactic sugar for {@code Option.of(null)}.
     * </p>
     * @param <T> The value type.
     * @return an {@link Option} with a null-value.
     */
    public static <T> Option<T> empty() {
        @SuppressWarnings("unchecked")
        Option<T> empty = (Option<T>) EMPTY;
        return empty;
    }

    /**
     * Returns an {@link Option} instance with no-value.
     *
     * @param <T> Type of the non-existent value.
     * @return An Option type with no-value.
     */
    public static <T> Option<T> uninitialized() {
        @SuppressWarnings("unchecked")
        Option<T> uninitialized = (Option<T>) UNINITIALIZED;
        return uninitialized;
    }

    /**
     * Return {@code true} if this instance is initialized with a null-value or non-null-value,
     * otherwise {@code false}.
     *
     * @return {@code true} if a value has been initialized, otherwise {@code false}
     */
    public boolean isInitialized() {
        return this.isInitialized;
    }

    /**
     * Gets the value in the {@link Option}.
     *
     * @return The {@code null} (null-value) or non-null-value that the {@link Option}
     *     is initialized with.
     * @throws NoSuchElementException thrown if the {@link Option} is in no-value state.
     */
    public T getValue() {
        if (!this.isInitialized) {
            throw new NoSuchElementException("No value initialized");
        }
        return this.value;
    }

    private Option() {
        this.isInitialized = false;
        this.value = null;
    }

    private Option(T value) {
        this.isInitialized = true;
        this.value = value;
    }
}