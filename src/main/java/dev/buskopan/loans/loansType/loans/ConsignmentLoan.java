package dev.buskopan.loans.loansType.loans;

import dev.buskopan.loans.controller.dto.RequestDTO;
import dev.buskopan.loans.enums.LoanType;
import dev.buskopan.loans.loansType.Loan;
import org.springframework.stereotype.Component;

@Component
public class ConsignmentLoan implements Loan {
    @Override
    public LoanType getLoan(RequestDTO dto) {
        double income = dto.income();

        if (income >= 5000) {
            return LoanType.CONSIGNMENT;
        }

        return null;
    }
}
