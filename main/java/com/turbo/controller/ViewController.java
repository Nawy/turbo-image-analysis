package com.turbo.controller;

import com.turbo.model.dto.PostChangedDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import static com.turbo.config.WebSocketConfig.POST_VIEW_MESSAGE_BROKER_NAME;

/**
 * Created by rakhmetov on 12.06.17.
 */
@Controller
public class ViewController {

    @MessageMapping("/up/post/view")
    @SendTo(POST_VIEW_MESSAGE_BROKER_NAME + "/changed")
    public PostChangedDto commentChangedUpvoted(EntityViewChanged message) {
        //TODO
        return new PostChangedDto();
    }

    private class EntityViewChanged {

        private long id;
        private long views;
        private long modificatorUserName;

        public EntityViewChanged(long id, long views, long modificatorUserName) {
            this.id = id;
            this.views = views;
            this.modificatorUserName = modificatorUserName;
        }

        public long getId() {
            return id;
        }

        public long getViews() {
            return views;
        }

        public long getModificatorUserName() {
            return modificatorUserName;
        }
    }
}
