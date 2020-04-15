package com.example.billyforteacher.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.example.billyforteacher.BullyReportActivity
import com.example.billyforteacher.R

class FragmentStudent : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_student, container, false)

        return v
    }

    companion object {
        fun newInstance(): FragmentStudent{
            val fragment = FragmentStudent()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }

    }

}