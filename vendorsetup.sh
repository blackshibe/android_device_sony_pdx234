#!/bin/bash

echo -e
echo 'Start Applying needed patches'
echo -e
echo 'Applying VTService patch in frameworks/av'
echo -e
cd frameworks/av
git reset --hard FETCH_HEAD
echo -e
git am ../../device/sony/pdx234/configs/patches/frameworks_av/VTService/*
cd ../..
echo -e
echo 'Applying X-Reality Engine patches in frameworks/base'
cd frameworks/base
git reset --hard FETCH_HEAD
echo -e
git am ../../device/sony/pdx234/configs/patches/frameworks_base/X-Reality/*
cd ../..
echo -e
echo 'Done applying'
echo -e
echo 'Continue'