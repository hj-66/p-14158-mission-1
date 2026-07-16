package com.back.domain.member.member.entity

import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member(
    @field:Column(unique = true)
    val username: String,
    var password: String,
    var nickname: String
) : BaseEntity() {

    override fun toString(): String = "Member(id=$id, username='$username', nickname='$nickname')"
}
