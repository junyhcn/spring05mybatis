package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.dao.EmployeeMapper;
import com.kgc.entity.Employee;
import com.kgc.entity.EmployeeExample;
import com.kgc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public PageInfo<Employee> findAll(int page, int pageSize, Employee employee) {
        PageHelper.startPage(page,pageSize);//分页
        EmployeeExample example=new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        if(employee.getName()!=null&&employee.getName().length()>0){
            criteria.andNameLike("%"+employee.getName()+"%");
        }
        List<Employee> list=employeeMapper.selectByExample(example);//limit
        PageInfo<Employee> pageInfo=new PageInfo<Employee>(list);
        return pageInfo;
    }
}
