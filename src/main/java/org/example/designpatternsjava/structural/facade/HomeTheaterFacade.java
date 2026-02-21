package org.example.designpatternsjava.structural.facade;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private StreamingDevice device;

    public HomeTheaterFacade(TV tv, SoundSystem sound, StreamingDevice device) {
        this.tv = tv;
        this.sound=sound;
        this.device = device;
    }

    public void watchMovie(String movie){
        tv.on();
        sound.on();
        device.playMovie(movie);
    }
}
