package com.eclatsol.fragmentlifecycle.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eclatsol.fragmentlifecycle.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("SecondFragment",">>> CREATED 2")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("SecondFragment",">>> CREATE VIEW 2")
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("SecondFragment",">>> ON VIEW CREATED 2")
//        binding.buttonSecond.setOnClickListener {
//
//        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("SecondFragment",">>> ON VIEW STATE RESTORED")
    }

    override fun onStart() {
        super.onStart()
        Log.e("SecondFragment",">>> START 2")
    }

    override fun onResume() {
        super.onResume()
        Log.e("SecondFragment",">>> RESUME 2")
    }

    override fun onPause() {
        super.onPause()

        Log.e("SecondFragment",">>> PAUSE 2")
    }

    override fun onStop() {
        super.onStop()

        Log.e("SecondFragment",">>> STOP 2")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.e("SecondFragment",">>> On Destroy View 2")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e("SecondFragment",">>> Destroy 2")
    }
}