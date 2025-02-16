package com.example.blogapp.data.model

import com.google.gson.annotations.SerializedName


data class BlogData(
    @SerializedName("id"                            ) var id                          : Int?              = null,
    @SerializedName("date"                          ) var date                        : String?           = null,
    @SerializedName("date_gmt"                      ) var dateGmt                     : String?           = null,
    @SerializedName("guid"                          ) var guid                        : Guid?             = Guid(),
    @SerializedName("modified"                      ) var modified                    : String?           = null,
    @SerializedName("modified_gmt"                  ) var modifiedGmt                 : String?           = null,
    @SerializedName("slug"                          ) var slug                        : String?           = null,
    @SerializedName("status"                        ) var status                      : String?           = null,
    @SerializedName("type"                          ) var type                        : String?           = null,
    @SerializedName("link"                          ) var link                        : String?           = null,
    @SerializedName("title"                         ) var title                       : Title?            = Title(),
    @SerializedName("content"                       ) var content                     : Content?          = Content(),
    @SerializedName("excerpt"                       ) var excerpt                     : Excerpt?          = Excerpt(),
    @SerializedName("author"                        ) var author                      : Int?              = null,
    @SerializedName("featured_media"                ) var featuredMedia               : Int?              = null,
    @SerializedName("comment_status"                ) var commentStatus               : String?           = null,
    @SerializedName("ping_status"                   ) var pingStatus                  : String?           = null,
    @SerializedName("sticky"                        ) var sticky                      : Boolean?          = null,
    @SerializedName("template"                      ) var template                    : String?           = null,
    @SerializedName("format"                        ) var format                      : String?           = null,
    @SerializedName("meta"                          ) var meta                        : Meta?             = Meta(),
    @SerializedName("categories"                    ) var categories                  : ArrayList<Int>    = arrayListOf(),
    @SerializedName("tags"                          ) var tags                        : ArrayList<Int>    = arrayListOf(),
    @SerializedName("class_list"                    ) var classList                   : ArrayList<String> = arrayListOf(),
    @SerializedName("jetpack_publicize_connections" ) var jetpackPublicizeConnections : ArrayList<String> = arrayListOf(),
    @SerializedName("aioseo_notices"                ) var aioseoNotices               : ArrayList<String> = arrayListOf(),
    @SerializedName("jetpack_featured_media_url"    ) var jetpackFeaturedMediaUrl     : String?           = null,
    @SerializedName("jetpack_likes_enabled"         ) var jetpackLikesEnabled         : Boolean?          = null,
    @SerializedName("jetpack_shortlink"             ) var jetpackShortlink            : String?           = null,
    @SerializedName("jetpack-related-posts"         ) var jetpackRelatedPosts       : ArrayList<String> = arrayListOf(),
    @SerializedName("jetpack_sharing_enabled"       ) var jetpackSharingEnabled       : Boolean?          = null,
    @SerializedName("_links"                        ) var links                       : Links?            = Links()
)

data class Guid(

    @SerializedName("rendered") var rendered: String? = null

)


data class Title(

    @SerializedName("rendered") var rendered: String? = null

)

data class Content(

    @SerializedName("rendered") var rendered: String? = null,
    @SerializedName("protected") var protected: Boolean? = null

)


data class Excerpt(

    @SerializedName("rendered") var rendered: String? = null,
    @SerializedName("protected") var protected: Boolean? = null

)


data class ImageGeneratorSettings(

    @SerializedName("template") var template: String? = null,
    @SerializedName("enabled") var enabled: Boolean? = null

)

data class JetpackSocialOptions(

    @SerializedName("image_generator_settings") var imageGeneratorSettings:
    ImageGeneratorSettings? = ImageGeneratorSettings(),
    @SerializedName("version") var version: Int? = null

)


data class Meta(

    @SerializedName("jetpack_post_was_ever_published") var jetpackPostWasEverPublished: Boolean? = null,
    @SerializedName("_jetpack_newsletter_access") var jetpackNewsletterAccess: String? = null,
    @SerializedName("_jetpack_dont_email_post_to_subs") var jetpackDontEmailPostToSubs: Boolean? = null,
    @SerializedName("_jetpack_newsletter_tier_id") var jetpackNewsletterTierId: Int? = null,
    @SerializedName("_jetpack_memberships_contains_paywalled_content") var jetpackMembershipsContainsPaywalledContent: Boolean? = null,
    @SerializedName("_jetpack_memberships_contains_paid_content") var jetpackMembershipsContainsPaidContent: Boolean? = null,
    @SerializedName("footnotes") var footnotes: String? = null,
    @SerializedName("jetpack_publicize_message") var jetpackPublicizeMessage: String? = null,
    @SerializedName("jetpack_publicize_feature_enabled") var jetpackPublicizeFeatureEnabled: Boolean? = null,
    @SerializedName("jetpack_social_post_already_shared") var jetpackSocialPostAlreadyShared: Boolean? = null,
    @SerializedName("jetpack_social_options") var jetpackSocialOptions: JetpackSocialOptions? = JetpackSocialOptions()

)


data class TargetHints(

    @SerializedName("allow") var allow: ArrayList<String> = arrayListOf()

)

data class Self(

    @SerializedName("href") var href: String? = null,
    @SerializedName("targetHints") var targetHints: TargetHints? = TargetHints()

)

data class Collection(

    @SerializedName("href") var href: String? = null

)


data class About(

    @SerializedName("href") var href: String? = null

)


data class Author(

    @SerializedName("embeddable") var embeddable: Boolean? = null,
    @SerializedName("href") var href: String? = null

)


data class Replies(

    @SerializedName("embeddable") var embeddable: Boolean? = null,
    @SerializedName("href") var href: String? = null

)


data class PredecessorVersion(

    @SerializedName("id") var id: Int? = null,
    @SerializedName("href") var href: String? = null

)

data class VersionHistory(

    @SerializedName("count") var count: Int? = null,
    @SerializedName("href") var href: String? = null

)


data class WpFeatureMedia(

    @SerializedName("embeddable") var embeddable: Boolean? = null,
    @SerializedName("href") var href: String? = null

)


data class WpAttachment(

    @SerializedName("href") var href: String? = null

)


data class WpTerm(

    @SerializedName("taxonomy") var taxonomy: String? = null,
    @SerializedName("embeddable") var embeddable: Boolean? = null,
    @SerializedName("href") var href: String? = null

)


data class Curies(

    @SerializedName("name") var name: String? = null,
    @SerializedName("href") var href: String? = null,
    @SerializedName("templated") var templated: Boolean? = null

)


data class Links(

    @SerializedName("self") var self: ArrayList<Self> = arrayListOf(),
    @SerializedName("collection") var collection: ArrayList<Collection> = arrayListOf(),
    @SerializedName("about") var about: ArrayList<About> = arrayListOf(),
    @SerializedName("author") var author: ArrayList<Author> = arrayListOf(),
    @SerializedName("replies") var replies: ArrayList<Replies> = arrayListOf(),
    @SerializedName("version-history") var versionHistory: ArrayList<VersionHistory> = arrayListOf(),
    @SerializedName("predecessor-version") var predecessorVersion: ArrayList<PredecessorVersion> = arrayListOf(),
    @SerializedName("wp:featuredmedia") var wpfeaturedmedia: ArrayList<WpFeatureMedia> = arrayListOf(),
    @SerializedName("wp:attachment") var wpAttachment: ArrayList<WpAttachment> = arrayListOf(),
    @SerializedName("wp:term") var wpTerm: ArrayList<WpTerm> = arrayListOf(),
    @SerializedName("curies") var curies: ArrayList<Curies> = arrayListOf()

)