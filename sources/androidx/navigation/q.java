package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.n0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: NavigatorProvider.kt */
@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5392b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, String> f5393c = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, p<? extends i>> f5394a = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final String a(Class<? extends p<?>> cls) {
            qc.q.i(cls, "navigatorClass");
            String str = (String) q.f5393c.get(cls);
            if (str == null) {
                p.b bVar = (p.b) cls.getAnnotation(p.b.class);
                if (bVar != null) {
                    str = bVar.value();
                } else {
                    str = null;
                }
                if (b(str)) {
                    q.f5393c.put(cls, str);
                } else {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + cls.getSimpleName()).toString());
                }
            }
            qc.q.f(str);
            return str;
        }

        public final boolean b(String str) {
            boolean z10;
            if (str == null) {
                return false;
            }
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<? extends i> b(p<? extends i> pVar) {
        qc.q.i(pVar, "navigator");
        return c(f5392b.a(pVar.getClass()), pVar);
    }

    public p<? extends i> c(String str, p<? extends i> pVar) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(pVar, "navigator");
        if (f5392b.b(str)) {
            p<? extends i> pVar2 = this.f5394a.get(str);
            if (qc.q.d(pVar2, pVar)) {
                return pVar;
            }
            boolean z10 = false;
            if (pVar2 != null && pVar2.c()) {
                z10 = true;
            }
            if ((!z10) != false) {
                if ((!pVar.c()) != false) {
                    return this.f5394a.put(str, pVar);
                }
                throw new IllegalStateException(("Navigator " + pVar + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + pVar + " is replacing an already attached " + pVar2).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public <T extends p<?>> T d(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (f5392b.b(str)) {
            p<? extends i> pVar = this.f5394a.get(str);
            if (pVar != null) {
                return pVar;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
    }

    public final Map<String, p<? extends i>> e() {
        Map<String, p<? extends i>> r10;
        r10 = n0.r(this.f5394a);
        return r10;
    }
}
