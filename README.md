# Feed Framework

## Overview

The Feed Framework is a powerful and flexible tool designed to help developers create and manage
feeds for various applications. It provides a set of features and functionalities that make it easy
to work with different types of feeds.

## 🌱 Extensibility Notes

New Feed Types: Add a new subclass to FeedItem, implement a new renderer & interaction logic.

Scalability: The separation of rendering, interaction, and data makes it easy for large teams to
work in parallel.

Testing: Each part is easily unit-testable via interfaces.

Future Features: Support for ads, stories, sponsored posts, reels, etc., can be added via new
FeedItem types.

## Usage Example

### 1. Create mock repository and handler

```
val mockRepository = object : FeedRepository {
    override fun getFeedData(): List<FeedItem> {
        return listOf(
            TextFeedItem("1", System.currentTimeMillis(), "alice", "Hello world!"),
            ImageFeedItem("2", System.currentTimeMillis(), "bob", listOf("url1.jpg", "url2.jpg")),
            VideoFeedItem("3", System.currentTimeMillis(), "charlie", "video.mp4", "thumb.jpg")
        )
    }
}

val renderer = object : FeedRenderer {
    override fun render(feedItem: FeedItem): FeedView {
        return when (feedItem) {
            is TextFeedItem -> FeedView.TextView(feedItem.text)
            is ImageFeedItem -> FeedView.ImageView(feedItem.imageUrls)
            is VideoFeedItem -> FeedView.VideoView(feedItem.videoUrl, feedItem.thumbnailUrl)
        }
    }
}

val interactionHandler = object : FeedInteractionHandler {
    override fun onClick(feedItem: FeedItem) {
        println("Clicked: ${feedItem.id}")
    }

    override fun onLongClick(feedItem: FeedItem) {
        println("Long Clicked: ${feedItem.id}")
    }

    override fun onLike(feedItemId: String) {
        println("Liked: $feedItemId")
    }

    override fun onComment(feedItemId: String, comment: String) {
        println("Commented on $feedItemId: $comment")
    }
}

```

### 2. Initialize Framework

```
val feedUIAdapter: FeedUIAdapter = FeedFramework(
    repository = mockRepository,
    renderer = renderer,
    interactionHandler = interactionHandler
)

```

### 3. Use in UI code (e.g., ViewModel or Fragment)

```
// Display items
val feedViews = feedUIAdapter.getFeedViews()
feedViews.forEach {
    println("Rendering view: $it")
}

// Simulate interactions
feedUIAdapter.handleClick("1")
feedUIAdapter.handleLongClick("2")
feedUIAdapter.likeItem("3")
feedUIAdapter.commentOnItem("3", "Awesome video!")

```