package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f7440a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f7441a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f7442b;

        a(Uri uri, boolean z10) {
            this.f7441a = uri;
            this.f7442b = z10;
        }

        public Uri a() {
            return this.f7441a;
        }

        public boolean b() {
            return this.f7442b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7442b == aVar.f7442b && this.f7441a.equals(aVar.f7441a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f7441a.hashCode() * 31) + (this.f7442b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f7440a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f7440a;
    }

    public int c() {
        return this.f7440a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f7440a.equals(((d) obj).f7440a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7440a.hashCode();
    }
}
