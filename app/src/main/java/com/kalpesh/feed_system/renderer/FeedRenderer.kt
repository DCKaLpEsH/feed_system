package com.kalpesh.feed_system.renderer

import com.kalpesh.feed_system.model.FeedItem

/**
 * Interface for rendering different types of feed items.
 *
 * This interface defines a method to render a feed item into a specific view representation.
 */

interface FeedRenderer {
    fun render(feedItem: FeedItem): FeedView
}
