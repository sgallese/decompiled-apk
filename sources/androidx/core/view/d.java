package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import j$.util.Objects;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final f f4145a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f4146a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f4146a = new b(clipData, i10);
            } else {
                this.f4146a = new C0083d(clipData, i10);
            }
        }

        public d a() {
            return this.f4146a.build();
        }

        public a b(Bundle bundle) {
            this.f4146a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f4146a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f4146a.a(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f4147a;

        b(ClipData clipData, int i10) {
            this.f4147a = androidx.core.view.g.a(clipData, i10);
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f4147a.setLinkUri(uri);
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f4147a.setFlags(i10);
        }

        @Override // androidx.core.view.d.c
        public d build() {
            ContentInfo build;
            build = this.f4147a.build();
            return new d(new e(build));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f4147a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        d build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0083d implements c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f4148a;

        /* renamed from: b  reason: collision with root package name */
        int f4149b;

        /* renamed from: c  reason: collision with root package name */
        int f4150c;

        /* renamed from: d  reason: collision with root package name */
        Uri f4151d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f4152e;

        C0083d(ClipData clipData, int i10) {
            this.f4148a = clipData;
            this.f4149b = i10;
        }

        @Override // androidx.core.view.d.c
        public void a(Uri uri) {
            this.f4151d = uri;
        }

        @Override // androidx.core.view.d.c
        public void b(int i10) {
            this.f4150c = i10;
        }

        @Override // androidx.core.view.d.c
        public d build() {
            return new d(new g(this));
        }

        @Override // androidx.core.view.d.c
        public void setExtras(Bundle bundle) {
            this.f4152e = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f4153a;

        e(ContentInfo contentInfo) {
            this.f4153a = androidx.core.view.c.a(androidx.core.util.i.g(contentInfo));
        }

        @Override // androidx.core.view.d.f
        public ClipData a() {
            ClipData clip;
            clip = this.f4153a.getClip();
            return clip;
        }

        @Override // androidx.core.view.d.f
        public int b() {
            int source;
            source = this.f4153a.getSource();
            return source;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo c() {
            return this.f4153a;
        }

        @Override // androidx.core.view.d.f
        public int getFlags() {
            int flags;
            flags = this.f4153a.getFlags();
            return flags;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f4153a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int getFlags();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f4154a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4155b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4156c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f4157d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f4158e;

        g(C0083d c0083d) {
            this.f4154a = (ClipData) androidx.core.util.i.g(c0083d.f4148a);
            this.f4155b = androidx.core.util.i.c(c0083d.f4149b, 0, 5, "source");
            this.f4156c = androidx.core.util.i.f(c0083d.f4150c, 1);
            this.f4157d = c0083d.f4151d;
            this.f4158e = c0083d.f4152e;
        }

        @Override // androidx.core.view.d.f
        public ClipData a() {
            return this.f4154a;
        }

        @Override // androidx.core.view.d.f
        public int b() {
            return this.f4155b;
        }

        @Override // androidx.core.view.d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.d.f
        public int getFlags() {
            return this.f4156c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f4154a.getDescription());
            sb2.append(", source=");
            sb2.append(d.e(this.f4155b));
            sb2.append(", flags=");
            sb2.append(d.a(this.f4156c));
            String str2 = "";
            if (this.f4157d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f4157d.toString().length() + ")";
            }
            sb2.append(str);
            if (this.f4158e != null) {
                str2 = ", hasExtras";
            }
            sb2.append(str2);
            sb2.append("}");
            return sb2.toString();
        }
    }

    d(f fVar) {
        this.f4145a = fVar;
    }

    static String a(int i10) {
        if ((i10 & 1) != 0) {
            return "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        return String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return String.valueOf(i10);
                            }
                            return "SOURCE_PROCESS_TEXT";
                        }
                        return "SOURCE_AUTOFILL";
                    }
                    return "SOURCE_DRAG_AND_DROP";
                }
                return "SOURCE_INPUT_METHOD";
            }
            return "SOURCE_CLIPBOARD";
        }
        return "SOURCE_APP";
    }

    public static d g(ContentInfo contentInfo) {
        return new d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f4145a.a();
    }

    public int c() {
        return this.f4145a.getFlags();
    }

    public int d() {
        return this.f4145a.b();
    }

    public ContentInfo f() {
        ContentInfo c10 = this.f4145a.c();
        Objects.requireNonNull(c10);
        return androidx.core.view.c.a(c10);
    }

    public String toString() {
        return this.f4145a.toString();
    }
}
