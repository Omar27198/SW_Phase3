import java.lang.*;
import java.util.*;

public class Main {

    static ArrayList<Product> Gloabal_Products = new ArrayList<>();
    static ArrayList<Store> Gloabal_Stores = new ArrayList<>();

    static ArrayList<Customer> Gloabal_Customers = new ArrayList<>();
    static ArrayList<Store_Owner> Gloabal_Owners = new ArrayList<>();
    static ArrayList<Admin> Gloabal_Admin = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1- Customer Using");
            System.out.println("2- Store Owner Using");
            System.out.println("3- Admin Using");
            System.out.println("4- Exit");
            System.out.println("=====================");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            while (true) {
                // Customer Using
                if (choice == 1) {

                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                // Store Owner Using
                else if (choice == 2) {
                    System.out.println("1-sign_up");
                    System.out.println("2-sign_in");
                    System.out.println("3-Exit!");
                    System.out.println("=====================");
                    int c1 = scan.nextInt();
                    Store_Owner own = new Store_Owner();
                    // Owner Sign Up
                    if (c1 == 1) {
                        ///////////////////////////////////////////////////////////////////////////
                        own.Owner_sign_up(Gloabal_Owners);
                        for (int i = 0; i < Gloabal_Owners.size(); i++){
                            System.out.println("Name: "
                                    + Gloabal_Owners.get(i).getName() + '\t' + " ,Password: "
                                    + Gloabal_Owners.get(i).getPassword() + '\t' + " ,Email: "
                                    + Gloabal_Owners.get(i).getEmail());
                        }

                        while (true) {
                            System.out.println("1-Add Store ");
                            System.out.println("2-Add product to store ");
                            System.out.println("3-Suggest product ");
                            System.out.println("4-Explore products in store ");
                            System.out.println("5-View specific product details ");
                            System.out.println("6-Explore number of views to each product in a store ");
                            System.out.println("7-Get the most viewed product in a store");
                            System.out.println("8-add a new store");
                            System.out.println("9-Exit");
                            System.out.println("=====================");
                            int on = scan.nextInt();

                            // Store Owner:-> Add Store
                            if (on == 1) {
                                own.Add_Store();
                                for (int i = 0; i < own.getOwner_store().size(); i++)
                                    System.out.println(own.getOwner_store().get(i).getName());
                            }

                            //2-Add product to store
                            if (on == 2) {

                            }
                            //3-Suggest product
                            if (on == 3) {

                            }
                            //4-Explore products in store
                            if (on == 4) {

                            }
                            //5-View specific product details
                            if (on == 5) {

                            }
                            //6-Explore number of views to each product in a store
                            if (on == 6) {

                            }
                            //7-Get the most viewed product in a store
                            if (on == 7) {

                            }
                            //8-add a new store
                            if (on == 8) {

                            }
                            else if(on == 9){
                                break;
                            }
                        }
                    }
                    // Owner:-> Sign In
                    if (c1 == 2) {
                        own.Owner_sign_in(Gloabal_Owners);
                        while (true) {
                            System.out.println("1-Add Store ");
                            System.out.println("2-Add product to store ");
                            System.out.println("3-Suggest product ");
                            System.out.println("4-Explore products in store ");
                            System.out.println("5-View specific product details ");
                            System.out.println("6-Explore number of views to each product in a store ");
                            System.out.println("7-Get the most viewed product in a store");
                            System.out.println("8-add a new store");
                            System.out.println("9-Exit");
                            System.out.println("=====================");
                            int on = scan.nextInt();

                            // Store Owner:-> Add Store
                            if (on == 1) {
                                own.Add_Store();
                                for (int i = 0; i < own.getOwner_store().size(); i++)
                                        System.out.println(own.getOwner_store().get(i).getName());
                            }
                            //2-Add product to store
                            if (on == 2) {

                            }
                            //3-Suggest product
                            if (on == 3) {

                            }
                            //4-Explore products in store
                            if (on == 4) {

                            }
                            //5-View specific product details
                            if (on == 5) {

                            }
                            //6-Explore number of views to each product in a store
                            if (on == 6) {

                            }
                            //7-Get the most viewed product in a store
                            if (on == 7) {

                            }
                            //8-add a new store
                            if (on == 8) {

                            }
                            else if(on == 9){
                                break;
                            }
                        }
                    }
                    // Owner Exit
                    else if (c1 == 3)
                    {
                        break;
                    }
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                // Admin Using
                else if (choice == 3) {

                }
                ////////////////////////////////////////////////////////////////////////////////////////////////////////
                else {
                    System.exit(0);
                }
            }
        }
    }
}
