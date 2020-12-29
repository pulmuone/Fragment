package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val frag1 = FirstFragment()
        val frag2 = SecondFragment ()

        binding.button.setOnClickListener {
            //Fragment 작업시작
            val tran = supportFragmentManager.beginTransaction()
            //Fragment를 셋팅한다.
            //tran.add(R.id.container1, frag1)
            tran.replace(R.id.container1, frag1)
            tran.addToBackStack(null) //백버튼 뒤로가기
            tran.commit()
        }

        binding.button2.setOnClickListener {
            //Fragment 작업시작
            val tran = supportFragmentManager.beginTransaction()
            //Fragment를 셋팅한다.
            //tran.add(R.id.container1, frag2)
            tran.replace(R.id.container1, frag2)
            tran.addToBackStack(null)
            tran.commit()

        }
    }
}