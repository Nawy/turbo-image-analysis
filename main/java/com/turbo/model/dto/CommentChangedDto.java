package com.turbo.model.dto;

/**
 * Only for response event!!!
 */
public class CommentChangedDto {

    private long commentId;
    private long rating;

    public CommentChangedDto(long commentId, long rating) {
        this.commentId = commentId;
        this.rating = rating;
    }

    public long getCommentId() {
        return commentId;
    }

    public long getRating() {
        return rating;
    }
}
