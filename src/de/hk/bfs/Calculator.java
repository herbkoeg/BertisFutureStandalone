package de.hk.bfs;

import java.util.Date;

/**
 *
 * @author palmherby
 */
public class Calculator {

    public static double calculateInsuranceSum(Contract contract) throws InterruptedException {
        Date birthDate = getCustomersBirthdate(contract.getId());
        return birthDate.getSeconds() * Math.random();
    }
    
    private static Date getCustomersBirthdate(long contractId) throws InterruptedException{
        // Old Cobol System, which needs long time to find a customer
        Thread.sleep(1000l);
        return new Date(System.currentTimeMillis());
    }
}
