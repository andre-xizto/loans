package dev.buskopan.loans.controller.dto;

import dev.buskopan.loans.enums.LoanType;

public record LoanDTO(LoanType type, int interest_rate) {
}
