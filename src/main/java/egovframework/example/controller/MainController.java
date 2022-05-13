package egovframework.example.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.mapper.MainMapper;
import egovframework.example.service.MainService;
 
@Controller
public class MainController {
	@Resource(name="mainTestService")
	private MainService service;
	
	@GetMapping(value = "/main.do")
	public String main(Model model) {
		System.out.println("메인 컨트롤러");
		ArrayList list =service.getList();//여기서 에러
		System.out.println("list길이 "+list.size());
		model.addAttribute("list",list);
		
		return "view/main";
	}
	@GetMapping("/inserId.do")
	public String insert(String id) {
		System.out.println("id "+id);
		service.insert(id);
		return "redirect:/main.do";
	}
}
