package com.example.android.kt.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

/**
 * @author Chris
 * @date 2021/06/18
 * @since 1.0.0
 */
class TestHelloWorldByCorountines {
}

suspend fun loadConfigurationAndData() {
    coroutineScope {
        launch { loadConfiguration() }
        launch { loadData() }
    }
}

fun loadData() {
    println("loadData")
}

fun loadConfiguration() {
    // network request
    val config = fetchConfigFromServer()
    updateConfiguration(config)
}

fun updateConfiguration(config: String) {
    println("updateConfiguration $config")
    TimeUnit.SECONDS.sleep(3L)
}

fun fetchConfigFromServer(): String {
    println("fetchConfigFromServer")
    TimeUnit.SECONDS.sleep(5L)
    return "config from server"
}

fun main() {
    // GlobalScope.launch {
    //     delay(1000L)
    //     println("hello world")
    // }

    GlobalScope.launch {
        loadConfiguration()
    }

    // loadConfigurationAndData()

    TimeUnit.SECONDS.sleep(10L)

}