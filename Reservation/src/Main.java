import model.Account;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {


        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number: ");
        int number = teclado.nextInt();
        System.out.print("Check-in Date (dd/MM/YYYY): ");
        Date checkIn = sdf.parse(teclado.next());

        System.out.print("Check-out Date (dd/MM/YYYY): ");
        Date checkOut = sdf.parse(teclado.next());

        Date now = new Date();


        if (!checkOut.after(checkIn)){
            System.out.println("Erro na Reserva: As datas de reserva para atualização devem ser futuras");

        }else {
            Account account = new Account(number, checkIn,checkOut);
            System.out.println("Account: " + account);

        }

        teclado.close();


    }






}

