public class Employee{

    boolean isSenior;
    boolean isPartTime;
    int monthsInCompany;

    public Employee() {}

    public void setSenior(boolean senior) {
        isSenior = senior;
    }

    public void setPartTime(boolean partTime) {
        isPartTime = partTime;
    }
    public void setMonthsInCompany(int monthsInCompany) {
        this.monthsInCompany = monthsInCompany;
    }

    public boolean getsBonus(Employee employee){
        System.out.println("This program tests if a company's employee will get bonus.");

        return employee.isSenior || (!employee.isPartTime && employee.monthsInCompany>=6);
    }
}