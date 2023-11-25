package w4;

import android.net.Uri;
import qc.q;
import w4.i;

/* compiled from: ResourceUriFetcher.kt */
/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f25400c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Uri f25401a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25402b;

    /* compiled from: ResourceUriFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: ResourceUriFetcher.kt */
    /* loaded from: classes.dex */
    public static final class b implements i.a<Uri> {
        private final boolean c(Uri uri) {
            return q.d(uri.getScheme(), "android.resource");
        }

        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, b5.l lVar, q4.g gVar) {
            if (!c(uri)) {
                return null;
            }
            return new l(uri, lVar);
        }
    }

    public l(Uri uri, b5.l lVar) {
        this.f25401a = uri;
        this.f25402b = lVar;
    }

    private final Void b(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0 = yc.u.j(r0);
     */
    @Override // w4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super w4.h> r12) {
        /*
            r11 = this;
            android.net.Uri r12 = r11.f25401a
            java.lang.String r12 = r12.getAuthority()
            if (r12 == 0) goto Lf3
            boolean r0 = yc.m.u(r12)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L11
            goto L12
        L11:
            r12 = 0
        L12:
            if (r12 == 0) goto Lf3
            android.net.Uri r0 = r11.f25401a
            java.util.List r0 = r0.getPathSegments()
            java.lang.Object r0 = ec.r.n0(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Le8
            java.lang.Integer r0 = yc.m.j(r0)
            if (r0 == 0) goto Le8
            int r0 = r0.intValue()
            b5.l r2 = r11.f25402b
            android.content.Context r2 = r2.g()
            java.lang.String r3 = r2.getPackageName()
            boolean r3 = qc.q.d(r12, r3)
            if (r3 == 0) goto L41
            android.content.res.Resources r3 = r2.getResources()
            goto L49
        L41:
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            android.content.res.Resources r3 = r3.getResourcesForApplication(r12)
        L49:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r3.getValue(r0, r4, r1)
            java.lang.CharSequence r1 = r4.string
            r6 = 47
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r1
            int r4 = yc.m.b0(r5, r6, r7, r8, r9, r10)
            int r5 = r1.length()
            java.lang.CharSequence r1 = r1.subSequence(r4, r5)
            java.lang.String r1 = r1.toString()
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = g5.l.j(r4, r1)
            java.lang.String r4 = "text/xml"
            boolean r4 = qc.q.d(r1, r4)
            if (r4 == 0) goto Lc3
            java.lang.String r1 = r2.getPackageName()
            boolean r12 = qc.q.d(r12, r1)
            if (r12 == 0) goto L89
            android.graphics.drawable.Drawable r12 = g5.d.a(r2, r0)
            goto L8d
        L89:
            android.graphics.drawable.Drawable r12 = g5.d.d(r2, r3, r0)
        L8d:
            r4 = r12
            boolean r12 = g5.l.u(r4)
            w4.g r0 = new w4.g
            if (r12 == 0) goto Lbd
            g5.o r3 = g5.o.f16199a
            b5.l r1 = r11.f25402b
            android.graphics.Bitmap$Config r5 = r1.f()
            b5.l r1 = r11.f25402b
            c5.i r6 = r1.o()
            b5.l r1 = r11.f25402b
            c5.h r7 = r1.n()
            b5.l r1 = r11.f25402b
            boolean r8 = r1.c()
            android.graphics.Bitmap r1 = r3.a(r4, r5, r6, r7, r8)
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r2, r1)
        Lbd:
            t4.f r1 = t4.f.DISK
            r0.<init>(r4, r12, r1)
            goto Le7
        Lc3:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            java.io.InputStream r3 = r3.openRawResource(r0, r4)
            w4.m r5 = new w4.m
            okio.Source r3 = okio.l0.k(r3)
            okio.e r3 = okio.l0.d(r3)
            t4.q0 r6 = new t4.q0
            int r4 = r4.density
            r6.<init>(r12, r0, r4)
            t4.o0 r12 = t4.p0.b(r3, r2, r6)
            t4.f r0 = t4.f.DISK
            r5.<init>(r12, r1, r0)
            r0 = r5
        Le7:
            return r0
        Le8:
            android.net.Uri r12 = r11.f25401a
            r11.b(r12)
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException
            r12.<init>()
            throw r12
        Lf3:
            android.net.Uri r12 = r11.f25401a
            r11.b(r12)
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.l.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
