package com.kalpesh.feed_system

import com.kalpesh.feed_system.api.FeedUIAdapter
import com.kalpesh.feed_system.interaction.FeedInteractionHandler
import com.kalpesh.feed_system.renderer.FeedRenderer
import com.kalpesh.feed_system.renderer.FeedView
import com.kalpesh.feed_system.repository.FeedRepository

/**
 * FeedFramework is the main entry point for interacting with the feed system.
 * It combines the repository, renderer, and interaction handler to provide a complete feed experience.
 *
 * @property repository The repository that provides feed data.
 * @property renderer The renderer that converts feed items into views.
 * @property interactionHandler The handler that manages user interactions with feed items.
 */

class FeedFramework(
    private val repository: FeedRepository,
    private val renderer: FeedRenderer,
    private val interactionHandler: FeedInteractionHandler
) : FeedUIAdapter {

    private val feedItems = repository.getFeedData()
    private val feedMap = feedItems.associateBy { it.id }

    override fun getFeedViews(): List<FeedView> {
        return feedItems.map(renderer::render)
    }

    override fun handleClick(itemId: String) {
        feedMap[itemId]?.let { interactionHandler.onClick(it) }
    }

    override fun handleLongClick(itemId: String) {
        feedMap[itemId]?.let { interactionHandler.onLongClick(it) }
    }

    override fun likeItem(itemId: String) {
        interactionHandler.onLike(itemId)
    }

    override fun commentOnItem(itemId: String, comment: String) {
        interactionHandler.onComment(itemId, comment)
    }
}
