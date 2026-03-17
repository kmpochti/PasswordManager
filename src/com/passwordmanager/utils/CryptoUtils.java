package com.passwordmanager.utils;

import java.security.MessageDigest;
import java.util.Base64;

public class CryptoUtils {
    public static String hashMasterPassword(String password,String randomModifier) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        String combined = password + randomModifier;
        byte[] hashBytes = md.digest(combined.getBytes());
        return Base64.getEncoder().encodeToString(hashBytes);
    }
}

