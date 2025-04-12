package com.kalpesh.feed_system.repository

import com.kalpesh.feed_system.model.FeedItem

/**
 * Interface for the Feed Repository.
 *
 * This interface defines the contract for fetching feed data.
 * It can be implemented by different data sources (e.g., local database, remote server).
 */

interface FeedRepository {
    fun getFeedData(): List<FeedItem>
}
