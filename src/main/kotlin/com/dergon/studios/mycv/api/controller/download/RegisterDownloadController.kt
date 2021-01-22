package com.dergon.studios.mycv.api.controller.download

import com.dergon.studios.mycv.api.action.download.RegisterDownload
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/download/register")
@CrossOrigin(origins = ["https://damian-lisas-cv.firebaseapp.com/", "https://damian-lisas-cv.firebaseapp.com", "damian-lisas-cv.firebaseapp.com"])
class RegisterDownloadController(private val registerDownload: RegisterDownload) {

    @PostMapping
    fun registerNewDownload(@RequestBody request: RegisterDownloadRequest) {
        registerDownload(request.email, request.docType)
    }
}


data class RegisterDownloadRequest(@JsonProperty("email") val email: String,
                                   @JsonProperty("docType") val docType: String)