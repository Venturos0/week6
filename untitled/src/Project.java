import java.util.LinkedList;
import java.sql.*;

public class Project {
    private String name;
    private int cost;
    private int daysToComplete;
    private LinkedList<Employee> workers;

    public Project(String name, int cost, int daysToComplete) {
        this.name = name;
        this.cost = cost;
        this.daysToComplete = daysToComplete;
        System.out.println("Project :" + name + "\nCapital: " + cost + "\nDays To Complete: " + daysToComplete);
    }

    public void hireEmployees() {
        System.out.println("\nEmployees:");
        workers = new LinkedList<Employee>();
        for(int i=0; i<7; i++) {
            String eName = Coders.generate();
            String email = eName.toLowerCase().replace(' ', '.') + "@gmail.com";

            switch(i) {
                case 0:
                    BackendDeveloper bd = new BackendDeveloper(eName, "Back-End Developer", email, ((int)(Math.random()*100))*100);
                    System.out.println(bd);
                    workers.add(bd);
                    break;
                case 1:
                    FrontendDeveloper fd = new FrontendDeveloper(eName, "Front-End Developer", email, ((int)(Math.random()*100))*100);
                    System.out.println(fd);
                    workers.add(fd);
                    break;
                case 2:
                    AndroidDeveloper ad = new AndroidDeveloper(eName, "Android Developer", email, ((int)(Math.random()*100))*100);
                    System.out.println(ad);
                    workers.add(ad);
                    break;
                case 3:
                    IosDeveloper id = new IosDeveloper(eName, "IOS Developer", email, ((int)(Math.random()*100))*100);
                    System.out.println(id);
                    workers.add(id);
                    break;
                case 5:
                    Designer des = new Designer(eName, "Designer", email, ((int)(Math.random()*100))*100);
                    System.out.println(des);
                    workers.add(des);
                    break;
                case 6:
                    ScrumMaster sm = new ScrumMaster(eName, "Scrum Master", email, ((int)(Math.random()*100))*100);
                    System.out.println(sm);
                    workers.add(sm);
                    break;
                case 7:
                    ProductOwner po = new ProductOwner(eName, "Product Owner", email, ((int)(Math.random()*100))*100);
                    System.out.println(po);
                    workers.add(po);
                    break;
            }
        }
    }

    public void implement() {
        System.out.println("\nLogs:");
        int spent = 0;
        for(Employee e : workers) {
            e.work();
            spent += e.getCost() * daysToComplete;
        }
        System.out.println("\nSpent: " + spent);
        System.out.println("Profit: " + (cost - spent));
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setDaysToComplete(int days) {
        this.daysToComplete = days;
    }

    public String getName() {
        return name;
    }
    public int getCost() {
        return cost;
    }
    public int getDaysToComplete() {
        return daysToComplete;
    }
}