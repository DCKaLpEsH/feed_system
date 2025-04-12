package com.kalpesh.feed_system.api

import com.kalpesh.feed_system.renderer.FeedView

/**
 * Interface for the Feed UI Adapter.
 * This interface is used to interact with the feed items in the UI.
 * It provides methods to get the feed views and handle user interactions.
 *
 * @property getFeedViews Function to get the list of feed views.
 * @property handleClick Function to handle click events on a feed item.
 * @property handleLongClick Function to handle long click events on a feed item.
 * @property likeItem Function to handle like events on a feed item.
 * @property commentOnItem Function to handle comment events on a feed item.
 *
 */


interface FeedUIAdapter {
    fun getFeedViews(): List<FeedView>
    fun handleClick(itemId: String)
    fun handleLongClick(itemId: String)
    fun likeItem(itemId: String)
    fun commentOnItem(itemId: String, comment: String)
}
