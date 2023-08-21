package com.nano

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated

@Controller("/calculator")
@Validated
class MathController {

    @Get("/greeting")
    fun greeting(): HttpResponse<String> {
        return HttpResponse.ok("Hello world!")
    }

    @Post("/add", produces = [MediaType.APPLICATION_JSON])
    fun add(body:AddRequest): HttpResponse<String> {
        val result = body.first + body.second
        val response = AddResponse(result)
        return HttpResponse.ok(response)
    }

    @Post("/subtract", produces = [MediaType.APPLICATION_JSON])
    fun subtract(body:SubtractRequest): HttpResponse<String> {
        val result = body.first + body.second
        val response = AddResponse(result)
        return HttpResponse.ok(response)
    }
}
