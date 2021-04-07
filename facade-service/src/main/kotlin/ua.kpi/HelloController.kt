package ua.kpi

import io.micronaut.http.HttpRequest.GET
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import kotlinx.coroutines.coroutineScope

@Controller
class HelloController(
    @Client(id = "logging-service")
    private val httpClient: RxHttpClient
) {

    @Get("/hello")
    @Produces(MediaType.TEXT_HTML)
    fun hello() = "Hello World"

    @Get("/hello2")
    @Produces(MediaType.TEXT_HTML)
    suspend fun remoteHello() = coroutineScope {
        httpClient.retrieve(GET<Any>("/hello")).singleElement()
    }
}