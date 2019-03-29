package com.vipCustomer;

public class VipCustomerMain {
    public static void main(String[] args) {
//        VipCustomer berkay = new VipCustomer("berkay", 500, "berkay@mail");
        VipCustomer berkay = new VipCustomer("Berkayy", 5000);
        System.out.println("Name = " + berkay.getName());
        System.out.println("creditLimit = " + berkay.getCreditLimit());
        System.out.println("email = " + berkay.getEmail());
    }
}
