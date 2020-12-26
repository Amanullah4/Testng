package Class22;

public class UserInfo extends UserClass {
    String userAdress;

    UserInfo (String name, String mobileNumber, String adress){
        super(name, mobileNumber);//these three lines are constructor
        super.mobileNumber = mobileNumber;
        this.userAdress = adress;
    }
    void userDetails() {
        System.out.println("User name is " + super.name + " has a phone number " + super.mobileNumber + "and lives in " + userAdress);
    }
    public static void main(String[] args) {
    UserInfo userInfo = new UserInfo("Ali", "8585894994", "87hghhh");
    userInfo.userDetails();
    }
}
