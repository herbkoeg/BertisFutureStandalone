package de.hk.bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author palmherby
 */
public class ContractCalculationMain {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        BatchJobCalculation.runParallel(getContractList(2000),1000);
        
//        BatchJobCalculation.runSequential(getContractList(20));
        
    }
    
    private static List<Contract> getContractList(int size) {
        List<Contract> contractList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            
            Contract contract = new Contract();
            contract.setId(i*100);
            contract.setInsuranceSum(123.d * Math.random());
            contractList.add(contract);
        }
        
        return contractList;
    }
}
