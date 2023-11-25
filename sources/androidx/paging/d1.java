package androidx.paging;

import androidx.paging.q0;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Iterator;
import java.util.List;

/* compiled from: PageEvent.kt */
/* loaded from: classes.dex */
public abstract class d1<T> {

    /* compiled from: PageEvent.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends d1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final t0 f5453a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5454b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5455c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5456d;

        /* compiled from: PageEvent.kt */
        /* renamed from: androidx.paging.d1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0121a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5457a;

            static {
                int[] iArr = new int[t0.values().length];
                try {
                    iArr[t0.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t0.PREPEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f5457a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t0 t0Var, int i10, int i11, int i12) {
            super(null);
            boolean z10;
            boolean z11;
            qc.q.i(t0Var, "loadType");
            this.f5453a = t0Var;
            this.f5454b = i10;
            this.f5455c = i11;
            this.f5456d = i12;
            if (t0Var != t0.REFRESH) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (d() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if (i12 >= 0) {
                        return;
                    }
                    throw new IllegalArgumentException(("Invalid placeholdersRemaining " + i12).toString());
                }
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + d()).toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        public final t0 a() {
            return this.f5453a;
        }

        public final int b() {
            return this.f5455c;
        }

        public final int c() {
            return this.f5454b;
        }

        public final int d() {
            return (this.f5455c - this.f5454b) + 1;
        }

        public final int e() {
            return this.f5456d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f5453a == aVar.f5453a && this.f5454b == aVar.f5454b && this.f5455c == aVar.f5455c && this.f5456d == aVar.f5456d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f5453a.hashCode() * 31) + this.f5454b) * 31) + this.f5455c) * 31) + this.f5456d;
        }

        public String toString() {
            String str;
            String h10;
            int i10 = C0121a.f5457a[this.f5453a.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    str = "front";
                } else {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
            } else {
                str = "end";
            }
            h10 = yc.o.h("PageEvent.Drop from the " + str + " (\n                    |   minPageOffset: " + this.f5454b + "\n                    |   maxPageOffset: " + this.f5455c + "\n                    |   placeholdersRemaining: " + this.f5456d + "\n                    |)", null, 1, null);
            return h10;
        }
    }

    /* compiled from: PageEvent.kt */
    /* loaded from: classes.dex */
    public static final class b<T> extends d1<T> {

        /* renamed from: g  reason: collision with root package name */
        public static final a f5458g;

        /* renamed from: h  reason: collision with root package name */
        private static final b<Object> f5459h;

        /* renamed from: a  reason: collision with root package name */
        private final t0 f5460a;

        /* renamed from: b  reason: collision with root package name */
        private final List<l2<T>> f5461b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5462c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5463d;

        /* renamed from: e  reason: collision with root package name */
        private final s0 f5464e;

        /* renamed from: f  reason: collision with root package name */
        private final s0 f5465f;

        /* compiled from: PageEvent.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public static /* synthetic */ b d(a aVar, List list, int i10, int i11, s0 s0Var, s0 s0Var2, int i12, Object obj) {
                if ((i12 & 16) != 0) {
                    s0Var2 = null;
                }
                return aVar.c(list, i10, i11, s0Var, s0Var2);
            }

            public final <T> b<T> a(List<l2<T>> list, int i10, s0 s0Var, s0 s0Var2) {
                qc.q.i(list, "pages");
                qc.q.i(s0Var, "sourceLoadStates");
                return new b<>(t0.APPEND, list, -1, i10, s0Var, s0Var2, null);
            }

            public final <T> b<T> b(List<l2<T>> list, int i10, s0 s0Var, s0 s0Var2) {
                qc.q.i(list, "pages");
                qc.q.i(s0Var, "sourceLoadStates");
                return new b<>(t0.PREPEND, list, i10, -1, s0Var, s0Var2, null);
            }

            public final <T> b<T> c(List<l2<T>> list, int i10, int i11, s0 s0Var, s0 s0Var2) {
                qc.q.i(list, "pages");
                qc.q.i(s0Var, "sourceLoadStates");
                return new b<>(t0.REFRESH, list, i10, i11, s0Var, s0Var2, null);
            }

            public final b<Object> e() {
                return b.f5459h;
            }
        }

