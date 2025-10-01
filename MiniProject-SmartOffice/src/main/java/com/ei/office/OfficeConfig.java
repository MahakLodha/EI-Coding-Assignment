package com.ei.office;
import java.time.Duration;
public class OfficeConfig {
    private static volatile OfficeConfig instance;
    private Duration autoReleaseTimeout = Duration.ofSeconds(30);
    private OfficeConfig(){}
    public static OfficeConfig getInstance(){ if(instance==null){ synchronized(OfficeConfig.class){ if(instance==null) instance=new OfficeConfig(); } } return instance; }
    public Duration getAutoReleaseTimeout(){ return autoReleaseTimeout; }
    public void setAutoReleaseTimeout(Duration d){ this.autoReleaseTimeout = d; }
}
