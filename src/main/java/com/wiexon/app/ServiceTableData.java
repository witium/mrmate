package com.wiexon.app;

import javafx.beans.property.SimpleStringProperty;

public class ServiceTableData {
    private final SimpleStringProperty sl;
    private final SimpleStringProperty term;
    private final SimpleStringProperty uri;
    private final SimpleStringProperty pid;
    private final SimpleStringProperty connection;
    private final SimpleStringProperty mode;
    private final SimpleStringProperty status;

    public ServiceTableData(String sl, String term, String uri, String pid, String connection, String mode, String status) {
        this.sl = new SimpleStringProperty(sl);
        this.term = new SimpleStringProperty(term);
        this.uri = new SimpleStringProperty(uri);
        this.pid = new SimpleStringProperty(pid);
        this.connection = new SimpleStringProperty(connection);
        this.mode = new SimpleStringProperty(mode);
        this.status = new SimpleStringProperty(status);
    }

    public String getSl() {
        return sl.get();
    }

    public SimpleStringProperty slProperty() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl.set(sl);
    }

    public String getTerm() {
        return term.get();
    }

    public SimpleStringProperty termProperty() {
        return term;
    }

    public void setTerm(String term) {
        this.term.set(term);
    }

    public String getUri() {
        return uri.get();
    }

    public SimpleStringProperty uriProperty() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri.set(uri);
    }

    public String getPid() {
        return pid.get();
    }

    public SimpleStringProperty pidProperty() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid.set(pid);
    }

    public String getConnection() {
        return connection.get();
    }

    public SimpleStringProperty connectionProperty() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection.set(connection);
    }

    public String getMode() {
        return mode.get();
    }

    public SimpleStringProperty modeProperty() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode.set(mode);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}