package NewPackageForNewAccount;

import java.util.Arrays;
import java.util.List;

public enum GeoPoliticalZones {
    NORTH_CENTRAL("Benue","FCT", "Koggi", "Kwara", "Nasarwa", "Plateu"),
    NORHT_EAST("Adamawa", "Bauchi", "Borno", "Gombe, Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina","Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara"),
    SOUTH_EAST("ABIA", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_SOUTH("Akwa_Ibom", "Bayelsa","Bayelsa", "Delta", "Edo", "River"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private String [] states;

    GeoPoliticalZones(String... states){
        this.states = states;
    }
    public List<String> getStates(){
        return Arrays.asList(states);
    }
    public static GeoPoliticalZones getGeoPolitical (String states){
        for(GeoPoliticalZones zone : GeoPoliticalZones.values()){
        if(zone.getStates().contains(states))return zone;
        }
        return null;
    }
}
