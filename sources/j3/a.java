package j3;

import java.util.LinkedHashMap;
import java.util.Map;
import qc.q;

/* compiled from: CreationExtras.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<b<?>, Object> f19016a = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    /* renamed from: j3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0424a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0424a f19017b = new C0424a();

        private C0424a() {
        }

        @Override // j3.a
        public <T> T a(b<T> bVar) {
            q.i(bVar, "key");
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    /* loaded from: classes.dex */
    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f19016a;
    }
}
