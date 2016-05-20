package Dc.app.Sampleboot;

import java.util.List;

//import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
@RequestMapping(value="/Emp")

public class EmpController {

	 Emp emp=new Emp();
	 @RequestMapping (value = "/{id}", method=RequestMethod.GET, produces="application/json")
	 public @ResponseBody Emp sample(@PathVariable Long id){
	 emp.setId(id);
	 emp.setName("dc");
	 emp.setEmail("dc@gmail.com");
	 return emp;
}
	 @RequestMapping (value="/save", method=RequestMethod.POST, produces="application/json")
	 public @ResponseBody<Long> Emp save(@RequestBody Emp emp){
		 //List<String>save;
		 
		 System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getEmail());
		 return null;
	 }
	 
	 @RequestMapping (value="/{id}", method=RequestMethod.DELETE,produces="application/json")
	 public @ResponseBody String  sampleone(@PathVariable long id){
		 return "record deleted"+id;
	 }
	 @RequestMapping (value="/{id}",method=RequestMethod.PUT,produces="application/json")
	 public @ResponseBody String sampletwo(@PathVariable long id){
		 return "record updated"+id;
	 }
	 
	@RequestMapping (value="/samplethree",method=RequestMethod.POST,produces="application/json")
	 public @ResponseBody List<Emplist> samplethree(@RequestBody String emp){
		 List<String> samplethree=null;
		samplethree.add(emp);
		 return null;
	 }
}
	
