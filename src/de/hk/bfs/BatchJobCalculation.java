package de.hk.bfs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author palmherby
 */
public class BatchJobCalculation {

    public static void runParallel(List<Contract> contracts, int threadNum) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(threadNum);
        List<Future<Double>> resultList = new ArrayList<>();

        Iterator<Contract> it = contracts.iterator();
        while (it.hasNext()) {
            Contract contract = it.next();
            CalculatorCallable calculatorCallable = new CalculatorCallable(contract);
            resultList.add(executor.submit(calculatorCallable));
        }
        
        // Print results (calculated sums of contracs=
        Iterator<Future<Double>> itResult = resultList.iterator();
        while (itResult.hasNext()) {
            Future<Double> next = itResult.next();
            System.out.println("Calculated Sum:" + next.get());
        }

        // Clear resources
        executor.shutdown();
    }

    public static void runSequential(List<Contract> contracts) throws InterruptedException, ExecutionException {
        Iterator<Contract> it = contracts.iterator();
        while (it.hasNext()) {
            Contract contract = it.next();
            Double insuranceSum = Calculator.calculateInsuranceSum(contract);
            System.out.println("Calculated Sum:" + insuranceSum);
        }
    }
        
}
