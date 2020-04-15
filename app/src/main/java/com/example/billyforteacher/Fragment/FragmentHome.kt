package com.example.billyforteacher.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.billyforteacher.R
import kotlinx.android.synthetic.main.fragment_home.*


class FragmentHome : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_home, container, false)

        return v
    }

    companion object {
        fun newInstance(): FragmentHome{
            val fragment = FragmentHome()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }

    }
}