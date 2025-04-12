package com.kalpesh.feed_system.model


/**
 * A data model representing a Video feed item.
 *
 * @property id Unique identifier for this feed item.
 * @property timestamp Time in milliseconds when the post was made.
 * @property postedBy The username or identifier of the poster.
 * @property videoUrl The url of the view content of the post.
 * @property thumbnailUrl The url of the thumbnail image for the video.
 */

class VideoFeedItem(
    id: String,
    timestamp: Long,
    postedBy: String,
    val videoUrl: String,
    val thumbnailUrl: String
) : FeedItem(id, timestamp, postedBy)