package com.cdancy.jenkins.rest.domain.job;

import java.util.List;

import com.google.auto.value.AutoValue;
import org.jclouds.json.SerializedNames;

import javax.annotation.Nullable;

@AutoValue
public abstract class PipelineNode {

    public abstract String id();

    public abstract String name();

    public abstract String status();

    public abstract long startTimeMillis();

    public abstract long durationTimeMillis();

    @Nullable
    public abstract List<StageFlowNode> stageFlowNodes();

    PipelineNode() {
    }

    @SerializedNames({ "id", "name", "status", "startTimeMillis", "durationTimeMillis", "stageFlowNodes" })
    public static PipelineNode create(String id, String name, String status, long startTimeMillis,
                                      long durationTimeMillis, List<StageFlowNode> stageFlowNodes) {
        return new AutoValue_PipelineNode(id, name, status, startTimeMillis, durationTimeMillis, stageFlowNodes);
    }
}
