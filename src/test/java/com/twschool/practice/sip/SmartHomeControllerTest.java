package com.twschool.practice.sip;

import org.junit.Test;
import org.mockito.Mockito;

public class SmartHomeControllerTest {

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_socket_device() {
        SmartHomeController smartHomeController = new SmartHomeController();

        SmartSocket smartSocket = Mockito.mock(SmartSocket.class);
        smartHomeController.turnOn(smartSocket);
        
        Mockito.verify(smartSocket, Mockito.times(1)).turnOn();
    }

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_lamp_device() {
        SmartHomeController smartHomeController = new SmartHomeController();

        SmartLamp smartLamp = Mockito.mock(SmartLamp.class);
        smartHomeController.turnOn(smartLamp);

        Mockito.verify(smartLamp, Mockito.times(1)).turnOn();
    }

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_sound_box_device() {
        SmartHomeController smartHomeController = new SmartHomeController();

        SmartSoundBox smartSoundBox = Mockito.mock(SmartSoundBox.class);
        smartHomeController.turnOn(smartSoundBox);

        Mockito.verify(smartSoundBox, Mockito.times(1)).turnOn();
    }

    @Test
    public void should_be_play_music_given_smart_home_controller_and_smart_sound_box_device() {
        SmartHomeController smartHomeController = new SmartHomeController();

        SmartSoundBox smartSoundBox = Mockito.mock(SmartSoundBox.class);
        smartHomeController.play(smartSoundBox);

        Mockito.verify(smartSoundBox, Mockito.times(1)).play();
    }
}
