package com.pattern.Actions.Reloads;

import com.pattern.State.State;
import com.pattern.Status.Status;


public class EmptyAmmo implements State {
     
    @Override
    public void nextWeaponStatus(Action Context) {
        Context.setWeaponState(new Reloading());
    }
 
    @Override
    public void previousWeaponStatus(Action Context) {
        System.out.println("nothing happens");      
    }
 
    @Override
    public String getStatusName() {
        return Status.EMPTY.getStatusName();
    }
 
}
