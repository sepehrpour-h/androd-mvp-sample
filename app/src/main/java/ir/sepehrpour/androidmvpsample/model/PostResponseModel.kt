package ir.sepehrpour.androidmvpsample.model

data class PostResponseModel(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)