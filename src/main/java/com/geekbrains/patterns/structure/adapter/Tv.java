package com.geekbrains.patterns.structure.adapter;

public class Tv implements ActionWithTv {

    private RemoteController controller;

    public Tv(RemoteController controller) {
        this.controller = controller;
    }

    @Override
    public void on() {
        controller.ok();
    }

    @Override
    public void off() {
        controller.ok();
    }

    @Override
    public void changeChannel(int channel) {
        switch (channel) {
            case 1 -> controller.one();
            case 2 -> controller.two();
        }
    }

    @Override
    public void volumePlus() {
        controller.right();
    }

    @Override
    public void volumeMinus() {
        controller.left();
    }

    @Override
    public void nextChannel() {
        controller.up();
    }

    @Override
    public void previousChannel() {
        controller.down();
    }
}
