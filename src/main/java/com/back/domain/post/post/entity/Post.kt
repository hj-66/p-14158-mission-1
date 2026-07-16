package com.back.domain.post.post.entity

import com.back.domain.member.member.entity.Member
import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class Post(
    @ManyToOne
    var author: Member? = null,
    title: String = "",
    content: String = "",
) : BaseEntity() {
    var title: String = title
        protected set

    @Column(columnDefinition = "TEXT")
    var content: String = content
        protected set

    fun modify(title: String, content: String) {
        this.title = title
        this.content = content
    }
}
