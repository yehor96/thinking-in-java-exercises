package com.chapters.innerclass.greenhouse;

public class GreenhouseController {
    public static void main(String[] args) {
        NewContoller nc = new NewContoller();
        nc.addEvent(nc.new Bell(900));
        Event[] eventList = {
                nc.new ThermostatNight(0),
                nc.new LightOn(200),
                nc.new LightOff(400),
                nc.new WaterOn(600),
                nc.new WaterOff(800),
                nc.new ThermostatDay(1400),
                nc.new FansOn(2000),
                nc.new FansOff(3000),
                nc.new MistOn(3400),
                nc.new MistOff(3600)
        };
        nc.addEvent(nc.new Restart(4000, eventList));
        if (args.length == 1) {
            nc.addEvent(new GreenhouseControls.Terminate(Integer.parseInt(args[0])));
        }
        nc.run();
    }
}
