package com.example.msaccount.api

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/accounts")
class AccountController {
//    companion object {
//
//        val accounts = listOf("78978978", "78989", "3457677")
//    }
    @RequestMapping("/test")
    fun test(): String{
        return "test"
    }

    @RequestMapping("/list")
    fun getAccounts(): List<String>{
        return listOf("account 1", "account 2", "account 3")
    }
}