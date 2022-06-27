package com.example.sendbirdchatapp

import android.app.Application
import com.sendbird.uikit.SendBirdUIKit
import com.sendbird.uikit.adapter.SendBirdUIKitAdapter
import com.sendbird.uikit.interfaces.UserInfo

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SendBirdUIKit.init(object : SendBirdUIKitAdapter {
            override fun getAppId(): String {
                return "A113D5E8-B653-4412-8476-0AF5B8EB01F9"
            }

            override fun getAccessToken(): String {
                return ""
            }

            override fun getUserInfo(): UserInfo {
                return object : UserInfo {
                    override fun getUserId(): String {
                        return "01"
                    }

                    override fun getNickname(): String {
                        return "one"
                    }

                    override fun getProfileUrl(): String {
                        return ""
                    }
                }
            }
        }, this)
    }

}