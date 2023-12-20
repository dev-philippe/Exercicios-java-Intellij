package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Account {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;


    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public long duration(){

        long  diff = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public void updateDates(Date checkIn ,  Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    public Account(){

    }

    public Account(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber() {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        return "Account "
                + roomNumber
                + ", checkIn: "
                + sdf.format(checkIn)
                + ", checkOut: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " noites";
    }
}

