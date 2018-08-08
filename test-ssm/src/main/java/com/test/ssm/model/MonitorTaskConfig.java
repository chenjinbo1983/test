package com.test.ssm.model;

import java.util.List;

public class MonitorTaskConfig {
    private int id;
    private String configName;
    private String configValue;
    private String configUnit;
    private String configComment;
    private List<MonitorTask> monitorTaskList;

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

    public List<MonitorTask> getMonitorTaskList() {
        return monitorTaskList;
    }

    public void setMonitorTaskList(List<MonitorTask> monitorTaskList) {
        this.monitorTaskList = monitorTaskList;
    }
}
