package com.kgc.dao;

import com.kgc.entity.Employee;
import com.kgc.entity.EmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    long countByExample(EmployeeExample example);
    int deleteByExample(EmployeeExample example);


    int deleteByPrimaryKey(Long id);

    /** 向表增加一条记录
     * @param record
     * @return
     */
    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Long id);

    /**
     *
     * @param record  要修改的数据  new Employee(101,"java",2300,"wuhan")
     * @param example  要修改数据的条件  new Employee().setMgr(102)
     * @return
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * 完成修改功能  按id
     * @param record
     * @return
     *
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * 完成修改功能
     * @param record
     * @return
     *
     */
    int updateByPrimaryKey(Employee record);
}