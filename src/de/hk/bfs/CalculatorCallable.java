package de.hk.bfs;

import java.util.concurrent.Callable;

/**
 *
 * @author palmherby
 */
public class CalculatorCallable implements Callable<Double>{

    private final Contract CONTRACT;

    public CalculatorCallable(Contract CONTRACT) {
        this.CONTRACT = CONTRACT;
    }
    
    @Override
    public Double call() throws Exception {
        return Calculator.calculateInsuranceSum(CONTRACT);
    }
    
}
