package com.twschool.practice.sip.good;

import com.twschool.practice.sip.bad.SmartHomeController;
import com.twschool.practice.sip.bad.SmartLamp;
import com.twschool.practice.sip.bad.SmartSocket;
import com.twschool.practice.sip.bad.SmartSoundBox;
import org.junit.Test;
import org.mockito.Mockito;

public class SmartHomeControllerTest {

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_socket_device() {
        com.twschool.practice.sip.bad.SmartHomeController smartHomeController = new com.twschool.practice.sip.bad.SmartHomeController();

        com.twschool.practice.sip.bad.SmartSocket smartSocket = Mockito.mock(SmartSocket.class);
        smartHomeController.turnOn(smartSocket);
        
        Mockito.verify(smartSocket, Mockito.times(1)).turnOn();
    }

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_lamp_device() {
        com.twschool.practice.sip.bad.SmartHomeController smartHomeController = new com.twschool.practice.sip.bad.SmartHomeController();

        com.twschool.practice.sip.bad.SmartLamp smartLamp = Mockito.mock(SmartLamp.class);
        smartHomeController.turnOn(smartLamp);

        Mockito.verify(smartLamp, Mockito.times(1)).turnOn();
    }

    @Test
    public void should_be_turn_on_smart_device_given_smart_home_controller_and_smart_sound_box_device() {
        com.twschool.practice.sip.bad.SmartHomeController smartHomeController = new com.twschool.practice.sip.bad.SmartHomeController();

        com.twschool.practice.sip.bad.SmartSoundBox smartSoundBox = Mockito.mock(com.twschool.practice.sip.bad.SmartSoundBox.class);
        smartHomeController.turnOn(smartSoundBox);

        Mockito.verify(smartSoundBox, Mockito.times(1)).turnOn();
    }

    @Test
    public void should_be_play_music_given_smart_home_controller_and_smart_sound_box_device() {
        com.twschool.practice.sip.bad.SmartHomeController smartHomeController = new SmartHomeController();

        com.twschool.practice.sip.bad.SmartSoundBox smartSoundBox = Mockito.mock(SmartSoundBox.class);
        smartHomeController.play(smartSoundBox);

        Mockito.verify(smartSoundBox, Mockito.times(1)).play();
    }
}
