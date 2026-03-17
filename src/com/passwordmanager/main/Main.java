package com.passwordmanager.main;

import com.passwordmanager.utils.CryptoUtils;

public class Main {
    public static void main(String[] args) {
        try {
            String pass1 = "KaitoyKAITOy@!321";
            String extraKey = "KarotagiaFafom@";
            String finalHash = CryptoUtils.hashMasterPassword(pass1, extraKey);

            System.out.println("Original Password: " + pass1);
            System.out.println("Security Key used: " + extraKey);
            System.out.println("Final Secure Hash: " + finalHash);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
