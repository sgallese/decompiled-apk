package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* compiled from: Constants.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final long f11629a = TimeUnit.MINUTES.toMillis(3);

    /* compiled from: Constants.java */
    /* loaded from: classes3.dex */
    public static final class a {
        public static androidx.collection.a<String, String> a(Bundle bundle) {
            androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            return aVar;
        }
    }
}
