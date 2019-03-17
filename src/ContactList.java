package ArrayList_Application;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {

    private Scanner scan = new Scanner(System.in);

    ArrayList<Contacts> contactList = new ArrayList<>();

    //Add Contacts -> Name & Phone No to ContactList;

    public void AddContacts(Contacts contacts)
    {
        if(SearchContact(contacts.getName()) < 0)
        {
            contactList.add(contacts);
        }
        else
        {
            System.out.println("Contact Already Exist in a List");
        }

    }


    //display Contact List
    public void DisplayContact()
    {
        System.out.println("You have Total " +contactList.size() + " Contacts in your List");

        for(int i=0;i<contactList.size();i++)
        {
            System.out.println(i+1 +". "+contactList.get(i).getName() + " => " +contactList.get(i).getPhoneNo() );
        }


    }



    //update Existing Contact
    public void UpdateContact(String Name)
    {
        Contacts contacts;
        if(SearchContact(Name) >=0)
        {
            int index = SearchContact(Name);
            contacts = contactList.get(index);
            System.out.println("Contact Name => " +contactList.get(index).getName());
            System.out.println("Contact Phone Number => " +contactList.get(index).getPhoneNo());

            System.out.println("Select Option To Change Name or Phone No.");
            System.out.println("1. Update Contact Name.");
            System.out.println("2. Update Contact Phone Number.");
            System.out.print("Enter Option : ");
            int opt = scan.nextInt();
            scan.nextLine();

            switch (opt)
            {
                case 1:
                {
                    String NewName;
                    System.out.print("Enter New Name : ");
                    NewName = scan.nextLine();
                    contacts.setName(NewName);
                    break;
                }

                case 2:
                {
                    String NewPhoneNo;
                    System.out.print("Enter New Phone Number : ");
                    NewPhoneNo = scan.nextLine();
                    contacts.setPhoneNo(NewPhoneNo);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Contact Not Exist in a List");
        }
    }


    //Remove Existing Contact
    public void RemoveExistingContact(String Name)
    {
        int index = SearchContact(Name);
        if(index>=0)
        {
            contactList.remove(index);
        }
        else
        {
            System.out.println("Contact Already Not Exist in the List");
        }
    }


    // Search Conatact with User Contact Name
    public int SearchContact(String Name)
    {

        for(int i=0;i<contactList.size();i++)
        {
            Contacts contacts = contactList.get(i);
            if(contacts.getName().equals(Name))
            {

                return i;
            }
        }

        return -1;

    }


    //function to display the searched contact information
    public void printSearchInfo(String Name)
    {
        int index = SearchContact(Name);


        System.out.println("Contact Name => " +contactList.get(index).getName());
        System.out.println("Contact Phone No. => " +contactList.get(index).getPhoneNo());
    }
}
