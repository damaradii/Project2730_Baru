package com.example.projectbp2730

class LoginModel {

    //variable

    var username = ""
    var password = ""

    //method
    fun loginCek(): Boolean{
        if (username.equals("damaradi") && password.equals("admin")){
            return true
        }else{
            return false
        }
    }
}