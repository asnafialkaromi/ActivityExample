package com.example.activityexample.feature.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.activityexample.R
import com.example.activityexample.databinding.FragmentHomeBinding
import com.example.activityexample.feature.detail.DetailActivity
import com.example.activityexample.model.Person

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickAction()
    }

    private fun navigateToProfile (){
        // Old ways
        /*val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("extras_img_profile", R.drawable.ic_profile)
        intent.putExtra("extras_name", "Asnafi")
        intent.putExtra("extras_role", "Software Engineering")
        startActivity(intent)*/

        DetailActivity.startActivity(requireContext(), Person("Asnafi", R.drawable.ic_profile,"Software Enginering", "Lorem ipsum dolor sit amet"))
        Toast.makeText(requireContext(),"Navigate to profile", Toast.LENGTH_SHORT).show()
    }

    private fun setClickAction() {
        binding.btnProfile.setOnClickListener{
            navigateToProfile()
        }
    }
}