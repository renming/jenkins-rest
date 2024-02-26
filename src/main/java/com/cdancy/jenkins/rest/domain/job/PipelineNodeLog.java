package com.cdancy.jenkins.rest.domain.job;

import com.google.auto.value.AutoValue;
import org.jclouds.json.SerializedNames;

import javax.annotation.Nullable;

@AutoValue
public abstract class PipelineNodeLog {

    public abstract String nodeId();

    public abstract String nodeStatus();

    public abstract int length();

    public abstract boolean hasMore();

    @Nullable
    public abstract String text();
    @Nullable
    public abstract String consoleUrl();

    PipelineNodeLog() {
    }

    @SerializedNames({ "nodeId", "nodeStatus", "length", "hasMore", "text", "consoleUrl" })
    public static PipelineNodeLog create(String nodeId, String nodeStatus, int length, boolean hasMore, String text, String consoleUrl) {
        return new AutoValue_PipelineNodeLog(nodeId, nodeStatus, length, hasMore, text, consoleUrl);
    }
}
