package com.example.activityexample.feature.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.activityexample.databinding.ActivityDetailBinding
import com.example.activityexample.model.Person

class DetailActivity : AppCompatActivity() {

    companion object {
        // Old ways
        /*const val EXTRAS_KEY_IMG_PROFILE = "EXTRAS_KEY_IMG_PROFILE"
        const val EXTRAS_KEY_NAME = "EXTRAS_KEY_NAME"
        const val EXTRAS_KEY_ROLE = "EXTRAS_KEY_ROLE"

        fun startActivity(context: Context,imgResDrawable: Int?,name: String?, role: String?){
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRAS_KEY_IMG_PROFILE, imgResDrawable)
            intent.putExtra(EXTRAS_KEY_NAME, name)
            intent.putExtra(EXTRAS_KEY_ROLE, role)
            context.startActivity(intent)
        }*/

        const val EXTRAS_DETAIL_DATA = "EXTRAS_DETAIL_DATA"
        fun startActivity(context: Context, person: Person) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRAS_DETAIL_DATA, person)
            context.startActivity(intent)
        }
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        /*val imgResDrawable = intent.extras?.getInt(EXTRAS_KEY_IMG_PROFILE)
        val textName = intent.extras?.getString(EXTRAS_KEY_NAME)
        val textRole = intent.extras?.getString(EXTRAS_KEY_ROLE)*/

        intent.extras?.getParcelable<Person>(EXTRAS_DETAIL_DATA)?.let {
            setProfileImage(it.imgResDrawable)
            setProfileData(it)


        }
    }

    private fun setProfileData(person: Person) {
        binding.tvName.text = person.name
        binding.tvJobDesc.text = person.jobDesc
        binding.tvMoreDetail.text = person.shortDesc
    }

    private fun setProfileImage(imgResDrawable: Int?) {
        imgResDrawable?.let { binding.ivProfile.setImageResource(it) }
    }
}