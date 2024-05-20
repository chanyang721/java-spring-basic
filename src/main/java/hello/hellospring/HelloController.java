package hello.hellospring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello-mvc")
    @ResponseBody // view resolver -> HttpMessageConverter 사용
    public String HelloMvc(
            @RequestParam("name") String name
    ) {
        Hello hello = new Hello();
        hello.setName("test");
        return "hello-template  " + hello.getName();
    }

    public class Hello {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
