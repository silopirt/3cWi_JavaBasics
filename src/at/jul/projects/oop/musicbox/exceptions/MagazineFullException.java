package at.jul.projects.oop.musicbox.exceptions;

public class MagazineFullException extends Exception{
    private int code;

    public MagazineFullException(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
