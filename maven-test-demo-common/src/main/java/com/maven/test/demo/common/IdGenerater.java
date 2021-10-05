package com.maven.test.demo.common;

import com.eatthepath.uuid.FastUUID;

import java.util.UUID;

public class IdGenerater {

    public static String generateId() {
        return FastUUID.toString(UUID.randomUUID());
    }


    public static String generateNormalId() {
        return UUID.randomUUID().toString();
    }

}
