package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Employee> searchEmployeesWithLastnameLike(final String arg) throws SearchProcessingException {
        boolean wasError = false;
        List<Employee> employeesWithLastnameSearchResult = new ArrayList<>();
        employeesWithLastnameSearchResult.addAll(employeeDao.retrieveEmployeeByLastNameLike(arg));
        if(employeesWithLastnameSearchResult.size() == 0) {
            LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return employeesWithLastnameSearchResult;
        }
    }

    public List<Company> searchCompaniesWithNameLike(final String arg) throws SearchProcessingException {
        boolean wasError = false;
        List<Company> companiesWithNameSearchResult = companyDao.retrieveCompaniesWithNameLike(arg);
        if(companiesWithNameSearchResult.size() == 0) {
            LOGGER.error(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
        } else {
            return companiesWithNameSearchResult;
        }
    }
}