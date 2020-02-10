package com.yaman.templatepp.pages.homefragment

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.DecelerateInterpolator
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso
import com.yaman.api.response.model.productpagedata.KiehlsProductPageDataResponse
import com.yaman.core.application.BaseFragment
import com.yaman.core.networking.Result
import com.yaman.templatepp.BuildConfig
import com.yaman.templatepp.ComponentManager
import com.yaman.templatepp.R
import com.yaman.templatepp.pages.home.HomeActivity
import com.yaman.templatepp.pages.homefragment.viewmodel.HomeViewModel
import com.yaman.templatepp.pages.homefragment.viewmodel.HomeViewModelFactory
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.IOException
import javax.inject.Inject


class HomeFragment : BaseFragment() {


    @Inject
    lateinit var vewModelFactory: HomeViewModelFactory

    private val component by lazy { ComponentManager.homeFragmentComponent(activity!!) }

    private val viewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this, vewModelFactory).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {

        private var homeActivity: HomeActivity? = null

        @JvmStatic
        fun newInstance() = HomeFragment()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        component.inject(this)

        if (BuildConfig.DEBUG) {
            Log.d("className: ", this.javaClass.simpleName)
        }

        viewModel.getKiehlsProductData()
        observeViewModel()


    }


    private fun observeViewModel() {

        viewModel.homeServicesResult.observe(this, Observer { it ->
            when (it) {
                is Result.Progress -> {

                }
                is Result.Success -> {
                    if (it.data.widgets != null) {
                        loadViews(it.data.widgets!!.leftContent!!.renders)
                    } else {
                        showEmptyView()
                    }
                }

                is Result.Failure -> {
                    when (it.e) {
                        IOException() -> Toast.makeText(
                                activity,
                                R.string.need_internet_posts,
                                Toast.LENGTH_LONG
                        ).show()
                        else -> {
                            Toast.makeText(
                                    activity,
                                    R.string.failed_post_try_again,
                                    Toast.LENGTH_LONG
                            ).show()
                        }
                    }
                }
            }
        })

    }

    private fun loadViews(render: List<KiehlsProductPageDataResponse.Widgets.LeftContent.Render?>?) {

        render?.get(0)?.components?.let { header ->
            headerDraw(header[0])
        }

        render?.get(1)?.components.let { body ->
            bodyDraw(body)
        }

        render?.get(2)?.components?.get(0)?.data?.content?.let {
            htmlText(it)
        }

    }


    private fun headerDraw(component: KiehlsProductPageDataResponse.Widgets.LeftContent.Render.Component?) {

        val linearLayout = LinearLayout(activity)
        linearLayout.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        )
        linearLayout.setBackgroundColor(Color.parseColor(component?.data?.backgroundColour))

        component?.data?.dynamicObjects?.let {

            if (it.size > 1) {
                for (i in it.size until 1) {
                    when (it[i]?.type) {
                        "text" -> {
                            linearLayout.addView(textDraw(it[i]?.textDetail?.textC))
                        }
                    }
                }
            } else {
                when (it[0]?.type) {
                    "text" -> {
                        linearLayout.addView(textDraw(it[0]?.textDetail?.textC))
                    }
                }
            }

            lyPage.addView(linearLayout)
        }

    }


    private fun bodyDraw(component: List<KiehlsProductPageDataResponse.Widgets.LeftContent.Render.Component?>?) {

        for (i in component!!.indices) {
            when (component[i]?.componentId) {

                "Dynamic_3" -> {
                    drawImageSlider(component[i]?.data?.dynamicObjects)
                }
                "Dynamic_4" -> {
                    lyPage.addView(textDraw(component[i]?.data?.dynamicObjects?.get(i)?.textDetail?.textC))
                }
                "Dynamic_5" -> {
                   // lyPage.addView(textDraw(component[i]?.data?.dynamicObjects?.get(i)?.textDetail?.textC))
                }
            }
        }


    }

    private fun drawImageSlider(dynamicObjects: List<KiehlsProductPageDataResponse.Widgets.LeftContent.Render.Component.ComponentData.DynamicObject?>?) {

        for (i in dynamicObjects!!.indices) {
            when (dynamicObjects[i]?.type) {
                "slider" -> {
                    drawSlider(dynamicObjects[i])
                }
            }
        }

    }

    private fun drawSlider(dynamicObject: KiehlsProductPageDataResponse.Widgets.LeftContent.Render.Component.ComponentData.DynamicObject?) {

        val imageView = ImageView(activity)


        dynamicObject?.height?.let {
            //   imageView.layoutParams = LinearLayout.LayoutParams(LinearLayout., it.toInt())
        }

        dynamicObject?.sliderDetail?.images?.get(0)?.let {
            Picasso.with(activity).load(it).into(imageView)
        }

        lyPage.addView(imageView)

    }

    private fun textDraw(textC: KiehlsProductPageDataResponse.Widgets.LeftContent.Render.Component.ComponentData.DynamicObject.TextDetail.TextC?): TextView {
        val tv = TextView(activity)

        textC?.let { it ->

            it.textSize?.let {
                //   tv.width = it
            }

            it.text?.let {
                tv.text = it
            }

            it.textSize?.let {
                tv.textSize = it.toFloat()
            }

            it.textAlign?.let {
                when (it) {
                    "center" -> {
                        tv.textAlignment = View.TEXT_ALIGNMENT_CENTER
                    }
                    "right" -> {
                        tv.textAlignment = View.TEXT_ALIGNMENT_VIEW_END
                    }
                    "left" -> {
                        tv.textAlignment = View.TEXT_ALIGNMENT_VIEW_START
                    }
                    else -> {

                    }
                }
            }

        }

        return tv

    }


    private fun customWebView(htmlText: String) {

        var webView = WebView(activity)
        webView.clearCache(true)
        webView.clearHistory()
        webView.scrollBarStyle = WebView.SCROLLBARS_OUTSIDE_OVERLAY
        val settings = webView.settings
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        settings.javaScriptEnabled = true

        webView.webChromeClient = WebChromeClient()

        webView.loadDataWithBaseURL(null, htmlText, "text/html", "utf-8", null)
    }

    private fun htmlText(htmlText: String) {
        val tv = TextView(activity)
        tv.textSize = 20f

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tv.text = Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT)
        } else {
            tv.text = Html.fromHtml(htmlText)
        }

        lyPage.addView(tv)
    }


    private fun showEmptyView() {
        emptyView.visibility = View.VISIBLE
    }

    private fun hideEmptyView() {
        emptyView.visibility = View.GONE
    }


    private fun showOrHideView(view: View, shouldShow: Boolean) {
        view.animate().alpha(if (shouldShow) 1f else 0f)
                .setDuration(100).interpolator = DecelerateInterpolator()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        homeActivity = context as HomeActivity
    }
}
