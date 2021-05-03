package binod.suman.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   
    @GetMapping("/test")
    public String getCapitalName(@RequestParam String name){
       String capitalName = "Not finding"; 
       if(name.equals("India"))
         capitalName =  "Delhi";
       else if(name.equals("US"))
         capitalName = "Washington";
      return capitalName;   
    }


    

}
