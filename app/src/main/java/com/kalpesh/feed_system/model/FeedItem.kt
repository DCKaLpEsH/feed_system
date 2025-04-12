package com.kalpesh.feed_system.model


/**
 * Base class for all feed items.
 * This class is used to represent a feed item in the system.
 *
 * @property id Unique identifier for the feed item.
 * @property timestamp Timestamp of when the item was posted.
 * @property postedBy User who posted the item.
 */

abstract class FeedItem(
    val id: String,
    val timestamp: Long,
    val postedBy: String
)
