package com.sangram.oop_basics.shallowcopy;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyDemo {
    static void main() {
        Vehicle originalVehicle = new Vehicle("WB-02-1234");
        List<String> logs = new ArrayList<String>();
        logs.add("Issued");
        ParkingTicket originalTicket = new ParkingTicket(1, originalVehicle, logs);

        // Shallow copy creation
        ParkingTicket copiedTicket = new ParkingTicket(originalTicket);

        // Mutate vehicle via copied ticket
        copiedTicket.getVehicle().setLicensePlate("WB-99-9999");
        // Mutate logs via copied ticket
        copiedTicket.getLogs().add("Payment Completed");


        // VERIFICATION
        // Print original ticket to verify shallow copy side-effects

        System.out.println("Original License Plate: " + originalTicket.getVehicle().getLicensePlate());
        System.out.println("Original Logs: " + originalTicket.getLogs());

        // SHALLOW COPY MEMORY MECHANICS:
        // The shallow copy constructor copied the memory addresses (references) of 'vehicle' and 'logs'
        // rather than instantiating new objects. As a result, both 'originalTicket' and 'copiedTicket'
        // point to the exact same Vehicle and List instances in Heap memory.
        // Any mutation made via 'copiedTicket' directly updates the shared Heap state,
        // causing the changes to reflect when inspecting 'originalTicket'.

    }
}
