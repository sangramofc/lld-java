package com.sangram.oop_basics.chaining;

public class ChainingDemo {
    public static void main(String[] args) {
        // 1. Calls 1-param constructor -> chains to 2-param -> chains to Master
        Notification defaultNotif = new Notification("Server CPU usage exceeded 90%");

        // 2. Calls 2-param constructor -> chains to Master
        Notification userNotif = new Notification("user@example.com", "Your password was changed");

        // 3. Calls Master constructor directly
        Notification customNotif = new Notification("NOTIF-9999", "admin@company.com", "Database Backup Failed", "HIGH");

        // --- VERIFICATION PRINTING ---
        System.out.println("1-Param (Default Admin & Priority):");
        System.out.println(defaultNotif);
        System.out.println();

        System.out.println("2-Param (Custom Recipient, Default Priority):");
        System.out.println(userNotif);
        System.out.println();

        System.out.println("4-Param (Fully Custom Master):");
        System.out.println(customNotif);
    }
}