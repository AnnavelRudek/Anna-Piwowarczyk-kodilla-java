package com.kodilla.hibernate.manymany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.SearchFacade;
import com.kodilla.hibernate.manytomany.facade.SearchProcessingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
    @SpringBootTest
    public class SearchServiceTestSuite {

        @Autowired
        CompanyDao companyDao;
        @Autowired
        EmployeeDao employeeDao;

        @Autowired
        private SearchFacade searchFacade;

        @Test
        public void testSearchService() throws SearchProcessingException {

            //Given
            Employee johnSmith = new Employee("John", "Smith");
            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

            Company softwareMachine = new Company("Software Machine");
            Company dataMaesters = new Company("Data Maesters");
            Company greyMatter = new Company("Grey Matter");

            softwareMachine.getEmployees().add(johnSmith);
            dataMaesters.getEmployees().add(stephanieClarckson);
            dataMaesters.getEmployees().add(lindaKovalsky);
            greyMatter.getEmployees().add(johnSmith);
            greyMatter.getEmployees().add(lindaKovalsky);

            johnSmith.getCompanies().add(softwareMachine);
            johnSmith.getCompanies().add(greyMatter);
            stephanieClarckson.getCompanies().add(dataMaesters);
            lindaKovalsky.getCompanies().add(dataMaesters);
            lindaKovalsky.getCompanies().add(greyMatter);

            //When
            companyDao.save(softwareMachine);
            companyDao.save(dataMaesters);
            companyDao.save(greyMatter);

            //Then
            try {
                List<Company> result = searchFacade.searchCompaniesWithNameLike("%tw%");
                Assert.assertEquals(3, result.size());
            } catch(SearchProcessingException e) {
                //
            }

            try {
                List<Employee> result = searchFacade.searchEmployeesWithLastnameLike("%ls%");
                Assert.assertEquals(1, result.size());
            } catch(SearchProcessingException e) {
                //
            }

            //Cleanup
            try {
                companyDao.deleteAll();
                employeeDao.deleteAll();
            } catch (Exception e) {
                //do nothing
            }
        }
    }
