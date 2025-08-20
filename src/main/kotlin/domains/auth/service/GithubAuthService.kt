package com.psjw.basic.domains.auth.service

import com.psjw.basic.common.exception.CustomException
import com.psjw.basic.common.exception.ErrorCode
import com.psjw.basic.config.OAuth2Config
import com.psjw.basic.interfaces.OAuth2TokenResponse
import com.psjw.basic.interfaces.OAuth2UserResponse
import com.psjw.basic.interfaces.OAuthServiceInterface
import org.springframework.stereotype.Service

private const val key = "github"

@Service(key)
class GithubAuthService(
    private val config: OAuth2Config
) : OAuthServiceInterface {
    private val oAuthInfo = config.providers[key] ?: throw CustomException(ErrorCode.AUTH_CONFIG_NOT_FOUND, key)
    override val providerName: String = key

    override fun getToken(code: String): OAuth2TokenResponse {
        TODO("Not yet implemented")
    }

    override fun getUserInfo(accessToken: String): OAuth2UserResponse {
        TODO("Not yet implemented")
    }

}