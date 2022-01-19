package com.example.browser

import android.app.ProgressDialog
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.SearchView
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import com.example.browser.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var url = "https://"

    lateinit var binding: ActivityMainBinding

    lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgB.setOnClickListener {
            binding.webView.isGone = true
            binding.txtV.isVisible = true
            binding.txtV2.isVisible = true
            binding.ln2.isVisible = true
            binding.search.setQuery("", false)
        }

//        binding.webView.settings.javaScriptEnabled = true

        progressDialog = ProgressDialog(this)
        progressDialog.setMessage("Loading...")

//        binding.webView.loadUrl("https://www.google.com/")

        binding.search.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding.webView.loadUrl("https://$query")
                binding.txtV.isGone = true
                binding.txtV2.isGone = true
                binding.ln2.isGone = true
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                return true
            }

        })


        binding.webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return true
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                progressDialog.show()
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                progressDialog.hide()
            }
        }
    }


}