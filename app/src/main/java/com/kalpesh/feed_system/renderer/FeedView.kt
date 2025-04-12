package com.kalpesh.feed_system.renderer


/**
 * Sealed class representing different types of views for feed items.
 *
 * This class is used to define the various view representations that can be rendered
 * for different types of feed items.
 *
 * @property TextView Represents a text view with a string.
 * @property ImageView Represents an image view with a list of image URLs.
 * @property VideoView Represents a video view with a video URL and a thumbnail.
 */

sealed class FeedView {
    data class TextView(val text: String) : FeedView()
    data class ImageView(val imageUrls: List<String>) : FeedView()
    data class VideoView(val videoUrl: String, val thumbnail: String) : FeedView()
}
