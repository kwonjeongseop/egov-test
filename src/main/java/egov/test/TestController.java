package egov.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

    @GetMapping("/test.do")
    public String testForm(Model model) {
        model.addAttribute("testVO", new TestVO());  // 빈 VO 객체 전달
        return "test/testForm";  // JSP 경로
    }

    @PostMapping("/testSubmit.do")
    public String testSubmit(TestVO testVO, Model model) {
        model.addAttribute("result", "전송 성공: " + testVO.getName());
        return "test/testResult";  // 결과 페이지
    }
}
