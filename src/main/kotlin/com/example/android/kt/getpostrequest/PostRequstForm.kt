package com.example.android.kt.getpostrequest
//
// /**
//  * @author Chris
//  * @version 1.0.0
//  * @since 2021/02/24
//  */
// // jdk 11
// fun main() {
//
//     val values = mapOf("name" to "John Doe", "occupation" to "gardener")
//
//     val client = HttpClient.newBuilder().build();
//     val request = HttpRequest.newBuilder()
//         .uri(URI.create("https://httpbin.org/post"))
//         .POST(formData(values))
//         .header("Content-Type", "application/x-www-form-urlencoded")
//         .build()
//     val response = client.send(request, HttpResponse.BodyHandlers.ofString());
//     println(response.body())
// }
//
// fun String.utf8(): String = URLEncoder.encode(this, "UTF-8")
//
// fun formData(data: Map<String, String>): HttpRequest.BodyPublisher? {
//
//     val res = data.map { (k, v) -> "${(k.utf8())}=${v.utf8()}" }
//         .joinToString("&")
//
//     return HttpRequest.BodyPublishers.ofString(res)
// }