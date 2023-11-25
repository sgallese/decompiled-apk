package com.google.protobuf;

import com.google.protobuf.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f12384b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile o f12385c;

    /* renamed from: d  reason: collision with root package name */
    static final o f12386d = new o(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, x.e<?, ?>> f12387a;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f12388a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12389b;

        a(Object obj, int i10) {
            this.f12388a = obj;
            this.f12389b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f12388a != aVar.f12388a || this.f12389b != aVar.f12389b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12388a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f12389b;
        }
    }

    o() {
        this.f12387a = new HashMap();
    }

    public static o b() {
        o oVar = f12385c;
        if (oVar == null) {
            synchronized (o.class) {
                oVar = f12385c;
                if (oVar == null) {
                    if (f12384b) {
                        oVar = n.a();
                    } else {
                        oVar = f12386d;
                    }
                    f12385c = oVar;
                }
            }
        }
        return oVar;
    }

    public <ContainingType extends q0> x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (x.e<ContainingType, ?>) this.f12387a.get(new a(containingtype, i10));
    }

    o(boolean z10) {
        this.f12387a = Collections.emptyMap();
    }
}
