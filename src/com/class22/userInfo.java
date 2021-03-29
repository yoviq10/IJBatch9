package com.class22;

public class userInfo extends UserClassTask{

    String userAddress;

    userInfo(String name, String mobileNumber, String userAddress){
        super(name, mobileNumber);
        this.userAddress=userAddress;


    }


    void userDetail(){
        System.out.println(" name "+super.name+" mobile number "+mobileNumber+" address "+userAddress);
    }


    public static void main(String[] args) {

        userInfo userInfo=new userInfo("yovanna","123445","falls Church");
        userInfo.userDetail();







    }




}
