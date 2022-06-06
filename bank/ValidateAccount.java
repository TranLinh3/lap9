package bank;

public class ValidateAccount {
    public final String MOBILE = "0904999999";
    public final String PASS = "dangxuat";
    public boolean checkAccount( String mobile, String pass){
        if(mobile.equals(MOBILE)){
            if(pass.equals(PASS)){
                System.out.println("dang nhap thanh cong");
                return true;
            }else {
                System.out.println("sai mat khau, dang nhap lai i");
                return false;
            }
        }else{
            System.out.println("kiem tra sdt hoac mk");
            return false;
        }
    }
}
