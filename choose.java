//anannya Pareek 0-713
import java.util.*;
class choose
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 if you wish to print count of documents printed via Konica minolta");
        System.out.println("Enter 2 if you wish to append");
        System.out.println("Enter 3 if you wish to insert");
        System.out.println("Enter 4 if you wish to delete a node");
        System.out.println("Enter 5 if you wish to print A4 doc information");
        System.out.println("Enter 6 if you wish remove excel files");
        int a=sc.nextInt();
        queue obj=new queue();
        obj.create();
        obj.displayprint();
        switch(a)
        {
            case 1:
            obj.count_KonicaMinolta();
            break;
            case 2:
            obj.append_doc();
            obj.displayprint();
            break;
            case 3:
            obj.insert_doc();
            obj.displayprint();
            break;
            case 4:
            obj.delete_doc();
            obj.displayprint();
            break;
            case 5:
            obj.A4_doc();
            obj.displayprint();
            break;
            case 6:
            obj.remove_excel();
            obj.displayprint();
            break;
            default:
            System.out.println("Error found");
            break;
        }
    }
}
/**Case 1 output:
Name: anannya	size: A4	Printer BrandHp	Software usedWord	Time of Command5.14
Name: Charu	size: A5	Printer BrandKonica minolta	Software usednotepad	Time of Command5.43
Name: Sammy	size: A4	Printer BrandHp	Software usedexcel	Time of Command6.00
The number of documents sent to Konica Minolta is 1*/
/**Case 2 output

Name: Anannya	size: A5	Printer BrandHp	Software usedword	Time of Command5.67
Name: Sarah	size: A5	Printer Brandepison	Software usednotepad	Time of Command6.15
Name: Sam	size: A4	Printer Brandcanon	Software usedexcel	Time of Command6.17
Name: Kriti	size: A4	Printer BrandHp	Software usedWord	Time of Command6.30 */
/**Case 3output:
 * Enter the name of the person after which we are going to insert the function: 
sarah
Enter the name of the person who is to be inserted
Enter name of person printing prinout
Kiti
Enter size of document:A4,A3,B5
A4
Enter brand of the printer which is printing
Canon
Enter name of software in which document is made:
notes
Enter time of the given print command
4.45
Name: anannya	size: A4	Printer BrandHp	Software usedword	Time of Command3.15
Name: sarah	size: A4	Printer BrandEpison	Software usedword	Time of Command3.30
Name: Kiti	size: A4	Printer BrandCanon	Software usednotes	Time of Command4.45
Name: Aryan	size: A3	Printer BrandCanon	Software usedNotepad	Time of Command3.45*/
/**Case 4 output:
 * Name: Anannya	size: A4	Printer BrandHp	Software usedword	Time of Command3.15
Name: sarah	size: A4	Printer BrandEpison	Software usedNotepad	Time of Command3.30
Name: Aryan	size: A4	Printer BrandEpison	Software usedWord	Time of Command3.45
Enter the info of the previous node from that which is to be deleted
Sarah
Name: Anannya	size: A4	Printer BrandHp	Software usedword	Time of Command3.15
Name: sarah	size: A4	Printer BrandEpison	Software usedNotepad	Time of Command3.30
 */

/**Case 5 output:
 * Name: anannya	size: A4	Printer BrandHp	Software usedword	Time of Command4.12
Name: Aryan	size: A4	Printer BrandCanon	Software usedword	Time of Command4.25
 * */

/**
 * */



