package com.example.billyforteacher.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.billyforteacher.R

class FragmentForum : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_forum, container, false)

        return v
    }

    companion object {
        fun newInstance(): FragmentForum{
            val fragment = FragmentForum()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }

    }
}