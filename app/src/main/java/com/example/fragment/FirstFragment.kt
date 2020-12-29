package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding?= null
    public val binding get() = _binding!!

    //여기에서 만든 view 를 Fragment의 view 로 사용한다.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
//        val view = inflater.inflate(R.layout.fragment_first, null)
//        return view
        //return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}