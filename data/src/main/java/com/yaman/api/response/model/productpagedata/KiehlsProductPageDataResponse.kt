package com.yaman.api.response.model.productpagedata


import com.google.gson.annotations.SerializedName

data class KiehlsProductPageDataResponse(
        @SerializedName("google_tracking_id")
        var googleTrackingId: String?,
        @SerializedName("header")
        var header: Header?,
        @SerializedName("hide_menu_shadow")
        var hideMenuShadow: Int?, // 1
        @SerializedName("hide_nav_bar")
        var hideNavBar: Boolean?, // false
        @SerializedName("language")
        var language: String?, // tr
        @SerializedName("left_menu")
        var leftMenu: LeftMenu?,
        @SerializedName("left_menu_border_color")
        var leftMenuBorderColor: String?, // #7f7f7f
        @SerializedName("left_menu_width")
        var leftMenuWidth: Int?, // 216
        @SerializedName("left_top_height")
        var leftTopHeight: Int?, // 145
        @SerializedName("navigation")
        var navigation: Any?, // null
        @SerializedName("offline_force_update")
        var offlineForceUpdate: Int?, // 1
        @SerializedName("overlay_view")
        var overlayView: OverlayView?,
        @SerializedName("page_description")
        var pageDescription: String?, // Parabensiz yapısıyla göz çevresindeki kaz ayaklarını ve koyu halkaları azaltır. Göz çevresini nemlendirir ve cilt dokusunu düzeltir.
        @SerializedName("page_info")
        var pageInfo: PageInfo?,
        @SerializedName("page_title")
        var pageTitle: String?, // Powerful Wrinkle Reducing Eye Cream
        @SerializedName("page_type")
        var pageType: String?,
        @SerializedName("page_url")
        var pageUrl: String?, // https://www.kiehls.com.tr/powerful-wrinkle-reducing-eye-cream
        @SerializedName("popup")
        var popup: Any?, // null
        @SerializedName("progress_colour")
        var progressColour: String?, // #ff0000
        @SerializedName("progress_text")
        var progressText: String?,
        @SerializedName("pull_to_refresh")
        var pullToRefresh: Any?, // null
        @SerializedName("reset_iframe")
        var resetIframe: String?, // 0
        @SerializedName("right_menu_width")
        var rightMenuWidth: Int?, // 260
        @SerializedName("session")
        var session: Any?, // null
        @SerializedName("shake_link")
        var shakeLink: Any?, // null
        @SerializedName("widgets")
        var widgets: Widgets?
) {
    data class Header(
            @SerializedName("component_hash")
            var componentHash: String?, // 572b9a939187870721986c660c0ae895
            @SerializedName("component_id")
            var componentId: String?, // Header_1
            @SerializedName("component_is_sticky")
            var componentIsSticky: Boolean?, // false
            @SerializedName("component_name")
            var componentName: String?, // Header
            @SerializedName("data")
            var headerdata: Headerdata?,
            @SerializedName("widget_alias")
            var widgetAlias: String? // ca_mobile_header
    ) {
        data class Headerdata(
                @SerializedName("background_colour")
                var backgroundColour: String?, // #ffffff
                @SerializedName("background_colour_hover")
                var backgroundColourHover: String?, // #cccccc
                @SerializedName("bottom_bar_background_colour")
                var bottomBarBackgroundColour: String?, // #cccccc
                @SerializedName("is_transparent")
                var isTransparent: Boolean?, // false
                @SerializedName("left_link_1")
                var leftLink1: LeftLink1?,
                @SerializedName("menu_lock")
                var menuLock: Int?, // 1
                @SerializedName("progress_colour")
                var progressColour: String?, // #ff0000
                @SerializedName("right_link_1")
                var rightLink1: RightLink1?,
                @SerializedName("text_colour")
                var textColour: String?, // #434343
                @SerializedName("title_c")
                var titleC: TitleC?,
                @SerializedName("title_image")
                var titleImage: String? // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-08/25/logo-1503624275.png
        ) {
            data class LeftLink1(
                    @SerializedName("component_hash")
                    var componentHash: String?, // 55eb88023febaf7f3988098d4feaab28
                    @SerializedName("component_id")
                    var componentId: String?, // Link_3
                    @SerializedName("component_is_sticky")
                    var componentIsSticky: Boolean?, // false
                    @SerializedName("component_name")
                    var componentName: String?, // Link
                    @SerializedName("data")
                    var leftLink1data: LeftLink1data?,
                    @SerializedName("widget_alias")
                    var widgetAlias: String? // ca_mobile_header
            ) {
                data class LeftLink1data(
                        @SerializedName("image")
                        var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-07/27/back.png
                        @SerializedName("link")
                        var link: String?, // #back
                        @SerializedName("serialize_widget")
                        var serializeWidget: String?, // 0
                        @SerializedName("text")
                        var text: String?, // Geri
                        @SerializedName("transition_type")
                        var transitionType: String? // back
                )
            }

            data class RightLink1(
                    @SerializedName("component_hash")
                    var componentHash: String?, // a4d6a5ed05bd257ea5cc273dea27bbe8
                    @SerializedName("component_id")
                    var componentId: String?, // Link_4
                    @SerializedName("component_is_sticky")
                    var componentIsSticky: Boolean?, // false
                    @SerializedName("component_name")
                    var componentName: String?, // Link
                    @SerializedName("data")
                    var rightLink1Data: RightLink1Data?,
                    @SerializedName("widget_alias")
                    var widgetAlias: String? // ca_mobile_header
            ) {
                data class RightLink1Data(
                        @SerializedName("image")
                        var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-07/27/basket-1501161065.png
                        @SerializedName("image_alternative")
                        var imageAlternative: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-07/27/basket.png
                        @SerializedName("is_cart")
                        var isCart: Boolean?, // true
                        @SerializedName("left_margin")
                        var leftMargin: String?, // 13
                        @SerializedName("link")
                        var link: String?, // /cart
                        @SerializedName("serialize_widget")
                        var serializeWidget: String?, // 0
                        @SerializedName("text")
                        var text: String?, // Cart
                        @SerializedName("text_align")
                        var textAlign: String?, // center
                        @SerializedName("text_hide")
                        var textHide: Boolean?, // false
                        @SerializedName("title_c")
                        var titleC: TitleC?,
                        @SerializedName("top_margin")
                        var topMargin: String?, // 9
                        @SerializedName("transition_type")
                        var transitionType: String?, // forward
                        @SerializedName("width")
                        var width: String? // 18
                ) {
                    data class TitleC(
                            @SerializedName("class_name")
                            var className: Any?, // null
                            @SerializedName("font")
                            var font: String?, // TimesNewRomanPSMT
                            @SerializedName("subname")
                            var subname: Any?, // null
                            @SerializedName("text")
                            var text: String?, // 0
                            @SerializedName("text_colour")
                            var textColour: String?, // #000000
                            @SerializedName("text_size")
                            var textSize: Int? // 12
                    )
                }
            }

            data class TitleC(
                    @SerializedName("class_name")
                    var className: Any?, // null
                    @SerializedName("font")
                    var font: String?, // TimesNewRomanPSMT
                    @SerializedName("subname")
                    var subname: Any?, // null
                    @SerializedName("text")
                    var text: String?,
                    @SerializedName("text_colour")
                    var textColour: String?, // #434343
                    @SerializedName("text_size")
                    var textSize: Int? // 16
            )
        }
    }

    data class LeftMenu(
            @SerializedName("background_colour")
            var backgroundColour: String?, // #000000
            @SerializedName("background_image")
            var backgroundImage: String? // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-08/01/menu_background_image__b.png
    )

    data class OverlayView(
            @SerializedName("component_hash")
            var componentHash: String?, // bcd7b5bb08471417c08fe95b3d405d58
            @SerializedName("component_id")
            var componentId: String?, // Dynamic_20
            @SerializedName("component_is_sticky")
            var componentIsSticky: Boolean?, // false
            @SerializedName("component_name")
            var componentName: String?, // Dynamic
            @SerializedName("data")
            var overlayViewData: OverlayViewData?,
            @SerializedName("widget_alias")
            var widgetAlias: Any? // null
    ) {
        data class OverlayViewData(
                @SerializedName("dynamic_objects")
                var dynamicObjects: List<DynamicObject?>?,
                @SerializedName("height")
                var height: String?, // 95
                @SerializedName("width")
                var width: String? // 30
        ) {
            data class DynamicObject(
                    @SerializedName("background_colour")
                    var backgroundColour: String?, // #b40c19
                    @SerializedName("class_name")
                    var className: Any?, // null
                    @SerializedName("height")
                    var height: String?, // 95
                    @SerializedName("image_detail")
                    var imageDetail: ImageDetail?,
                    @SerializedName("link_c")
                    var linkC: LinkC?,
                    @SerializedName("object_id")
                    var objectId: String?, // randomObjId_696772
                    @SerializedName("position")
                    var position: Position?,
                    @SerializedName("subname")
                    var subname: Any?, // null
                    @SerializedName("type")
                    var type: String?, // image
                    @SerializedName("width")
                    var width: String? // 30
            ) {
                data class ImageDetail(
                        @SerializedName("class_name")
                        var className: Any?, // null
                        @SerializedName("image")
                        var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/02/canli_destek_img.png
                        @SerializedName("mode")
                        var mode: String?, // scale_to_fill
                        @SerializedName("subname")
                        var subname: Any?, // null
                        @SerializedName("type")
                        var type: String? // normal
                )

                data class LinkC(
                        @SerializedName("component_hash")
                        var componentHash: String?, // 67f919ddc15bf8761cc4be6fe52737fa
                        @SerializedName("component_id")
                        var componentId: String?, // Link_22
                        @SerializedName("component_is_sticky")
                        var componentIsSticky: Boolean?, // false
                        @SerializedName("component_name")
                        var componentName: String?, // Link
                        @SerializedName("data")
                        var linkCdata: LinkCdata?,
                        @SerializedName("widget_alias")
                        var widgetAlias: String? // mobile_static_content
                ) {
                    data class LinkCdata(
                            @SerializedName("link")
                            var link: String? // /plugin/snapengage/start-link
                    )
                }

                data class Position(
                        @SerializedName("class_name")
                        var className: Any?, // null
                        @SerializedName("right")
                        var right: String?, // 0
                        @SerializedName("subname")
                        var subname: Any?, // null
                        @SerializedName("top")
                        var top: String? // 237
                )
            }
        }
    }

    data class PageInfo(
            @SerializedName("metadata")
            var metadata: Metadata?,
            @SerializedName("social_data")
            var socialData: SocialData?
    ) {
        data class Metadata(
                @SerializedName("description")
                var description: String?, // Parabensiz yapısıyla göz çevresindeki kaz ayaklarını ve koyu halkaları azaltır. Göz çevresini nemlendirir ve cilt dokusunu düzeltir.
                @SerializedName("keywords")
                var keywords: String?,
                @SerializedName("title")
                var title: String? // Powerful Wrinkle Reducing Eye Cream | Kiehl's
        )

        data class SocialData(
                @SerializedName("0")
                var x0: X0?,
                @SerializedName("10")
                var x10: X10?,
                @SerializedName("11")
                var x11: X11?,
                @SerializedName("12")
                var x12: X12?,
                @SerializedName("2")
                var x2: X2?,
                @SerializedName("3")
                var x3: X3?,
                @SerializedName("5")
                var x5: X5?,
                @SerializedName("6")
                var x6: X6?,
                @SerializedName("7")
                var x7: X7?,
                @SerializedName("8")
                var x8: X8?,
                @SerializedName("9")
                var x9: X9?
        ) {
            data class X0(
                    @SerializedName("content")
                    var content: String?, // article
                    @SerializedName("property")
                    var `property`: String? // og:type
            )

            data class X10(
                    @SerializedName("content")
                    var content: String?, // https://www.kiehls.com.tr/powerful-wrinkle-reducing-eye-cream
                    @SerializedName("property")
                    var `property`: String? // og:url
            )

            data class X11(
                    @SerializedName("content")
                    var content: String?, // Kiehl's
                    @SerializedName("property")
                    var `property`: String? // og:site_name
            )

            data class X12(
                    @SerializedName("content")
                    var content: String?, // https://cdn.commerce.multiscreen.technology/loreal/loreal_kiehls/product_images/11158_1_1.jpg?1580429321
                    @SerializedName("property")
                    var `property`: String? // og:image
            )

            data class X2(
                    @SerializedName("content")
                    var content: String?, // 250
                    @SerializedName("property")
                    var `property`: String? // og:image:width
            )

            data class X3(
                    @SerializedName("content")
                    var content: String?, // 250
                    @SerializedName("property")
                    var `property`: String? // og:image:height
            )

            data class X5(
                    @SerializedName("content")
                    var content: String?, // all
                    @SerializedName("name")
                    var name: String? // robots
            )

            data class X6(
                    @SerializedName("content")
                    var content: String?, // all
                    @SerializedName("name")
                    var name: String? // googlebot
            )

            data class X7(
                    @SerializedName("content")
                    var content: String?, // summary
                    @SerializedName("property")
                    var `property`: String? // twitter:card
            )

            data class X8(
                    @SerializedName("content")
                    var content: String?, // Powerful Wrinkle Reducing Eye Cream
                    @SerializedName("property")
                    var `property`: String? // og:title
            )

            data class X9(
                    @SerializedName("content")
                    var content: String?, // Parabensiz yapısıyla göz çevresindeki kaz ayaklarını ve koyu halkaları azaltır. Göz çevresini nemlendirir ve cilt dokusunu düzeltir.
                    @SerializedName("property")
                    var `property`: String? // og:description
            )
        }
    }

    data class Widgets(
            @SerializedName("footer")
            var footer: Footer?,
            @SerializedName("header")
            var header: Header?,
            @SerializedName("left")
            var left: Left?,
            @SerializedName("left_content")
            var leftContent: LeftContent?,
            @SerializedName("left_top")
            var leftTop: LeftTop?
    ) {
        data class Footer(
                @SerializedName("renders")
                var renders: List<Render?>?
        ) {
            data class Render(
                    @SerializedName("components")
                    var components: List<Component?>?,
                    @SerializedName("module_name")
                    var moduleName: String? // footer_prepend
            ) {
                data class Component(
                        @SerializedName("alias")
                        var alias: String?, // gdpr_dynamic_view
                        @SerializedName("component_hash")
                        var componentHash: String?, // 7515e0de35fe6b59379b9b577ff5ed22
                        @SerializedName("component_id")
                        var componentId: String?, // gdpr_dynamic_view
                        @SerializedName("component_is_sticky")
                        var componentIsSticky: Boolean?, // false
                        @SerializedName("component_name")
                        var componentName: String?, // Dynamic
                        @SerializedName("data")
                        var componentData: ComponentData?,
                        @SerializedName("widget_alias")
                        var widgetAlias: Any? // null
                ) {
                    data class ComponentData(
                            @SerializedName("title")
                            var title: String?,
                            @SerializedName("content")
                            var content: String?, // <p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong>Powerful Wrinkle Reducing Eye Cream</strong></span></p><p style="line-height: 115%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; margin: 0cm 0cm 8.0pt 0cm;"><span data-contrast="auto" lang="EN">&Ccedil;izgi ve</span><span data-contrast="auto" lang="EN">&nbsp;kırışık g&ouml;r&uuml;n&uuml;m</span><span data-contrast="auto" lang="EN">&uuml;&nbsp;</span><span data-contrast="auto" lang="EN">g&ouml;z &ccedil;evresinde en &ccedil;ok şikayet edilen sorunlar arasında yer alıyor. Powerful Wrinkle Reducing Eye Cream bakır, kalsiyum, kafein ve seramitler ile form&uuml;le edilmiş i&ccedil;eriğiyle g&ouml;z &ccedil;evresindeki kırışıklık g&ouml;r&uuml;n&uuml;m&uuml;n&uuml;n ve p&uuml;r&uuml;zlerin azalmasına yardımcı oluyor. Hassas g&ouml;z &ccedil;evresine uygun ol</span><span data-contrast="auto" lang="EN">arak form&uuml;le edilmiş i&ccedil;erikleriyle&nbsp;</span><span data-contrast="auto" lang="EN">cilt dokusunu</span><span data-contrast="auto" lang="EN">nun g&ouml;r&uuml;n&uuml;m&uuml;n&uuml; d&uuml;zeltmeye yardımcı oluyor</span><span data-contrast="auto" lang="EN">.&nbsp;</span><span data-contrast="auto" lang="EN">K</span><span data-contrast="auto" lang="EN">afein</span><span data-contrast="auto" lang="EN">&nbsp;i&ccedil;eren form&uuml;l&uuml; ile</span><span data-contrast="auto" lang="EN">&nbsp;</span><span data-contrast="auto" lang="EN">g&ouml;z&nbsp;</span><span data-contrast="auto" lang="EN">&ccedil;evresindeki şiş g&ouml;r&uuml;n&uuml;m&uuml; azaltıyor. Kaz ayağı g&ouml;r&uuml;n&uuml;m&uuml; i&ccedil;in de etkili olan bu g&ouml;z bakım kremi, cilt elastikiyetini artırarak g&ouml;z &ccedil;evresini yaşlanmaya karşı g&uuml;&ccedil;lendiriyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong>G&uuml;&ccedil;l&uuml; Bir G&ouml;z &Ccedil;evresi İ&ccedil;in G&ouml;z Bakım Kreminin &Ouml;nemi</strong></span></p><p style="line-height: 115%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; margin: 0cm 0cm 8.0pt 0cm;"><span data-contrast="auto" lang="EN">Cildini kırışık g&ouml;r&uuml;n&uuml;me karşı daha diren&ccedil;li yapman i&ccedil;in</span><br><span data-contrast="auto" lang="EN">g&ouml;z bakım kremlerinden destek alman gerekiyor. Narin bir yapıya sahip olan g&ouml;z &ccedil;evresine, hen&uuml;z &ccedil;izgi ve kırışıklıklar</span><span data-contrast="auto" lang="EN">ın&nbsp;g&ouml;r&uuml;n&uuml;m&uuml;</span><span data-contrast="auto" lang="EN">&nbsp;derinleşmeden doğru &uuml;r&uuml;nler ile bakım yapılması, cilt dokusundaki yaşlanma s&uuml;recini yavaşlatıyor. G&uuml;&ccedil;l&uuml; i&ccedil;erikleri ile dikkat &ccedil;eken&nbsp;</span><a href="https://www.kiehls.com.tr/powerful-wrinkle-reducing-eye-cream" rel="noreferrer" target="_blank"><span data-contrast="none" lang="EN"><span data-ccp-charstyle="Hyperlink">Powerful Wrinkle Reducing Eye Cream</span></span></a><span data-contrast="auto" lang="EN">,&nbsp;</span><span data-contrast="auto" lang="EN">g&ouml;z&nbsp;&ccedil;evresini</span><a href="https://www.kiehls.com.tr/goz-ve-dudak-bakimi" rel="noreferrer" target="_blank"><span data-contrast="auto" lang="EN">&nbsp;</span></a><span data-contrast="auto" lang="EN">nemlendirerek kırışıklık g&ouml;r&uuml;n&uuml;m&uuml;n&uuml; azaltıyor. B&ouml;ylece g&ouml;z &ccedil;evresi kırışıklıklara karşı daha g&uuml;&ccedil;l&uuml;&nbsp;</span><span data-contrast="auto" lang="EN">savaşıyor</span><span data-contrast="auto" lang="EN">.</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><strong><span data-contrast="auto" lang="EN">Powerful Wrinkle Reducing Eye&nbsp;Cream&rsquo;in&nbsp;Faydaları</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">● &nbsp;G&ouml;z &ccedil;evresindeki kırışıkları hedef alarak p&uuml;r&uuml;zs&uuml;z bir g&ouml;r&uuml;n&uuml;m</span><br><span data-contrast="auto" lang="EN" style="font-size: 15px;">&nbsp;sunuyor.</span><span style="font-size: 15px;"><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;G&ouml;z &ccedil;evresini nemlendiren bir bakım sağlıyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;G&ouml;z &ccedil;evresindeki şişkinliklerin</span><span data-contrast="auto" lang="EN">&nbsp;g&ouml;r&uuml;n&uuml;m&uuml;n&uuml;n</span><span data-contrast="auto" lang="EN">&nbsp;azalmasına yardımcı&nbsp;</span></span><br><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">oluyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;Kaz ayakları i&ccedil;in de etkili bir bakım sunuyor.</span></span><span data-ccp-props='{"201341983":0,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN">&nbsp;</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></p><p style='line-height: 1.5; font-size: 15px; font-family: "TR Times New Roman", sans-serif; text-align: center; background: rgb(0, 0, 0); margin: 0cm 0cm 8pt;'><span style="color: white; font-size: 18px;"><strong><span data-contrast="auto" lang="EN">Bakır ve Kalsiyum İ&ccedil;eren Benzersiz Form&uuml;l</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">Temel i&ccedil;erikleri bakır, kalsiyum, kafein ve seramitlerden oluşan bu form&uuml;l&uuml;, gelin yakından tanıyalım.</span><span style="font-size: 15px;"><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;<strong>Seramitler</strong></span><span data-ccp-props='{"201341983":0,"335559740":276}'><strong>&nbsp;</strong></span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">Cilt bariyerinin suyu ge&ccedil;irgenliğini g&uuml;&ccedil;lendiriyor ve cildin nem seviyesini&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">ideal oranda&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">tutmasına yardımcı oluyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;<strong>Kafein</strong></span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">G&ouml;z&nbsp;&ccedil;evresindeki&nbsp;şiş</span><span data-contrast="auto" lang="EN">kinlik</span><span data-contrast="auto" lang="EN">&nbsp;g&ouml;r&uuml;n&uuml;m&uuml; azaltıyor.</span><span data-ccp-props='{"201341983":0,"335559685":720,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;">● &nbsp;<span data-contrast="auto" lang="EN"><strong>Bakır&nbsp;PCA</strong></span><span data-ccp-props='{"201341983":0,"335559740":276}'><strong>&nbsp;</strong></span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">Cild</span><span data-contrast="auto" lang="EN">i&nbsp;g&uuml;&ccedil;lendirmeye&nbsp;yardımcı&nbsp;olur.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● <strong>&nbsp;Kalsiyum PCA</strong></span><span data-ccp-props='{"134233279":true,"201341983":0,"335559740":276}'><strong>&nbsp;</strong></span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">Cildin nemlenmesine ve cilt bariyerinin</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">korunmasına&nbsp;yardımcı&nbsp;olur.</span></span><span data-ccp-props='{"201341983":0,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><span data-contrast="auto" lang="EN">Kiehl&rsquo;s Powerful Wrinkle Reducing Eye&nbsp;Cream&rsquo;i&nbsp;Nasıl&nbsp;Kullanacağım?</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">1. Parmak u&ccedil;larına mercimek tanesi kadar krem alarak başla.</span><span style="font-size: 15px;"><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">2. Parmak ucundaki kremi hafif&ccedil;e diğer parmak ucuna da&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">dokundur.</span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">3. G&ouml;z altları ve &uuml;st&uuml;ne, kısacası g&ouml;z &ccedil;evresine nazik&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">dokunuşlar ile uygula.</span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">4. Cildini aşağıya doğru &ccedil;ekmeden g&ouml;z &ccedil;evresindeki kemiklere&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">uygulamaya&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">&ouml;zen g&ouml;ster.&nbsp;</span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">5. &nbsp;Kremi g&ouml;z pınarına s&uuml;rmemeye dikkat et.</span></span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p><img src="https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/23/pw-380x380-1.jpg" style="width: 300px;" class="fr-fic fr-dib fr-fil" data-success="true" data-message="" data-filename="19-12/23/pw-380x380-1.jpg" data-full_path="https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/23/pw-380x380-1.jpg" data-filelink="https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/23/pw-380x380-1.jpg"></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><strong><span data-contrast="auto" lang="EN">Kiehl&rsquo;s Powerful Wrinkle Reducing Eye Cream&rsquo;i Ne Zaman Kullanmalıyım?</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></strong></span></p><p><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">1.Bu &uuml;r&uuml;n&uuml; sabah ve akşam kullanabilirsin.&nbsp;</span></span><span data-ccp-props='{"201341983":0,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><span data-contrast="auto" lang="EN">Kiehl&rsquo;s&nbsp;Rutinim</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">G&ouml;z &ccedil;evresinde daha etkili bir sonu&ccedil; i&ccedil;in&nbsp;</span><span style="font-size: 15px;"><a href="https://www.kiehls.com.tr/super-multi-corrective-cream" rel="noreferrer" target="_blank"><span data-contrast="none" lang="EN"><span data-ccp-charstyle="Hyperlink">Super Multi Corrective Cream</span></span></a><span data-contrast="auto" lang="EN">&nbsp;da destek alabilirsin. Yaşlanmanın belirgin izlerine karşı 5&rsquo;i bir&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">arada bakım sunan&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">&uuml;r&uuml;n g&ouml;z &ccedil;evresini toparlar, sıkılaştırır, p&uuml;r&uuml;zs&uuml;zleştirir,&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">nemlendirir ve canlandırır.</span></span><br><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">G&ouml;z &ccedil;evresindeki sorunları &ccedil;&ouml;zerken y&uuml;z&uuml;n&uuml;n de buna en iyi şekilde eşlik etmesi i&ccedil;in&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">g&uuml;neş korumalı y&uuml;z kremi&nbsp;</span><a href="https://www.kiehls.com.tr/powerful-wrinkle-reducing-cream-spf30" rel="noreferrer" target="_blank"><span data-contrast="none" lang="EN">Powerful Wrinkle Reducing Cream SPF30</span></a><span data-contrast="auto" lang="EN">&rsquo;u da kullanmanı &ouml;neriyoruz. &Ccedil;izgi ve kırışıklık savaş&ccedil;ısı &uuml;r&uuml;n, cildin ileride oluşacak kırışıklık&nbsp;</span></span><br><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">g&ouml;r&uuml;n&uuml;m&uuml;ne karşı direncinin artmasına yardımcı olur.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p><br></p>
                            @SerializedName("left_margin")
                            var leftMargin: Int?, // 10
                            @SerializedName("right_margin")
                            var rightMargin: Int?, // 10
                            @SerializedName("top_margin")
                            var topMargin: Int?, // 0
                            @SerializedName("bottom_margin")
                            var bottomMargin: Int?, // 0
                            @SerializedName("component_id")
                            var componentId: String?, // gdpr_dynamic_view
                            @SerializedName("dynamic_objects")
                            var dynamicObjects: List<DynamicObject?>?,
                            @SerializedName("width")
                            var width: String? // 320
                    ) {
                        data class DynamicObject(
                                @SerializedName("background_colour")
                                var backgroundColour: String?, // #ffffff
                                @SerializedName("class_name")
                                var className: Any?, // null
                                @SerializedName("height")
                                var height: String?, // 15
                                @SerializedName("link_array")
                                var linkArray: List<LinkArray?>?,
                                @SerializedName("link_c")
                                var linkC: LinkC?,
                                @SerializedName("object_id")
                                var objectId: String?, // randomObjId_933178
                                @SerializedName("position")
                                var position: Position?,
                                @SerializedName("related_position")
                                var relatedPosition: RelatedPosition?,
                                @SerializedName("size_to_fit")
                                var sizeToFit: Boolean?, // true
                                @SerializedName("subname")
                                var subname: Any?, // null
                                @SerializedName("text_detail")
                                var textDetail: TextDetail?,
                                @SerializedName("type")
                                var type: String?, // view
                                @SerializedName("width")
                                var width: String? // 320
                        ) {
                            data class LinkArray(
                                    @SerializedName("component_hash")
                                    var componentHash: String?, // 1f61e1fbbd2688e08cef2875d6812cb1
                                    @SerializedName("component_id")
                                    var componentId: String?, // Link_25
                                    @SerializedName("component_is_sticky")
                                    var componentIsSticky: Boolean?, // false
                                    @SerializedName("component_name")
                                    var componentName: String?, // Link
                                    @SerializedName("data")
                                    var linkArrayData: LinkArrayData?,
                                    @SerializedName("widget_alias")
                                    var widgetAlias: Any? // null
                            ) {
                                data class LinkArrayData(
                                        @SerializedName("hide_components")
                                        var hideComponents: List<String?>?,
                                        @SerializedName("link")
                                        var link: String?, // #hide_components
                                        @SerializedName("show_components")
                                        var showComponents: List<Any?>?
                                )
                            }

                            data class LinkC(
                                    @SerializedName("component_hash")
                                    var componentHash: String?, // 3e6460ce54bd89758746efa2456f14fc
                                    @SerializedName("component_id")
                                    var componentId: String?, // Link_24
                                    @SerializedName("component_is_sticky")
                                    var componentIsSticky: Boolean?, // false
                                    @SerializedName("component_name")
                                    var componentName: String?, // Link
                                    @SerializedName("data")
                                    var linkCData: LinkCData?,
                                    @SerializedName("widget_alias")
                                    var widgetAlias: String? // mobile_static_content
                            ) {
                                data class LinkCData(
                                        @SerializedName("link")
                                        var link: String?, // /plugin/gdpr/hide-gdpr-banner
                                        @SerializedName("show_progress")
                                        var showProgress: Boolean? // false
                                )
                            }

                            data class Position(
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("left")
                                    var left: String?, // 0
                                    @SerializedName("subname")
                                    var subname: Any? // null
                            )

                            data class RelatedPosition(
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("subname")
                                    var subname: Any?, // null
                                    @SerializedName("top")
                                    var top: String?, // 0
                                    @SerializedName("top_object_id")
                                    var topObjectId: String? // privacy_text
                            )

                            data class TextDetail(
                                    @SerializedName("text_c")
                                    var textC: TextC?
                            ) {
                                data class TextC(
                                        @SerializedName("class_name")
                                        var className: Any?, // null
                                        @SerializedName("font")
                                        var font: String?, // HelveticaNeue-CondensedBold
                                        @SerializedName("subname")
                                        var subname: Any?, // null
                                        @SerializedName("text")
                                        var text: String?, // x
                                        @SerializedName("text_align")
                                        var textAlign: String?, // center
                                        @SerializedName("text_colour")
                                        var textColour: String?, // #000000
                                        @SerializedName("text_size")
                                        var textSize: Int? // 17
                                )
                            }
                        }
                    }
                }
            }
        }

        data class Header(
                @SerializedName("container_width")
                var containerWidth: String?, // 6.00
                @SerializedName("info")
                var info: Info?,
                @SerializedName("renders")
                var renders: List<Render?>?
        ) {
            data class Info(
                    @SerializedName("ajax_load")
                    var ajaxLoad: String?, // 0
                    @SerializedName("alias")
                    var alias: String?, // header
                    @SerializedName("background_color")
                    var backgroundColor: String?,
                    @SerializedName("background_image")
                    var backgroundImage: String?,
                    @SerializedName("background_image_mode")
                    var backgroundImageMode: String?,
                    @SerializedName("background_image_type")
                    var backgroundImageType: String?,
                    @SerializedName("base_path")
                    var basePath: String?, // app/widgets/
                    @SerializedName("cache_duration")
                    var cacheDuration: Any?, // null
                    @SerializedName("class_name")
                    var className: String?, // ca_mobile_header
                    @SerializedName("class_name_other")
                    var classNameOther: Any?, // null
                    @SerializedName("class")
                    var classX: String?,
                    @SerializedName("cms_design_alias")
                    var cmsDesignAlias: String?, // mobile-tablet-powerful-wrinkle-reducing-eye-cream-rpp
                    @SerializedName("cms_design_class")
                    var cmsDesignClass: String?,
                    @SerializedName("cms_design_id")
                    var cmsDesignId: String?, // 559
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5158
                    @SerializedName("cms_device_id")
                    var cmsDeviceId: String?, // 11
                    @SerializedName("cms_layout_filename")
                    var cmsLayoutFilename: String?, // layout_mobile
                    @SerializedName("cms_layout_id")
                    var cmsLayoutId: String?, // 6
                    @SerializedName("cms_layout_place_id")
                    var cmsLayoutPlaceId: String?, // 30
                    @SerializedName("cms_widget_category_id")
                    var cmsWidgetCategoryId: String?, // 13
                    @SerializedName("cms_widget_id")
                    var cmsWidgetId: String?, // 207
                    @SerializedName("cms_widget_preset_id")
                    var cmsWidgetPresetId: Any?, // null
                    @SerializedName("commercial_type")
                    var commercialType: Any?, // null
                    @SerializedName("Description")
                    var description: Any?, // null
                    @SerializedName("device_availabilty")
                    var deviceAvailabilty: Any?, // null
                    @SerializedName("disable_bounce")
                    var disableBounce: String?, // 0
                    @SerializedName("dynamic_layout")
                    var dynamicLayout: String?, // 0
                    @SerializedName("filename")
                    var filename: String?, // layout_mobile
                    @SerializedName("full_width")
                    var fullWidth: String?, // 0
                    @SerializedName("hidden")
                    var hidden: Any?, // null
                    @SerializedName("id")
                    var id: String?, // 5158
                    @SerializedName("image")
                    var image: String?,
                    @SerializedName("is_dynamic")
                    var isDynamic: String?, // 0
                    @SerializedName("is_dynamic_widget")
                    var isDynamicWidget: Any?, // null
                    @SerializedName("is_favorite")
                    var isFavorite: Any?, // null
                    @SerializedName("is_master")
                    var isMaster: Any?, // null
                    @SerializedName("is_master_template")
                    var isMasterTemplate: String?, // 0
                    @SerializedName("is_system")
                    var isSystem: String?, // 0
                    @SerializedName("is_template")
                    var isTemplate: String?, // 0
                    @SerializedName("is_theme_specific")
                    var isThemeSpecific: Any?, // null
                    @SerializedName("item_id")
                    var itemId: String?, // 70168
                    @SerializedName("label")
                    var label: Any?, // null
                    @SerializedName("main_cms_widget_id")
                    var mainCmsWidgetId: Any?, // null
                    @SerializedName("mobile_params")
                    var mobileParams: String?,
                    @SerializedName("mobile_version")
                    var mobileVersion: Any?, // null
                    @SerializedName("name")
                    var name: String?, // Tablet
                    @SerializedName("no_index")
                    var noIndex: String?, // 0
                    @SerializedName("order_no")
                    var orderNo: String?, // 0.000000
                    @SerializedName("page_description")
                    var pageDescription: String?, // %meta_description%
                    @SerializedName("page_keywords")
                    var pageKeywords: String?,
                    @SerializedName("page_title")
                    var pageTitle: String?, // %meta_title%
                    @SerializedName("page_type")
                    var pageType: String?,
                    @SerializedName("parameter_source_type")
                    var parameterSourceType: Any?, // null
                    @SerializedName("params")
                    var params: Params?,
                    @SerializedName("parent_design_id")
                    var parentDesignId: String?, // 558
                    @SerializedName("place_container_class_name")
                    var placeContainerClassName: Any?, // null
                    @SerializedName("place_container_end")
                    var placeContainerEnd: Any?, // null
                    @SerializedName("place_container_inner_end")
                    var placeContainerInnerEnd: Any?, // null
                    @SerializedName("place_container_inner_start")
                    var placeContainerInnerStart: Any?, // null
                    @SerializedName("place_container_start")
                    var placeContainerStart: Any?, // null
                    @SerializedName("place_width_end")
                    var placeWidthEnd: String?, // 0.00
                    @SerializedName("place_width_start")
                    var placeWidthStart: String?, // 0.00
                    @SerializedName("preset_params")
                    var presetParams: Any?, // null
                    @SerializedName("pro_admin_support")
                    var proAdminSupport: Any?, // null
                    @SerializedName("row_container_class_name")
                    var rowContainerClassName: Any?, // null
                    @SerializedName("row_container_end")
                    var rowContainerEnd: Any?, // null
                    @SerializedName("row_container_start")
                    var rowContainerStart: Any?, // null
                    @SerializedName("short_description")
                    var shortDescription: Any?, // null
                    @SerializedName("social_description")
                    var socialDescription: String?, // %meta_description%
                    @SerializedName("social_image")
                    var socialImage: String?, // %product_image%
                    @SerializedName("social_title")
                    var socialTitle: String?, // %label%
                    @SerializedName("status")
                    var status: Any?, // null
                    @SerializedName("tags")
                    var tags: Any?, // null
                    @SerializedName("title")
                    var title: String?,
                    @SerializedName("tpl_code")
                    var tplCode: Any?, // null
                    @SerializedName("update_status")
                    var updateStatus: String?, // 1
                    @SerializedName("use_cache")
                    var useCache: Any?, // null
                    @SerializedName("version_key")
                    var versionKey: String?, // 15AD23BED979
                    @SerializedName("weight")
                    var weight: Any?, // null
                    @SerializedName("widget_title")
                    var widgetTitle: String?,
                    @SerializedName("width")
                    var width: String?, // 6.00
                    @SerializedName("width_sm")
                    var widthSm: Any?, // null
                    @SerializedName("width_xs")
                    var widthXs: Any? // null
            ) {
                data class Params(
                        @SerializedName("app_button_id_left_1")
                        var appButtonIdLeft1: String?, // 4
                        @SerializedName("app_button_id_left_2")
                        var appButtonIdLeft2: String?,
                        @SerializedName("app_button_id_right_1")
                        var appButtonIdRight1: String?,
                        @SerializedName("app_button_id_right_2")
                        var appButtonIdRight2: String?, // 2
                        @SerializedName("app_button_id_right_3")
                        var appButtonIdRight3: String?,
                        @SerializedName("background_colour")
                        var backgroundColour: String?,
                        @SerializedName("background_colour_hover")
                        var backgroundColourHover: String?,
                        @SerializedName("disable_logo_link")
                        var disableLogoLink: String?,
                        @SerializedName("font_family")
                        var fontFamily: String?,
                        @SerializedName("hide_bottom_border")
                        var hideBottomBorder: String?, // 0
                        @SerializedName("hide_top_component")
                        var hideTopComponent: String?,
                        @SerializedName("image_background")
                        var imageBackground: String?,
                        @SerializedName("image_title")
                        var imageTitle: String?,
                        @SerializedName("logo_align")
                        var logoAlign: String?,
                        @SerializedName("menu_lock")
                        var menuLock: String?, // 0
                        @SerializedName("no_transparent")
                        var noTransparent: String?,
                        @SerializedName("sub_title")
                        var subTitle: String?,
                        @SerializedName("text_colour")
                        var textColour: String?,
                        @SerializedName("use_with_member")
                        var useWithMember: String? // 0
                )
            }

            data class Render(
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5158
                    @SerializedName("components")
                    var components: List<Component?>?,
                    @SerializedName("info")
                    var info: Info?,
                    @SerializedName("module_id")
                    var moduleId: Int?, // 3
                    @SerializedName("module_name")
                    var moduleName: String?, // ca_mobile_header
                    @SerializedName("params")
                    var params: Any? // null
            ) {
                data class Component(
                        @SerializedName("component_hash")
                        var componentHash: String?, // 572b9a939187870721986c660c0ae895
                        @SerializedName("component_id")
                        var componentId: String?, // Header_1
                        @SerializedName("component_is_sticky")
                        var componentIsSticky: Boolean?, // false
                        @SerializedName("component_name")
                        var componentName: String?, // Header
                        @SerializedName("data")
                        var componentData: ComponentData?,
                        @SerializedName("widget_alias")
                        var widgetAlias: String? // ca_mobile_header
                ) {
                    data class ComponentData(
                            @SerializedName("background_colour")
                            var backgroundColour: String?, // #ffffff
                            @SerializedName("background_colour_hover")
                            var backgroundColourHover: String?, // #cccccc
                            @SerializedName("bottom_bar_background_colour")
                            var bottomBarBackgroundColour: String?, // #cccccc
                            @SerializedName("is_transparent")
                            var isTransparent: Boolean?, // false
                            @SerializedName("left_link_1")
                            var leftLink1: LeftLink1?,
                            @SerializedName("menu_lock")
                            var menuLock: Int?, // 1
                            @SerializedName("progress_colour")
                            var progressColour: String?, // #ff0000
                            @SerializedName("right_link_1")
                            var rightLink1: RightLink1?,
                            @SerializedName("text_colour")
                            var textColour: String?, // #434343
                            @SerializedName("title_c")
                            var titleC: TitleC?,
                            @SerializedName("title_image")
                            var titleImage: String? // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-08/25/logo-1503624275.png
                    ) {
                        data class LeftLink1(
                                @SerializedName("component_hash")
                                var componentHash: String?, // 55eb88023febaf7f3988098d4feaab28
                                @SerializedName("component_id")
                                var componentId: String?, // Link_3
                                @SerializedName("component_is_sticky")
                                var componentIsSticky: Boolean?, // false
                                @SerializedName("component_name")
                                var componentName: String?, // Link
                                @SerializedName("data")
                                var leftLink1Data: LeftLink1Data?,
                                @SerializedName("widget_alias")
                                var widgetAlias: String? // ca_mobile_header
                        ) {
                            data class LeftLink1Data(
                                    @SerializedName("image")
                                    var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-07/27/back.png
                                    @SerializedName("link")
                                    var link: String?, // #back
                                    @SerializedName("serialize_widget")
                                    var serializeWidget: String?, // 0
                                    @SerializedName("text")
                                    var text: String?, // Geri
                                    @SerializedName("transition_type")
                                    var transitionType: String? // back
                            )
                        }

                        data class RightLink1(
                                @SerializedName("component_hash")
                                var componentHash: String?, // a4d6a5ed05bd257ea5cc273dea27bbe8
                                @SerializedName("component_id")
                                var componentId: String?, // Link_4
                                @SerializedName("component_is_sticky")
                                var componentIsSticky: Boolean?, // false
                                @SerializedName("component_name")
                                var componentName: String?, // Link
                                @SerializedName("data")
                                var rightLink1data: RightLink1data?,
                                @SerializedName("widget_alias")
                                var widgetAlias: String? // ca_mobile_header
                        ) {
                            data class RightLink1data(
                                    @SerializedName("image")
                                    var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-07/27/basket-1501161065.png
                                    @SerializedName("image_alternative")
                                    var imageAlternative: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-07/27/basket.png
                                    @SerializedName("is_cart")
                                    var isCart: Boolean?, // true
                                    @SerializedName("left_margin")
                                    var leftMargin: String?, // 13
                                    @SerializedName("link")
                                    var link: String?, // /cart
                                    @SerializedName("serialize_widget")
                                    var serializeWidget: String?, // 0
                                    @SerializedName("text")
                                    var text: String?, // Cart
                                    @SerializedName("text_align")
                                    var textAlign: String?, // center
                                    @SerializedName("text_hide")
                                    var textHide: Boolean?, // false
                                    @SerializedName("title_c")
                                    var titleC: TitleC?,
                                    @SerializedName("top_margin")
                                    var topMargin: String?, // 9
                                    @SerializedName("transition_type")
                                    var transitionType: String?, // forward
                                    @SerializedName("width")
                                    var width: String? // 18
                            ) {
                                data class TitleC(
                                        @SerializedName("class_name")
                                        var className: Any?, // null
                                        @SerializedName("font")
                                        var font: String?, // TimesNewRomanPSMT
                                        @SerializedName("subname")
                                        var subname: Any?, // null
                                        @SerializedName("text")
                                        var text: String?, // 0
                                        @SerializedName("text_colour")
                                        var textColour: String?, // #000000
                                        @SerializedName("text_size")
                                        var textSize: Int? // 12
                                )
                            }
                        }

                        data class TitleC(
                                @SerializedName("class_name")
                                var className: Any?, // null
                                @SerializedName("font")
                                var font: String?, // TimesNewRomanPSMT
                                @SerializedName("subname")
                                var subname: Any?, // null
                                @SerializedName("text")
                                var text: String?,
                                @SerializedName("text_colour")
                                var textColour: String?, // #434343
                                @SerializedName("text_size")
                                var textSize: Int? // 16
                        )
                    }
                }

                data class Info(
                        @SerializedName("ajax_load")
                        var ajaxLoad: Boolean?, // false
                        @SerializedName("widget_title")
                        var widgetTitle: String?
                )
            }
        }

        data class Left(
                @SerializedName("container_width")
                var containerWidth: String?, // 2.00
                @SerializedName("info")
                var info: Info?,
                @SerializedName("renders")
                var renders: List<Render?>?
        ) {
            data class Info(
                    @SerializedName("ajax_load")
                    var ajaxLoad: Any?, // null
                    @SerializedName("alias")
                    var alias: String?, // left
                    @SerializedName("background_color")
                    var backgroundColor: String?,
                    @SerializedName("background_image")
                    var backgroundImage: String?,
                    @SerializedName("background_image_mode")
                    var backgroundImageMode: String?,
                    @SerializedName("background_image_type")
                    var backgroundImageType: String?,
                    @SerializedName("base_path")
                    var basePath: String?, // app/widgets/
                    @SerializedName("cache_duration")
                    var cacheDuration: Any?, // null
                    @SerializedName("class_name")
                    var className: String?, // ca_mobile_left_menu
                    @SerializedName("class_name_other")
                    var classNameOther: Any?, // null
                    @SerializedName("class")
                    var classX: String?,
                    @SerializedName("cms_design_alias")
                    var cmsDesignAlias: String?, // mobile-tablet-powerful-wrinkle-reducing-eye-cream-rpp
                    @SerializedName("cms_design_class")
                    var cmsDesignClass: String?,
                    @SerializedName("cms_design_id")
                    var cmsDesignId: String?, // 559
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5439
                    @SerializedName("cms_device_id")
                    var cmsDeviceId: String?, // 11
                    @SerializedName("cms_layout_filename")
                    var cmsLayoutFilename: String?, // layout_mobile
                    @SerializedName("cms_layout_id")
                    var cmsLayoutId: String?, // 6
                    @SerializedName("cms_layout_place_id")
                    var cmsLayoutPlaceId: String?, // 31
                    @SerializedName("cms_widget_category_id")
                    var cmsWidgetCategoryId: String?, // 12
                    @SerializedName("cms_widget_id")
                    var cmsWidgetId: String?, // 208
                    @SerializedName("cms_widget_preset_id")
                    var cmsWidgetPresetId: Any?, // null
                    @SerializedName("commercial_type")
                    var commercialType: Any?, // null
                    @SerializedName("Description")
                    var description: String?,
                    @SerializedName("device_availabilty")
                    var deviceAvailabilty: Any?, // null
                    @SerializedName("disable_bounce")
                    var disableBounce: String?, // 0
                    @SerializedName("dynamic_layout")
                    var dynamicLayout: String?, // 0
                    @SerializedName("filename")
                    var filename: String?, // layout_mobile
                    @SerializedName("full_width")
                    var fullWidth: String?, // 0
                    @SerializedName("hidden")
                    var hidden: Any?, // null
                    @SerializedName("id")
                    var id: String?, // 5439
                    @SerializedName("image")
                    var image: String?,
                    @SerializedName("is_dynamic")
                    var isDynamic: String?, // 0
                    @SerializedName("is_dynamic_widget")
                    var isDynamicWidget: Any?, // null
                    @SerializedName("is_favorite")
                    var isFavorite: Any?, // null
                    @SerializedName("is_master")
                    var isMaster: Any?, // null
                    @SerializedName("is_master_template")
                    var isMasterTemplate: String?, // 0
                    @SerializedName("is_system")
                    var isSystem: String?, // 0
                    @SerializedName("is_template")
                    var isTemplate: String?, // 0
                    @SerializedName("is_theme_specific")
                    var isThemeSpecific: Any?, // null
                    @SerializedName("item_id")
                    var itemId: String?, // 70168
                    @SerializedName("label")
                    var label: Any?, // null
                    @SerializedName("main_cms_widget_id")
                    var mainCmsWidgetId: Any?, // null
                    @SerializedName("mobile_params")
                    var mobileParams: String?,
                    @SerializedName("mobile_version")
                    var mobileVersion: Any?, // null
                    @SerializedName("name")
                    var name: String?, // Tablet
                    @SerializedName("no_index")
                    var noIndex: String?, // 0
                    @SerializedName("order_no")
                    var orderNo: String?, // 0.000000
                    @SerializedName("page_description")
                    var pageDescription: String?, // %meta_description%
                    @SerializedName("page_keywords")
                    var pageKeywords: String?,
                    @SerializedName("page_title")
                    var pageTitle: String?, // %meta_title%
                    @SerializedName("page_type")
                    var pageType: String?,
                    @SerializedName("parameter_source_type")
                    var parameterSourceType: Any?, // null
                    @SerializedName("params")
                    var params: List<Any?>?,
                    @SerializedName("parent_design_id")
                    var parentDesignId: String?, // 558
                    @SerializedName("place_container_class_name")
                    var placeContainerClassName: Any?, // null
                    @SerializedName("place_container_end")
                    var placeContainerEnd: Any?, // null
                    @SerializedName("place_container_inner_end")
                    var placeContainerInnerEnd: Any?, // null
                    @SerializedName("place_container_inner_start")
                    var placeContainerInnerStart: Any?, // null
                    @SerializedName("place_container_start")
                    var placeContainerStart: Any?, // null
                    @SerializedName("place_width_end")
                    var placeWidthEnd: String?, // 0.00
                    @SerializedName("place_width_start")
                    var placeWidthStart: String?, // 0.00
                    @SerializedName("preset_params")
                    var presetParams: Any?, // null
                    @SerializedName("pro_admin_support")
                    var proAdminSupport: Any?, // null
                    @SerializedName("row_container_class_name")
                    var rowContainerClassName: Any?, // null
                    @SerializedName("row_container_end")
                    var rowContainerEnd: Any?, // null
                    @SerializedName("row_container_start")
                    var rowContainerStart: Any?, // null
                    @SerializedName("short_description")
                    var shortDescription: Any?, // null
                    @SerializedName("social_description")
                    var socialDescription: String?, // %meta_description%
                    @SerializedName("social_image")
                    var socialImage: String?, // %product_image%
                    @SerializedName("social_title")
                    var socialTitle: String?, // %label%
                    @SerializedName("status")
                    var status: String?, // 2
                    @SerializedName("tags")
                    var tags: Any?, // null
                    @SerializedName("title")
                    var title: Any?, // null
                    @SerializedName("tpl_code")
                    var tplCode: Any?, // null
                    @SerializedName("update_status")
                    var updateStatus: String?, // 1
                    @SerializedName("use_cache")
                    var useCache: Any?, // null
                    @SerializedName("version_key")
                    var versionKey: String?, // 4F265F4741
                    @SerializedName("weight")
                    var weight: Any?, // null
                    @SerializedName("widget_title")
                    var widgetTitle: Any?, // null
                    @SerializedName("width")
                    var width: String?, // 2.00
                    @SerializedName("width_sm")
                    var widthSm: Any?, // null
                    @SerializedName("width_xs")
                    var widthXs: Any? // null
            )

            data class Render(
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5439
                    @SerializedName("components")
                    var components: List<Component?>?,
                    @SerializedName("info")
                    var info: Info?,
                    @SerializedName("module_id")
                    var moduleId: Int?, // 2
                    @SerializedName("module_name")
                    var moduleName: String?, // ca_mobile_left_menu
                    @SerializedName("params")
                    var params: Any? // null
            ) {
                data class Component(
                        @SerializedName("alias")
                        var alias: String?, // ca_mobile_left_menu
                        @SerializedName("component_hash")
                        var componentHash: String?, // 97fead9eaf5b16a1a1dd88cd287567c6
                        @SerializedName("component_id")
                        var componentId: String?, // CategoryItem_13
                        @SerializedName("component_is_sticky")
                        var componentIsSticky: Boolean?, // false
                        @SerializedName("component_name")
                        var componentName: String?, // CategoryItem
                        @SerializedName("data")
                        var componentdata: Componentdata?,
                        @SerializedName("widget_alias")
                        var widgetAlias: String? // ca_mobile_left_menu
                ) {
                    data class Componentdata(
                            @SerializedName("active_border_colour")
                            var activeBorderColour: String?, // #000000
                            @SerializedName("background_colour")
                            var backgroundColour: String?, // #ffffff
                            @SerializedName("background_colour_hover")
                            var backgroundColourHover: String?, // #282828
                            @SerializedName("border_colour")
                            var borderColour: String?, // #ffffff
                            @SerializedName("height")
                            var height: String?, // 45
                            @SerializedName("image")
                            var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-08/01/downarrow-1469426433.png
                            @SerializedName("image_hover")
                            var imageHover: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-08/01/uparrows-1469426430-1501594559.png
                            @SerializedName("link")
                            var link: String?, // /ca-mobile-anasayfa?main_menu_id=397.810&current_main_depth=1
                            @SerializedName("passive_background_color")
                            var passiveBackgroundColor: String?, // #cbcbcb
                            @SerializedName("passive_border_color")
                            var passiveBorderColor: String?, // #cbcbcb
                            @SerializedName("passive_text_color")
                            var passiveTextColor: String?, // #000000
                            @SerializedName("place")
                            var place: String?, // left
                            @SerializedName("reload_components")
                            var reloadComponents: String?, // ca_mobile_left_menu
                            @SerializedName("selected_colour")
                            var selectedColour: String?, // #282828
                            @SerializedName("title_c")
                            var titleC: TitleC?
                    ) {
                        data class TitleC(
                                @SerializedName("active_text_colour")
                                var activeTextColour: String?, // #ffffff
                                @SerializedName("class_name")
                                var className: Any?, // null
                                @SerializedName("font")
                                var font: String?, // HelveticaNeue-CondensedBold
                                @SerializedName("subname")
                                var subname: Any?, // null
                                @SerializedName("text")
                                var text: String?, // OUTLET
                                @SerializedName("text_colour")
                                var textColour: String?, // #000000
                                @SerializedName("text_size")
                                var textSize: Int? // 14
                        )
                    }
                }

                data class Info(
                        @SerializedName("ajax_load")
                        var ajaxLoad: Boolean?, // false
                        @SerializedName("widget_title")
                        var widgetTitle: Any? // null
                )
            }
        }

        data class LeftContent(
                @SerializedName("container_width")
                var containerWidth: String?, // 6.00
                @SerializedName("info")
                var info: Info?,
                @SerializedName("renders")
                var renders: List<Render?>?
        ) {
            data class Info(
                    @SerializedName("ajax_load")
                    var ajaxLoad: String?, // 0
                    @SerializedName("alias")
                    var alias: String?, // left_content
                    @SerializedName("background_color")
                    var backgroundColor: String?,
                    @SerializedName("background_image")
                    var backgroundImage: String?,
                    @SerializedName("background_image_mode")
                    var backgroundImageMode: String?,
                    @SerializedName("background_image_type")
                    var backgroundImageType: String?,
                    @SerializedName("base_path")
                    var basePath: String?, // app/themes/kiehls/widgets/
                    @SerializedName("cache_duration")
                    var cacheDuration: Any?, // null
                    @SerializedName("class_name")
                    var className: String?, // mobile_notification_header
                    @SerializedName("class_name_other")
                    var classNameOther: Any?, // null
                    @SerializedName("class")
                    var classX: String?,
                    @SerializedName("cms_design_alias")
                    var cmsDesignAlias: String?, // mobile-tablet-powerful-wrinkle-reducing-eye-cream-rpp
                    @SerializedName("cms_design_class")
                    var cmsDesignClass: String?,
                    @SerializedName("cms_design_id")
                    var cmsDesignId: String?, // 559
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5159
                    @SerializedName("cms_device_id")
                    var cmsDeviceId: String?, // 11
                    @SerializedName("cms_layout_filename")
                    var cmsLayoutFilename: String?, // layout_mobile
                    @SerializedName("cms_layout_id")
                    var cmsLayoutId: String?, // 6
                    @SerializedName("cms_layout_place_id")
                    var cmsLayoutPlaceId: String?, // 36
                    @SerializedName("cms_widget_category_id")
                    var cmsWidgetCategoryId: String?, // 1
                    @SerializedName("cms_widget_id")
                    var cmsWidgetId: String?, // 791
                    @SerializedName("cms_widget_preset_id")
                    var cmsWidgetPresetId: Any?, // null
                    @SerializedName("commercial_type")
                    var commercialType: Any?, // null
                    @SerializedName("Description")
                    var description: Any?, // null
                    @SerializedName("device_availabilty")
                    var deviceAvailabilty: Any?, // null
                    @SerializedName("disable_bounce")
                    var disableBounce: String?, // 0
                    @SerializedName("dynamic_layout")
                    var dynamicLayout: String?, // 0
                    @SerializedName("filename")
                    var filename: String?, // layout_mobile
                    @SerializedName("full_width")
                    var fullWidth: String?, // 0
                    @SerializedName("hidden")
                    var hidden: Any?, // null
                    @SerializedName("id")
                    var id: String?, // 5159
                    @SerializedName("image")
                    var image: Any?, // null
                    @SerializedName("is_dynamic")
                    var isDynamic: String?, // 0
                    @SerializedName("is_dynamic_widget")
                    var isDynamicWidget: Any?, // null
                    @SerializedName("is_favorite")
                    var isFavorite: Any?, // null
                    @SerializedName("is_master")
                    var isMaster: Any?, // null
                    @SerializedName("is_master_template")
                    var isMasterTemplate: String?, // 0
                    @SerializedName("is_system")
                    var isSystem: String?, // 0
                    @SerializedName("is_template")
                    var isTemplate: String?, // 0
                    @SerializedName("is_theme_specific")
                    var isThemeSpecific: Any?, // null
                    @SerializedName("item_id")
                    var itemId: String?, // 70168
                    @SerializedName("label")
                    var label: Any?, // null
                    @SerializedName("main_cms_widget_id")
                    var mainCmsWidgetId: Any?, // null
                    @SerializedName("mobile_params")
                    var mobileParams: String?,
                    @SerializedName("mobile_version")
                    var mobileVersion: Any?, // null
                    @SerializedName("name")
                    var name: String?, // Tablet
                    @SerializedName("no_index")
                    var noIndex: String?, // 0
                    @SerializedName("order_no")
                    var orderNo: String?, // 1.000000
                    @SerializedName("page_description")
                    var pageDescription: String?, // %meta_description%
                    @SerializedName("page_keywords")
                    var pageKeywords: String?,
                    @SerializedName("page_title")
                    var pageTitle: String?, // %meta_title%
                    @SerializedName("page_type")
                    var pageType: String?,
                    @SerializedName("parameter_source_type")
                    var parameterSourceType: Any?, // null
                    @SerializedName("params")
                    var params: Params?,
                    @SerializedName("parent_design_id")
                    var parentDesignId: String?, // 558
                    @SerializedName("place_container_class_name")
                    var placeContainerClassName: Any?, // null
                    @SerializedName("place_container_end")
                    var placeContainerEnd: Any?, // null
                    @SerializedName("place_container_inner_end")
                    var placeContainerInnerEnd: Any?, // null
                    @SerializedName("place_container_inner_start")
                    var placeContainerInnerStart: Any?, // null
                    @SerializedName("place_container_start")
                    var placeContainerStart: Any?, // null
                    @SerializedName("place_width_end")
                    var placeWidthEnd: String?, // 0.00
                    @SerializedName("place_width_start")
                    var placeWidthStart: String?, // 0.00
                    @SerializedName("preset_params")
                    var presetParams: Any?, // null
                    @SerializedName("pro_admin_support")
                    var proAdminSupport: Any?, // null
                    @SerializedName("row_container_class_name")
                    var rowContainerClassName: Any?, // null
                    @SerializedName("row_container_end")
                    var rowContainerEnd: Any?, // null
                    @SerializedName("row_container_start")
                    var rowContainerStart: Any?, // null
                    @SerializedName("short_description")
                    var shortDescription: Any?, // null
                    @SerializedName("social_description")
                    var socialDescription: String?, // %meta_description%
                    @SerializedName("social_image")
                    var socialImage: String?, // %product_image%
                    @SerializedName("social_title")
                    var socialTitle: String?, // %label%
                    @SerializedName("status")
                    var status: Any?, // null
                    @SerializedName("tags")
                    var tags: Any?, // null
                    @SerializedName("title")
                    var title: String?,
                    @SerializedName("tpl_code")
                    var tplCode: Any?, // null
                    @SerializedName("update_status")
                    var updateStatus: String?, // 1
                    @SerializedName("use_cache")
                    var useCache: Any?, // null
                    @SerializedName("version_key")
                    var versionKey: String?, // 7D33143A343
                    @SerializedName("weight")
                    var weight: Any?, // null
                    @SerializedName("widget_title")
                    var widgetTitle: String?,
                    @SerializedName("width")
                    var width: String?, // 6.00
                    @SerializedName("width_sm")
                    var widthSm: Any?, // null
                    @SerializedName("width_xs")
                    var widthXs: Any? // null
            ) {
                data class Params(
                        @SerializedName("alias")
                        var alias: String?, // product_notification
                        @SerializedName("background_colour")
                        var backgroundColour: String?,
                        @SerializedName("container_height")
                        var containerHeight: String?,
                        @SerializedName("content_pool_id")
                        var contentPoolId: String?, // 218
                        @SerializedName("content_pools")
                        var contentPools: List<String?>?,
                        @SerializedName("show_bottom_border")
                        var showBottomBorder: String?,
                        @SerializedName("sub_font_family")
                        var subFontFamily: String?,
                        @SerializedName("sub_font_size")
                        var subFontSize: String?,
                        @SerializedName("sub_text_colour")
                        var subTextColour: String?,
                        @SerializedName("super_font_family")
                        var superFontFamily: String?,
                        @SerializedName("super_font_size")
                        var superFontSize: String?,
                        @SerializedName("super_text_colour")
                        var superTextColour: String?
                )
            }

            data class Render(
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5161
                    @SerializedName("components")
                    var components: List<Component?>?,
                    @SerializedName("info")
                    var info: Info?,
                    @SerializedName("module_id")
                    var moduleId: Int?, // 8
                    @SerializedName("module_name")
                    var moduleName: String?, // mobile_static_content
                    @SerializedName("params")
                    var params: Any? // null
            ) {
                data class Component(
                        @SerializedName("component_hash")
                        var componentHash: String?, // 39e1c26b9f60abc61db9858afd589376
                        @SerializedName("component_id")
                        var componentId: String?, // StaticPage_1
                        @SerializedName("component_is_sticky")
                        var componentIsSticky: Boolean?, // false
                        @SerializedName("component_name")
                        var componentName: String?, // StaticPage
                        @SerializedName("data")
                        var data: ComponentData?,
                        @SerializedName("widget_alias")
                        var widgetAlias: String? // mobile_static_content
                ) {
                    data class ComponentData(

                            @SerializedName("title")
                            var title: String?,
                            @SerializedName("content")
                            var content: String?, // <p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong>Powerful Wrinkle Reducing Eye Cream</strong></span></p><p style="line-height: 115%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; margin: 0cm 0cm 8.0pt 0cm;"><span data-contrast="auto" lang="EN">&Ccedil;izgi ve</span><span data-contrast="auto" lang="EN">&nbsp;kırışık g&ouml;r&uuml;n&uuml;m</span><span data-contrast="auto" lang="EN">&uuml;&nbsp;</span><span data-contrast="auto" lang="EN">g&ouml;z &ccedil;evresinde en &ccedil;ok şikayet edilen sorunlar arasında yer alıyor. Powerful Wrinkle Reducing Eye Cream bakır, kalsiyum, kafein ve seramitler ile form&uuml;le edilmiş i&ccedil;eriğiyle g&ouml;z &ccedil;evresindeki kırışıklık g&ouml;r&uuml;n&uuml;m&uuml;n&uuml;n ve p&uuml;r&uuml;zlerin azalmasına yardımcı oluyor. Hassas g&ouml;z &ccedil;evresine uygun ol</span><span data-contrast="auto" lang="EN">arak form&uuml;le edilmiş i&ccedil;erikleriyle&nbsp;</span><span data-contrast="auto" lang="EN">cilt dokusunu</span><span data-contrast="auto" lang="EN">nun g&ouml;r&uuml;n&uuml;m&uuml;n&uuml; d&uuml;zeltmeye yardımcı oluyor</span><span data-contrast="auto" lang="EN">.&nbsp;</span><span data-contrast="auto" lang="EN">K</span><span data-contrast="auto" lang="EN">afein</span><span data-contrast="auto" lang="EN">&nbsp;i&ccedil;eren form&uuml;l&uuml; ile</span><span data-contrast="auto" lang="EN">&nbsp;</span><span data-contrast="auto" lang="EN">g&ouml;z&nbsp;</span><span data-contrast="auto" lang="EN">&ccedil;evresindeki şiş g&ouml;r&uuml;n&uuml;m&uuml; azaltıyor. Kaz ayağı g&ouml;r&uuml;n&uuml;m&uuml; i&ccedil;in de etkili olan bu g&ouml;z bakım kremi, cilt elastikiyetini artırarak g&ouml;z &ccedil;evresini yaşlanmaya karşı g&uuml;&ccedil;lendiriyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong>G&uuml;&ccedil;l&uuml; Bir G&ouml;z &Ccedil;evresi İ&ccedil;in G&ouml;z Bakım Kreminin &Ouml;nemi</strong></span></p><p style="line-height: 115%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; margin: 0cm 0cm 8.0pt 0cm;"><span data-contrast="auto" lang="EN">Cildini kırışık g&ouml;r&uuml;n&uuml;me karşı daha diren&ccedil;li yapman i&ccedil;in</span><br><span data-contrast="auto" lang="EN">g&ouml;z bakım kremlerinden destek alman gerekiyor. Narin bir yapıya sahip olan g&ouml;z &ccedil;evresine, hen&uuml;z &ccedil;izgi ve kırışıklıklar</span><span data-contrast="auto" lang="EN">ın&nbsp;g&ouml;r&uuml;n&uuml;m&uuml;</span><span data-contrast="auto" lang="EN">&nbsp;derinleşmeden doğru &uuml;r&uuml;nler ile bakım yapılması, cilt dokusundaki yaşlanma s&uuml;recini yavaşlatıyor. G&uuml;&ccedil;l&uuml; i&ccedil;erikleri ile dikkat &ccedil;eken&nbsp;</span><a href="https://www.kiehls.com.tr/powerful-wrinkle-reducing-eye-cream" rel="noreferrer" target="_blank"><span data-contrast="none" lang="EN"><span data-ccp-charstyle="Hyperlink">Powerful Wrinkle Reducing Eye Cream</span></span></a><span data-contrast="auto" lang="EN">,&nbsp;</span><span data-contrast="auto" lang="EN">g&ouml;z&nbsp;&ccedil;evresini</span><a href="https://www.kiehls.com.tr/goz-ve-dudak-bakimi" rel="noreferrer" target="_blank"><span data-contrast="auto" lang="EN">&nbsp;</span></a><span data-contrast="auto" lang="EN">nemlendirerek kırışıklık g&ouml;r&uuml;n&uuml;m&uuml;n&uuml; azaltıyor. B&ouml;ylece g&ouml;z &ccedil;evresi kırışıklıklara karşı daha g&uuml;&ccedil;l&uuml;&nbsp;</span><span data-contrast="auto" lang="EN">savaşıyor</span><span data-contrast="auto" lang="EN">.</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><strong><span data-contrast="auto" lang="EN">Powerful Wrinkle Reducing Eye&nbsp;Cream&rsquo;in&nbsp;Faydaları</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">● &nbsp;G&ouml;z &ccedil;evresindeki kırışıkları hedef alarak p&uuml;r&uuml;zs&uuml;z bir g&ouml;r&uuml;n&uuml;m</span><br><span data-contrast="auto" lang="EN" style="font-size: 15px;">&nbsp;sunuyor.</span><span style="font-size: 15px;"><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;G&ouml;z &ccedil;evresini nemlendiren bir bakım sağlıyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;G&ouml;z &ccedil;evresindeki şişkinliklerin</span><span data-contrast="auto" lang="EN">&nbsp;g&ouml;r&uuml;n&uuml;m&uuml;n&uuml;n</span><span data-contrast="auto" lang="EN">&nbsp;azalmasına yardımcı&nbsp;</span></span><br><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">oluyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;Kaz ayakları i&ccedil;in de etkili bir bakım sunuyor.</span></span><span data-ccp-props='{"201341983":0,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN">&nbsp;</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></p><p style='line-height: 1.5; font-size: 15px; font-family: "TR Times New Roman", sans-serif; text-align: center; background: rgb(0, 0, 0); margin: 0cm 0cm 8pt;'><span style="color: white; font-size: 18px;"><strong><span data-contrast="auto" lang="EN">Bakır ve Kalsiyum İ&ccedil;eren Benzersiz Form&uuml;l</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">Temel i&ccedil;erikleri bakır, kalsiyum, kafein ve seramitlerden oluşan bu form&uuml;l&uuml;, gelin yakından tanıyalım.</span><span style="font-size: 15px;"><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;<strong>Seramitler</strong></span><span data-ccp-props='{"201341983":0,"335559740":276}'><strong>&nbsp;</strong></span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">Cilt bariyerinin suyu ge&ccedil;irgenliğini g&uuml;&ccedil;lendiriyor ve cildin nem seviyesini&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">ideal oranda&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">tutmasına yardımcı oluyor.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● &nbsp;<strong>Kafein</strong></span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">G&ouml;z&nbsp;&ccedil;evresindeki&nbsp;şiş</span><span data-contrast="auto" lang="EN">kinlik</span><span data-contrast="auto" lang="EN">&nbsp;g&ouml;r&uuml;n&uuml;m&uuml; azaltıyor.</span><span data-ccp-props='{"201341983":0,"335559685":720,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;">● &nbsp;<span data-contrast="auto" lang="EN"><strong>Bakır&nbsp;PCA</strong></span><span data-ccp-props='{"201341983":0,"335559740":276}'><strong>&nbsp;</strong></span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">Cild</span><span data-contrast="auto" lang="EN">i&nbsp;g&uuml;&ccedil;lendirmeye&nbsp;yardımcı&nbsp;olur.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">● <strong>&nbsp;Kalsiyum PCA</strong></span><span data-ccp-props='{"134233279":true,"201341983":0,"335559740":276}'><strong>&nbsp;</strong></span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">Cildin nemlenmesine ve cilt bariyerinin</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">korunmasına&nbsp;yardımcı&nbsp;olur.</span></span><span data-ccp-props='{"201341983":0,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><span data-contrast="auto" lang="EN">Kiehl&rsquo;s Powerful Wrinkle Reducing Eye&nbsp;Cream&rsquo;i&nbsp;Nasıl&nbsp;Kullanacağım?</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">1. Parmak u&ccedil;larına mercimek tanesi kadar krem alarak başla.</span><span style="font-size: 15px;"><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">2. Parmak ucundaki kremi hafif&ccedil;e diğer parmak ucuna da&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">dokundur.</span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">3. G&ouml;z altları ve &uuml;st&uuml;ne, kısacası g&ouml;z &ccedil;evresine nazik&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">dokunuşlar ile uygula.</span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">4. Cildini aşağıya doğru &ccedil;ekmeden g&ouml;z &ccedil;evresindeki kemiklere&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">uygulamaya&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">&ouml;zen g&ouml;ster.&nbsp;</span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}'>&nbsp;</span></span></p><p style="line-height: 1;"><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">5. &nbsp;Kremi g&ouml;z pınarına s&uuml;rmemeye dikkat et.</span></span><span data-ccp-props='{"201341983":0,"335559685":360,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p><img src="https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/23/pw-380x380-1.jpg" style="width: 300px;" class="fr-fic fr-dib fr-fil" data-success="true" data-message="" data-filename="19-12/23/pw-380x380-1.jpg" data-full_path="https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/23/pw-380x380-1.jpg" data-filelink="https://epmajuiy.rocketcdn.com/kiehls/img/content/19-12/23/pw-380x380-1.jpg"></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><strong><span data-contrast="auto" lang="EN">Kiehl&rsquo;s Powerful Wrinkle Reducing Eye Cream&rsquo;i Ne Zaman Kullanmalıyım?</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></strong></span></p><p><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">1.Bu &uuml;r&uuml;n&uuml; sabah ve akşam kullanabilirsin.&nbsp;</span></span><span data-ccp-props='{"201341983":0,"335559740":276}' style="font-size: 15px;">&nbsp;</span></p><p style="line-height: 270%; font-size: 15px; font-family: 'TR Times New Roman',sans-serif; text-align: center; background: #000000; margin: 0cm 0cm 8.0pt 0cm;"><span style="color: white; font-size: 18px;"><strong><span data-contrast="auto" lang="EN">Kiehl&rsquo;s&nbsp;Rutinim</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></strong></span></p><p style="line-height: 1;"><span data-contrast="auto" lang="EN" style="font-size: 15px;">G&ouml;z &ccedil;evresinde daha etkili bir sonu&ccedil; i&ccedil;in&nbsp;</span><span style="font-size: 15px;"><a href="https://www.kiehls.com.tr/super-multi-corrective-cream" rel="noreferrer" target="_blank"><span data-contrast="none" lang="EN"><span data-ccp-charstyle="Hyperlink">Super Multi Corrective Cream</span></span></a><span data-contrast="auto" lang="EN">&nbsp;da destek alabilirsin. Yaşlanmanın belirgin izlerine karşı 5&rsquo;i bir&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">arada bakım sunan&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">&uuml;r&uuml;n g&ouml;z &ccedil;evresini toparlar, sıkılaştırır, p&uuml;r&uuml;zs&uuml;zleştirir,&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">nemlendirir ve canlandırır.</span></span><br><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">G&ouml;z &ccedil;evresindeki sorunları &ccedil;&ouml;zerken y&uuml;z&uuml;n&uuml;n de buna en iyi şekilde eşlik etmesi i&ccedil;in&nbsp;</span></span><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">g&uuml;neş korumalı y&uuml;z kremi&nbsp;</span><a href="https://www.kiehls.com.tr/powerful-wrinkle-reducing-cream-spf30" rel="noreferrer" target="_blank"><span data-contrast="none" lang="EN">Powerful Wrinkle Reducing Cream SPF30</span></a><span data-contrast="auto" lang="EN">&rsquo;u da kullanmanı &ouml;neriyoruz. &Ccedil;izgi ve kırışıklık savaş&ccedil;ısı &uuml;r&uuml;n, cildin ileride oluşacak kırışıklık&nbsp;</span></span><br><span style="font-size: 15px;"><span data-contrast="auto" lang="EN">g&ouml;r&uuml;n&uuml;m&uuml;ne karşı direncinin artmasına yardımcı olur.</span><span data-ccp-props='{"201341983":0,"335559740":276}'>&nbsp;</span></span></p><p><br></p>
                            @SerializedName("left_margin")
                            var leftMargin: Int?, // 10
                            @SerializedName("right_margin")
                            var rightMargin: Int?, // 10
                            @SerializedName("top_margin")
                            var topMargin: Int?, // 0
                            @SerializedName("bottom_margin")
                            var bottomMargin: Int?, // 0
                            @SerializedName("background_colour")
                            var backgroundColour: String?, // #ffffff
                            @SerializedName("dynamic_objects")
                            var dynamicObjects: List<DynamicObject?>?,
                            @SerializedName("height")
                            var height: String?, // 145
                            @SerializedName("width")
                            var width: String? // 320
                    ) {
                        data class DynamicObject(
                                @SerializedName("background_colour")
                                var backgroundColour: String?, // #cccccc
                                @SerializedName("class_name")
                                var className: Any?, // null
                                @SerializedName("height")
                                var height: String?, // 1
                                @SerializedName("image_detail")
                                var imageDetail: ImageDetail?,
                                @SerializedName("link_c")
                                var linkC: LinkC?,
                                @SerializedName("object_id")
                                var objectId: String?, // randomObjId_154618
                                @SerializedName("position")
                                var position: Position?,
                                @SerializedName("related_position")
                                var relatedPosition: RelatedPosition?,
                                @SerializedName("size_to_fit")
                                var sizeToFit: Boolean?, // true
                                @SerializedName("subname")
                                var subname: Any?, // null
                                @SerializedName("text_detail")
                                var textDetail: TextDetail?,
                                @SerializedName("type")
                                var type: String?, // view
                                @SerializedName("width")
                                var width: String? ,// 216
                                @SerializedName("slider_detail")
                                var sliderDetail: SliderDetail? // 216
                        ) {
                            data class ImageDetail(
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("image")
                                    var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-10/25/menu_logo.png
                                    @SerializedName("mode")
                                    var mode: String?, // aspect_fit
                                    @SerializedName("subname")
                                    var subname: Any?, // null
                                    @SerializedName("type")
                                    var type: String? // normal
                            )

                            data class LinkC(
                                    @SerializedName("component_hash")
                                    var componentHash: String?, // 1fbfd801eb7038889b28046388eb84b7
                                    @SerializedName("component_id")
                                    var componentId: String?, // Link_2
                                    @SerializedName("component_is_sticky")
                                    var componentIsSticky: Boolean?, // false
                                    @SerializedName("component_name")
                                    var componentName: String?, // Link
                                    @SerializedName("data")
                                    var linkCData: LinkCData?,
                                    @SerializedName("widget_alias")
                                    var widgetAlias: String? // mobile_menu_top
                            ) {
                                data class LinkCData(
                                        @SerializedName("link")
                                        var link: String? // /giris
                                )
                            }

                            data class Position(
                                    @SerializedName("bottom")
                                    var bottom: String?, // 0
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("left")
                                    var left: String?, // 0
                                    @SerializedName("subname")
                                    var subname: Any? // null
                            )

                            data class RelatedPosition(
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("horizontal")
                                    var horizontal: String?, // 0
                                    @SerializedName("horizontal_object_id")
                                    var horizontalObjectId: String?, // login_bg
                                    @SerializedName("subname")
                                    var subname: Any?, // null
                                    @SerializedName("vertical")
                                    var vertical: String?, // 0
                                    @SerializedName("vertical_object_id")
                                    var verticalObjectId: String? // login_bg
                            )

                            data class TextDetail(
                                    @SerializedName("text_c")
                                    var textC: TextC?
                            ) {
                                data class TextC(
                                        @SerializedName("class_name")
                                        var className: Any?, // null
                                        @SerializedName("font")
                                        var font: String?, // HelveticaNeue-CondensedBold
                                        @SerializedName("subname")
                                        var subname: Any?, // null
                                        @SerializedName("text")
                                        var text: String?, // GİRİŞ YAP
                                        @SerializedName("text_colour")
                                        var textColour: String?, // #ffffff
                                        @SerializedName("text_size")
                                        var textSize: Int?, // 15
                                        @SerializedName("text_align")
                                        var textAlign: String? // center
                                )
                            }
                        }
                    }
                }

                data class Info(
                        @SerializedName("ajax_load")
                        var ajaxLoad: Boolean?, // false
                        @SerializedName("widget_title")
                        var widgetTitle: String?
                )
            }
        }

        data class LeftTop(
                @SerializedName("container_width")
                var containerWidth: String?, // 2.00
                @SerializedName("info")
                var info: Info?,
                @SerializedName("renders")
                var renders: List<Render?>?
        ) {
            data class Info(
                    @SerializedName("ajax_load")
                    var ajaxLoad: Any?, // null
                    @SerializedName("alias")
                    var alias: String?, // left_top
                    @SerializedName("background_color")
                    var backgroundColor: String?,
                    @SerializedName("background_image")
                    var backgroundImage: String?,
                    @SerializedName("background_image_mode")
                    var backgroundImageMode: String?,
                    @SerializedName("background_image_type")
                    var backgroundImageType: String?,
                    @SerializedName("base_path")
                    var basePath: String?, // app/themes/kiehls/widgets/
                    @SerializedName("cache_duration")
                    var cacheDuration: Any?, // null
                    @SerializedName("class_name")
                    var className: String?, // mobile_menu_top
                    @SerializedName("class_name_other")
                    var classNameOther: Any?, // null
                    @SerializedName("class")
                    var classX: String?,
                    @SerializedName("cms_design_alias")
                    var cmsDesignAlias: String?, // mobile-tablet-powerful-wrinkle-reducing-eye-cream-rpp
                    @SerializedName("cms_design_class")
                    var cmsDesignClass: String?,
                    @SerializedName("cms_design_id")
                    var cmsDesignId: String?, // 559
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5440
                    @SerializedName("cms_device_id")
                    var cmsDeviceId: String?, // 11
                    @SerializedName("cms_layout_filename")
                    var cmsLayoutFilename: String?, // layout_mobile
                    @SerializedName("cms_layout_id")
                    var cmsLayoutId: String?, // 6
                    @SerializedName("cms_layout_place_id")
                    var cmsLayoutPlaceId: String?, // 355
                    @SerializedName("cms_widget_category_id")
                    var cmsWidgetCategoryId: String?, // 1
                    @SerializedName("cms_widget_id")
                    var cmsWidgetId: String?, // 783
                    @SerializedName("cms_widget_preset_id")
                    var cmsWidgetPresetId: Any?, // null
                    @SerializedName("commercial_type")
                    var commercialType: Any?, // null
                    @SerializedName("Description")
                    var description: Any?, // null
                    @SerializedName("device_availabilty")
                    var deviceAvailabilty: Any?, // null
                    @SerializedName("disable_bounce")
                    var disableBounce: String?, // 0
                    @SerializedName("dynamic_layout")
                    var dynamicLayout: String?, // 0
                    @SerializedName("filename")
                    var filename: String?, // layout_mobile
                    @SerializedName("full_width")
                    var fullWidth: String?, // 0
                    @SerializedName("hidden")
                    var hidden: Any?, // null
                    @SerializedName("id")
                    var id: String?, // 5440
                    @SerializedName("image")
                    var image: Any?, // null
                    @SerializedName("is_dynamic")
                    var isDynamic: String?, // 0
                    @SerializedName("is_dynamic_widget")
                    var isDynamicWidget: Any?, // null
                    @SerializedName("is_favorite")
                    var isFavorite: Any?, // null
                    @SerializedName("is_master")
                    var isMaster: Any?, // null
                    @SerializedName("is_master_template")
                    var isMasterTemplate: String?, // 0
                    @SerializedName("is_system")
                    var isSystem: String?, // 0
                    @SerializedName("is_template")
                    var isTemplate: String?, // 0
                    @SerializedName("is_theme_specific")
                    var isThemeSpecific: Any?, // null
                    @SerializedName("item_id")
                    var itemId: String?, // 70168
                    @SerializedName("label")
                    var label: Any?, // null
                    @SerializedName("main_cms_widget_id")
                    var mainCmsWidgetId: Any?, // null
                    @SerializedName("mobile_params")
                    var mobileParams: String?,
                    @SerializedName("mobile_version")
                    var mobileVersion: Any?, // null
                    @SerializedName("name")
                    var name: String?, // Tablet
                    @SerializedName("no_index")
                    var noIndex: String?, // 0
                    @SerializedName("order_no")
                    var orderNo: String?, // 0.000000
                    @SerializedName("page_description")
                    var pageDescription: String?, // %meta_description%
                    @SerializedName("page_keywords")
                    var pageKeywords: String?,
                    @SerializedName("page_title")
                    var pageTitle: String?, // %meta_title%
                    @SerializedName("page_type")
                    var pageType: String?,
                    @SerializedName("parameter_source_type")
                    var parameterSourceType: Any?, // null
                    @SerializedName("params")
                    var params: List<Any?>?,
                    @SerializedName("parent_design_id")
                    var parentDesignId: String?, // 558
                    @SerializedName("place_container_class_name")
                    var placeContainerClassName: Any?, // null
                    @SerializedName("place_container_end")
                    var placeContainerEnd: Any?, // null
                    @SerializedName("place_container_inner_end")
                    var placeContainerInnerEnd: Any?, // null
                    @SerializedName("place_container_inner_start")
                    var placeContainerInnerStart: Any?, // null
                    @SerializedName("place_container_start")
                    var placeContainerStart: Any?, // null
                    @SerializedName("place_width_end")
                    var placeWidthEnd: String?, // 0.00
                    @SerializedName("place_width_start")
                    var placeWidthStart: String?, // 0.00
                    @SerializedName("preset_params")
                    var presetParams: Any?, // null
                    @SerializedName("pro_admin_support")
                    var proAdminSupport: Any?, // null
                    @SerializedName("row_container_class_name")
                    var rowContainerClassName: Any?, // null
                    @SerializedName("row_container_end")
                    var rowContainerEnd: Any?, // null
                    @SerializedName("row_container_start")
                    var rowContainerStart: Any?, // null
                    @SerializedName("short_description")
                    var shortDescription: Any?, // null
                    @SerializedName("social_description")
                    var socialDescription: String?, // %meta_description%
                    @SerializedName("social_image")
                    var socialImage: String?, // %product_image%
                    @SerializedName("social_title")
                    var socialTitle: String?, // %label%
                    @SerializedName("status")
                    var status: String?, // 2
                    @SerializedName("tags")
                    var tags: Any?, // null
                    @SerializedName("title")
                    var title: Any?, // null
                    @SerializedName("tpl_code")
                    var tplCode: Any?, // null
                    @SerializedName("update_status")
                    var updateStatus: String?, // 1
                    @SerializedName("use_cache")
                    var useCache: Any?, // null
                    @SerializedName("version_key")
                    var versionKey: String?, // 6D33143A49
                    @SerializedName("weight")
                    var weight: Any?, // null
                    @SerializedName("widget_title")
                    var widgetTitle: Any?, // null
                    @SerializedName("width")
                    var width: String?, // 2.00
                    @SerializedName("width_sm")
                    var widthSm: Any?, // null
                    @SerializedName("width_xs")
                    var widthXs: Any? // null
            )

            data class Render(
                    @SerializedName("cms_design_widget_id")
                    var cmsDesignWidgetId: String?, // 5440
                    @SerializedName("components")
                    var components: List<Component?>?,
                    @SerializedName("info")
                    var info: Info?,
                    @SerializedName("module_id")
                    var moduleId: Int?, // 1
                    @SerializedName("module_name")
                    var moduleName: String?, // mobile_menu_top
                    @SerializedName("params")
                    var params: Any? // null
            ) {
                data class Component(
                        @SerializedName("component_hash")
                        var componentHash: String?, // adf44b66eae609dc398b2009e49ec96b
                        @SerializedName("component_id")
                        var componentId: String?, // Dynamic_1
                        @SerializedName("component_is_sticky")
                        var componentIsSticky: Boolean?, // false
                        @SerializedName("component_name")
                        var componentName: String?, // Dynamic
                        @SerializedName("data")
                        var componentData: ComponentData?,
                        @SerializedName("widget_alias")
                        var widgetAlias: String? // mobile_menu_top
                ) {
                    data class ComponentData(
                            @SerializedName("background_colour")
                            var backgroundColour: String?, // #ffffff
                            @SerializedName("dynamic_objects")
                            var dynamicObjects: List<DynamicObject?>?,
                            @SerializedName("height")
                            var height: String?, // 145
                            @SerializedName("width")
                            var width: String? // 320
                    ) {
                        data class DynamicObject(
                                @SerializedName("background_colour")
                                var backgroundColour: String?, // #cccccc
                                @SerializedName("class_name")
                                var className: Any?, // null
                                @SerializedName("height")
                                var height: String?, // 1
                                @SerializedName("image_detail")
                                var imageDetail: ImageDetail?,
                                @SerializedName("link_c")
                                var linkC: LinkC?,
                                @SerializedName("object_id")
                                var objectId: String?, // randomObjId_154618
                                @SerializedName("position")
                                var position: Position?,
                                @SerializedName("related_position")
                                var relatedPosition: RelatedPosition?,
                                @SerializedName("size_to_fit")
                                var sizeToFit: Boolean?, // true
                                @SerializedName("subname")
                                var subname: Any?, // null
                                @SerializedName("text_detail")
                                var textDetail: TextDetail?,
                                @SerializedName("type")
                                var type: String?, // view
                                @SerializedName("width")
                                var width: String? // 216
                        ) {
                            data class ImageDetail(
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("image")
                                    var image: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-10/25/menu_logo.png
                                    @SerializedName("mode")
                                    var mode: String?, // aspect_fit
                                    @SerializedName("subname")
                                    var subname: Any?, // null
                                    @SerializedName("type")
                                    var type: String? // normal
                            )

                            data class LinkC(
                                    @SerializedName("component_hash")
                                    var componentHash: String?, // 1fbfd801eb7038889b28046388eb84b7
                                    @SerializedName("component_id")
                                    var componentId: String?, // Link_2
                                    @SerializedName("component_is_sticky")
                                    var componentIsSticky: Boolean?, // false
                                    @SerializedName("component_name")
                                    var componentName: String?, // Link
                                    @SerializedName("data")
                                    var linkCData: LinkCData?,
                                    @SerializedName("widget_alias")
                                    var widgetAlias: String? // mobile_menu_top
                            ) {
                                data class LinkCData(
                                        @SerializedName("link")
                                        var link: String? // /giris
                                )
                            }

                            data class Position(
                                    @SerializedName("bottom")
                                    var bottom: String?, // 0
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("left")
                                    var left: String?, // 0
                                    @SerializedName("subname")
                                    var subname: Any? // null
                            )

                            data class RelatedPosition(
                                    @SerializedName("class_name")
                                    var className: Any?, // null
                                    @SerializedName("horizontal")
                                    var horizontal: String?, // 0
                                    @SerializedName("horizontal_object_id")
                                    var horizontalObjectId: String?, // login_bg
                                    @SerializedName("subname")
                                    var subname: Any?, // null
                                    @SerializedName("vertical")
                                    var vertical: String?, // 0
                                    @SerializedName("vertical_object_id")
                                    var verticalObjectId: String? // login_bg
                            )

                            data class TextDetail(
                                    @SerializedName("text_c")
                                    var textC: TextC?
                            ) {
                                data class TextC(
                                        @SerializedName("class_name")
                                        var className: Any?, // null
                                        @SerializedName("font")
                                        var font: String?, // HelveticaNeue-CondensedBold
                                        @SerializedName("subname")
                                        var subname: Any?, // null
                                        @SerializedName("text")
                                        var text: String?, // GİRİŞ YAP
                                        @SerializedName("text_colour")
                                        var textColour: String?, // #ffffff
                                        @SerializedName("text_size")
                                        var textSize: Int? // 15
                                )
                            }
                        }
                    }
                }

                data class Info(
                        @SerializedName("ajax_load")
                        var ajaxLoad: Boolean?, // false
                        @SerializedName("widget_title")
                        var widgetTitle: Any? // null
                )
            }
        }
    }
}