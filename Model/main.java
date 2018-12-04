/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapplerdb;

import java.util.List;

/**
 *
 * @author Stanley Sie
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RapplerDB db = new RapplerDB();
        RapplerService service = new RapplerService(db);
//        List<Account> accounts = service.getAllAccounts();
//        for (int i = 0; i < accounts.size(); i++) {
//            System.out.println(accounts.get(i).getAdminID() + "\n" +
//                    accounts.get(i).getFirstName() + "\n" +
//                    accounts.get(i).getLastName() + "\n" +
//                    accounts.get(i).getEmailAddress() + "\n" +
//                    accounts.get(i).getPassword() + "\n" +
//                    accounts.get(i).getGender());
//        }
    }
    
}
