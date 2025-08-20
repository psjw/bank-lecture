package com.psjw.basic.common.exception


interface CodeInterface {
    val code: Int
    var message: String
}

enum class ErrorCode(
    override val code: Int,
    override var message: String
) : CodeInterface{
    AUTH_CONFIG_NOT_FOUND(-100, "auth config not found."),
    FAIL_TO_CALL_CLIENT(-101, "fail to call client."),
    CALL_RESULT_BODY_NULL(-102, "body is null."),
}