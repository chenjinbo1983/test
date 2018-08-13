package com.test.ssm.model;

import java.util.List;

public class MonitorTask {
    private int id;
    private String name;
    private List<MonitorTaskConfig> monitorTaskConfigList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MonitorTaskConfig> getMonitorTaskConfigList() {
        return monitorTaskConfigList;
    }

    public void setMonitorTaskConfigList(List<MonitorTaskConfig> monitorTaskConfigList) {
        this.monitorTaskConfigList = monitorTaskConfigList;
    }
}
