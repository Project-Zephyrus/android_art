/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.art.wrapper;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.util.SparseArray;

import java.util.List;

/** @hide */
public class AndroidPackageApi {
    private final Object mPkg;

    AndroidPackageApi(@NonNull Object pkg) {
        mPkg = pkg;
    }

    Object getRealInstance() {
        return mPkg;
    }

    @NonNull
    public String getBaseApkPath() {
        try {
            return (String) mPkg.getClass().getMethod("getBaseApkPath").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isHasCode() {
        try {
            return (boolean) mPkg.getClass().getMethod("isHasCode").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String[] getSplitNames() {
        try {
            return (String[]) mPkg.getClass().getMethod("getSplitNames").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String[] getSplitCodePaths() {
        try {
            return (String[]) mPkg.getClass().getMethod("getSplitCodePaths").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public int[] getSplitFlags() {
        try {
            return (int[]) mPkg.getClass().getMethod("getSplitFlags").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public String getClassLoaderName() {
        try {
            return (String) mPkg.getClass().getMethod("getClassLoaderName").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public String[] getSplitClassLoaderNames() {
        try {
            return (String[]) mPkg.getClass().getMethod("getSplitClassLoaderNames").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public SparseArray<int[]> getSplitDependencies() {
        try {
            return (SparseArray<int[]>) mPkg.getClass()
                    .getMethod("getSplitDependencies")
                    .invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isIsolatedSplitLoading() {
        try {
            return (boolean) mPkg.getClass().getMethod("isIsolatedSplitLoading").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public int getUid() {
        try {
            return (int) mPkg.getClass().getMethod("getUid").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isVmSafeMode() {
        try {
            return (boolean) mPkg.getClass().getMethod("isVmSafeMode").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isDebuggable() {
        try {
            return (boolean) mPkg.getClass().getMethod("isDebuggable").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isSignedWithPlatformKey() {
        try {
            return (boolean) mPkg.getClass().getMethod("isSignedWithPlatformKey").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isUsesNonSdkApi() {
        try {
            return (boolean) mPkg.getClass().getMethod("isUsesNonSdkApi").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public int getTargetSdkVersion() {
        try {
            return (int) mPkg.getClass().getMethod("getTargetSdkVersion").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public String getSdkLibName() {
        try {
            return (String) mPkg.getClass().getMethod("getSdkLibName").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public String getStaticSharedLibName() {
        try {
            return (String) mPkg.getClass().getMethod("getStaticSharedLibName").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public List<String> getLibraryNames() {
        try {
            return (List<String>) mPkg.getClass().getMethod("getLibraryNames").invoke(mPkg);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
