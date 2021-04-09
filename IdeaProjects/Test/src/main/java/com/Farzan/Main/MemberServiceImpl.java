package com.Farzan.Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService
{
    @Autowired
    private MemberDao memberDao;

    // or do like this:
/*
    @Autowired
    public void setMemberDao(MemberDao memberDao)
    {
        this.memberDao = memberDao;
    }*/

    public void save(Member member)
    {
        memberDao.save(member);
    }
}
