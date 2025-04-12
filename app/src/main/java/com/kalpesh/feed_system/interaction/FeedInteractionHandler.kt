package com.kalpesh.feed_system.interaction

import com.kalpesh.feed_system.model.FeedItem


/**
 * Interface for handling interactions with feed items.
 * This interface defines methods for handling click, long click, like, and comment actions on feed items.
 *
 * @property onClick Function to handle click events on a feed item.
 * @property onLongClick Function to handle long click events on a feed item.
 * @property onLike Function to handle like events on a feed item.
 * @property onComment Function to handle comment events on a feed item.
 *
 */

interface FeedInteractionHandler {
    fun onClick(feedItem: FeedItem)
    fun onLongClick(feedItem: FeedItem)
    fun onLike(feedItemId: String)
    fun onComment(feedItemId: String, comment: String)
}
