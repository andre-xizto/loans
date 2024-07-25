package dev.buskopan.loans.loansType;

import dev.buskopan.loans.controller.dto.RequestDTO;
import dev.buskopan.loans.enums.LoanType;

public interface Loan {
    LoanType getLoan (RequestDTO dto);
}
