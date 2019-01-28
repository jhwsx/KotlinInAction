package com.kotlin.inaction.chapter_4

/**
 *
 * @author wzc
 * @date 2019/1/27
 */
class User9 {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }


}