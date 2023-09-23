package com.exercise.campproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("java.runtime")
public record NotionConfigProperties(String apiVersion) {
}
