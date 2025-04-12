package com.kalpesh.feed_system.model


/**
 * A data model representing a Video feed item.
 *
 * @property id Unique identifier for this feed item.
 * @property timestamp Time in milliseconds when the post was made.
 * @property postedBy The username or identifier of the poster.
 * @property imageUrls List of urls for the images of the post.
 */


class ImageFeedItem(
    id: String,
    timestamp: Long,
    postedBy: String,
    val imageUrls: List<String>
) : FeedItem(id, timestamp, postedBy)