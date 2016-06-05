package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ruslan Zhdan on 11.04.2016.
 */
public class ConsoleHelper
{
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString()
    {
        String msg;
        while (true)
        {
            try
            {
                msg = bufferedReader.readLine();
                break;
            }
            catch (IOException e)
            {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");

            }
        }
        return msg;
    }

    public static int readInt()
    {
        int num;
        while (true){
            try
            {
                num = Integer.parseInt(readString());
                break;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
        return num;
    }
}
