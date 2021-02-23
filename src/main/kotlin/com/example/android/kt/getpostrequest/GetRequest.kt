package com.example.android.kt.getpostrequest
//
// /**
//  * @author Chris
//  * @version 1.0.0
//  * @since 2021/02/24
//  */
// import java.net.URI
// import java.net.http.HttpClient
// import java.net.http.HttpRequest
// import java.net.http.HttpResponse
// // 需要 jdk 11
// fun main() {
//     val client = HttpClient.newBuilder().build();
//     val request = HttpRequest.newBuilder()
//         .uri(URI.create("http://webcode.me"))
//         .build();
//     val response = client.send(request, HttpResponse.BodyHandlers.ofString());
//     println(response.body())
// }