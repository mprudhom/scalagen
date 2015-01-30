/*
 * Copyright (c) 2010 Mysema Ltd.
 * Copyright (C) 2015, glimpse.io
 * 
 * base on code from https://hickory.dev.java.net/
 * 
 */

package io.glimpse.examples;

import javax.tools.JavaFileManager.Location;
import javax.tools.JavaFileObject.Kind;

/**
 * LocationAndKind defines a pair of Location and Kind
 * 
 * @author tiwe
 *
 */
public class LocationAndKind {
    
    private final Kind kind;
    
    private final Location location;
    
    public LocationAndKind(Location location, Kind kind) {
        this.location = location;
        this.kind = kind;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }else if (obj instanceof LocationAndKind){
            LocationAndKind other = (LocationAndKind)obj;
            return location.equals(other.location) && kind.equals(other.kind);    
        }else{
            return false;
        }        
    }

    @Override
    public int hashCode() {
        return kind.hashCode() * 31  + location.hashCode();
    }

    @Override
    public String toString() {
        return kind.toString() + "@" + location.toString(); 
    }
    
    
    
    
    
}
