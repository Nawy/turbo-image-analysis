package com.turbo.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Only for response event!!!
 */
public final class PostChangedDto {
    private long postId;
    private long ups;
    private long downs;
    private long rating;
    private long views;

    public PostChangedDto(long postId, long ups, long downs, long rating, long views) {
        this.postId = postId;
        this.ups = ups;
        this.downs = downs;
        this.rating = rating;
        this.views = views;
    }

    @JsonProperty("post_id")
    public long getPostId() {
        return postId;
    }

    public long getUps() {
        return ups;
    }

    public long getDowns() {
        return downs;
    }

    public long getRating() {
        return rating;
    }

    public long getViews() {
        return views;
    }
}