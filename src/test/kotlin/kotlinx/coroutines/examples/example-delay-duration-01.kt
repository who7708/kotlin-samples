@file:OptIn(ExperimentalTime::class)
/*
 * Copyright 2016-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

// This file was automatically generated from Delay.kt by Knit tool. Do not edit.
package kotlinx.coroutines.examples.exampleDelayDuration01

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

fun main() = runBlocking {

    flow {
        emit(1)
        delay(Duration.milliseconds(90))
        emit(2)
        delay(Duration.milliseconds(90))
        emit(3)
        delay(Duration.milliseconds(1010))
        emit(4)
        delay(Duration.milliseconds(1010))
        emit(5)
    }.debounce(Duration.milliseconds(1000))
        .toList().joinToString().let { println(it) }
}
