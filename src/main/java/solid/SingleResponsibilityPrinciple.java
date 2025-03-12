package solid;

// -- A class should have only single purpose

class UserService {

    public void addUser() {
        // add logic
    }

    public void deleteuser(String id) {
        // delete logic
    }

    public void sendNotification() {
        // notification logic
    }

}

public class SingleResponsibilityPrinciple {

}

/*
package solid;

// A class should have only one purpose
class UserManager {
    public void addUser() {
        System.out.println("Adding User");
    }
    public void deleteUser() {
        System.out.println("Deleting User");
    }
//
//    public void sendNotification() {
//        System.out.println("Sending Notification");
//    }
}
class NotificationService {
    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}
public class SingleResponsibilityPrinciple {

}















*/
/*
*   EmployeeService
*       - addEmployee
*       - deleteEmployee
*       - senNotificationsToEmployee
*       - calculateEPF
*   DisAdvantages:
*   ==============
*   Testing is difficult
*   Tight coupling
*   Low Cohesion
*
*  AFTER SRP:
*  ---------
*   Testing is easy
*   Loose coupling
*   High Cohesion
*
* *//*

*/
