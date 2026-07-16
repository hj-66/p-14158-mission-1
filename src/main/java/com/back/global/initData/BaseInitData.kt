package com.back.global.initData

import com.back.domain.member.member.service.MemberService
import com.back.domain.post.post.service.PostService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy
import org.springframework.transaction.annotation.Transactional

@Configuration
class BaseInitData(
    private val memberService: MemberService,
    private val postService: PostService,
    @param: Lazy private val self: BaseInitData?
) {

    @Bean
    fun baseInitDataApplicationRunner(): ApplicationRunner {
        return ApplicationRunner { args: ApplicationArguments? ->
            self?.work1()
        }
    }

    @Transactional
    fun work1() {
        if (memberService.count() > 0) return
        val memberUser1 = memberService.join("user1", "1234", "유저1")
        val memberUser2 = memberService.join("user2", "1234", "유저2")

        if (postService.count() > 0) return

        val post1 = postService.write(memberUser1, "제목 1", "내용 1")
        val post2 = postService.write(memberUser2, "제목 2", "내용 2")
    }
}
