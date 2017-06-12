package com.turbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by rakhmetov on 12.06.17.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    public static final String POST_RATING_MESSAGE_BROKER_NAME = "/post/rating";
    public static final String COMMENT_RATING_MESSAGE_BROKER_NAME = "/comment/rating";
    public static final String POST_VIEW_MESSAGE_BROKER_NAME = "/post/view";

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker(POST_RATING_MESSAGE_BROKER_NAME, COMMENT_RATING_MESSAGE_BROKER_NAME, POST_VIEW_MESSAGE_BROKER_NAME);
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    }

}
