package com.practice.coursera.modules.week3

import com.sun.istack.internal.NotNull
import com.sun.istack.internal.Nullable

class OptionalVsNullable<T>(private val value: T) {

    fun isPresent() = value!=null

    fun get() = value ?:
            throw NoSuchElementException("No value present")

    // Optional type is a wrapper which stores reference to
    // the initial object. For each optional value an extra object is created
    // on the contrary nullable type dont create any wrapper
    // they are implemented using annotations


    fun foo(): String = "foo"
    fun bar(): String? = "bar"

        // under the hood implementation //
            /*
            @NotNull
            public static final String foo() {
                return "foo";
            }

            @Nullable
            public static final String bar() {
                return "bar";
            }
        */
}


