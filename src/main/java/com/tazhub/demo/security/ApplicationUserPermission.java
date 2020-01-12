package com.tazhub.demo.security;

import java.util.prefs.AbstractPreferences;

public enum ApplicationUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("Course:read"),
    COURSE_WRITE("Course:write");


    private final String permission;
    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
    public String getPermission() {
        return permission;
    }


}
