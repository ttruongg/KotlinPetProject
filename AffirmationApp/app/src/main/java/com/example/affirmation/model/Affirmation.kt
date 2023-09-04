package com.example.affirmation.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val StringResourceID: Int,
    @DrawableRes val ImageResourceID: Int,
)
