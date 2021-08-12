package com.exercises.chapters.io.ex11;

import com.exercises.chapters.innerclass.greenhouse.Event;
import com.exercises.chapters.innerclass.greenhouse.GreenhouseControls;
import com.exercises.chapters.innerclass.greenhouse.NewContoller;
import com.exercises.chapters.io.ex7_8_9.LineReader;

import java.util.HashMap;
import java.util.Map;

public class GreenhouseController {
    public static void main(String[] args) {
        NewContoller nc = new NewContoller();
        Map<String, String> eventMap = new HashMap<>();
        LineReader.readInto("src\\main\\resources\\Times.txt", "=", eventMap);

        nc.addEvent(nc.new Bell(Long.parseLong(eventMap.get("Bell"))));
        Event[] eventList = {
                nc.new ThermostatNight(Long.parseLong(eventMap.get("ThermostatNight"))),
                nc.new LightOn(Long.parseLong(eventMap.get("LightOn"))),
                nc.new LightOff(Long.parseLong(eventMap.get("LightOff"))),
                nc.new WaterOn(Long.parseLong(eventMap.get("WaterOn"))),
                nc.new WaterOff(Long.parseLong(eventMap.get("WaterOff"))),
                nc.new ThermostatDay(Long.parseLong(eventMap.get("ThermostatDay"))),
                nc.new FansOn(Long.parseLong(eventMap.get("FansOn"))),
                nc.new FansOff(Long.parseLong(eventMap.get("FansOff"))),
                nc.new MistOn(Long.parseLong(eventMap.get("MistOn"))),
                nc.new MistOff(Long.parseLong(eventMap.get("MistOff")))
        };
        nc.addEvent(nc.new Restart(Long.parseLong(eventMap.get("Restart")), eventList));
        if (args.length == 1) {
            nc.addEvent(new GreenhouseControls.Terminate(Integer.parseInt(args[0])));
        } else {
            nc.addEvent(new GreenhouseControls.Terminate(Long.parseLong(eventMap.get("Terminate"))));
        }
        nc.run();
    }
}