package com.jhc.volumetile

import android.service.quicksettings.TileService
import com.topjohnwu.superuser.Shell


class PowerTileService : TileService() {
    override fun onStartListening() {
        Shell.getShell()
    }

    override fun onClick() {
        Shell.cmd("input keyevent 26").exec()
    }
}