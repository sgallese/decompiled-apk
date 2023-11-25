package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* compiled from: NavDeepLinkRequest.kt */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f5302a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5303b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5304c;

    /* compiled from: NavDeepLinkRequest.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static final C0115a f5305d = new C0115a(null);

        /* renamed from: a  reason: collision with root package name */
        private Uri f5306a;

        /* renamed from: b  reason: collision with root package name */
        private String f5307b;

        /* renamed from: c  reason: collision with root package name */
        private String f5308c;

        /* compiled from: NavDeepLinkRequest.kt */
        /* renamed from: androidx.navigation.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0115a {
            private C0115a() {
            }

            public /* synthetic */ C0115a(qc.h hVar) {
                this();
            }

            public final a a(Uri uri) {
                qc.q.i(uri, "uri");
                a aVar = new a(null);
                aVar.b(uri);
                return aVar;
            }
        }

        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final h a() {
            return new h(this.f5306a, this.f5307b, this.f5308c);
        }

        public final a b(Uri uri) {
            qc.q.i(uri, "uri");
            this.f5306a = uri;
            return this;
        }
    }

    public h(Uri uri, String str, String str2) {
        this.f5302a = uri;
        this.f5303b = str;
        this.f5304c = str2;
    }

    public String a() {
        return this.f5303b;
    }

    public String b() {
        return this.f5304c;
    }

    public Uri c() {
        return this.f5302a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NavDeepLinkRequest");
        sb2.append("{");
        if (c() != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb2.append(" action=");
            sb2.append(a());
        }
        if (b() != null) {
            sb2.append(" mimetype=");
            sb2.append(b());
        }
        sb2.append(" }");
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        qc.q.i(intent, "intent");
    }
}
