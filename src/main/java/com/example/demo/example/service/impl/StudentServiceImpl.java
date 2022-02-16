package com.example.demo.example.service.impl;

import com.example.demo.example.dao.StudentMapper;
import com.example.demo.example.entity.Student;
import com.example.demo.example.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = Logger.getLogger(StudentServiceImpl.class);
    private StudentMapper studentDao;

    @Resource
    public void setStudentDao(StudentMapper studentDao){
        this.studentDao = studentDao;
    }

    @Override
    public int deleteByPrimaryKey(Long studentId) {
        return studentDao.deleteByPrimaryKey(studentId);
    }

    @Override
    public int insert(Student record) {
        logger.info("updating data...");
        return studentDao.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentDao.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Long studentId) {
        return studentDao.selectByPrimaryKey(studentId);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentDao.updateByPrimaryKey(record);
    }
}
