package com.chapters.innerclass.greenhouse;

public class NewContoller extends GreenhouseControls {

    private boolean mist = false;

    public class MistOn extends Event {

        public MistOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            mist = true;
        }

        public String toString() {
            return "Mist water generators are on";
        }
    }

    public class MistOff extends Event {

        public MistOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            mist = false;
        }

        public String toString() {
            return "Mist water generators are off";
        }
    }

}
