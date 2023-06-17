
public class Bank {
    public static void main(String args[]){
  BankAccount ac1=new BankAccount("ramesh", "rahul",233434, 213349612, "cwxy3949", "Ateli", 100) ;
  BankAccount.credite(ac1, 40);
  BankAccount.credite(ac1, 200);
    float x= BankAccount.credite(ac1, 20);
    System.out.println(x);
    BankAccount.printTransaction(ac1);
   }
}
class BankAccount{
          String Accountholdername;
          String fathername;
          String address;
          String town;
 private  String city;
          String state;
          String country;

 private  int phonenumber;
 private  int aadharnumber;
 private  String pannumber;
 private  int zipcode;
 private  int housenumber;
 private  float balance;
 float [][] transaction= new float [100][2];

     static void updateAddress(BankAccount ac, int houseno , String town, String city, int zipcode, String state, String country){
            ac.housenumber =houseno;
            ac.town=town;
            ac.city=city;
            ac.zipcode=zipcode;
            ac.state=state;
            ac.country=country;
           }
    static void getAddress(BankAccount ac){
           System.out.println(ac.housenumber);
           System.out.println(ac.town);
           System.out.println(ac.city);
           System.out.println( ac.zipcode);
           System.out.println(ac.state);
           System.out.println(ac.country);
           }
   static float credite(BankAccount ac , int credit){
            ac.balance +=credit;
            
            for (int i=0;i<ac.transaction.length;i++){
                if(ac.transaction[i][0] ==0){
                    ac.transaction[i][0]=+credit;
                    ac.transaction[i][1]=ac.balance;
                    break;
                 }
            }
            return ac.balance;

           }
    static float debite(BankAccount ac , int withdraw){
        if(ac.balance< withdraw){throw new ArithmeticException("Insufficient balance !");}   
        else {
            ac.balance -=withdraw;
            for (int i=0;i<ac.transaction.length;i++){
                if(ac.transaction[i][0] ==0){
                    ac.transaction[i][0]=-withdraw;
                    ac.transaction[i][1]=ac.balance;
                    break;}
            }
        }
            return ac.balance;

           }
/////Here are some getters and setters and simple function for updating the private variables
static  float getBalance(BankAccount ac){
        return ac.balance;
       }
static  void  showPan(BankAccount ac){
        if(ac.pannumber==""){System.out.println("add Pan first");}
        else {System.out.println(ac.Accountholdername +"'s pan numberis "+ac.pannumber);}
       }
static String addPan(BankAccount ac ,String pan){
       if(pan.length()<10){throw new ArithmeticException("Enter valid pan Number");}
       else{ac.pannumber =pan; return "Successfully added pan";}
       }
static String addAadhar(BankAccount ac ,int aadhar){
        ac.aadharnumber =aadhar; 
        return "Successfully added aadhar";
        }
static  void showAadhar(BankAccount ac){
            if(ac.aadharnumber==0){System.out.println("add Pan first");}
            else {System.out.println(ac.Accountholdername +"'s aahar numberis "+ac.aadharnumber);}
           }
static  String updateMobileNumber(BankAccount ac , int mobnumber){
        ac.phonenumber=mobnumber;
        return "Mobile number added successfully";
        }
static void printTransaction(BankAccount ac){
        int n=ac.transaction.length+5;
        for(int i=0 ;i<n;i++){
        int y=2;
        if(ac.transaction[0][1]==0 && ac.transaction[2][0]==0){System.out.println("No transaction done yet ! and balance = "+ac.balance); break;}
        else if (ac.transaction[i][0] >0){System.out.println("Credited amount " +ac.transaction[i][0] +" balance "+ac.transaction[i][1]);}
        else if (ac.transaction[i][0] <0){System.out.println("Debited amount " +ac.transaction[i][0] +" balance "+ac.transaction[i][1]);}
        else{break;}
        }
}
BankAccount(String name, String fathern, int aadharno, int mobno, String city, int balance){
    this.Accountholdername=name;
    this.fathername=fathern;
    this.aadharnumber=aadharno;
    this.phonenumber=mobno;
    this.city=city;
    this.balance=balance;
    System.out.println("Child's Account");

}
BankAccount(String name, String fathern,int mobno, int aadharno, String pan, String city, int balance){
    this.Accountholdername=name;
    this.fathername=fathern;
    this.aadharnumber=aadharno;
    this.pannumber=pan;
    this.phonenumber=mobno;
    this.city=city;
    this.balance=balance;
    System.out.println("Account of 18+ person");
}
BankAccount(String name, String fathern, int mobno,  int aadharno, String pan, int houseno, String town, String city, int zipcode ,String state ,String country,int balance){
    this.Accountholdername=name;
    this.fathername=fathern;
    this.phonenumber=mobno;
    this.aadharnumber=aadharno;
    this.pannumber=pan;
    this.housenumber=houseno;
    this.town=town;
    this.city=city;
    this.zipcode=zipcode;
    this.state=state;
    this.country=country;
    this.balance=balance;
    
}


}