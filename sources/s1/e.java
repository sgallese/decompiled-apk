package s1;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import qc.q;

/* compiled from: VectorResources.android.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<b, WeakReference<a>> f22939a = new HashMap<>();

    /* compiled from: VectorResources.android.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e1.f f22940a;

        /* renamed from: b  reason: collision with root package name */
        private final int f22941b;

        public a(e1.f fVar, int i10) {
            q.i(fVar, "imageVector");
            this.f22940a = fVar;
            this.f22941b = i10;
        }

        public final int a() {
            return this.f22941b;
        }

        public final e1.f b() {
            return this.f22940a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (q.d(this.f22940a, aVar.f22940a) && this.f22941b == aVar.f22941b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f22940a.hashCode() * 31) + this.f22941b;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f22940a + ", configFlags=" + this.f22941b + ')';
        }
    }

    /* compiled from: VectorResources.android.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Resources.Theme f22942a;

        /* renamed from: b  reason: collision with root package name */
        private final int f22943b;

        public b(Resources.Theme theme, int i10) {
            q.i(theme, "theme");
            this.f22942a = theme;
            this.f22943b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (q.d(this.f22942a, bVar.f22942a) && this.f22943b == bVar.f22943b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f22942a.hashCode() * 31) + this.f22943b;
        }

        public String toString() {
            return "Key(theme=" + this.f22942a + ", id=" + this.f22943b + ')';
        }
    }

    public final void a() {
        this.f22939a.clear();
    }

    public final a b(b bVar) {
        q.i(bVar, "key");
        WeakReference<a> weakReference = this.f22939a.get(bVar);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void c(int i10) {
        Iterator<Map.Entry<b, WeakReference<a>>> it = this.f22939a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<b, WeakReference<a>> next = it.next();
            q.h(next, "it.next()");
            a aVar = next.getValue().get();
            if (aVar == null || Configuration.needNewResources(i10, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        q.i(bVar, "key");
        q.i(aVar, "imageVectorEntry");
        this.f22939a.put(bVar, new WeakReference<>(aVar));
    }
}
