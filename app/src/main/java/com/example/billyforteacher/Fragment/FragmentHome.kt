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


class FragmentHome : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_home, container, false)

        val reportBully: LinearLayout = v.findViewById<View>(R.id.list_status) as LinearLayout
        reportBully?.setOnClickListener {
            val intent = Intent (activity, BullyReportActivity::class.java)
            startActivity(intent)
        }

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