package com.ei.office;
import java.util.Scanner;
public class SmartOfficeSystem {
    private final Office office;
    public SmartOfficeSystem(){
        office = new Office("Main Office");
        Floor f1=new Floor("Floor 1");
        Room r101=new Room("101"); r101.addDevice(new Light("L101")); r101.addDevice(new AirConditioner("AC101")); r101.addDevice(new OccupancySensor("S101"));
        f1.addRoom(r101);
        office.addFloor(f1);
    }
    public void run(){
        try(Scanner sc=new Scanner(System.in)){
            boolean exit=false;
            while(!exit){
                System.out.println("\n1)status 2)on 3)off 4)occ 5)exit"); System.out.print("choice:"); String in=sc.nextLine().trim();
                switch(in){
                    case "1": showStatus(); break;
                    case "2": System.out.print("room:"); turnOnRoom(sc.nextLine().trim()); break;
                    case "3": System.out.print("room:"); turnOffRoom(sc.nextLine().trim()); break;
                    case "4": System.out.print("room:"); String r=sc.nextLine().trim(); System.out.print("occ? y/n:"); String o=sc.nextLine().trim(); setOccupancy(r, o.equalsIgnoreCase("y")); break;
                    case "5": exit=true; break;
                    default: System.out.println("invalid"); break;
                }
            }
        }
    }
    private void showStatus(){ for(Floor f: office.getFloors()){ System.out.println(f.getName()); for(Room r: f.getRooms()){ System.out.println("Room " + r.getName()); System.out.println(r.getStatus()); } } }
    private void turnOnRoom(String name){ for(Floor f: office.getFloors()) for(Room r: f.getRooms()) if(r.getName().equals(name)){ r.turnOnAllDevices(); return; } System.out.println("not found"); }
    private void turnOffRoom(String name){ for(Floor f: office.getFloors()) for(Room r: f.getRooms()) if(r.getName().equals(name)){ r.turnOffAllDevices(); return; } System.out.println("not found"); }
    private void setOccupancy(String name, boolean occ){ for(Floor f: office.getFloors()) for(Room r: f.getRooms()) if(r.getName().equals(name)){ r.getDevices().forEach(d -> { if(d instanceof OccupancySensor) ((OccupancySensor)d).setOccupied(occ); }); return; } System.out.println("not found"); }
    public static void main(String[] args){ new SmartOfficeSystem().run(); }
}
