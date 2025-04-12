package com.kalpesh.feed_system.model

/**
 * A data model representing a textual feed item.
 *
 * @property id Unique identifier for this feed item.
 * @property timestamp Time in milliseconds when the post was made.
 * @property postedBy The username or identifier of the poster.
 * @property text The actual text content of the post.
 */


class TextFeedItem(
    id: String,
    timestamp: Long,
    postedBy: String,
    val text: String
) : FeedItem(id, timestamp, postedBy)
