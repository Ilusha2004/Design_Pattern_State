package com.pattern;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.pattern.Actions.Reloads.Action;
import com.pattern.Actions.Reloads.EmptyAmmo;
import com.pattern.Actions.Reloads.WeaponReloaded;

public class WeaponTest {

    private Action action = new Action();
    private Action action2 = new Action();
    private Action action3 = new Action();

    @Before
    public void setUp() {
        action.setWeaponState(new EmptyAmmo());
    }
   
    @Test
    public void EmptyWeapon() {
        assertEquals(action.getStatusName(), "empty weapon");
    }

    @Test
    public void Reloading(){
        assertFalse(action.getStatusName() == "reloading");
    }

    @Test
    public void Reloaded() {
        assertFalse(action.getStatusName() == "reloaded");
    }

    @Test
    public void NothingTest() {
        assertFalse(action.getStatusName() == "nothing");
    }

    @Before
    public void setUp_2() {
        action2.setWeaponState(new com.pattern.Actions.Reloads.Reloading());
    }

    @Test
    public void EmptyWeapon_0() {
        assertEquals(action2.getStatusName(), "reloading weapon");
    }

    @Test
    public void Reloading_0(){
        assertFalse(action2.getStatusName() == "reloading");
    }

    @Test
    public void Reloaded_0() {
        assertFalse(action2.getStatusName() == "reloaded");
    }

    @Test
    public void NothingTest_0() {
        assertFalse(action2.getStatusName() == "nothing");
    }

    @Before
    public void setUp_3() {
        action3.setWeaponState(new WeaponReloaded());
    }

    @Test
    public void EmptyWeapon_1() {
        assertEquals(action3.getStatusName(), "reloaded");
    }

    @Test
    public void Reloading_1(){
        assertFalse(action3.getStatusName() == "reloading");
    }

    @Test
    public void NothingTest_1() {
        assertFalse(action3.getStatusName() == "nothing");
    }

}
