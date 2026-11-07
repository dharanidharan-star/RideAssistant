package com.rideassistant.core

object PickupDistance {

    private const val LIMIT = 1000.0

    fun calculate(
        lat1: Double,
        lon1: Double,
        lat2: Double,
        lon2: Double
    ): Double {

        val earthRadius = 6371000.0

        val dLat = Math.toRadians(lat2 - lat1)
        val dLon = Math.toRadians(lon2 - lon1)

        val a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) *
                Math.cos(Math.toRadians(lat2)) *
                Math.sin(dLon / 2) *
                Math.sin(dLon / 2)

        val c = 2 * Math.atan2(
            Math.sqrt(a),
            Math.sqrt(1 - a)
        )

        return earthRadius * c
    }

    fun isWithinLimit(distance: Double): Boolean {
        return distance <= LIMIT
    }
}
