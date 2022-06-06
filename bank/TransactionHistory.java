package bank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TransactionHistory  {
    private Long id;
    private LocalDate dayTrading;
    private String depscription;
    private String beneficiaryAccount;
    private long money;
    public TransactionHistory(String depscription, String beneficiaryAccount, long money){
        this.id = IdGenerate.getNewID();
        //id để tự động tăng
        this.dayTrading = LocalDate.now();
        //lấy ngày hiện tại
        this.depscription = depscription;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }
    public String getBeneficiaryAccount(){ return beneficiaryAccount;
    }
    public void setBeneficiaryAccount(String beneficiaryAccount){this.beneficiaryAccount = beneficiaryAccount;}
    public Long getId(){return id;
    }
    public LocalDate getDescription(){return depscription;}
    public void setDepscription(String depscription){this.depscription = depscription;}
    public long getMoney(){return money;}
    public void setMoney(long money){this.money = money;}
    public String toString(){
        DateTimeFormatter myFomatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return id + " - " + dayTrading.format(myFomatter) + " - " + depscription + " - " + Controller.formatMoney(money) + " - " + beneficiaryAccount + "\n";

    }
}
