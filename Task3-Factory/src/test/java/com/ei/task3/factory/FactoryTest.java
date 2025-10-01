package com.ei.task3.factory;
import org.junit.jupiter.api.Test; import static org.junit.jupiter.api.Assertions.*;
class FactoryTest { @Test void testCreate(){ Device d = DeviceFactory.createDevice("light","L1"); assertEquals("L1", d.getId()); } }
