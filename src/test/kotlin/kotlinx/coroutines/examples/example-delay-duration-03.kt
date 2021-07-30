@file:OptIn(ExperimentalTime::class)
/*
 * Copyright 2016-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

// This file was automatically generated from Delay.kt by Knit tool. Do not edit.
package kotlinx.coroutines.examples.exampleDelayDuration03

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.sample
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration
import kotlin.time.ExperimentalTime

fun main() = runBlocking {

    flow {
        repeat(10) {
            emit(it)
            delay(Duration.milliseconds(110))
        }
    }.sample(Duration.milliseconds(200))
        .toList().joinToString().let { println(it) }
}
