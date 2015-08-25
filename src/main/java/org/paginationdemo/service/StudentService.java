package org.paginationdemo.service;

import org.paginationdemo.domain.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

	/**
	 * Finds a "page" of students
	 * 
	 * @param pageable
	 * @return {@link Page} instance
	 */
	Page<Student> findAllPageable(Pageable pageable);

	/**
	 * Saves collection of students
	 * 
	 * @param students
	 * 
	 * @return collection of students
	 */
	Iterable<Student> save(Iterable<Student> students);

}
