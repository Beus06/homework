package application;

import application.database.DBEngine;

public class Main {

    public static void main(String[] args) {


        DBEngine dbEngine = new DBEngine();

        if(dbEngine.isConnected()) {

            System.out.println(dbEngine.listAllMembers());

        } else {
            System.out.println("no connection");
        }



    }


}
