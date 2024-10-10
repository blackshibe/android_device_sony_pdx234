#
# Copyright (C) 2018 The LineageOS Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

#
# This file sets variables that control the way modules are built
# thorughout the system. It should not be used to conditionally
# disable makefiles (the proper mechanism to control what gets
# included in a build is to use PRODUCT_PACKAGES in a product
# definition file).
#

# Inherit from sony sm8550-common
$(call inherit-product, device/sony/sm8550-common/common.mk)

# Boot animation
TARGET_SCREEN_HEIGHT := 2560
TARGET_SCREEN_WIDTH := 1440

# Device uses high-density artwork where available
PRODUCT_AAPT_CONFIG := normal
PRODUCT_AAPT_PREF_CONFIG := xxxhdpi

PRODUCT_PACKAGES += \
    android.hidl.base@1.0 \
    android.hidl.manager@1.0

# Overlays
PRODUCT_PACKAGES += \
    SonyPDX234SystemUIRes \
    SonyPDX234NfcNciRes \
    SonyPDX234FrameworksRes

DEVICE_PACKAGE_OVERLAYS += \
    $(LOCAL_PATH)/overlay-lineage

# Soong namespaces
PRODUCT_SOONG_NAMESPACES += \
    $(LOCAL_PATH)

# Xperia Extras
$(call inherit-product, vendor/sony/extra/Yodo/extra.mk)

TARGET_SHIPS_SONY_FRAMEWORK := true
TARGET_SHIPS_SONY_CAMERA := true
TARGET_SUPPORTS_SOUND_ENHANCEMENT := true
TARGET_SHIPS_SOUND_ENHANCEMENT := true

DEVICE_PACKAGE_OVERLAYS += \
    $(LOCAL_PATH)/overlay-sony

# Picked modules from XperiaLabs/hardware_sony
# The right way to do this would be to include the entire repo, but it's unnecessary
PRODUCT_PACKAGES += \
    XperiaAudioAddon \
    XperiaTSRA \
    XperiaSettingsMenu # modified to launch Sony stock audio settings

# Inherit from vendor blobs
$(call inherit-product, vendor/sony/pdx234/pdx234-vendor.mk)
