package org.example.designpatternsjava.structural.proxy;

public class RealImage implements Image{
    private String filename;
    public RealImage(String filename){
        this.filename=filename;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading Image from disk:"+ filename);
    }

    @Override
    public void display(){
        System.out.println("Displaying Image:" + filename);
    }
}
