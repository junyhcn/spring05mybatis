package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Employee;

public interface EmployeeService {
    //分页查询 page   pageSize  Employee对象

    /**
     *
     * @param page    页面号
     * @param pageSize 每一页有多少行
     * @param employee  封装查询条件
     * @return
     */
    public PageInfo<Employee> findAll(int page,int pageSize,Employee employee);
}
