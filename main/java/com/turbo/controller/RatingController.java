package com.turbo.controller;

import com.turbo.model.dto.CommentChangedDto;
import com.turbo.model.dto.PostChangedDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import static com.turbo.config.WebSocketConfig.COMMENT_RATING_MESSAGE_BROKER_NAME;
import static com.turbo.config.WebSocketConfig.POST_RATING_MESSAGE_BROKER_NAME;

/**
 * Created by rakhmetov on 09.05.17.
 */
@Controller
public class RatingController {

    @MessageMapping("/up/post/rating")
    @SendTo(POST_RATING_MESSAGE_BROKER_NAME + "/changed")
    public PostChangedDto postChangedUpvoted(EntityRatingChanged message) {
        //TODO
        return new PostChangedDto();
    }

    @MessageMapping("/down/post/rating")
    @SendTo(POST_RATING_MESSAGE_BROKER_NAME + "/changed")
    public PostChangedDto postChangedDownovoted(EntityRatingChanged message) {
        //TODO
        return new PostChangedDto();
    }

    @MessageMapping("/up/comment/rating")
    @SendTo(COMMENT_RATING_MESSAGE_BROKER_NAME + "/changed")
    public CommentChangedDto commentChangedUpvoted(EntityRatingChanged message) {
        //TODO
        return new CommentChangedDto();
    }

    private class EntityRatingChanged {

        private long id;
        private long rating;
        private long modificatorUserName;

        public EntityRatingChanged(long id, long rating, long modificatorUserName) {
            this.id = id;
            this.rating = rating;
            this.modificatorUserName = modificatorUserName;
        }

        public long getId() {
            return id;
        }

        public long getRating() {
            return rating;
        }

        public long getModificatorUserName() {
            return modificatorUserName;
        }
    }

}
