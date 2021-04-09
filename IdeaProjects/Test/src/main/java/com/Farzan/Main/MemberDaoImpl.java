package com.Farzan.Main;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberDaoImpl implements MemberDao
{
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Member member)
    {
        entityManager.persist(member);
    }
}
