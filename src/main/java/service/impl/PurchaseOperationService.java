package service.impl;

import java.util.function.IntUnaryOperator;
import service.OperationService;

public class PurchaseOperationService implements OperationService {
    @Override
    public IntUnaryOperator getActionByOperation(int quantity) {
        return x -> x - quantity;
    }
}
