package ir.sepehrpour.androidmvpsample.network

import ir.sepehrpour.androidmvpsample.model.PostResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("/posts")
    suspend fun getAllPost(): Response<List<PostResponseModel>>

    @GET("/{postId}")
    suspend fun getPost(@Path(value = "postId", encoded = true) postId: String): Response<PostResponseModel>
}