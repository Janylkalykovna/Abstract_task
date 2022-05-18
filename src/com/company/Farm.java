package com.company;

import java.util.Arrays;

public class Farm {
    private String ovnerName;
    private String address;
    private Horse[] horses;
    private Sheep[] sheeps;
    private Cow[] cows;

    public Farm(String ovnerName, String address, Horse[] horses, Sheep[] sheeps, Cow[] cows) {
        this.ovnerName = ovnerName;
        this.address = address;
        this.horses = horses;
        this.sheeps = sheeps;
        this.cows = cows;
    }

    public String getOvnerName() {
        return ovnerName;
    }

    public void setOvnerName(String ovnerName) {
        this.ovnerName = ovnerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Farm(String ovnerName, String address) {
        this.setOvnerName(ovnerName);
        this.setAddress(address);

    }
    @Override
    public String toString() {
        return "Farm{" +
                "ovnerName='" + ovnerName + '\'' +
                ", address='" + address + '\'' + "," + "\n" +
                ", horses=" + Arrays.toString(horses) + "," + "\n" +
                ", sheeps=" + Arrays.toString(sheeps) + "," + "\n" +
                ", cows=" + Arrays.toString(cows) +
                '}';
    }
}


