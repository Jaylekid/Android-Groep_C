package com.example.yajo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class uploadOrRetrieve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_or_retrieve)

        var pickImage = findViewById<Button>(R.id.img_pick_btn)

        pickImage.setOnClickListener {
            prepOpenImageGallery()
        }
    }

    private fun prepOpenImageGallery() {
        Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI).apply {
            type = "image/*"
            startActivityForResult(this, 2001)
        }
    }
}