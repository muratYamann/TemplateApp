package com.yaman.api.response.model.productpagedata


import com.google.gson.annotations.SerializedName

data class SliderDetail(
        @SerializedName("key")
        var key: String?, // photos
        @SerializedName("image_mode")
        var imageMode: String?, // scale_to_fil
        @SerializedName("gallery_backgroundcolour")
        var galleryBackgroundcolour: String?, // #000000
        @SerializedName("gallery_bartintcolour")
        var galleryBartintcolour: String?, // #000000
        @SerializedName("gallery_tintcolour")
        var galleryTintcolour: String?, // #ffffff
        @SerializedName("gallery_bordercolour")
        var galleryBordercolour: String?, // #cccccc
        @SerializedName("gallery_activebordercolour")
        var galleryActivebordercolour: String?, // #000000
        @SerializedName("gallery_displayactionbutton")
        var galleryDisplayactionbutton: Boolean?, // false
        @SerializedName("gallery_displaynavarrows")
        var galleryDisplaynavarrows: Boolean?, // false
        @SerializedName("gallery_displayselectionbuttons")
        var galleryDisplayselectionbuttons: Boolean?, // false
        @SerializedName("gallery_zoomphotostofill")
        var galleryZoomphotostofill: Boolean?, // true
        @SerializedName("gallery_alwaysshowcontrols")
        var galleryAlwaysshowcontrols: Boolean?, // false
        @SerializedName("gallery_enablegrid")
        var galleryEnablegrid: Boolean?, // false
        @SerializedName("gallery_startongrid")
        var galleryStartongrid: Boolean?, // false
        @SerializedName("gallery_enableswipetodismiss")
        var galleryEnableswipetodismiss: Boolean?, // true
        @SerializedName("gallery_shownextphotoanimated")
        var galleryShownextphotoanimated: Boolean?, // true
        @SerializedName("gallery_showpreviousphotoanimated")
        var galleryShowpreviousphotoanimated: Boolean?, // true
        @SerializedName("gallery_showpagecontrol")
        var galleryShowpagecontrol: Boolean?, // true
        @SerializedName("gallery_showarrows")
        var galleryShowarrows: Boolean?, // false
        @SerializedName("gallery_closebuttonurl")
        var galleryClosebuttonurl: String?, // https://epmajuiy.rocketcdn.com/kiehls/img/content/17-10/25/photo_close_3x.png
        @SerializedName("gallery_closebuttonwidth")
        var galleryClosebuttonwidth: Int?, // 30
        @SerializedName("gallery_closebuttonheight")
        var galleryClosebuttonheight: Int?, // 30
        @SerializedName("gallery_hidethumbnails")
        var galleryHidethumbnails: Boolean?, // true
        @SerializedName("text_c")
        var textC: TextC?,
        @SerializedName("images")
        var images: List<String?>?,
        @SerializedName("links")
        var links: List<String?>?,
        @SerializedName("class_name")
        var className: Any?, // null
        @SerializedName("subname")
        var subname: Any? // null
) {
    data class TextC(
            @SerializedName("font")
            var font: String?, // HelveticaNeue-CondensedBold
            @SerializedName("text")
            var text: String?,
            @SerializedName("text_size")
            var textSize: Int?, // 15
            @SerializedName("text_colour")
            var textColour: String?, // #000000
            @SerializedName("class_name")
            var className: Any?, // null
            @SerializedName("subname")
            var subname: Any? // null
    )
}