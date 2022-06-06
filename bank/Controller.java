package bank;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TransactionHistory;

public class Controller {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();;
    public long getBalanceNumber(){
        return balanceNumber;
    }
    public static long transfer(long money){
      return balanceNumber;
    }
    public void actionTransfer(){
    }
    public void getHistory(){
    }
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        return formatter.format(money);
    }
}
