package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.b;
import androidx.core.app.x;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public class b extends androidx.core.content.a {

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String[] f3624f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Activity f3625m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f3626p;

        a(String[] strArr, Activity activity, int i10) {
            this.f3624f = strArr;
            this.f3625m = activity;
            this.f3626p = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f3624f.length];
            PackageManager packageManager = this.f3625m.getPackageManager();
            String packageName = this.f3625m.getPackageName();
            int length = this.f3624f.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f3624f[i10], packageName);
            }
            ((h) this.f3625m).onRequestPermissionsResult(this.f3626p, this.f3624f, iArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0063b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    static class e {
        static <T> T a(Activity activity, int i10) {
            return (T) activity.requireViewById(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface h {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface i {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class j extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        private final x f3627a;

        j(x xVar) {
            this.f3627a = xVar;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3627a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3627a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f3627a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f3627a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f3627a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f3627a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3627a.h(list, list2, new x.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.x.a
                public final void a() {
                    b.d.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static void A(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        C0063b.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void B(Activity activity) {
        c.e(activity);
    }

    public static void p(Activity activity) {
        C0063b.a(activity);
    }

    public static void q(Activity activity) {
        c.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Activity activity) {
        if (!activity.isFinishing() && !androidx.core.app.e.i(activity)) {
            activity.recreate();
        }
    }

    public static void s(Activity activity) {
        c.b(activity);
    }

    public static void t(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.r(activity);
                }
            });
        }
    }

    public static void u(Activity activity, String[] strArr, int i10) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (!TextUtils.isEmpty(strArr[i11])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            } else {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof i) {
                ((i) activity).validateRequestPermissionsRequestCode(i10);
            }
            d.b(activity, strArr, i10);
        } else if (activity instanceof h) {
            new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
        }
    }

    public static <T extends View> T v(Activity activity, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) e.a(activity, i10);
        }
        T t10 = (T) activity.findViewById(i10);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void w(Activity activity, x xVar) {
        j jVar;
        if (xVar != null) {
            jVar = new j(xVar);
        } else {
            jVar = null;
        }
        c.c(activity, jVar);
    }

    public static void x(Activity activity, x xVar) {
        j jVar;
        if (xVar != null) {
            jVar = new j(xVar);
        } else {
            jVar = null;
        }
        c.d(activity, jVar);
    }

    public static boolean y(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return g.a(activity, str);
        }
        if (i10 == 31) {
            return f.b(activity, str);
        }
        if (i10 < 23) {
            return false;
        }
        return d.c(activity, str);
    }

    public static void z(Activity activity, Intent intent, int i10, Bundle bundle) {
        C0063b.b(activity, intent, i10, bundle);
    }
}
