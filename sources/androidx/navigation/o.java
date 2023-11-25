package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.Serializable;
import okhttp3.HttpUrl;
import yc.v;

/* compiled from: NavType.kt */
/* loaded from: classes.dex */
public abstract class o<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final l f5367c = new l(null);

    /* renamed from: d  reason: collision with root package name */
    public static final o<Integer> f5368d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final o<Integer> f5369e = new i();

    /* renamed from: f  reason: collision with root package name */
    public static final o<int[]> f5370f = new e();

    /* renamed from: g  reason: collision with root package name */
    public static final o<Long> f5371g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final o<long[]> f5372h = new g();

    /* renamed from: i  reason: collision with root package name */
    public static final o<Float> f5373i = new d();

    /* renamed from: j  reason: collision with root package name */
    public static final o<float[]> f5374j = new c();

    /* renamed from: k  reason: collision with root package name */
    public static final o<Boolean> f5375k = new b();

    /* renamed from: l  reason: collision with root package name */
    public static final o<boolean[]> f5376l = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final o<String> f5377m = new k();

    /* renamed from: n  reason: collision with root package name */
    public static final o<String[]> f5378n = new j();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5380b = "nav_type";

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class a extends o<boolean[]> {
        a() {
            super(true);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "boolean[]";
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public boolean[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public boolean[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new boolean[]{o.f5375k.j(str).booleanValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        
            r3 = ec.o.A(r3, j(r2));
         */
        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean[] g(java.lang.String r2, boolean[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                qc.q.i(r2, r0)
                if (r3 == 0) goto L11
                boolean[] r0 = r1.f(r2)
                boolean[] r3 = ec.l.A(r3, r0)
                if (r3 != 0) goto L15
            L11:
                boolean[] r3 = r1.f(r2)
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.o.a.g(java.lang.String, boolean[]):boolean[]");
        }

        @Override // androidx.navigation.o
        /* renamed from: l  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, boolean[] zArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class b extends o<Boolean> {
        b() {
            super(false);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "boolean";
        }

        @Override // androidx.navigation.o
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Boolean bool) {
            k(bundle, str, bool.booleanValue());
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Boolean a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public Boolean j(String str) {
            boolean z10;
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (qc.q.d(str, "true")) {
                z10 = true;
            } else if (qc.q.d(str, "false")) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        public void k(Bundle bundle, String str, boolean z10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putBoolean(str, z10);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class c extends o<float[]> {
        c() {
            super(true);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "float[]";
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public float[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public float[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new float[]{o.f5373i.j(str).floatValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        
            r3 = ec.o.u(r3, j(r2));
         */
        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public float[] g(java.lang.String r2, float[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                qc.q.i(r2, r0)
                if (r3 == 0) goto L11
                float[] r0 = r1.f(r2)
                float[] r3 = ec.l.u(r3, r0)
                if (r3 != 0) goto L15
            L11:
                float[] r3 = r1.f(r2)
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.o.c.g(java.lang.String, float[]):float[]");
        }

        @Override // androidx.navigation.o
        /* renamed from: l  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, float[] fArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class d extends o<Float> {
        d() {
            super(false);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "float";
        }

        @Override // androidx.navigation.o
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Float f10) {
            k(bundle, str, f10.floatValue());
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Float a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            Object obj = bundle.get(str);
            qc.q.g(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public Float j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return Float.valueOf(Float.parseFloat(str));
        }

        public void k(Bundle bundle, String str, float f10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putFloat(str, f10);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class e extends o<int[]> {
        e() {
            super(true);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "integer[]";
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public int[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public int[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new int[]{o.f5368d.j(str).intValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        
            r3 = ec.o.w(r3, j(r2));
         */
        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int[] g(java.lang.String r2, int[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                qc.q.i(r2, r0)
                if (r3 == 0) goto L11
                int[] r0 = r1.f(r2)
                int[] r3 = ec.l.w(r3, r0)
                if (r3 != 0) goto L15
            L11:
                int[] r3 = r1.f(r2)
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.o.e.g(java.lang.String, int[]):int[]");
        }

        @Override // androidx.navigation.o
        /* renamed from: l  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, int[] iArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class f extends o<Integer> {
        f() {
            super(false);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "integer";
        }

        @Override // androidx.navigation.o
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Integer num) {
            k(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            Object obj = bundle.get(str);
            qc.q.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public Integer j(String str) {
            boolean F;
            int parseInt;
            int a10;
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            F = v.F(str, "0x", false, 2, null);
            if (F) {
                String substring = str.substring(2);
                qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
                a10 = yc.b.a(16);
                parseInt = Integer.parseInt(substring, a10);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        public void k(Bundle bundle, String str, int i10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putInt(str, i10);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class g extends o<long[]> {
        g() {
            super(true);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "long[]";
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public long[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public long[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new long[]{o.f5371g.j(str).longValue()};
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        
            r3 = ec.o.x(r3, j(r2));
         */
        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long[] g(java.lang.String r2, long[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                qc.q.i(r2, r0)
                if (r3 == 0) goto L11
                long[] r0 = r1.f(r2)
                long[] r3 = ec.l.x(r3, r0)
                if (r3 != 0) goto L15
            L11:
                long[] r3 = r1.f(r2)
            L15:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.o.g.g(java.lang.String, long[]):long[]");
        }

        @Override // androidx.navigation.o
        /* renamed from: l  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, long[] jArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class h extends o<Long> {
        h() {
            super(false);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "long";
        }

        @Override // androidx.navigation.o
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Long l10) {
            k(bundle, str, l10.longValue());
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Long a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            Object obj = bundle.get(str);
            qc.q.g(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public Long j(String str) {
            boolean q10;
            String str2;
            boolean F;
            long parseLong;
            int a10;
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            q10 = v.q(str, "L", false, 2, null);
            if (q10) {
                str2 = str.substring(0, str.length() - 1);
                qc.q.h(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            F = v.F(str, "0x", false, 2, null);
            if (F) {
                String substring = str2.substring(2);
                qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
                a10 = yc.b.a(16);
                parseLong = Long.parseLong(substring, a10);
            } else {
                parseLong = Long.parseLong(str2);
            }
            return Long.valueOf(parseLong);
        }

        public void k(Bundle bundle, String str, long j10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putLong(str, j10);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class i extends o<Integer> {
        i() {
            super(false);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "reference";
        }

        @Override // androidx.navigation.o
        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Integer num) {
            k(bundle, str, num.intValue());
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public Integer a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            Object obj = bundle.get(str);
            qc.q.g(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public Integer j(String str) {
            boolean F;
            int parseInt;
            int a10;
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            F = v.F(str, "0x", false, 2, null);
            if (F) {
                String substring = str.substring(2);
                qc.q.h(substring, "this as java.lang.String).substring(startIndex)");
                a10 = yc.b.a(16);
                parseInt = Integer.parseInt(substring, a10);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        public void k(Bundle bundle, String str, int i10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putInt(str, i10);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class j extends o<String[]> {
        j() {
            super(true);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "string[]";
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public String[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public String[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return new String[]{str};
        }

        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public String[] g(String str, String[] strArr) {
            Object[] z10;
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (strArr != null) {
                z10 = ec.o.z(strArr, f(str));
                String[] strArr2 = (String[]) z10;
                if (strArr2 != null) {
                    return strArr2;
                }
            }
            return f(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: l  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, String[] strArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class k extends o<String> {
        k() {
            super(true);
        }

        @Override // androidx.navigation.o
        public String b() {
            return "string";
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public String a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.o
        /* renamed from: j  reason: merged with bridge method [inline-methods] */
        public String j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (qc.q.d(str, "null")) {
                return null;
            }
            return str;
        }

        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, String str2) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            bundle.putString(str, str2);
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class l {
        private l() {
        }

        public /* synthetic */ l(qc.h hVar) {
            this();
        }

        public o<?> a(String str, String str2) {
            boolean z10;
            boolean F;
            String str3;
            boolean q10;
            o<Integer> oVar = o.f5368d;
            if (qc.q.d(oVar.b(), str)) {
                return oVar;
            }
            o oVar2 = o.f5370f;
            if (qc.q.d(oVar2.b(), str)) {
                return oVar2;
            }
            o<Long> oVar3 = o.f5371g;
            if (qc.q.d(oVar3.b(), str)) {
                return oVar3;
            }
            o oVar4 = o.f5372h;
            if (qc.q.d(oVar4.b(), str)) {
                return oVar4;
            }
            o<Boolean> oVar5 = o.f5375k;
            if (qc.q.d(oVar5.b(), str)) {
                return oVar5;
            }
            o oVar6 = o.f5376l;
            if (qc.q.d(oVar6.b(), str)) {
                return oVar6;
            }
            o<String> oVar7 = o.f5377m;
            if (qc.q.d(oVar7.b(), str)) {
                return oVar7;
            }
            o oVar8 = o.f5378n;
            if (qc.q.d(oVar8.b(), str)) {
                return oVar8;
            }
            o<Float> oVar9 = o.f5373i;
            if (qc.q.d(oVar9.b(), str)) {
                return oVar9;
            }
            o oVar10 = o.f5374j;
            if (qc.q.d(oVar10.b(), str)) {
                return oVar10;
            }
            o<Integer> oVar11 = o.f5369e;
            if (qc.q.d(oVar11.b(), str)) {
                return oVar11;
            }
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                try {
                    F = v.F(str, ".", false, 2, null);
                    if (F && str2 != null) {
                        str3 = str2 + str;
                    } else {
                        str3 = str;
                    }
                    q10 = v.q(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null);
                    if (q10) {
                        str3 = str3.substring(0, str3.length() - 2);
                        qc.q.h(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                        Class<?> cls = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls)) {
                            qc.q.g(cls, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            return new n(cls);
                        } else if (Serializable.class.isAssignableFrom(cls)) {
                            qc.q.g(cls, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            return new p(cls);
                        }
                    } else {
                        Class<?> cls2 = Class.forName(str3);
                        if (Parcelable.class.isAssignableFrom(cls2)) {
                            qc.q.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                            return new C0118o(cls2);
                        } else if (Enum.class.isAssignableFrom(cls2)) {
                            qc.q.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                            return new m(cls2);
                        } else if (Serializable.class.isAssignableFrom(cls2)) {
                            qc.q.g(cls2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            return new q(cls2);
                        }
                    }
                    throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            return oVar7;
        }

        public final o<Object> b(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            try {
                try {
                    try {
                        try {
                            o<Integer> oVar = o.f5368d;
                            oVar.j(str);
                            qc.q.g(oVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return oVar;
                        } catch (IllegalArgumentException unused) {
                            o<Boolean> oVar2 = o.f5375k;
                            oVar2.j(str);
                            qc.q.g(oVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return oVar2;
                        }
                    } catch (IllegalArgumentException unused2) {
                        o<Long> oVar3 = o.f5371g;
                        oVar3.j(str);
                        qc.q.g(oVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return oVar3;
                    }
                } catch (IllegalArgumentException unused3) {
                    o<String> oVar4 = o.f5377m;
                    qc.q.g(oVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return oVar4;
                }
            } catch (IllegalArgumentException unused4) {
                o<Float> oVar5 = o.f5373i;
                oVar5.j(str);
                qc.q.g(oVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar5;
            }
        }

        public final o<Object> c(Object obj) {
            o<Object> qVar;
            if (obj instanceof Integer) {
                o<Integer> oVar = o.f5368d;
                qc.q.g(oVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar;
            } else if (obj instanceof int[]) {
                o<int[]> oVar2 = o.f5370f;
                qc.q.g(oVar2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar2;
            } else if (obj instanceof Long) {
                o<Long> oVar3 = o.f5371g;
                qc.q.g(oVar3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar3;
            } else if (obj instanceof long[]) {
                o<long[]> oVar4 = o.f5372h;
                qc.q.g(oVar4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar4;
            } else if (obj instanceof Float) {
                o<Float> oVar5 = o.f5373i;
                qc.q.g(oVar5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar5;
            } else if (obj instanceof float[]) {
                o<float[]> oVar6 = o.f5374j;
                qc.q.g(oVar6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar6;
            } else if (obj instanceof Boolean) {
                o<Boolean> oVar7 = o.f5375k;
                qc.q.g(oVar7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar7;
            } else if (obj instanceof boolean[]) {
                o<boolean[]> oVar8 = o.f5376l;
                qc.q.g(oVar8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar8;
            } else if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    o<String[]> oVar9 = o.f5378n;
                    qc.q.g(oVar9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return oVar9;
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    qc.q.f(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        qc.q.g(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        qVar = new n<>(componentType2);
                        return qVar;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    qc.q.f(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        qc.q.g(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        qVar = new p<>(componentType4);
                        return qVar;
                    }
                }
                if (obj instanceof Parcelable) {
                    qVar = new C0118o<>(obj.getClass());
                } else if (obj instanceof Enum) {
                    qVar = new m<>(obj.getClass());
                } else if (obj instanceof Serializable) {
                    qVar = new q<>(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return qVar;
            } else {
                o<String> oVar10 = o.f5377m;
                qc.q.g(oVar10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return oVar10;
            }
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class m<D extends Enum<?>> extends q<D> {

        /* renamed from: p  reason: collision with root package name */
        private final Class<D> f5381p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Class<D> cls) {
            super(false, cls);
            qc.q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            if (cls.isEnum()) {
                this.f5381p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.o.q, androidx.navigation.o
        public String b() {
            String name = this.f5381p.getName();
            qc.q.h(name, "type.name");
            return name;
        }

        @Override // androidx.navigation.o.q
        /* renamed from: l  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D j(String str) {
            D d10;
            boolean r10;
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            D[] enumConstants = this.f5381p.getEnumConstants();
            qc.q.h(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    d10 = enumConstants[i10];
                    r10 = v.r(d10.name(), str, true);
                    if (r10) {
                        break;
                    }
                    i10++;
                } else {
                    d10 = null;
                    break;
                }
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f5381p.getName() + '.');
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class n<D extends Parcelable> extends o<D[]> {

        /* renamed from: o  reason: collision with root package name */
        private final Class<D[]> f5382o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class<D> cls) {
            super(true);
            qc.q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    Class<D[]> cls2 = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                    qc.q.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.f5382o = cls2;
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }

        @Override // androidx.navigation.o
        public String b() {
            String name = this.f5382o.getName();
            qc.q.h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && qc.q.d(n.class, obj.getClass())) {
                return qc.q.d(this.f5382o, ((n) obj).f5382o);
            }
            return false;
        }

        public int hashCode() {
            return this.f5382o.hashCode();
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public D[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        @Override // androidx.navigation.o
        public D[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, D[] dArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            this.f5382o.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* compiled from: NavType.kt */
    /* renamed from: androidx.navigation.o$o  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0118o<D> extends o<D> {

        /* renamed from: o  reason: collision with root package name */
        private final Class<D> f5383o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0118o(Class<D> cls) {
            super(true);
            qc.q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.f5383o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.o
        public D a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.o
        public String b() {
            String name = this.f5383o.getName();
            qc.q.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && qc.q.d(C0118o.class, obj.getClass())) {
                return qc.q.d(this.f5383o, ((C0118o) obj).f5383o);
            }
            return false;
        }

        @Override // androidx.navigation.o
        /* renamed from: f */
        public D j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.o
        public void h(Bundle bundle, String str, D d10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            this.f5383o.cast(d10);
            if (d10 != null && !(d10 instanceof Parcelable)) {
                if (d10 instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) d10);
                    return;
                }
                return;
            }
            bundle.putParcelable(str, (Parcelable) d10);
        }

        public int hashCode() {
            return this.f5383o.hashCode();
        }
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static final class p<D extends Serializable> extends o<D[]> {

        /* renamed from: o  reason: collision with root package name */
        private final Class<D[]> f5384o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Class<D> cls) {
            super(true);
            qc.q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    Class<D[]> cls2 = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
                    qc.q.g(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.f5384o = cls2;
                    return;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.o
        public String b() {
            String name = this.f5384o.getName();
            qc.q.h(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && qc.q.d(p.class, obj.getClass())) {
                return qc.q.d(this.f5384o, ((p) obj).f5384o);
            }
            return false;
        }

        public int hashCode() {
            return this.f5384o.hashCode();
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public D[] a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        @Override // androidx.navigation.o
        public D[] j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, D[] dArr) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            this.f5384o.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    public o(boolean z10) {
        this.f5379a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.f5379a;
    }

    public final T d(Bundle bundle, String str, String str2) {
        qc.q.i(bundle, "bundle");
        qc.q.i(str, "key");
        qc.q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        T j10 = j(str2);
        h(bundle, str, j10);
        return j10;
    }

    public final T e(Bundle bundle, String str, String str2, T t10) {
        qc.q.i(bundle, "bundle");
        qc.q.i(str, "key");
        if (bundle.containsKey(str)) {
            if (str2 != null) {
                T g10 = g(str2, t10);
                h(bundle, str, g10);
                return g10;
            }
            return t10;
        }
        throw new IllegalArgumentException("There is no previous value in this bundle.");
    }

    /* renamed from: f */
    public abstract T j(String str);

    public T g(String str, T t10) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return j(str);
    }

    public abstract void h(Bundle bundle, String str, T t10);

    public String toString() {
        return b();
    }

    /* compiled from: NavType.kt */
    /* loaded from: classes.dex */
    public static class q<D extends Serializable> extends o<D> {

        /* renamed from: o  reason: collision with root package name */
        private final Class<D> f5385o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Class<D> cls) {
            super(true);
            qc.q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            if (Serializable.class.isAssignableFrom(cls)) {
                if (true ^ cls.isEnum()) {
                    this.f5385o = cls;
                    return;
                }
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.o
        public String b() {
            String name = this.f5385o.getName();
            qc.q.h(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return qc.q.d(this.f5385o, ((q) obj).f5385o);
        }

        public int hashCode() {
            return this.f5385o.hashCode();
        }

        @Override // androidx.navigation.o
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public D a(Bundle bundle, String str) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.o
        public D j(String str) {
            qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.o
        /* renamed from: k  reason: merged with bridge method [inline-methods] */
        public void h(Bundle bundle, String str, D d10) {
            qc.q.i(bundle, "bundle");
            qc.q.i(str, "key");
            qc.q.i(d10, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f5385o.cast(d10);
            bundle.putSerializable(str, d10);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(boolean z10, Class<D> cls) {
            super(z10);
            qc.q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f5385o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
