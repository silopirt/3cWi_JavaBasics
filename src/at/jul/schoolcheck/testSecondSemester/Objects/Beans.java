package at.jul.schoolcheck.testSecondSemester.Objects;

import java.util.Scanner;

public class Beans {
    private int volumeOfBonesTank;

    public Beans(int volumeOfBonesTank) {
        int maxVol = 100;
        if(volumeOfBonesTank >maxVol) {
            System.out.println("Tank kann nur 100g fassen");
        }else {
            this.volumeOfBonesTank = volumeOfBonesTank;
        }
    }

    public void fillBonesTank(int newBones){
        int maxVol = 100;
        if(newBones+this.volumeOfBonesTank >maxVol) {
            System.out.println("Tank kann nur 100g fassen");
            Scanner scanner = new Scanner(System.in);
            newBones = scanner.nextInt();
            fillBonesTank(newBones);
        }else {
            this.volumeOfBonesTank = newBones;
        }
    }

    public void setVolumeOfBonesTank(int volumeOfBonesTank) {
        this.volumeOfBonesTank -= volumeOfBonesTank;
    }

    public int getVolumeOfBonesTank() {
        return volumeOfBonesTank;
    }
}
