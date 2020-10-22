package com.company;

public class PetrolStation {
    public void fillUp(float capacity){
        try{
            Thread.sleep(5000);
            
        } catch (Exception e) {
            throw new RuntimeException("SWW", e);
        }
    }
}
