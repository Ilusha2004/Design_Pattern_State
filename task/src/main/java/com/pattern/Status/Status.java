package com.pattern.Status;
 
public enum Status {

    EMPTY("empty weapon"),
    RELOAD("reloading weapon"),
    END("reloaded");
     
    private String statusName;  
 
    private Status(String statusName) {
        this.statusName = statusName;
    }
 
    public String getStatusName() {
        return statusName;
    }   
}
