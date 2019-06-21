package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.Info.StudentInfo;
import com.library.model.Student;

@Controller
public class LibraryController {

@RequestMapping(value ="/index.htm")
public String welcome(Model model){
	
	return"index";
}

}

