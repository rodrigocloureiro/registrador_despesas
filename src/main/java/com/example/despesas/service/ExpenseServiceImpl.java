package com.example.despesas.service;

import com.example.despesas.model.Expense;
import com.example.despesas.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense getExpenseById(long id) {
        return null;
    }

    @Override
    public Expense registerExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense editExpense(Expense expense) {
        return null;
    }

    @Override
    public void deleteExpenseById(long id) {
        expenseRepository.deleteById(id);
    }

    @Override
    public void deleteExpense(Expense expense) {
        expenseRepository.delete(expense);
    }
}
