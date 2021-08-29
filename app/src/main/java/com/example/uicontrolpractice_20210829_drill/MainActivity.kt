package com.example.uicontrolpractice_20210829_drill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        로그인 버튼을 누르면 아이디와 비밀번호를 받아온다
        loginBtn.setOnClickListener {
            var inputid = idEdt.text.toString()
            var inputPw = pwEdt.text.toString()

            if (inputId == "admin" && inputPw == "qwer") {
                Toast.makeText(this, "관리자님 반갑습니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "로그인이 실패했습니다.", Toast.LENGTH_SHORT).show()
            }


        }


    }
}