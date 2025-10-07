package toy.group_calendar.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClient;
import toy.group_calendar.Utils.RestClientUtil;
import toy.group_calendar.data.Member;
import toy.group_calendar.data.MemberCreateDto;

@RequiredArgsConstructor
@Controller
@RequestMapping("/members")
public class MemberController {

    private final RestClientUtil restClientUtil;

    @GetMapping("/add")
    public String addForm(@ModelAttribute("member") Member member) {
        return "members/addMemberForm";
    }

    @PostMapping("/add")
    public String save(@Valid @ModelAttribute Member member, BindingResult result) {
        if (result.hasErrors()) {
            return "members/addMemberForm";
        }

        var sendResult = restClientUtil.sendPost("members/add", new MemberCreateDto(member.getLoginId(), member.getPassword(), member.getName()), Member.class);

        return "redirect:/";
    }
}
