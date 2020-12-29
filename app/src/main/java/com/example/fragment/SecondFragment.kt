package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.FragmentFirstBinding
import com.example.fragment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding?= null
    public val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
//        val view = inflater.inflate(R.layout.fragment_second, null)
//        return view
        //return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}