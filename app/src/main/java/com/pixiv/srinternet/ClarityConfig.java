package com.pixiv.srinternet;

import com.microsoft.clarity.models.LogLevel;

import java.util.Collections;
import java.util.List;

public class ClarityConfig {
    private final String projectId;
    private final String userId;
    private final LogLevel logLevel;
    private final boolean allowMeteredNetworkUsage;
    private final boolean enableWebViewCapture;
    private final List<String> allowedDomains;
    private final List<String> allowedActivities;
    private final List<String> disallowedActivities;
    private final boolean disableOnLowEndDevices;

    public ClarityConfig(String projectId,
                         String userId,
                         LogLevel logLevel,
                         boolean allowMeteredNetworkUsage,
                         boolean enableWebViewCapture,
                         List<String> allowedDomains,
                         List<String> allowedActivities,
                         List<String> disallowedActivities,
                         boolean disableOnLowEndDevices) {
        this.projectId = projectId;
        this.userId = userId;
        this.logLevel = logLevel;
        this.allowMeteredNetworkUsage = allowMeteredNetworkUsage;
        this.enableWebViewCapture = enableWebViewCapture;
        this.allowedDomains = allowedDomains;
        this.allowedActivities = allowedActivities;
        this.disallowedActivities = disallowedActivities;
        this.disableOnLowEndDevices = disableOnLowEndDevices;
    }

    // Getters for all fields
    public String getProjectId() {
        return projectId;
    }

    public String getUserId() {
        return userId;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public boolean isAllowMeteredNetworkUsage() {
        return allowMeteredNetworkUsage;
    }

    public boolean isEnableWebViewCapture() {
        return enableWebViewCapture;
    }

    public List<String> getAllowedDomains() {
        return allowedDomains;
    }

    public List<String> getAllowedActivities() {
        return allowedActivities;
    }

    public List<String> getDisallowedActivities() {
        return disallowedActivities;
    }

    public boolean isDisableOnLowEndDevices() {
        return disableOnLowEndDevices;
    }
}