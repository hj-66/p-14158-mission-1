package com.back.domain.post.post.entity

import com.back.domain.member.member.entity.Member
import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class Post(
    @field:ManyToOne
    var author: Member?,

    var title: String,

    @field:Column(columnDefinition = "TEXT")
    var content: String
) : BaseEntity()
