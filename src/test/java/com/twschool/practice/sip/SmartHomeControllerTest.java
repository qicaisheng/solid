package com.twschool.practice.sip;

import org.junit.Test;
import org.mockito.Mockito;

public class SmartHomeControllerTest {

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_device() {
        SmartHomeController smartHomeController = new SmartHomeController();

        SmartSocket smartSocket = Mockito.mock(SmartSocket.class);
        smartHomeController.turnOn(smartSocket);
        
        Mockito.verify(smartSocket, Mockito.times(1)).turnOn();
    }
}
