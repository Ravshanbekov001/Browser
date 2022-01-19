package com.example.browser

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.browser.databinding.ActivityMain2Binding
import com.example.browser.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    var str = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <link rel=\"stylesheet\" href=\"./css/style.css\" />\n" +
            "    <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\n" +
            "    <title>Portfolio</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "    <div class=\"scrollToTop-btn\">\n" +
            "        <i class=\"fas fa-angle-up\"></i>\n" +
            "    </div>\n" +
            "\n" +
            "    <header>\n" +
            "        <a href=\"#\" class=\"brand\">Muhammadnozim</a>\n" +
            "        <div class=\"menu-btn\"><i class=\"fas fa-bars menu_btn\"></i></div>\n" +
            "        <div class=\"navigation\">\n" +
            "            <a href=\"#main\">home</a>\n" +
            "            <a href=\"#about\">about</a>\n" +
            "            <a href=\"#skills\">skills</a>\n" +
            "            <a href=\"#services\">services</a>\n" +
            "            <a href=\"#work\">work</a>\n" +
            "            <a href=\"#contact\">contact</a>\n" +
            "        </div>\n" +
            "    </header>\n" +
            "\n" +
            "    <section class=\"main\" id=\"main\">\n" +
            "        <div class=\"content\">\n" +
            "            <h2>Hello I'm <br> <span>Muhammadnozim</span></h2>\n" +
            "            <div class=\"animated-text\">\n" +
            "                <h3>Blogger</h3>\n" +
            "                <h3>Web Developer</h3>\n" +
            "                <h3>Youtube</h3>\n" +
            "            </div>\n" +
            "            <a class=\"btn\" href=\"#\">See My Work</a>\n" +
            "           \n" +
            "                <ul class=\"socialIcons\">\n" +
            "                    <li><a href=\"#\" class=\"facebook\"><i class=\"fab fa-facebook-f\"></i></a></li>\n" +
            "                    <li><a href=\"#\" class=\"twitter\"><i class=\"fab fa-telegram\"></i></a></li>\n" +
            "                    <li><a href=\"#\" class=\"instagram\"><i class=\"fab fa-instagram\"></i></a></li>\n" +
            "                    <li><a href=\"#\" class=\"googlePlus\"><i class=\"fab fa-google-plus\"></i></a></li>\n" +
            "                    <li><a href=\"#\" class=\"youtube\"><i class=\"fab fa-youtube\"></i></a></li>\n" +
            "                  </ul>\n" +
            "                \n" +
            "        </div>\n" +
            "    </section>\n" +
            "\n" +
            "    <section class=\"about\" id=\"about\">\n" +
            "        <div class=\"title reveal\">\n" +
            "            <div class=\"section-title\">\n" +
            "                About Me\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"content\">\n" +
            "            <div class=\"column col-left reveal\">\n" +
            "                <div class=\"img-card\">\n" +
            "                    <img src=\"./images/qirqilgan.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"column col-right reveal\">\n" +
            "                <h2 class=\"content-title\"> Hey there! I'm <span>Muhammadnozim Anvarbekov</span></h2>\n" +
            "                <p class=\"paragraph-text\">\n" +
            "                    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quasi accusantium libero voluptatem eligendi molestias. Exercitationem architecto corporis perspiciatis distinctio labore a. Nobis doloribus, quaerat voluptas accusamus ut tempora hic numquam explicabo \n" +
            "                </p>\n" +
            "                <br>\n" +
            "                <p class=\"paragraph-text\">\n" +
            "                    Lorem, ipsum dolor sit amet consectetur adipisicing elit. Maxime itaque quibusdam earum. Ipsum enim quam sequi consequuntur similique dolore quae. Maxime itaque quibusdam earum. Exercitationem neque iure eius?\n" +
            "                    Lorem, ipsum dolor sit amet consectetur adipisicing elit.\n" +
            "                </p>\n" +
            "                <a href=\"#\" class=\"btn\">See more</a>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </section>\n" +
            "\n" +
            "    <section class=\"skills\" id=\"skills\">\n" +
            "        <div class=\"title reveal\">\n" +
            "            <div class=\"section-title\">\n" +
            "                My Skills\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"content\">\n" +
            "            <div class=\"column col-left reveal\">\n" +
            "                <h2 class=\"content-title\">My Skills and Experiences</h2>\n" +
            "                <p>\n" +
            "                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. Optio minus provident eius libero vero odit. Repellendus rem consequuntur nemo velit quibusdam, magni ut nam quod dolore non nobis beatae cumque deleniti sapiente consequatur quaerat aliquid recusandae nisi aut suscipit saepe numquam. Cumque facere veritatis quas quisquam laboriosam quidem et perferendis praesentium, obcaecati, at error ducimus repellat unde vitae repellendus neque.\n" +
            "                </p>\n" +
            "                <a href=\"#\" class=\"btn\">See More</a>\n" +
            "            </div>\n" +
            "            <div class=\"column col-right reveal\">\n" +
            "                <div class=\"bar\">\n" +
            "                    <div class=\"info\">\n" +
            "                        <span>HTML</span>\n" +
            "                        <span>90%</span>\n" +
            "                    </div>\n" +
            "                    <div class=\"line html\"></div>\n" +
            "                </div>\n" +
            "                <div class=\"bar\">\n" +
            "                    <div class=\"info\">\n" +
            "                        <span>CSS</span>\n" +
            "                        <span>70%</span>\n" +
            "                    </div>\n" +
            "                    <div class=\"line css\"></div>\n" +
            "                </div>\n" +
            "                <div class=\"bar\">\n" +
            "                    <div class=\"info\">\n" +
            "                        <span>Bootstrap</span>\n" +
            "                        <span>80%</span>\n" +
            "                    </div>\n" +
            "                    <div class=\"line bootstrap\"></div>\n" +
            "                </div>\n" +
            "                <div class=\"bar\">\n" +
            "                    <div class=\"info\">\n" +
            "                        <span>SASS</span>\n" +
            "                        <span>60%</span>\n" +
            "                    </div>\n" +
            "                    <div class=\"line sass\"></div>\n" +
            "                </div>\n" +
            "\n" +
            "                <div class=\"bar\">\n" +
            "                    <div class=\"info\">\n" +
            "                        <span>JavaScript</span>\n" +
            "                        <span>50%</span>\n" +
            "                    </div>\n" +
            "                    <div class=\"line javascript\"></div>\n" +
            "                </div>\n" +
            "                \n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </section>\n" +
            "\n" +
            "    <section class=\"services\" id=\"services\">\n" +
            "        <div class=\"title reveal\">\n" +
            "            <div class=\"section-title\">\n" +
            "                My Services\n" +
            "            </div>\n" +
            "            <p>\n" +
            "                Lorem ipsum dolor sit amet consectetur adipisicing elit. Nisi architecto libero earum blanditiis nam? Facere, temporibus esse saepe animi dolorum quas nam voluptates voluptate veniam hic! Eius beatae ut itaque vitae illum dolorum alias dolores. Ratione commodi doloribus dolores culpa!\n" +
            "            </p>\n" +
            "        </div>\n" +
            "        <div class=\"content\">\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"service-icon\">\n" +
            "                    <i class=\"fas fa-palette\"></i>\n" +
            "                </div>\n" +
            "                    <div class=\"info\">\n" +
            "                    <h3>Web Design</h3>\n" +
            "                        <p>\n" +
            "                            Lorem ipsum, dolor sit amet consectetur adipisicing elit. Omnis cumque facere quasi aspernatur officia assumenda accusantium quae tempora asperiores recusandae.\n" +
            "                        </p>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"service-icon\">\n" +
            "                    <i class=\"fas fa-file-code\"></i>\n" +
            "                </div>\n" +
            "                    <div class=\"info\">\n" +
            "                    <h3>Web Developer</h3>\n" +
            "                        <p>\n" +
            "                            Lorem ipsum, dolor sit amet consectetur adipisicing elit. Omnis cumque facere quasi aspernatur officia assumenda accusantium quae tempora asperiores recusandae.\n" +
            "                        </p>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"service-icon\">\n" +
            "                    <i class=\"fas fa-object-group\"></i>\n" +
            "                </div>\n" +
            "                    <div class=\"info\">\n" +
            "                    <h3>Youtuber</h3>\n" +
            "                        <p>\n" +
            "                            Lorem ipsum, dolor sit amet consectetur adipisicing elit. Omnis cumque facere quasi aspernatur officia assumenda accusantium quae tempora asperiores recusandae.\n" +
            "                        </p>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "        </div>\n" +
            "    </section>\n" +
            "\n" +
            "    <section class=\"work\" id=\"work\">\n" +
            "        <div class=\"title reveal\">\n" +
            "            <div class=\"section-title\">\n" +
            "                My Work\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"content\">\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"card-img\">\n" +
            "                    <img src=\"./images/fon.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"card-img\">\n" +
            "                    <img src=\"./images/oy.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"card-img\">\n" +
            "                    <img src=\"./images/tabiat.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"card-img\">\n" +
            "                    <img src=\"./images/koprik.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"card-img\">\n" +
            "                    <img src=\"./images/kastyum.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"card reveal\">\n" +
            "                <div class=\"card-img\">\n" +
            "                    <img src=\"./images/mukham.jpg\" alt=\"\">\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"title reveal\">\n" +
            "                <a href=\"#\" class=\"btn\">See ALl</a>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </section>\n" +
            "\n" +
            "    <section class=\"contact\" id=\"contact\">\n" +
            "        <div class=\"title reveal\">\n" +
            "            <div class=\"section-title\">\n" +
            "                Contact Me\n" +
            "            </div>\n" +
            "        </div>\n" +
            "        <div class=\"content\">\n" +
            "            <div class=\"row\">\n" +
            "                <div class=\"card reveal\">\n" +
            "                    <div class=\"contact-icon\">\n" +
            "                        <i class=\"fas fa-map-marker-alt\"></i>\n" +
            "                    </div>\n" +
            "                    <div class=\"info\">\n" +
            "                        <h3>Address</h3>\n" +
            "                        <span>Beshtal Xamza Sadaf 65 Hause</span>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"card reveal\">\n" +
            "                    <div class=\"contact-icon\">\n" +
            "                        <i class=\"fas fa-phone\"></i>\n" +
            "                    </div>\n" +
            "                    <div class=\"info\">\n" +
            "                        <h3>Phone</h3>\n" +
            "                        <span>+998 33 024 70 50</span>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"card reveal\">\n" +
            "                    <div class=\"contact-icon\">\n" +
            "                        <i class=\"fas fa-envelope\"></i>\n" +
            "                    </div>\n" +
            "                    <div class=\"info\">\n" +
            "                        <h3>Email Address</h3>\n" +
            "                        <span>anvarbekov@gmail.com</span>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "                <div class=\"card reveal\">\n" +
            "                    <div class=\"contact-icon\">\n" +
            "                        <i class=\"fas fa-globe\"></i>\n" +
            "                    </div>\n" +
            "                    <div class=\"info\">\n" +
            "                        <h3>Website</h3>\n" +
            "                        <span>MyPortfolio.netlify.app</span>\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "            <div class=\"row\">\n" +
            "                <div class=\"contact-form reveal\">\n" +
            "                    <h3>Send Message</h3>\n" +
            "                    <div class=\"input-box\">\n" +
            "                        <input type=\"text\" placeholder=\"Name\">\n" +
            "                    </div>\n" +
            "                    <div class=\"input-box\">\n" +
            "                        <input type=\"text\" placeholder=\"Email\">\n" +
            "                    </div>\n" +
            "                    <div class=\"input-box\">\n" +
            "                        <textarea name=\"\" id=\"\" cols=\"80\" rows=\"8\" placeholder=\"Message\"></textarea>\n" +
            "                    </div>\n" +
            "                    <div class=\"input-box\">\n" +
            "                        <input type=\"submit\" class=\"send-btn\" value=\"Send\">\n" +
            "                    </div>\n" +
            "                </div>\n" +
            "            </div>\n" +
            "        </div>\n" +
            "    </section>\n" +
            "\n" +
            "\n" +
            "    <footer class=\"footer\">\n" +
            "        <span class=\"footer-title\">Muhammadnozim Anvarbekov</span>\n" +
            "        <p>Copyright &copy2022. All Rights Reserved.</p>\n" +
            "    </footer>\n" +
            "\n" +
            "    <script src=\"./JS/script.js\"></script>\n" +
            "</body>\n" +
            "</html>"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val header = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
        binding.webView.loadData(header + str, "text/html", "UTF-8")

        val settings: WebSettings = binding.webView.settings
        settings.defaultTextEncodingName = "utf-8"

        val base64: String = Base64.encodeToString(str.toByteArray(), Base64.DEFAULT)
        binding.webView.loadData(base64, "text/html; charset=utf-8", "base64")

        binding.webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url!!)
                return true
            }
        }
    }
}