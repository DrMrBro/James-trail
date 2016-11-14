package com.miguelsportal.googleloginm;

/**
 * Created by James on 11/12/2016.
 */

public class Trail
{//class that creates trail objects to be referenced later. TODO: implement type, difficulty, a rating system and a weather system.
    private String trailID;
    private String name;
    private String description;


    public Trail (String tID, String nm, String desc)
    {//standard constructor
        trailID= tID;
        name = nm;
        description = desc;
    }

    //getter methods
    public String getTrailID()
    {
        return trailID;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }
}
