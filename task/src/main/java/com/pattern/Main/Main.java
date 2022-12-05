package com.pattern.Main;

import com.pattern.Actions.Reloads.Action;
import com.pattern.Actions.Reloads.EmptyAmmo;

public class Main {
    public static void main(String[] args) {
        Action weapAction = new Action();
        weapAction.setWeaponState(new EmptyAmmo());
        System.out.println(weapAction.getStatusName());
        weapAction.nextweaponStatus();
        System.out.println(weapAction.getStatusName());
        weapAction.nextweaponStatus();
        System.out.println(weapAction.getStatusName());
        weapAction.nextweaponStatus();
        System.out.println(weapAction.getStatusName());
    }
 
}
