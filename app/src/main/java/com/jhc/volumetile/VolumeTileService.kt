package com.jhc.volumetile

import android.media.AudioManager
import android.service.quicksettings.TileService

class VolumeTileService : TileService() {
    private var am: AudioManager? = null

    override fun onStartListening() {
        am = getSystemService(AUDIO_SERVICE) as AudioManager
    }

    override fun onClick() {
        am?.adjustStreamVolume(
            AudioManager.STREAM_MUSIC, AudioManager.ADJUST_SAME, AudioManager.FLAG_SHOW_UI
        )
    }
}