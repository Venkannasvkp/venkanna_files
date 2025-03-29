package com.tnsif.capgemani.c2tc.inheritance;

  public class User
  {
    public static void main(String[] args) 
    {
    	Guest guest=new Guest();
    	 guest.Read();
    	 
    	 Developer dev=new Developer();
    	 dev.Read();
    	 dev.write();
    	 
    	 Admin admin =new Admin();
    	 admin.Read();
    	 admin.write();
    	 admin.manage();
    	 }
  }
