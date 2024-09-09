package org.example.http;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpGetDemo {
    public static void main(String[] args) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
    }
}
