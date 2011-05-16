#!/bin/bash
adb logcat | grep -E '(Test|AndroidRuntime)'
