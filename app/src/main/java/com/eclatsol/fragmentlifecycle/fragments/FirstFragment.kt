package com.eclatsol.fragmentlifecycle.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.eclatsol.fragmentlifecycle.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        Log.e(
            "main", "onCreate: ${
                savedInstanceState?.getString("data")
            }"
        )

        Log.e("main", "onCreate: ${savedInstanceState?.getBoolean("keyTrue")}")
        Log.e("FirstFragment", ">>> CREATED")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.e("FirstFragment", ">>> CREATE VIEW")
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("FirstFragment", ">>> ON VIEW CREATED")
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.e("FirstFragment", ">>> ON VIEW STATE RESTORED")
//        savedInstanceState?.let {
//            if (savedInstanceState.getBoolean("keyStore")){
//                Log.e("main", "onViewStateRestored: Success")
//            }
//        }
        super.onViewStateRestored(savedInstanceState)

        if (savedInstanceState != null) {
            // Retrieve saved data from savedInstanceState bundle if needed
            val savedData = savedInstanceState.getString("key")
            Log.e("main", "onViewStateRestored: $savedData")
            // Use the saved data to update your fragment's UI or state
            // For example, update TextView with savedData
        }

        savedInstanceState?.let {
            val savedData = savedInstanceState.getString("key")
            Log.e("main", "onViewStateRestored: Let $savedData")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("FirstFragment", ">>> START")
    }


    override fun onResume() {
        super.onResume()
        Log.e("FirstFragment", ">>> RESUME")
    }

    override fun onPause() {
        super.onPause()

        Log.e("FirstFragment", ">>> PAUSE")
    }

    override fun onStop() {
        super.onStop()

        Log.e("FirstFragment", ">>> STOP")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putBoolean("keyTrue", true)
        outState.putString("data", "Hello World")
        super.onSaveInstanceState(outState)
        Log.e("TAG", "onSaveInstanceState: ")

        //Configure change thay jem ke protrait screen nu landscap screen thay mobile ma tyate saveInstnceState Call thay che
        //Vertical screen ne apne horizontal karvi shavi tyare

        val dataToSave = "some data"
        outState.putString("key", dataToSave)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.e("FirstFragment", ">>> On Destroy View")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("FirstFragment", ">>> Destroy")
    }
}