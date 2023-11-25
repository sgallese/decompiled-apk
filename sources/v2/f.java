package v2;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f24527a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f24527a = new a(uri, clipDescription, uri2);
        } else {
            this.f24527a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new f(new a(obj));
    }

    public Uri a() {
        return this.f24527a.a();
    }

    public ClipDescription b() {
        return this.f24527a.getDescription();
    }

    public Uri c() {
        return this.f24527a.c();
    }

    public void d() {
        this.f24527a.b();
    }

    public Object e() {
        return this.f24527a.d();
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f24528a;

        a(Object obj) {
            this.f24528a = (InputContentInfo) obj;
        }

        @Override // v2.f.c
        public Uri a() {
            return this.f24528a.getContentUri();
        }

        @Override // v2.f.c
        public void b() {
            this.f24528a.requestPermission();
        }

        @Override // v2.f.c
        public Uri c() {
            return this.f24528a.getLinkUri();
        }

        @Override // v2.f.c
        public Object d() {
            return this.f24528a;
        }

        @Override // v2.f.c
        public ClipDescription getDescription() {
            return this.f24528a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24528a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f24527a = cVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f24529a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f24530b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f24531c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24529a = uri;
            this.f24530b = clipDescription;
            this.f24531c = uri2;
        }

        @Override // v2.f.c
        public Uri a() {
            return this.f24529a;
        }

        @Override // v2.f.c
        public Uri c() {
            return this.f24531c;
        }

        @Override // v2.f.c
        public Object d() {
            return null;
        }

        @Override // v2.f.c
        public ClipDescription getDescription() {
            return this.f24530b;
        }

        @Override // v2.f.c
        public void b() {
        }
    }
}
