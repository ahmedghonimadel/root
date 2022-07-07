package com.cors.cors;

import java.util.ArrayList;

public class Response {
    ArrayList<String> permissions;
    String token;

    public Response() {
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
