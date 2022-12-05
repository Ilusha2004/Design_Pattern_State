package com.pattern.State;

import com.pattern.Actions.Reloads.Action;

public interface State {
    String getStatusName();
    void nextWeaponStatus(Action weaponContext);
    void previousWeaponStatus(Action weaponContext);
}
