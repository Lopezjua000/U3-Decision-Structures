public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */

    public static void main(String[] args) {

        int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What is your grade level? (9, 19, 11, 12"));
        int discipline = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had?"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("How many money, rounded to the nearest $5, do you have?"));

        if(gradeLevel >= 11) {
           if(discipline >= 1){
               JOptionPane.showMessageDialog(null, "You cant get a ticket");
           }else{

               if(money >= 40){
                   JOptionPane.showMessage(null, "You can purchase a ticket!");
               }else{
                   JOptionPane.showMessage(null, "You can't get a ticket");
               }
           }

        }else{
            JOptionPane.showMessageDialog(null, "You cant get a ticket");
        }



}
