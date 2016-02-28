package de.hk.bfs;

import java.util.Date;

/**
 *
 * @author palmherby
 */
public class Contract {
    
    private long id;
    private double paymenPerMonth;
    private double insuranceSum;
    private Date startDate;
    private Date endDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getInsuranceSum() {
        return insuranceSum;
    }

    public void setInsuranceSum(double insuranceSum) {
        this.insuranceSum = insuranceSum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPaymenPerMonth() {
        return paymenPerMonth;
    }

    public void setPaymenPerMonth(double paymenPerMonth) {
        this.paymenPerMonth = paymenPerMonth;
    }

    @Override
    public String toString() {
        return "Contract{" + "id=" + id + ", paymenPerMonth=" + paymenPerMonth + ", insuranceSum=" + insuranceSum + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
        
}
