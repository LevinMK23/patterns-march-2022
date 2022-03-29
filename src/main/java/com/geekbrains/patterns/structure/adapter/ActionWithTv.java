package com.geekbrains.patterns.structure.adapter;

public interface ActionWithTv {

    void on();

    void off();

    void changeChannel(int channel);

    void volumePlus();

    void volumeMinus();

    void nextChannel();

    void previousChannel();

}
