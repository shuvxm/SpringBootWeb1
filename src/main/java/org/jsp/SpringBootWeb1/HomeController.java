package org.jsp.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index";
    }

/*          Using servlet without Spring
    @RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        session.setAttribute("result" , result);

        return "result.jsp";
    }
*/

/*    // Servlet with Spring, Model
    @RequestMapping("/add")
    public String add(@RequestParam("num1") int num1, @RequestParam int num2, Model model){

        int result = num1 + num2;
        model.addAttribute("result", result);

        return "result";
    }

 */     // Servlet with Spring, Model AND View
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam int num2, ModelAndView mv){

        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }
}
