import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeParamTest {
    Employee employee = new Employee();
    @Parameterized.Parameters
    static Collection parameters(){
        return Arrays.asList(new Object[][]{
                {true,false,15},
                {true,false,3},
                {true,true,8},
                {true,true,2},
                {false,false,27},
        });
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void paramTestEquals(boolean isSenior, boolean isPartTime, int monthsInCompany){
        employee.setMonthsInCompany(monthsInCompany);
        employee.setPartTime(isPartTime);
        employee.setSenior(isSenior);
        boolean expResult = isSenior || (!isPartTime && monthsInCompany>=6);
        assertEquals(expResult,employee.getsBonus(employee));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void paramTestTrue(boolean isSenior, boolean isPartTime, int monthsInCompany){
        employee.setMonthsInCompany(monthsInCompany);
        employee.setPartTime(isPartTime);
        employee.setSenior(isSenior);
        boolean expResult = isSenior || (!isPartTime && monthsInCompany>=6);
        assertTrue(expResult == employee.getsBonus(employee));
    }
}