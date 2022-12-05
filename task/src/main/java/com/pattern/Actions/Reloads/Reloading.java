package com.pattern.Actions.Reloads;

import com.pattern.State.State;
import com.pattern.Status.Status;

public class Reloading implements State {
 
    @Override
    public void nextWeaponStatus(Action Context) {
        Context.setWeaponState(new WeaponReloaded());
    }
 
    @Override
    public void previousWeaponStatus(Action Context) {
        Context.setWeaponState(new EmptyAmmo());
    }
 
    @Override
    public String getStatusName() {
        return Status.RELOAD.getStatusName();
    }
 
}
