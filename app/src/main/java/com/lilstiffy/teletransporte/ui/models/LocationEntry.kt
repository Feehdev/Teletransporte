package com.lilstiffy.teletransporte.ui.models

import com.google.android.gms.maps.model.LatLng

data class LocationEntry(
    var latLng: LatLng,
    var addressLine: String? = null,
)
