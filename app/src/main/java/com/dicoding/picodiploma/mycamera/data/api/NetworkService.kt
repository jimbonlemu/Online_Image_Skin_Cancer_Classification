package com.dicoding.picodiploma.mycamera.data.api

import com.dicoding.picodiploma.mycamera.data.response.FileUploadResponse
import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface NetworkService {
    @Multipart
    @POST("skin-cancer/predict")
    suspend fun uploadImage(
        @Part file:MultipartBody.Part
    ):FileUploadResponse
}