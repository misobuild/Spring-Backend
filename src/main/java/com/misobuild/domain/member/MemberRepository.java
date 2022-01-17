package com.misobuild.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long>, MemberRepositoryQueryDsl {
    Optional<Member> findByNickname(String nickname);
}