        static {
            List d10;
            a aVar = new a(null);
            f5458g = aVar;
            d10 = ec.s.d(l2.f5867e.a());
            q0.c.a aVar2 = q0.c.f6001b;
            f5459h = a.d(aVar, d10, 0, 0, new s0(aVar2.b(), aVar2.a(), aVar2.a()), null, 16, null);
        }

        public /* synthetic */ b(t0 t0Var, List list, int i10, int i11, s0 s0Var, s0 s0Var2, qc.h hVar) {
            this(t0Var, list, i10, i11, s0Var, s0Var2);
        }

        public static /* synthetic */ b c(b bVar, t0 t0Var, List list, int i10, int i11, s0 s0Var, s0 s0Var2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                t0Var = bVar.f5460a;
            }
            List<l2<T>> list2 = list;
            if ((i12 & 2) != 0) {
                list2 = bVar.f5461b;
            }
            List list3 = list2;
            if ((i12 & 4) != 0) {
                i10 = bVar.f5462c;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = bVar.f5463d;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                s0Var = bVar.f5464e;
            }
            s0 s0Var3 = s0Var;
            if ((i12 & 32) != 0) {
                s0Var2 = bVar.f5465f;
            }
            return bVar.b(t0Var, list3, i13, i14, s0Var3, s0Var2);
        }

        public final b<T> b(t0 t0Var, List<l2<T>> list, int i10, int i11, s0 s0Var, s0 s0Var2) {
            qc.q.i(t0Var, "loadType");
            qc.q.i(list, "pages");
            qc.q.i(s0Var, "sourceLoadStates");
            return new b<>(t0Var, list, i10, i11, s0Var, s0Var2);
        }

        public final t0 d() {
            return this.f5460a;
        }

        public final s0 e() {
            return this.f5465f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f5460a == bVar.f5460a && qc.q.d(this.f5461b, bVar.f5461b) && this.f5462c == bVar.f5462c && this.f5463d == bVar.f5463d && qc.q.d(this.f5464e, bVar.f5464e) && qc.q.d(this.f5465f, bVar.f5465f)) {
                return true;
            }
            return false;
        }

        public final List<l2<T>> f() {
            return this.f5461b;
        }

        public final int g() {
            return this.f5463d;
        }

        public final int h() {
            return this.f5462c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.f5460a.hashCode() * 31) + this.f5461b.hashCode()) * 31) + this.f5462c) * 31) + this.f5463d) * 31) + this.f5464e.hashCode()) * 31;
            s0 s0Var = this.f5465f;
            if (s0Var == null) {
                hashCode = 0;
            } else {
                hashCode = s0Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final s0 i() {
            return this.f5464e;
        }

        public String toString() {
            String str;
            Object c02;
            Object obj;
            Object n02;
            Object obj2;
            String h10;
            List<T> b10;
            List<T> b11;
            Iterator<T> it = this.f5461b.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 += ((l2) it.next()).b().size();
            }
            int i11 = this.f5462c;
            String str2 = DevicePublicKeyStringDef.NONE;
            if (i11 != -1) {
                str = String.valueOf(i11);
            } else {
                str = DevicePublicKeyStringDef.NONE;
            }
            int i12 = this.f5463d;
            if (i12 != -1) {
                str2 = String.valueOf(i12);
            }
            s0 s0Var = this.f5465f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PageEvent.Insert for ");
            sb2.append(this.f5460a);
            sb2.append(", with ");
            sb2.append(i10);
            sb2.append(" items (\n                    |   first item: ");
            c02 = ec.b0.c0(this.f5461b);
            l2 l2Var = (l2) c02;
            if (l2Var != null && (b11 = l2Var.b()) != null) {
                obj = ec.b0.c0(b11);
            } else {
                obj = null;
            }
            sb2.append(obj);
            sb2.append("\n                    |   last item: ");
            n02 = ec.b0.n0(this.f5461b);
            l2 l2Var2 = (l2) n02;
            if (l2Var2 != null && (b10 = l2Var2.b()) != null) {
                obj2 = ec.b0.n0(b10);
            } else {
                obj2 = null;
            }
            sb2.append(obj2);
            sb2.append("\n                    |   placeholdersBefore: ");
            sb2.append(str);
            sb2.append("\n                    |   placeholdersAfter: ");
            sb2.append(str2);
            sb2.append("\n                    |   sourceLoadStates: ");
            sb2.append(this.f5464e);
            sb2.append("\n                    ");
            String sb3 = sb2.toString();
            if (s0Var != null) {
                sb3 = sb3 + "|   mediatorLoadStates: " + s0Var + '\n';
            }
            h10 = yc.o.h(sb3 + "|)", null, 1, null);
            return h10;
        }

        private b(t0 t0Var, List<l2<T>> list, int i10, int i11, s0 s0Var, s0 s0Var2) {
            super(null);
            this.f5460a = t0Var;
            this.f5461b = list;
            this.f5462c = i10;
            this.f5463d = i11;
            this.f5464e = s0Var;
            this.f5465f = s0Var2;
            if (t0Var == t0.APPEND || i10 >= 0) {
                if (t0Var == t0.PREPEND || i11 >= 0) {
                    if (!(t0Var != t0.REFRESH || (list.isEmpty() ^ true))) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i11).toString());
            }
            throw new IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i10).toString());
        }
    }

    /* compiled from: PageEvent.kt */
    /* loaded from: classes.dex */
    public static final class c<T> extends d1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final s0 f5466a;

        /* renamed from: b  reason: collision with root package name */
        private final s0 f5467b;

        public /* synthetic */ c(s0 s0Var, s0 s0Var2, int i10, qc.h hVar) {
            this(s0Var, (i10 & 2) != 0 ? null : s0Var2);
        }

        public final s0 a() {
            return this.f5467b;
        }

        public final s0 b() {
            return this.f5466a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (qc.q.d(this.f5466a, cVar.f5466a) && qc.q.d(this.f5467b, cVar.f5467b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f5466a.hashCode() * 31;
            s0 s0Var = this.f5467b;
            if (s0Var == null) {
                hashCode = 0;
            } else {
                hashCode = s0Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            String h10;
            s0 s0Var = this.f5467b;
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f5466a + "\n                    ";
            if (s0Var != null) {
                str = str + "|   mediatorLoadStates: " + s0Var + '\n';
            }
            h10 = yc.o.h(str + "|)", null, 1, null);
            return h10;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s0 s0Var, s0 s0Var2) {
            super(null);
            qc.q.i(s0Var, "source");
            this.f5466a = s0Var;
            this.f5467b = s0Var2;
        }
    }

    /* compiled from: PageEvent.kt */
    /* loaded from: classes.dex */
    public static final class d<T> extends d1<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<T> f5468a;

        /* renamed from: b  reason: collision with root package name */
        private final s0 f5469b;

        /* renamed from: c  reason: collision with root package name */
        private final s0 f5470c;

        public final List<T> a() {
            return this.f5468a;
        }

        public final s0 b() {
            return this.f5470c;
        }

        public final s0 c() {
            return this.f5469b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (qc.q.d(this.f5468a, dVar.f5468a) && qc.q.d(this.f5469b, dVar.f5469b) && qc.q.d(this.f5470c, dVar.f5470c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f5468a.hashCode() * 31;
            s0 s0Var = this.f5469b;
            int i10 = 0;
            if (s0Var == null) {
                hashCode = 0;
            } else {
                hashCode = s0Var.hashCode();
            }
            int i11 = (hashCode2 + hashCode) * 31;
            s0 s0Var2 = this.f5470c;
            if (s0Var2 != null) {
                i10 = s0Var2.hashCode();
            }
            return i11 + i10;
        }

        public String toString() {
            Object c02;
            Object n02;
            String h10;
            s0 s0Var = this.f5470c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PageEvent.StaticList with ");
            sb2.append(this.f5468a.size());
            sb2.append(" items (\n                    |   first item: ");
            c02 = ec.b0.c0(this.f5468a);
            sb2.append(c02);
            sb2.append("\n                    |   last item: ");
            n02 = ec.b0.n0(this.f5468a);
            sb2.append(n02);
            sb2.append("\n                    |   sourceLoadStates: ");
            sb2.append(this.f5469b);
            sb2.append("\n                    ");
            String sb3 = sb2.toString();
            if (s0Var != null) {
                sb3 = sb3 + "|   mediatorLoadStates: " + s0Var + '\n';
            }
            h10 = yc.o.h(sb3 + "|)", null, 1, null);
            return h10;
        }
    }

    private d1() {
    }

    public /* synthetic */ d1(qc.h hVar) {
        this();
    }
}
