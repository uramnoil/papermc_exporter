package com.uramnoil.prometheus.papermc

import io.prometheus.client.Gauge

class ServerMetrics {
    companion object {
         val playerCount = Gauge.build().name("player_count").help("Number of players").register()
    }

    fun onPlayerJoin() {
        playerCount.inc()
    }

    fun onPlayerQuit() {
        playerCount.dec()
    }
}