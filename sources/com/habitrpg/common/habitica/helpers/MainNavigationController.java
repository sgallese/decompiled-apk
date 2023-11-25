package com.habitrpg.common.habitica.helpers;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.navigation.j;
import java.lang.ref.WeakReference;
import java.util.Date;
import k3.k;
import qc.q;

/* compiled from: MainNavigationController.kt */
/* loaded from: classes4.dex */
public final class MainNavigationController {
    public static final MainNavigationController INSTANCE = new MainNavigationController();
    private static WeakReference<androidx.navigation.d> controllerReference;
    private static Date lastNavigation;

    private MainNavigationController() {
    }

    private final androidx.navigation.d getNavController() {
        WeakReference<androidx.navigation.d> weakReference = controllerReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static /* synthetic */ void navigate$default(MainNavigationController mainNavigationController, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        mainNavigationController.navigate(i10, bundle);
    }

    public final Date getLastNavigation() {
        return lastNavigation;
    }

    public final void handle(Intent intent) {
        q.i(intent, "deeplink");
        androidx.navigation.d navController = getNavController();
        if (navController != null) {
            navController.J(intent);
        }
    }

    public final boolean isReady() {
        androidx.navigation.d dVar;
        WeakReference<androidx.navigation.d> weakReference = controllerReference;
        if (weakReference != null) {
            dVar = weakReference.get();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return true;
        }
        return false;
    }

    public final void navigate(int i10, Bundle bundle) {
        Date date = lastNavigation;
        if (Math.abs((date != null ? date.getTime() : 0L) - new Date().getTime()) > 500) {
            lastNavigation = new Date();
            try {
                androidx.navigation.d navController = getNavController();
                if (navController != null) {
                    navController.P(i10, bundle);
                }
            } catch (IllegalArgumentException e10) {
                String localizedMessage = e10.getLocalizedMessage();
                Log.e("Main Navigation", localizedMessage != null ? localizedMessage : "");
            } catch (Exception e11) {
                String localizedMessage2 = e11.getLocalizedMessage();
                Log.e("Main Navigation", localizedMessage2 != null ? localizedMessage2 : "");
            }
        }
    }

    public final void navigateBack() {
        androidx.navigation.d navController = getNavController();
        if (navController != null) {
            navController.Z();
        }
    }

    public final void setLastNavigation(Date date) {
        lastNavigation = date;
    }

    public final void setup(androidx.navigation.d dVar) {
        q.i(dVar, "navController");
        controllerReference = new WeakReference<>(dVar);
    }

    public final void updateLabel(int i10, String str) {
        androidx.navigation.i iVar;
        q.i(str, "label");
        androidx.navigation.d navController = getNavController();
        if (navController != null) {
            iVar = navController.x(i10);
        } else {
            iVar = null;
        }
        if (iVar != null) {
            iVar.D(str);
        }
    }

    public final void navigate(k kVar) {
        q.i(kVar, "directions");
        Date date = lastNavigation;
        if (Math.abs((date != null ? date.getTime() : 0L) - new Date().getTime()) > 500) {
            lastNavigation = new Date();
            try {
                androidx.navigation.d navController = getNavController();
                if (navController != null) {
                    navController.X(kVar);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void navigate(String str) {
        q.i(str, "uriString");
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (parse.getScheme() == null) {
            buildUpon = buildUpon.scheme("https");
        }
        if (parse.getHost() == null) {
            buildUpon = buildUpon.authority("habitica.com");
        }
        Uri build = buildUpon.build();
        q.h(build, "build(...)");
        navigate(build);
    }

    public final void navigate(Uri uri) {
        Context B;
        j F;
        q.i(uri, "uri");
        androidx.navigation.d navController = getNavController();
        boolean z10 = false;
        if (navController != null && (F = navController.F()) != null && F.t(uri)) {
            z10 = true;
        }
        if (z10) {
            androidx.navigation.d navController2 = getNavController();
            if (navController2 != null) {
                navController2.S(uri);
                return;
            }
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            androidx.navigation.d navController3 = getNavController();
            if (navController3 == null || (B = navController3.B()) == null) {
                return;
            }
            B.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void navigate(androidx.navigation.h hVar) {
        androidx.navigation.d navController;
        j F;
        q.i(hVar, "request");
        androidx.navigation.d navController2 = getNavController();
        boolean z10 = false;
        if (navController2 != null && (F = navController2.F()) != null && F.u(hVar)) {
            z10 = true;
        }
        if (!z10 || (navController = getNavController()) == null) {
            return;
        }
        navController.T(hVar);
    }
}
