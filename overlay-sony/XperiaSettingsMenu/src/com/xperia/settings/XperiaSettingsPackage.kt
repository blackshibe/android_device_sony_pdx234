/*
 * Copyright (C) 2024 XperiaLabs Project
 * Copyright (C) 2022 Paranoid Android
 * SPDX-License-Identifier: Apache-2.0
 */

package com.xperia.settings

import android.os.Bundle
import android.content.Intent
import android.content.pm.PackageManager
import androidx.preference.*
import androidx.core.content.pm.PackageInfoCompat
 
import com.xperia.settings.R
 
class XperiaSettingsPackage(private val fragment: PreferenceFragmentCompat) {
    private val pm = fragment.activity?.packageManager
    private val displayPackageName = "com.xperia.settings.display"
    private val displayClassName = "com.xperia.settings.display.DisplaySettingsActivity"
    private val audioPackageName = "com.xperia.settings.audio"
    private val audioClassName = "com.xperia.settings.audio.AudioSettingsActivity"
    private val batteryPackageName = "org.lineageos.lineageparts"
    private val batteryClassName = "org.lineageos.lineageparts.health.ChargingControlSettings"
    private val extmonPackageName = "com.sonymobile.extmonitorapp"
    private val extmonClassName = "com.sonymobile.extmonitorapp.settings.SettingsAppLauncherActivity"
    private val usbaPackageName = "jp.co.sony.mc.usbextoutaudio"
    private val usbaClassName = "jp.co.sony.mc.usbextoutaudio.AudioSettingsActivity"
    private val dsmPackageName = "com.sonymobile.dualshockmanager"
    private val dsmClassName = "com.sonymobile.dualshockmanager.Ds4SetUpActivity"
    private val accuiPackageName = "jp.co.sony.mc.gameaccui"
    private val accuiClassName = "jp.co.sony.mc.gameaccui.MainActivity"

    fun setupDisplaySettings() {
        try {
            val packageInfo = pm?.getPackageInfo(displayPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("display_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(displayPackageName, displayClassName)
                }
                fragment.findPreference<Preference>("display_settings")?.intent = intent
            } else {
                val category = fragment.findPreference<PreferenceCategory>("display")
                fragment.findPreference<Preference>("display_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("display")
            fragment.findPreference<Preference>("display_settings")?.isVisible = false
            category?.isVisible = false
        }
    }

    fun setupAudioSettings() {
        try {
            val packageInfo = pm?.getPackageInfo(audioPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("audio_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(audioPackageName, audioClassName)
                }
                fragment.findPreference<Preference>("audio_settings")?.intent = intent
            } else {
                val category = fragment.findPreference<PreferenceCategory>("sound")
                fragment.findPreference<Preference>("audio_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("sound")
            fragment.findPreference<Preference>("audio_settings")?.isVisible = false
            category?.isVisible = false
        }
    }

    fun setupBatterySettings() {
        try {
            val packageInfo = pm?.getPackageInfo(batteryPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("charging_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(batteryPackageName, batteryClassName)
                }
                fragment.findPreference<Preference>("charging_settings")?.intent = intent
            } else {
                val category = fragment.findPreference<PreferenceCategory>("charger")
                fragment.findPreference<Preference>("charging_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("charger")
            fragment.findPreference<Preference>("charging_settings")?.isVisible = false
            category?.isVisible = false
        }
    }
    fun setupExtMonSettings() {
        try {
            val packageInfo = pm?.getPackageInfo(extmonPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("usb_extmon_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(extmonPackageName, extmonClassName)
                }
                fragment.findPreference<Preference>("usb_extmon_settings")?.intent = intent
            } else {
                val category = fragment.findPreference<PreferenceCategory>("usb")
                fragment.findPreference<Preference>("usb_extmon_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("usb")
            fragment.findPreference<Preference>("usb_extmon_settings")?.isVisible = false
            category?.isVisible = false
        }
    }
    fun setupUSBASettings() {
        try {
            val packageInfo = pm?.getPackageInfo(usbaPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("usb_audio_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(usbaPackageName, usbaClassName)
                }
                fragment.findPreference<Preference>("usb_audio_settings")?.intent = intent
            } else {
                val category = fragment.findPreference<PreferenceCategory>("usb")
                fragment.findPreference<Preference>("usb_audio_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("usb")
            fragment.findPreference<Preference>("usb_audio_settings")?.isVisible = false
            category?.isVisible = false
        }
    }
    fun setupDSMSettings() {
        try {
            val packageInfo = pm?.getPackageInfo(dsmPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("dsm_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(dsmPackageName, dsmClassName)
                }
                fragment.findPreference<Preference>("dsm_settings")?.intent = intent
            } else {
                val category = fragment.findPreference<PreferenceCategory>("gaming")
                fragment.findPreference<Preference>("dsm_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("gaming")
            fragment.findPreference<Preference>("dsm_settings")?.isVisible = false
            category?.isVisible = false
        }
    }
    fun setupACCUISettings() {
        try {
            val packageInfo = pm?.getPackageInfo(accuiPackageName, PackageManager.GET_ACTIVITIES)
            if (packageInfo != null && PackageInfoCompat.getLongVersionCode(packageInfo) >= 1) {
                fragment.findPreference<Preference>("accui_settings")?.isVisible = true
                val intent = Intent().apply {
                    setClassName(accuiPackageName, accuiClassName)
                }
                fragment.findPreference<Preference>("accui_settings")?.intent = intent
            } else {

                val category = fragment.findPreference<PreferenceCategory>("gaming")
                fragment.findPreference<Preference>("accui_settings")?.isVisible = false
                category?.isVisible = false
            }
        } catch (e: PackageManager.NameNotFoundException) {
            val category = fragment.findPreference<PreferenceCategory>("gaming")
            fragment.findPreference<Preference>("accui_settings")?.isVisible = false
            category?.isVisible = false
        }
    }
}