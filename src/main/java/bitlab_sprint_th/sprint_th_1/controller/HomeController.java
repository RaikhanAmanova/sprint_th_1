package bitlab_sprint_th.sprint_th_1.controller;

import bitlab_sprint_th.sprint_th_1.db.DbManager;
import bitlab_sprint_th.sprint_th_1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(Model model){
        List<Student> students = DbManager.getStudents();
        model.addAttribute("pupil", students);
        return "home";
    }

    @GetMapping("/addStudent")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        DbManager.createStudent(student);
        return "redirect:/"; // resp.sendRedirect("/")

    }
}
