package com.Farzan.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MemberService memberService = context.getBean(MemberService.class);

        Member member = context.getBean(Member.class);

        member.setName("Farzan1");
        member.setFamily("Khalaj");

        memberService.save(member);
    }


}
