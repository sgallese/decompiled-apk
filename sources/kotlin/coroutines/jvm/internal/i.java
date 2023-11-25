package kotlin.coroutines.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugMetadata.kt */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f19456a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final a f19457b = new a(null, null, null);

    /* renamed from: c  reason: collision with root package name */
    private static a f19458c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugMetadata.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f19459a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f19460b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f19461c;

        public a(Method method, Method method2, Method method3) {
            this.f19459a = method;
            this.f19460b = method2;
            this.f19461c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, new Class[0]));
            f19458c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f19457b;
            f19458c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        q.i(aVar, "continuation");
        a aVar2 = f19458c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f19457b) {
            return null;
        }
        Method method = aVar2.f19459a;
        if (method != null) {
            obj = method.invoke(aVar.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar2.f19460b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar2.f19461c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
