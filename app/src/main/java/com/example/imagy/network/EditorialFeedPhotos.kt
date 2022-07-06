package com.example.imagy.network

import com.squareup.moshi.Json

data class EditorialFeedPhotos (
    val id: String,
    @Json(name = "urls")
    val imageUrls: ImageUrls,
    @Json(name = "links")
    val linkRelation: LinkRelations)

data class ImageUrls(
    @Json(name = "regular")
    val regularImageUrl: String)

data class LinkRelations(val download: String)