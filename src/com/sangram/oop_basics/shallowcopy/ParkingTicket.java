package com.sangram.oop_basics.shallowcopy;

import java.util.List;

public class ParkingTicket {
    private Long ticketId;
    private Vehicle vehicle;
    private List<String> logs;

    // Custom constructor for initialization
    public ParkingTicket(long ticketId, Vehicle vehicle, List<String> logs) {
        this.logs = logs;
        this.ticketId = ticketId;
        this.vehicle = vehicle;
    }

    // shallow copy constructors
    public ParkingTicket(ParkingTicket other) {
        this.vehicle = other.vehicle;
        this.ticketId = other.ticketId;
        this.logs = other.logs;
    }

    // getter & setters
    public Long getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<String> getLogs() {
        return logs;
    }

    public void setLogs(List<String> logs) {
        this.logs = logs;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
