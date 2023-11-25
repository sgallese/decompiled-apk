package io.realm.internal;

import android.content.Context;
import java.io.File;

/* compiled from: RealmCore.java */
/* loaded from: classes4.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17827a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f17828b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f17829c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f17830d;

    static {
        String str = File.separator;
        f17827a = str;
        String str2 = File.pathSeparator;
        f17828b = str2;
        f17829c = "lib" + str2 + ".." + str + "lib";
        f17830d = false;
    }

    public static synchronized void a(Context context) {
        synchronized (n.class) {
            if (f17830d) {
                return;
            }
            a6.b.a(context, "realm-jni", "10.13.2-transformer-api");
            f17830d = true;
        }
    }
}
