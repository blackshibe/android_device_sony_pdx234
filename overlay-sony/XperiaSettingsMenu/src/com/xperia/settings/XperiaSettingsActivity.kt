/*
 * Copyright (C) 2024 XperiaLabs Project
 * Copyright (C) 2022 Paranoid Android
 * SPDX-License-Identifier: Apache-2.0
 */

package com.xperia.settings

import android.os.Bundle
import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity

class XperiaSettingsActivity : CollapsingToolbarBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager
                .beginTransaction()
		.replace(
			com.android.settingslib.collapsingtoolbar.R.id.content_frame,
			XperiaSettingsFragment(),
			TAG
		)
                .commit()
    }

    companion object {
        private const val TAG = "XperiaSettingsActivity"
    }   
}