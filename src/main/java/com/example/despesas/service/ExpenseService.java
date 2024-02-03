package com.example.despesas.service;

import com.example.despesas.model.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
    Expense getExpenseById(long id);
    Expense registerExpense(Expense expense);
    Expense editExpense(Expense expense);
    void deleteExpenseById(long id);
    void deleteExpense(Expense expense);
}
