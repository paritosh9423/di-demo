package com.paritosh.didemo.fakeBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class FakeDataSource {

    private String dbUsername;
    private String dbPassword;
    private String dbUrl;

    public String getDbUsername() {
        return dbUsername;
    }

    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
}
