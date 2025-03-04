package com.example.mvvm_paperdb_retrofit.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mvvm_paperdb_retrofit.R

/**
 * A simple [Fragment] subclass.
 * Use the [AddUpdateTaskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddUpdateTaskFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_update_task, container, false)
    }


}