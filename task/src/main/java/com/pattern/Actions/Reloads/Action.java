package com.pattern.Actions.Reloads;

import com.pattern.State.State;

public class Action {
     
    private State state;  
 
    public State getWeaponState() {
        return state;
    }
     
    public void nextweaponStatus() {
        state.nextWeaponStatus(this);       
    }
     
    public void previousWeaponStatuc() {
        state.previousWeaponStatus(this);       
    }
 
    public void setWeaponState(State weaponState) {
        this.state = weaponState;
    }   
         
    public String getStatusName() {
        return state.getStatusName();
    }

}