package com.pattern.Actions.Reloads;

import com.pattern.State.State;
import com.pattern.Status.Status;

public class WeaponReloaded implements State {
 
    @Override
    public void nextWeaponStatus(Action Context) {
        System.out.println("nothing happens");  
    }
 
    @Override
    public void previousWeaponStatus(Action Context) {
        Context.setWeaponState(new Reloading());
    }
 
    @Override
    public String getStatusName() {
        return Status.END.getStatusName();
    }
    
}
