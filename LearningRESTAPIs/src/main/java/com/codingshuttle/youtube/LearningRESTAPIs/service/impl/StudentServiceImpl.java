package com.codingshuttle.youtube.LearningRESTAPIs.service.impl;

import com.codingshuttle.youtube.LearningRESTAPIs.dto.AddStudentRequestDto;
import com.codingshuttle.youtube.LearningRESTAPIs.dto.StudentDto;
import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import com.codingshuttle.youtube.LearningRESTAPIs.repository.StudentRepository;
import com.codingshuttle.youtube.LearningRESTAPIs.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtoList = students.stream().map(student->new StudentDto(student.getId(), student.getName(), student.getEmail())).toList();

        return studentDtoList;
    }

    @Override
    public StudentDto getStudentById(Long Id) {
        Student student =  studentRepository.findById(Id).orElseThrow(() -> new IllegalArgumentException("Could not Find this Id"));
        return  modelMapper.map(student , StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto) {
        Student newstudent = modelMapper.map(addStudentRequestDto,Student.class );
        Student student = studentRepository.save(newstudent);
        return modelMapper.map(student , StudentDto.class);
    }

    @Override
    public void deleteStudentById(Long id) {
        if( !studentRepository.existsById(id)){
            throw new IllegalArgumentException("Student does'nt exist");
        }
        else{
            studentRepository.deleteById(id);
        }
    }

    @Override
    public StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto) {
        Student student =  studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Could not Find this Id"));
          modelMapper.map(addStudentRequestDto , student);
          student = studentRepository.save(student);
        return modelMapper.map(student,StudentDto.class);
    }

}
