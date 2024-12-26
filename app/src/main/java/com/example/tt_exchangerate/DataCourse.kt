package com.example.tt_exchangerate

import androidx.versionedparcelable.VersionedParcelize


@VersionedParcelize
data class DataCourse (
    val abbreviationName : String,
    val decryptionName :String,)