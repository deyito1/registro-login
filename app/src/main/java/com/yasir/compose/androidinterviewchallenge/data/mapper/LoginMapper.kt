package com.yasir.compose.androidinterviewchallenge.data.mapper

import com.yasir.compose.androidinterviewchallenge.data.provider.FakeUserProvider.DummyUser
import com.yasir.compose.androidinterviewchallenge.domain.model.Login
import com.yasir.compose.androidinterviewchallenge.utils.ext.orZero

class LoginMapper {

    fun mapToDomain(remoteLogin: DummyUser): Login {
        return Login(
            userId = remoteLogin.id.orZero(),
            email = remoteLogin.email.orEmpty(),
            password = remoteLogin.password.orEmpty(),
            token = remoteLogin.accessToken.orEmpty(),
        )
    }
}