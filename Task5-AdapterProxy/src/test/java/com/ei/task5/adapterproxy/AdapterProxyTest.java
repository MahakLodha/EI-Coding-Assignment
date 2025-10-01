package com.ei.task5.adapterproxy;
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class AdapterProxyTest { @Test void testSensor(){ Sensor s = new LegacySensorAdapter("a|b"); assertTrue(s.readData().startsWith("normalized:")); } @Test void testProxy(){ Device d = new DeviceProxy(new RealDevice("X"), "secret"); d.turnOn(); assertEquals("X", d.id()); } }
