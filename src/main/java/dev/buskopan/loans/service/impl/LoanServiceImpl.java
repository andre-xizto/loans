package dev.buskopan.loans.service.impl;

import dev.buskopan.loans.controller.dto.RequestDTO;
import dev.buskopan.loans.enums.LoanType;
import dev.buskopan.loans.loansType.Loan;
import dev.buskopan.loans.service.LoanService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class LoanServiceImpl implements LoanService {

    private final List<Loan> loans;

    public LoanServiceImpl(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public List<LoanType> getLoans(RequestDTO dto) {
        List<LoanType> loansType = new ArrayList<>();
        for (Loan loan : loans) {
            LoanType type = loan.getLoan(dto);
            if (type != null) {
                loansType.add(type);
            }
        }
        return loansType;
    }
}
