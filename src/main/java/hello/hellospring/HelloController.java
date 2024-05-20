package hello.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello-mvc")
    @ResponseBody // view resolver(template) 파일 사용 안함
    public String HelloMvc(
            @RequestParam("name") String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello-template  " + name;
    }
}
