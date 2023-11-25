package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static Field f781a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f782b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f783c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f784d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f785e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f786f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f787g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f788h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourcesFlusher.java */
    /* loaded from: classes.dex */
    public static class a {
        static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            d(resources);
        } else if (i10 >= 23) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        Map map;
        if (!f782b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f781a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f782b = true;
        }
        Field field = f781a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.f0.f782b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.f0.f781a = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.f0.f782b = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.f0.f781a
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.f0.c(android.content.res.Resources):void");
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f788h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f787g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f788h = true;
        }
        Field field = f787g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f782b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f781a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f782b = true;
        }
        Field field2 = f781a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f784d) {
            try {
                f783c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f784d = true;
        }
        Class<?> cls = f783c;
        if (cls == null) {
            return;
        }
        if (!f786f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f785e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f786f = true;
        }
        Field field = f785e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
