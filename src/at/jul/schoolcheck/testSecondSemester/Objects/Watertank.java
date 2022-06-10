package at.jul.schoolcheck.testSecondSemester.Objects;

import java.util.Scanner;

public class Watertank {
    private int volumeOfTank;

    public Watertank(int volumeOfTank) {
        int maxVol = 1000;
        if(volumeOfTank >maxVol) {
            System.out.println("Tank kann nur 1000ml fassen");
            Scanner scanner = new Scanner(System.in);
            int newWater = scanner.nextInt();
            fillWaterTank(newWater);
        }else {
            this.volumeOfTank = volumeOfTank;
        }
    }

    public void fillWaterTank(int newWater){
        int maxVol = 1000;
        if(newWater+this.volumeOfTank >maxVol) {
            System.out.println("Tank kann nur 1000ml fassen");
            Scanner scanner = new Scanner(System.in);
            newWater = scanner.nextInt();
            fillWaterTank(newWater);
        }else {
            this.volumeOfTank = newWater;
        }
    }

    public void setVolumeOfTank(int volumeOfTank) {
        this.volumeOfTank -= volumeOfTank;
    }

    public int getVolumeOfTank() {
        return volumeOfTank;
    }
}
