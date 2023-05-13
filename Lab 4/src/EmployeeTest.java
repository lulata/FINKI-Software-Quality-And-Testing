import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;
    @BeforeEach
    public void setUp(){
        employee = new Employee();
    }

    @Test
    public void TTT() throws Exception{
        employee.isSenior = true;
        employee.isPartTime = false;
        employee.monthsInCompany = 15;
        // true || (true & true) = true
        assertTrue(employee.getsBonus(employee));
    }

    @Test
    public void TTF() throws Exception{
        employee.isSenior = true;
        employee.isPartTime = false;
        employee.monthsInCompany = 3;
        // true || (true & false ) = true
        assertTrue(employee.getsBonus(employee));
    }

    @Test
    public void TFT() throws Exception{
        employee.isSenior=true;
        employee.isPartTime=true;
        employee.monthsInCompany=8;
        // true || (false & true) = true
        assertTrue(employee.getsBonus(employee));
    }

    @Test
    public void TFF() throws Exception{
        employee.isSenior=true;
        employee.isPartTime=true;
        employee.monthsInCompany=2;
        // true || (false & false) = true
        assertTrue(employee.getsBonus(employee));
    }



    @Test
    public void FTT() throws Exception{
        employee.isSenior = false;
        employee.isPartTime = false;
        employee.monthsInCompany = 27;
        // false || (true & true) = true
        assertTrue(employee.getsBonus(employee));
    }



}