package dev.buskopan.loans.loansType.loans;

import dev.buskopan.loans.controller.dto.RequestDTO;
import dev.buskopan.loans.enums.LoanType;
import dev.buskopan.loans.loansType.Loan;
import org.springframework.stereotype.Component;

@Component
public class GuaranteedLoan implements Loan {
    @Override
    public LoanType getLoan(RequestDTO dto) {
        double income = dto.income();
        int age = dto.age();
        String location = dto.location();

        if (income <= 3000) {
            return LoanType.GUARANTEED;
        }

        if (income > 3000 && income < 5000 && age < 30 && location.equalsIgnoreCase("SP")) {
            return LoanType.GUARANTEED;
        }

        return null;
    }
}
