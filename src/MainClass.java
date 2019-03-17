package ArrayList_Application;

import java.util.Scanner;


public class MainClass {

    private static ContactList contactList = new ContactList();

    private static Scanner scan = new Scanner(System.in);

    public static void main(String []args)
    {
        System.out.println("\tContact Lists");
        System.out.println("\tMENU");
        int opt;
        boolean flag = true;
        Menu();

        do {

            System.out.print("Select Option : ");
            opt = scan.nextInt();
            scan.nextLine();

            switch (opt)
            {
                case 0:
                {
                    Menu();
                    break;
                }
                case 1:
                {
                    AddNewContacts();
                    break;
                }
                case 2:
                {
                    DisplayContactList();
                    break;
                }
                case 3:
                {
                    UpdateContact();
                    break;
                }
                case 4:
                {
                    RemoveContact();
                    break;
                }
                case 5:
                {
                    SearchContact();
                    break;
                }
                case 6:
                {
                    flag = false;
                }
            }



        }while (flag);



    }




    public static void Menu()
    {
        System.out.println("#1. Add new Contacts.");
        System.out.println("#2. Print List of Contacts.");
        System.out.println("#3. Update Existing Contacts.");
        System.out.println("#4. Remove Contact");
        System.out.println("#5. Search/Find Contact");
        System.out.println("#6. Exit");
    }

    //Add contacts to contact list
    //by getting input ->UserName & User ContactPhoneNo.

    private static void AddNewContacts()
    {
        String name , phoneNo;
        System.out.print("Enter Name : ");
        name = scan.nextLine();
        System.out.print("Enter PhoneNo : ");
        phoneNo = scan.nextLine();

        Contacts contacts = Contacts.mycontact(name,phoneNo);
        contactList.AddContacts(contacts);
    }

    private static void DisplayContactList()
    {
        contactList.DisplayContact();
    }


    private static void UpdateContact()
    {

        System.out.print("Enter Current Contact Name : ");
        contactList.UpdateContact(scan.nextLine());
    }

    private static void RemoveContact()
    {
        System.out.print("Enter Contact Name : ");
        contactList.RemoveExistingContact(scan.nextLine());
    }

    private static void SearchContact()
    {
        String Name;
        System.out.print("Enter Contact Name To Search : ");
        Name = scan.nextLine();
        if(contactList.SearchContact(Name) >= 0)
        {

            contactList.printSearchInfo(Name);

        }
        else
        {
            System.out.println("Contact Not Found.. ");
        }
    }

}
