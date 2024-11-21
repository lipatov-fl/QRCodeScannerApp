package com.example.qrcodescannerapp

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.qrcodescannerapp.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url = intent.getStringExtra("url")
        binding.webView.webViewClient = WebViewClient()
        binding.webView.settings.javaScriptEnabled = true
        if (url != null) {
            binding.webView.loadUrl(url)
        }
    }
}