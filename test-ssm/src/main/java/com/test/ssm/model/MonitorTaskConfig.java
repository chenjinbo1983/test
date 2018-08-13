package com.test.ssm.model;

import java.util.List;

public class MonitorTaskConfig {
    private int id;
    private String configName;
    private String configValue;
    private String configUnit;
    private String configComment;
    private MonitorTask monitorTask;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigUnit() {
        return configUnit;
    }

    public void setConfigUnit(String configUnit) {
        this.configUnit = configUnit;
    }

    public String getConfigComment() {
        return configComment;
    }

    public void setConfigComment(String configComment) {
        this.configComment = configComment;
    }

    public MonitorTask getMonitorTask() {
        return monitorTask;
    }

    public void setMonitorTask(MonitorTask monitorTask) {
        this.monitorTask = monitorTask;
    }
}
