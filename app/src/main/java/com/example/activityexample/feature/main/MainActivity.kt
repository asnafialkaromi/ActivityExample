package com.example.activityexample.feature.main

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.activityexample.R
import com.example.activityexample.databinding.ActivityMainBinding
import com.example.activityexample.feature.detail.DetailActivity

class MainActivity : AppCompatActivity() {

    private val TAG: String? = MainActivity::class.java.name

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "OnStart: Activity Create")
        setContentView(binding.root)
        //setClickAction()
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        val navController = findNavController(R.id.main_nav_host)
        binding.bnvMain.setupWithNavController(navController)
    }

    /*private fun setClickAction() {
        binding.btnProfile.setOnClickListener{
            navigateToProfile()
        }
    }*/

    private fun navigateToProfile (){
        // Old ways
        /*val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("extras_img_profile", R.drawable.ic_profile)
        intent.putExtra("extras_name", "Asnafi")
        intent.putExtra("extras_role", "Software Engineering")
        startActivity(intent)*/

        /*DetailActivity.startActivity("Asnafi", R.drawable.ic_profile,
            "Software Engineering", "Lorem ipsum")*/
        Toast.makeText(this,"Navigate to profile", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        Log.d(TAG, "OnStart: Activity Start")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG, "OnStart: Activity Resume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "OnStart: Activity Pause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "OnStart: Activity Stop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "OnStart: Activity Destroy")
        super.onDestroy()
    }
}