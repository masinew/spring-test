package com.masinew.spring.xml.bean;

public class Jdbc {
    private String url;
    private String port;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Jdbc{" +
                "url='" + url + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
